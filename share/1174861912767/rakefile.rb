require 'rake/clean'
CLEAN.include( "**/*.class")
CLEAN.include( "**/*~")
CLOBBER.include( 'build/antlr-3.0.jar')

desc "The default task:  build antlr3 jar."
task :default => [ "build/antlr-3.0.jar"]

Dir.chdir( "src")
SRC = FileList[ "**/*.java"]
#JAR = SRC.ext( 'class')    #  Insufficient.  Need extra (anon. "$") classes, LICENSE, and stringtemplates.
#  See JAR, below.

file "build/antlr-3.0.jar" => SRC do
  sh "javac #{SRC}"
  cp "../LICENSE.txt", "."
  JAR = FileList[ "LICENSE.txt", "**/*.class", "**/*.stg", "**/*.st", "**/*.sti"]
  JAR.each do |fname| fname.gsub!(/\$/, '\$'); end    #  Escape "$" w/in java anonymous class filenames.
  sh "jar cvf ../build/antlr-3.0.jar #{JAR}"
end
