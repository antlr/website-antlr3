
-----------------------------------
-- SqlSQL2Parser     Operation Test
-- Author: Lubos Vnuk, 01 July 2003
-----------------------------------

-- <query_primary>
select*from table_1;
table table_2;
values A,ada;
values (A,B,C),(E,F,G);
values (select*from table_3),(E,F,G);
(select*from table_1) cross join (select*from table_2);
table_1 cross join (select*from table_2);
table_1 cross join table_2;
((select*from table_1) cross join (select*from table_2));
(table_1 cross join table_2);
select * from table_1, table2 where table_1.column1=table_2.column2;
select*from table_1 natural inner join table_2;
select*from table_1 union join table_2;
select*from table_1 inner join table_2 on table_1.column1=table_2.column2;
select*from table_1 left outer join table_2 on table_1.column1=table_2.column2;
select*from table_1 full outer join table_2 on table_1.column1=table_2.column2;
select*from table_1 right join table_2 using (id1,id2);

-- <query_exp>
select*from table_1 union corresponding select*from table_2;
select*from table_1 union all corresponding by (a,b,c) select*from table_2;
select a,b,c from table_1 except all select e,f,g from table_2;
select a,b,c from table_1
 union all corresponding by (a,b,c)
select e,f,g from table_2
 intersect all 
select*from table_3
 union 
select*from table_4;
select a,b into :VarA,:FrmA.FieldB,: _WIN1250 Ö3 from table_1; --EXF5

-- <table_ref>
select A from (select B from (select C from d) cross join table_b b);
select 0 from (select B from (table C) cross join table_b as b (derived_column_1, derived_column_2));
select * from (values (A,B,C),(E,F,G));

-- <parameter_name>
select * from a where a<> : Var1;
select * from b where a<=:frmF1.clsC1.dfDF1.instI1; --EXF4
select*from c where a>?;

-- <char_value_fct>
select*from a where a=substring (b from 5);
select*from a where a=substring (b from 5 for 2);
select*from a where a=substring ('abcdefgh'||'ijkl' from 5-2 for 1*2);
select upper('a') from a;
select LOWER('Z') from a;
select convert('Ä' using conversionname) from a;
select translate ('Ö' using translationname) from a;
select trim('  A  ' || '  s ') from a;
select trim(leading from c) from a;
select a||(trim(both '_' from '__A__')) from a;
select trim(trailing '_' from 'A___') from a;
select trim(from c) from a;

-- <num_value_fct>
select position ('b' in 'abced') from a;
select extract (second from b) from a;
select extract (hour from '13:14:15') from a;
select char_length (a || '_') from a;
select character_length (a || '_') from a;
select octet_length ('_' || 2) from a;
select octet_length ('_' || 2) from a;
select bit_length (b'1010') from a;

-- <datetime_value_fct>
select current_date, current_time, current_timestamp (2) from a;

-- <value_exp_primary>
select count(*) from a;
select count(distinct a) from a;
select max(all a) from a;
select min(a*b) from a;
select avg(a/b) from a;
select (sum((select*from c))) from a;
select nullif(b,5) from a;
select coalesce(b,5,c,45) from a;
select
    case c
	when 1 then null
	when 2 then 'abc'
	else 'efg'
    end
from a;
select
    case
	when a=b AND c<d then null
	when a is null then 'abc'
	else 'efg'
    end
from t;
select	cast(5 as char(20)),cast(6 as varchar(20)),
	cast(7 as nchar varying (20)),
	cast(6 as national char varying (20)),
	cast(50 as bit varying(20)),
	cast('20' as float(10)),
	cast('20' as real),
	cast('20' as double precision),
	cast('20' as numeric(18,6)),
	cast('20' as decimal(12,2)),
	cast('20' as dec(12,2)),
	cast('20' as integer),
	cast('20' as int),
	cast('20' as smallint),
	cast('2003-12-31' as date),
	cast('20' as smallint),
	cast('13:13:15' as time),
	cast('13:13:15 +1:00' as time(0) with time zone),
	cast('2003-12-31 13:13:15 -02:00' as timestamp(0) with time zone),
	cast('2003-12-31' as interval month to day),
	cast('13:13:15' as interval minute to second)
from a;

-- <search_condition>
select*from a,b where a.a=b.b and a.c<20 or b.d<>30 and not a.d>='a';
select*from a,b where a.a is not null and (b.b>5 is false) or a.d<4 is true;
select*from a,b where a.a not between b.b and b.c or a.a in ('a','b') and b.b not in (select*from c);
select*from a,b where a.a like 'abc%' escape '%' or b.b not like '_bc';
select*from a,b where (a.a is null or b.b=any(select*from c)) and not exists(select * from d);
select*from a,b where unique(select*from c) and b.b match unique partial (select * from d);
select*from a,b where (values a.a,b.b) overlaps (values 1,2);

