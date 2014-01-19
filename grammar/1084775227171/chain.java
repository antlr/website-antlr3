import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.String;
public class chain extends Frame implements ActionListener
 {
TextField t1;
TextField t2;
TextField t3,t4,t5,t6,t7,t8,t9,t10,t11;
TextArea ta;
Button b1;
Panel p1,p2,p3,p4,p5,p6;
public chain()
{
super("File Transform");
p1=new Panel();
p2=new Panel();
p3=new Panel();
p4=new Panel();
p5=new Panel();
p6=new Panel();

t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
t6=new TextField();
t7=new TextField();
t8=new TextField();
t9=new TextField();
t10=new TextField();
t11=new TextField();
ta=new TextArea();
b1=new Button("Submit");
b1.addActionListener(this);
setLayout(new GridLayout(2,1));
p1.setLayout(new GridLayout(2,1));
p3.setLayout(new GridLayout(1,1));
p3.add(new Label("CHAIN B TRANSFORMATION",Label.CENTER));
p4.setLayout(new GridLayout(2,2));
p4.add(new Label("Enter the Input File"));
p4.add(t1);
p4.add(new Label("Enter the Output File"));
p4.add(t2);
p1.add(p3);
p1.add(p4);
p2.setLayout(new GridLayout(2,1));
p5.setLayout(new GridLayout(3,4));
p5.add(new Label("x coord"));
p5.add(t3);
p5.add(t4);
p5.add(t5);
p5.add(new Label("Y coord"));
p5.add(t6);
p5.add(t7);
p5.add(t8);
p5.add(new Label("Z coord"));
p5.add(t9);
p5.add(t10);
p5.add(t11);
p6.setLayout(new GridLayout(2,2));
p6.add(new Label("Information"));
p6.add(ta);
p6.add(new Label(" "));
p6.add(b1);
p2.add(p5);
p2.add(p6);
add(p1);
add(p2);
setSize(400,400);
setVisible(true);
 }
public void actionPerformed(ActionEvent e)
 {
if(e.getSource()==b1)
{
File name=new File(t1.getText());
File op=new File(t2.getText());
double x1,x2,x3;
double y1,y2,y3;
double z1,z2,z3;
String tx1,tx2,tx3;
String ty1,ty2,ty3;
String tz1,tz2,tz3;
tx1=t3.getText();
x1=Double.parseDouble(tx1);
tx2=t4.getText();
x2=Double.parseDouble(tx2);
tx3=t5.getText();
x3=Double.parseDouble(tx3);

ty1=t6.getText();
y1=Double.parseDouble(ty1);
ty2=t7.getText();
y2=Double.parseDouble(ty2);
ty3=t8.getText();
y3=Double.parseDouble(ty3);

tz1=t9.getText();
z1=Double.parseDouble(tz1);
tz2=t10.getText();
z2=Double.parseDouble(tz2);
tz3=t11.getText();
z3=Double.parseDouble(tz3);

if(name.exists())
 {
ta.setText(name.getName()+"exists \n"+
(name.isFile()?" is a file\n":"is not a file\n")+
(name.isDirectory()?"is a directory\n":"is not directory\n")+
"Last Modified:"+name.lastModified()+
"\n Length:"+name.length()+"\n Path:"+name.getPath()+"\n Abolute Path is:"+name.getAbsolutePath()+"\n Parent:"+name.getParent()+"\n File Copied");

if(name.isFile())
{
try
{

FileReader in = new FileReader(name);
       FileWriter out = new FileWriter(op);

      BufferedReader br=new BufferedReader(in);
      BufferedWriter bw=new BufferedWriter(out);
     
//NumberFormat nf=new DecimalFormat("00.000");
      String s;
      String str;         
      String s1;
      String s2;
 String s3;
String s4;

int q=0;
int q1=0;
int q2=0;
int q3=0;
int q5=0;
int q6=0;
int q7=0;
int q8=0;
int q9=0;
int q10=0;
         int n=0;
        int len;
      char c='B';
      char a='A';
       

      while((s=br.readLine())!=null)
      {

double[][] mat={{x1,x2,x3},{y1,y2,y3},{z1,z2,z3}};


int j,k,l;

double[] d = new double[50];
double[] nd=new double[50];
double[] trans={84.26000,0.00000,0.00000};




if(s.startsWith("ATOM"))
              {
                    
 StringTokenizer st = new StringTokenizer(s, " ");
ArrayList al = new ArrayList();


while (st.hasMoreTokens()) {
  al.add(st.nextToken());

}

d[0]=Double.parseDouble((String)al.get(5));
d[1]=Double.parseDouble((String)al.get(6));
d[2]=Double.parseDouble((String)al.get(7));
for(int i=0;i<=2;i++)

{
i=2;
j=0;
k=j+1;
l=j+2;
nd[i]=mat[i][j]*d[j] + mat[i][k]*d[k] + mat[i][l]*d[l] + trans[i];
}

s1=s.substring(32,46);
q=s1.length();
s2=s.substring(49,61);
q1=s2.length();
s2=s2.trim();
q6=s2.length();
q5=(q1-q6);
s3=s.substring(62,75);
q2=s3.length();
s3=s3.trim();
q8=s3.length();
q7=(q2-q8);
s4=s.substring(76);
s4=s4.trim();
q10=s4.length();
q9=(q3-q10);
while(q>14) {
s1=s1+" ";
q=q+1;
}
while(q1>12) {
s2=s2+" ";
q1=q1+1;
}
while(q5>0){
s2=s2+" ";
q5--;
}
while(q2>13) {
s3=s3+" ";
q2=q2+1;
}
while(q7>0){
s3=s3+" ";
q7--;
}
//s1=nf.format(nd[0]);
//s2=nf.format(nd[1]);
//s3=nf.format(nd[2]);
if((nd[0]<0)&&(nd[1]<0)&&(nd[2]<0))
{
s=s.substring(0,21)+c+s.substring(22,32)+s1+"  "+s2+"  "+s3+" "+s4;
}
else if((nd[1]<0)&&(nd[2]<0))
{
s=s.substring(0,21)+c+s.substring(22,32)+s1+"  "+s2+"  "+s3+" "+s4;

}
else if(nd[1]<0)
{
s=s.substring(0,21)+c+s.substring(22,32)+s1+"  "+s2+"  "+s3+" "+s4;

}
else if(nd[2]<0)
{
s=s.substring(0,21)+c+s.substring(22,32)+s1+"  "+s2+"  "+s3+" "+s4;
}

else
s=s.substring(0,21)+c+s.substring(22,32)+s1+"  "+s2+"  "+s3+" "+s4;


bw.write(s);
            bw.newLine();
      
            }
           
          } 
          bw.flush(); 
        in.close();
        out.close();
        
}
catch(IOException e2)
{
String dir[]=name.list();
ta.append("\n\n Directory contents :\n");
for(int i=0;i<dir.length;i++)
ta.append(dir[i]+"\n");
}
}
}
else
{
ta.setText(t1.getText()+"does not exist");
}
}

}
public static void main(String args[])
{
chain cb=new chain();
cb.addWindowListener(new windhand());
}
}
class windhand extends WindowAdapter
{
public void windowClosing(WindowEvent w)
{
System.exit(0);
}
}
