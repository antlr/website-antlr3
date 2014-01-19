
-----------------------------------
-- DmlSQL2Lexer      Operation Test
-- Author: Lubos Vnuk, 30 June 2003
-----------------------------------
Select	aDa, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVXYZ_0123456789",
	_catalog.schema.WIN1250'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVXYZ_0123456789€äÄßöÖüÜ',
	n'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVXYZ_0123456789€äÄßöÖüÜ',
	B'0110',x'0123456789abcdefABCEDF',
	-012345667890,.0123456789,1234567890.,1234567890.0123456789,1234567890e1234567890,-1234567890e-01234567890,
	o.eXp,.2e2,1.2e-3,1.e4
froM	_catalog.schema.ISO8859_2"delimited_€table"
where	1+((2-3)*5)/6||('7'||column_1)<>"column_2" aNd (: Param_1<n'A') Or ?>=3
	AND :__HostId$._2=:#&@HostId3--comment'1'ö°^äü@!"§$%&/()=?`µ~
--comment'2';