-- <table_exp>
select	*
from	a
where	a=b
group by a,b
having sum(a)>3;

-- <select_stmt>
select a as a1 from table_1;
select table_1.* from table_1 order by a,2 desc,b asc for update;
select table_1.* from table_1 for update of a,b;
select table_1.* from table_1 for read only;
select table_1.* from table_1 into :VarA,:FrmA.FieldB; --EXF5
select table_1.* from table_1 for read only into :VarA,:FrmA.FieldB; --EXF5
select table_1.* from table_1 order by a,2 into :VarA,:FrmA.FieldB for update of a,b; --EXF5

-- <insert_stmt>
insert into table_1 default values;
insert into table_1 select * from b;
insert into table_1 (select * from b);
insert into table_1 (a) values (1);
insert into table_1 (a,b) values (1,'2');
insert into table_1 (a,b) select * from b;;
insert into table_1 (a,b) table c;
insert into table_1 (a,b) c natural join d;

-- <update_stmt>
update set a=1,b=2 where current of cur1;
update table_1 set a=null,b=2 where current of :cur1;
update table_1 set a=1,b=default where c=3 and d='d';
update table_1 set a=null,b=(select max(c) from d);

-- <delete_stmt>
delete where current of cur1;
delete from table_2 where current of :cur2;
delete from table_3 where a=default or b=(select max(c) from d);
delete from table_4;

-- <sql_schema_def_stmt>
create schema schema_1 authorization ADM default character set UNICODE 
    create table table_1 (col1 varchar(20) not null, col2 nchar default current_user)
    create view view_1 (col1, col2) as select*from a with check option
;
create schema schema_2;
create global temporary table table_3 (col1 dec(10,2) default 0) on commit delete rows;
create local temporary table table_4 (col1 dec default null primary key) on commit preserve rows;
create table table_5 (
    col1 integer unique, col2 smallint unique,
    col3 numeric(5,0) references table_3(col1) match full on delete cascade,
    col4 numeric(5,0) references table_4(col1) match partial on delete set default on update set null,
    col5 numeric(5,0) references table_1(col1) on update no action on delete cascade check (col5<col4),
    col6 date not null check (col5<col4 and col6<=date'2003-12-31') unique,
    unique (col1,col4) initially immediate not deferrable,
    constraint pk5 primary key (col1) initially deferred,
    foreign key (col4,col5) references table_7(col2,col3) not deferrable initially immediate,
    constraint ck2 check (col5 is not null)
);
create view view_1 (col1,col2) as values (1,2);
create view view_1 (col1,col2) as values (1,2) with check option;
create view view_1 (col1,col2) as select a,b from c with local check option;
create view view_1 (col1,col2) as table c with cascaded check option;
grant all privileges on table_1 to public with grant option;
grant delete,insert(col1,col2),update, references on table table_1 to user1, user1;
grant usage on domain dom1 to user3;
grant usage on collation col1 to user4, user5;
grant usage on character set cs1 to user6;
grant usage on translation tn1 to user7;
create domain mydecimal decimal(10) default 1 check (mydecimal>=0) initially immediate not deferrable;
create domain myinteger as integer constraint myintegconstr1 check(myinteger is not null);
create domain mynchar as nchar(100) collate schema1.collation2;
create character set cs1 get WIN1250 collation from desc(collation1);
create character set cs2 as get unicode collate collation2;
create character set cs3 as get WIN1250;
create character set cs4 get WIN1250 collation from external('externcollat2');
create character set cs5 get WIN1250 collation from translation tn1 then collation collation1;
create collation collation1 for cs1 from default no pad;
create collation collation2 for cs2 from translation tn1 then collation collation1;
create collation collation3 for cs3 from external('externcollat2') pad space;
create translation tn1 for cs1 to cs2 from external('externtransl2');
create translation tn2 for cs2 to cs3 from identity;
create translation tn3 for cs3 to cs4 from tn2;
create assertion assertconstr1 check(1=(select count(*) from a)) initially immediate not deferrable;
create assertion assertconstr2 check((select max(b) from c)>0);

