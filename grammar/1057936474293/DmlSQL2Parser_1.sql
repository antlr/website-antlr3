
-----------------------------------
-- DmlSQL2Parser     Operation Test
-- Author: Lubos Vnuk, 30 June 2003
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