-- <sql_schema_manipulat_stmt>
drop schema cat1.schema1 cascade;
drop schema cat1.schema2 restrict;
alter table table_1 add col8 decimal not null;
alter table table_1 add column col9 date;
alter table table_1 add column col5 numeric(5,0) references table_1(col1) on update no action on delete cascade check (col5<col4);
alter table table_1 alter col5 drop default;
alter table table_1 alter column col5 set default session_user;
alter table table_1 drop col5 cascade;
alter table table_2 drop column col6 restrict;
alter table table_2 add constraint ck4 check (col5 is not null);
alter table table_2 add foreign key (col4,col5) references table_7(col2,col3) not deferrable initially immediate;
alter table table_2 drop constraint ck4 cascade;
drop table table_2 cascade;
drop view view_1 cascade;
revoke grant option for all privileges on table c from user1,user2 cascade;
revoke select,insert on table_1 from public restrict;
revoke usage on domain dom1 from public restrict;
revoke usage on collation col1 from user1 cascade;
revoke usage on character set cs1 from user2,user3 restrict;
revoke usage on translation tn1 from user5 cascade;
alter domain dom1 set default 1;
alter domain dom1 drop default;
alter domain dom1 add constraint myintegconstr2 check(myinteger>3);
alter domain dom1 drop constraint myintegconstr2;
drop domain dom1 cascade;
drop domain dom1 restrict;
drop character set cs5;
drop collation collation1;
drop translation tn3;
drop assertion assertconstr1;

-- <sql_transaction_stmt>
commit;
commit work;
rollback;
rollback work;
set constraints all deferred; 
set constraints table_5.pk5, ck2 immediate; 
set transaction read only, isolation level read uncommitted;
set transaction read write, isolation level read committed, diagnostics size 20;
set transaction isolation level repeatable read;
set transaction isolation level serializable, read write;

-- <sql_connection_stmt>
connect to default;
connect to :server1;
connect to 'server1' as :conectname2;
connect to 'server1' user 'user1';
connect to 'server1' as 'conectname3' user :user1;
disconnect all;
disconnect current;
disconnect default;
disconnect :conectname2;
disconnect 'conectname13';
set connection default;
set connection :conectname2;
set connection 'conectname13';

-- <sql_session_stmt>
set catalog :cat1;
set catalog 'cat2';
set schema :schema1;
set schema 'schema2';
set names :cs1;
set names 'WIN1250';
set session authorization :auth1;
set session authorization 'AUTH2';
set time zone local;
set time zone INTERVAL -'12:59' hour to minute;
set time zone interval +'13:00' hour to minute;

-- <sql_dyn_stmt>
prepare 'stmt1' from :strSQL1;
prepare global :stmt2 from :strSQL2;
deallocate prepare stmt1;
describe input 'stmt1' using sql descriptor :descr1;
describe output global :stmt2 into sql descriptor :descr2;
execute stmt1 into :Var1,:Var2 into sql descriptor :descr3;
execute immediate :strSQL3;
allocate local 'cur1' insensitive scroll cursor for global 'stmt1';
allocate local :cur2 insensitive scroll cursor for global :stmt2;
fetch next from 'cur1' into :Var1,:Var2;
fetch :cur2 into :Var1,:Var2;
fetch absolute 1 from 'cur1' into :Var1,:Var2;
fetch relative -1 from 'cur1' into :Var1,:Var2;
fetch last from :cur2 into :Var1,:Var2;
open 'cur1';
close 'cur1';

-- <system_descriptor_stmt>
allocate descriptor global 'descr4' with max 10;
allocate descriptor :descr5;
deallocate descriptor :descr5;
set descriptor 'descr4' count=2;
set descriptor 'descr4' value 1 type='decimal', length=20;
set descriptor 'descr4' value 1 data=:mydata1;
set descriptor 'descr4' value 2 type='date', length=6, nullable=1;
get descriptor 'descr4' :mycount=count;
get descriptor 'descr4' value 1 :mytype=type, :mylength=length;
get descriptor 'descr4' value 1 :mydata1=data;

-- <get_diag_stmt>
get diagnostics :myrow_cound=row_count, :mycommandfunc=command_function;
get diagnostics exception 1 :mysqlstate=returned_sqlstate, :myservername=server_name, :mycontr=constraint_name;

-- <declare_cursor>
declare cur1 insensitive scroll cursor for stmt1;
declare cur2 cursor for select * from a;

-- <temporary_table_decl>
declare local temporary table schema1.temptable3 (col1 dec(10,2) default 0) on commit delete rows;
declare local temporary table schema1.temptable4 (col1 dec default null primary key) on commit preserve rows;
declare local temporary table schema1.temptable4 (col1 date);
