/*
 * $Id: fort.g,v 1.23 1998/10/29 23:12:58 sawdey Exp $
 *
 * Fortran 77 grammar
 *
 * Copyright by the Regents of the University of Minnesota, 1996,1997
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA
 *
 */

#header <<
	#include "ttype.h"
	#define AST_FIELDS Attrib attr; int token; int nodeno; int flags;
	struct _ast *zzmk_ast();
	#define zzcr_ast(ast,attr,tok,text) ZZcr_ast(ast,attr,tok,text)
	void ZZcr_ast(struct _ast*, Attrib *, int, char *);
	#include "fort.h"
	#include "main.h"
	#define SORAST AST
	>>

<<
/* Make an AST node from a #[attribute, token] constructor
 *
 * Take the newly created AST 'node' (which holds an attribute)
 * and simply place the attribute passed in into the new node.
 * The attr argument is the attribute associated with the token 
 * for which the AST node is being created.
 */
AST *zzmk_ast(node, attr, tok)
AST *node;
Attrib attr;
int tok;
{
	node->attr = strdup(attr);
	node->token = tok;
	return node;
}

void
ZZcr_ast(AST *t, Attrib *a, int tok, char *text)
{
	if(tok == Eof) {
	  t->attr = strdup("Eof");
	} else {
	  t->attr = strdup(*a); 
    	  t->token = tok;
	}
}
#include "charptr.c"
>>

#token SEOF "@"
#token SEOS

#token SBYTE
#token SLOGICAL
#token SINTEGER
#token SREAL
#token SDOUBLE
#token SCOMPLEX
#token SDCOMPLEX
#token SCHARACTER

#token SCOMMENT
#token SDIR
#token SLABEL
#token SUNKNOWN
#token SHOLLERITH
#token SICON
#token SRCON
#token SDCON
#token SCCON
#token SBITCON
#token SOCTCON
#token SHEXCON
#token STRUE
#token SFALSE
#token SNAME
#token SNAMEEQ
#token SFIELD
#token SSCALE
#token SINCLUDE
#token SLET
#token SASSIGN
#token SAUTOMATIC
#token SBACKSPACE
#token SBLOCK
#token SCALL
#token SCLOSE
#token SCOMMON
#token SCONTINUE
#token SDATA
#token SDIMENSION
#token SDO
#token SIDO
#token SSEP
#token SELSE
#token SELSEIF
#token SEND
#token SENDFILE
#token SENDIF
#token SENTRY
#token SEQUIV
#token SEXTERNAL
#token SFORMAT
#token SFUNCTION
#token SGOTO
#token SASGOTO
#token SCOMPGOTO
#token SARITHIF
#token SLOGIF
#token SBLOCKIF
#token SIMPLICIT
#token SINQUIRE
#token SINTRINSIC
#token SNAMELIST
#token SOPEN
#token SPARAM
#token SPAUSE
#token SPRINT
#token SPROGRAM
#token SPUNCH
#token SREAD
#token SREAD2
#token SRETURN
#token SREWIND
#token SSAVE
#token SSTATIC
#token SSTOP
#token SSUBROUTINE
#token STHEN
#token STO
#token SUNDEFINED
#token SWRITE
#token SLPAR
#token SRPAR
#token SEQUALS
#token SCOMMA
#token SCURRENCY
#token SSTARIO
#token SNONE
#token SASSUMEDIM

#token SPLUS
#token SMINUS
#token SSTAR
#token SSLASH
#token SPOWER
#token SCONCAT
#token SAND
#token SOR
#token SNEQV
#token SEQV
#token SNOT
#token SEQ
#token SLT
#token SGT
#token SLE
#token SGE
#token SNE

#token SCOLON
#token SENDDO
#token SWHILE
#token SSLASHD
#token SFMTSPEC
#token SENDINCLUDE
#token SPOINTER
#token SLEN
#token SSFUNC
#token SSUBSTRING

/* one unit of a fortran program */
executable_unit! "1 executable_program" :	
	( (function_statement)? function_subprogram | 
	  main_program | subroutine_subprogram | blockdata_subprogram )
	{ ( SEOF )?(SEOF <<eof_seen++;>>) }
	;

/* 2 */
main_program! "2 main_program" :
	<<stat_line = zzthis_line;>>
	{ ps:program_statement << new_statement(#ps,0,stat_line,NULL); >> }
	subprogram_body
	;

/* 3 */
function_subprogram! "3 function_subprogram" :
	<<stat_line = zzthis_line;>>
	fs:function_statement << new_statement(#fs,0,stat_line,NULL); >> 
	subprogram_body
	;

/* 4 */
subroutine_subprogram! "4 subroutine_subprogram" :
	<<stat_line = zzthis_line;>>
	ss:subroutine_statement << new_statement(#ss,0,stat_line,NULL); >>
	subprogram_body
	;

/* 5 - block_data_subprogram */
blockdata_subprogram! "5 blockdata_subprogram" :
	<<stat_line = zzthis_line;>>
	bs:blockdata_statement << new_statement(#bs,0,stat_line,NULL); >>
	subprogram_body
	;

/* 6 */
other_specification_statement "6 other_specification_statement" :
      <<statlev_is(2)>>? 
      ( dimension_statement   |
	equivalence_statement |
	intrinsic_statement   |
	save_statement )
      ;

/* 7 */
executable_statement "7 executable_statement" :
      (	assignment_statement |
	goto_statement |
	arithmetic_if_statement |
	(block_if_statement)? |
	logical_if_statement |
	else_if_statement |
	else_statement |
	end_if_statement |
	do_statement |
	while_statement |
	enddo_statement |
	continue_statement |
	stop_statement |
	pause_statement |
	read_statement |
	write_statement |
	print_statement |
	rewind_statement |
	backspace_statement |
	endfile_statement |
	open_statement |
	close_statement |
	inquire_statement |
	call_statement |
	return_statement )
      ;

/* 8 */
program_statement "8 program_statement" : SPROGRAM^ n:SNAME seos
	<< new_program(#n->attr); >> ;

seos! "end of statement" : SEOS ;

/* 9, 11, 13 */
entry_statement "9,11,13 entry_statement" : 
	<< nlist *eargs = NULL; >>
	SENTRY^ n:SNAME {SLPAR! {namelist > [eargs]} SRPAR!} 
	<< entry_decl(#n->attr,eargs); >>
	;

/* 10 */
function_statement "10 function_statement" :
	<< int ty=0,tyl=0; nlist *fparams = NULL; >>
	{ (typename > [ty,tyl] | 
	   character_with_len << ty = TYPE_CHAR; >> ) } 
	SFUNCTION^ n:SNAME SLPAR! { namelist > [fparams] } SRPAR! seos
	<< new_function(#n->attr, fparams,ty,tyl); >>
	;

blockdata_statement "blockdata_statement" :
	SBLOCK^ SNAME seos
	;

/* 12 */
subroutine_statement "12 subroutine_statement" :
	<< nlist *fparams = NULL; >>
	SSUBROUTINE^ n:SNAME { SLPAR! { namelist > [fparams] } SRPAR! } seos
	<< new_subroutine(#n->attr,fparams); >>
	;
	
namelist > [nlist *nl] "namelist" : 
	<< $nl = NULL; >>
	n:SNAME << $nl = new_nlist(#n->attr); >> 
	( SCOMMA! m:SNAME << add_nlist($nl,#m->attr); >> )* ;

statement "statement" :
	format_statement |
	entry_statement |
	implicit_statement |
	parameter_statement |
	type_statement        |
	common_statement      |
	pointer_statement |
	include_statement |
	endinclude |
	directive |
	<<statlev_is(3)>>? external_statement |
	other_specification_statement <<statlev_set(2);>> |
	<<statlev_is(4)>>? data_statement <<statlev_set(3);>> |
	(statement_function_statement)? <<statlev_set(3);>> |
	executable_statement <<statlev_set(4);>>
	;

/* 2,3,4,5 body of a subprogram (after program/subroutine/function line) */
subprogram_body! "2,3,4,5 subprogram_body" :
	<< char *lab; statlev_reset(); >>
	(<<int inclev; >> 
	 <<inclev=include_level; stat_line=zzthis_line;>> 
	 optlabel! > [lab] curst:whole_statement 
         << new_statement(#curst,inclev,stat_line,lab); >> )*
	 <<stat_line = zzthis_line;>>
	 optlabel! > [lab] endst:end_statement
	 << new_statement(#endst,include_level,stat_line,lab); >> 
	;

optlabel! > [char *lab]: <<$lab=NULL;>> 
	{ l:SLABEL <<$lab=strdup($l);>> } ;

whole_statement "whole statement" :
	 statement seos ;

end_statement "end_statement" :
	 SEND seos ;

directive "directive" : SDIR^ d:SHOLLERITH
			<<fz_directive_during_parse($d);>>
			;

include_statement "include_statement" :
	SINCLUDE^ SHOLLERITH << include_level++; >> ;

endinclude "end of include file" : SENDINCLUDE << include_level--; >> ;

/* 15 */
dimension_statement "15 dimension_statement" : 
	SDIMENSION^ array_declarators[0,0];

/* 16 */
array_declarator[int type,int typelen] "16 array_declarator" : 
	<< struct array_ext_list *elist; >>
	n:SNAME^ SLPAR! array_declarator_extents > [elist] SRPAR! 
	<< array_decl(#n->attr,type,typelen,elist); >>
	 { type_statement_len_spec }
	;

array_declarators[int type, int typelen] "array_declarators" : 
	array_declarator[type,typelen] 
	(SCOMMA! array_declarator[type,typelen])* ;

array_declarator_extents > [struct array_ext_list *rv]
	"array_declarator_extents" : <<struct array_ext_list *tmp; >>
	array_declarator_extent > [$rv] 
	(SCOMMA! array_declarator_extent > [tmp] 
	   << tmp->next = $rv; $rv = tmp; >> 
	)* 
	;

array_declarator_extent > [struct array_ext_list *rv]
	"array_declarator_extent" : 
	<< fpe_code r1=fpe_noarg,r2=fpe_noarg; $rv=NULL; >>
	( iexpr_code > [r1] 
	  { SCOLON^ 
		(iexpr_code > [r2] | 
		 s1:SSTAR <<#s1->token=SASSUMEDIM; r2=fpe_nil;>> ) 
	  } 
	  | s2:SSTAR <<#s2->token=SASSUMEDIM;>>
	)
	<< $rv = array_ext_list_new(r1,r2); >>
	;

/* 17 */
equivalence_statement "17 equivalence_statement" : 
	SEQUIV^ equiv_entity_group (SCOMMA! equiv_entity_group)* ;

equiv_entity_group: SLPAR^ equiv_entity (SCOMMA! equiv_entity)* SRPAR! ;

/* 18 */
equiv_entity "18 equiv_entity": var_ref[0] ;

/* 19 */
common_statement "19 common_statement": 
	<<statlev_is(3)>>?
	SCOMMON^ common_block (SCOMMA! common_block)* |
	SCOMMON^ common_items 
	;
common_name "common_name":  
	( SSLASH! SNAME^ SSLASH! |
	  SSLASH^ SSLASH! )  ;
common_item "common_item": 
	n:SNAME <<scalar_decl(#n->attr,0,0);>> |
	array_declarator[0,0] 
	;
common_items "common_items": common_item (SCOMMA! common_item)* ;
common_block! "common_block": cn:common_name ci:common_items 
	<< #0 = #(#cn,#ci); >> ;

/* 20 */
type_statement! "20 type_statement": 
	<< int ty,tyl; >>
	<<statlev_is(3)>>?
	tn:typename > [ty,tyl]
	tl:type_statement_name_list[ty,tyl]
	<< #0 = #(NULL,#tn,#tl); >>
	|
	ct:character_with_len
	cl:type_statement_name_char_list
	<< #0 = #(NULL,#ct,#cl); >>
	;

type_statement_name_list[int type, int typelen] 
	"type_statement_name_list":
	type_statement_name[type,typelen] 
	( SCOMMA! type_statement_name[type,typelen] )*
	;
type_statement_name[int type,int typelen] "type_statement_name": 
	n:SNAME^ <<scalar_decl(#n->attr,type,typelen);>> | 
	array_declarator[type,typelen] ;

type_statement_name_char_list
	"type_statement_name_char_list":
	type_statement_name_char ( SCOMMA! type_statement_name_char )*
	;
type_statement_name_char "type_statement_name_char": 
	(n:SNAME^ <<scalar_decl(#n->attr,TYPE_CHAR,0);>> 
	 { type_statement_len_spec }
        | array_declarator[TYPE_CHAR,0]
	)  ;

type_statement_len_spec "type_statement_len_spec" :
	  s:SSTAR^ <<#s->token = SLEN;>> len_specification ;
	

typename > [int type,int typelen] "typename": 
	<< $typelen = -1; >>
	( SREAL^      << $type = TYPE_REAL;    >> |
	  SCOMPLEX^   << $type = TYPE_COMPLEX; >> |
	  SDOUBLE^    << $type = TYPE_DOUBLE;  $typelen = -2; >> |
	  SDCOMPLEX^  << $type = TYPE_COMPLEX; $typelen = -2; >> |
          SINTEGER^   << $type = TYPE_INT;     >> |
	  SLOGICAL^   << $type = TYPE_LOGICAL; >> )
	{ typename_len > [$typelen] }
	;

typename_len > [int typelen] "typename_len" :
	s:SSTAR^ l:SICON << #s->token = SLEN; $typelen = atoi(#l->attr); >>
	;

/* "Cray" pointer */

pointer_statement "pointer_statement" :
	<<statlev_is(3)>>?
	SPOINTER pointer_decl (SCOMMA! pointer_decl)* ;

pointer_decl "pointer_decl" :
	SLPAR!  ptr:SNAME^ <<scalar_decl(#ptr->attr,TYPE_POINTER,0);>>
	SCOMMA! pte:SNAME <<scalar_decl(#pte->attr,TYPE_POINTEE,0);>>
	SRPAR!
	;


/* 21 */
implicit_statement "21 implicit_statement": 
	<<statlev_is(1)>>? SIMPLICIT^ ( implicit_none | implicit_specs ) ;

implicit_spec "implicit_spec": 
	SNAME^ { implicit_len }
	SLPAR! implicit_letters SRPAR! ;

implicit_len "implicit_len": s:SSTAR^ <<#s->token = SLEN;>> len_specification ;

implicit_specs "implicit_specs": implicit_spec ( SCOMMA! implicit_spec )* ;

implicit_none "implicit_none": <<isstr(LATEXT(1),NONE)>>? n:SNAME 
	<<#n->token = SNONE;>> ;

implicit_letter "implicit_letter": <<isletter(LATEXT(1))>>? SNAME ;

implicit_range "implicit_range": implicit_letter { SMINUS^ implicit_letter };

implicit_letters "implicit_letters": 
	implicit_range ( SCOMMA! implicit_range )* ;

/* 22 */
len_specification "22 len_specification": 
	( (SLPAR! s:SSTAR <<#s->token = SLEN;>> SRPAR!)? | SICON |
	  SLPAR int_constant_expr SRPAR ) ;

character_with_len "character_with_len": SCHARACTER^ { cwl_len } ; 

cwl_len "character_with_len actual length" :
	s:SSTAR^ <<#s->token = SLEN;>> len_specification
	;

/* 23 */
parameter_statement "23 parameter_statement": 
	<<statlev_is(3)>>? SPARAM^ SLPAR! paramlist SRPAR!;

paramlist "paramlist": paramassign ( SCOMMA! paramassign )* ;
paramassign "paramassign": n:SNAME SEQUALS^ e:constant_expr 
	<< param_decl(#n->attr,#e); >>
	;

/* 24 */
external_statement "24 external_statement" :
	<< nlist *extns = NULL; >>
	SEXTERNAL namelist > [extns] << external_decl(extns); >> ;

/* 25 */
intrinsic_statement "25 intrinsic_statement" : 
	<< nlist *nl = NULL; >>
	SINTRINSIC^ namelist > [nl] << intrinsic_decl(nl); >> ;

/* 26 */
save_statement "26 save_statement" : SSAVE^ save_entity (SCOMMA! save_entity)* ;
save_entity "save_entity": ( SNAME | SSLASH^ SNAME SSLASH! ) ;

/* 27 */
data_statement "27 data_statement" : 
	SDATA^ data_statement_entity ({SCOMMA!} data_statement_entity)* ;
data_statement_item "data_statement_item" : 
	var_ref[0] | data_implied_do ;

data_statement_multiple "data_statement_multiple" : 
	{(SICON | SNAME) s:SSTAR^ <<#s->token = SLEN;>>} (constant | SNAME) ;

data_statement_entity "data_statement_entity" : 
	dse1 dse2 ;

dse1:   data_statement_item (SCOMMA! data_statement_item)*
	SSLASH^ ;
dse2:   data_statement_multiple 
	(SCOMMA! data_statement_multiple)* SSLASH^ ;

/* 28 */
data_implied_do "28 data_implied_do" : 
	l:SLPAR^ <<#l->token=SIDO;>>
	data_implied_do_list s:SCOMMA <<#s->token=SSEP;>>
	SNAME SEQUALS! int_constant_expr
	SCOMMA! int_constant_expr { SCOMMA! int_constant_expr } SRPAR! ;

data_implied_do_list "data_implied_do_list" :
	(data_implied_do_list_what SCOMMA! data_implied_do_list)? |
	data_implied_do_list_what ;

data_implied_do_list_what "data_implied_do_list_what" : 
	(var_ref[0] | data_implied_do ) ;

/* 29 */
assignment_statement "29 assignment_statement" : 
	SLET^ var_ref[0] SEQUALS! expression |
	SASSIGN^ l:SICON <<#l->token=SLABEL;>> STO! variable_name 
	;

/* 30 */
goto_statement "30 goto_statement" : 
	(unconditional_goto | computed_goto | assigned_goto) ;

/* 31 */
unconditional_goto "31 unconditional_goto" : 
	SGOTO^ l:SICON <<#l->token=SLABEL;>> ;

/* 32 */
computed_goto "32 computed_goto" : 
	SCOMPGOTO^ SLPAR! label_list SRPAR {SCOMMA!} integer_expr ;

/* 33 */
assigned_goto "33 assigned_goto" : 
	SASGOTO^ SNAME { {SCOMMA!} SLPAR! label_list SRPAR! } ;

label_list "label_list": l1:SICON <<#l1->token=SLABEL;>>
	(SCOMMA! l2:SICON <<#l2->token=SLABEL;>> )* ;

/* 34 */
arithmetic_if_statement "34 arithmetic_if_statement" : 
	SARITHIF^ SLPAR! int_real_dp_expr SRPAR!
	l1:SICON SCOMMA! l2:SICON SCOMMA! l3:SICON 
	<<#l1->token=SLABEL; #l2->token=SLABEL; #l3->token=SLABEL;>>
	;

/* 35 */
logical_if_statement "35 logical_if_statement" : 
	SLOGIF^ SLPAR! logical_expression SRPAR! 
	executable_statement ;

/* 36 */
block_if_statement "36 block_if_statement" : 
	i:SLOGIF^ <<#i->token = SBLOCKIF;>>
	  SLPAR! logical_expression SRPAR! STHEN! ;

/* 37 */
else_if_statement "37 else_if_statement" : 
	SELSEIF^ SLPAR! logical_expression SRPAR! STHEN! ;

/* 38 */
else_statement "38 else_statement" : SELSE ;

/* 39 */
end_if_statement "39 end_if_statement" : SENDIF ;

/* 40 */
do_statement "40 do_statement" : 
	SDO^ { l:SICON <<#l->token=SLABEL; check_do_label(#l->attr);>> 
	       {SCOMMA!} } 
	variable_name SEQUALS! int_real_dp_expr
	SCOMMA! int_real_dp_expr { SCOMMA! int_real_dp_expr } ;

while_statement "while_statement" :
	SDO! SWHILE^ SLPAR! logical_expression SRPAR! ;

enddo_statement "enddo_statement" : SENDDO ;

/* 41 */
continue_statement "41 continue_statement" : SCONTINUE ;

/* 42 */
stop_statement "42 stop_statement" : SSTOP^ (SICON|SHOLLERITH|) ;

/* 43 */
pause_statement "43 pause_statement" : SPAUSE^ (SICON|SHOLLERITH) ;

/* 44 */
write_statement "44 write_statement" : 
	SWRITE^ SLPAR control_info_list SRPAR { io_list } ;

/* 45 */
read_statement "45 read_statement" : 
	r:SREAD^ 
	( 
	  (format_identifier { SCOMMA io_list } SEOS)? 
	  (<<;>> <<#r->token=SREAD2;>> format_identifier { SCOMMA io_list }) |
	  SLPAR control_info_list SRPAR { io_list } ) ;

/* 46 */
print_statement "46 print_statement" : 
	SPRINT^ format_identifier {SCOMMA io_list } ;

/* 47 */
control_info_list "47 control_info_list" : 
	control_info_list_item (SCOMMA! control_info_list_item)*
	;

control_err_spec "err=label specification":
	control_err  SEQUALS^ 
	( l:SICON <<#l->token=SLABEL;>> |
	  SNAME )
	;

control_info_list_item "control_info_list_item" :	
	unit_identifier | SHOLLERITH |
	control_fmt SEQUALS^ format_identifier |
	control_unit SEQUALS^ unit_identifier |
	control_rec SEQUALS^ integer_expr |
	control_end SEQUALS^ SICON |
	control_err_spec |
	control_iostat SEQUALS^ var_ref[0] ;

/* 48 */
/* io_list "48 io_list" : (io_list_item SCOMMA! io_list)? | io_list_item ; */
io_list "48 io_list" : 
	io_list_item (SCOMMA! io_list_item)*
	;

io_list_item "io_list_item" : 
	(io_implied_do_list)? | expression
	;

/* 49 */
io_implied_do_list "49 io_implied_do_list" : 
	l:SLPAR^ <<#l->token = SIDO;>>
	io_list c:SCOMMA <<#c->token = SSEP;>> variable_name SEQUALS!
	int_real_dp_expr SCOMMA! int_real_dp_expr
	{ SCOMMA! int_real_dp_expr } SRPAR! ;

/* 50 */
open_statement "50 open_statement" : 
	SOPEN^ SLPAR open_control (SCOMMA open_control)* SRPAR ;

open_control "open_control" : 
	unit_identifier |
	control_unit SEQUALS^ unit_identifier |
	control_err_spec |
	control_file SEQUALS^ character_expression |
	control_status SEQUALS^ character_expression |
	(control_access|control_position) SEQUALS^ character_expression|
	control_form SEQUALS^ character_expression |
	control_recl SEQUALS^ integer_expr |
	control_blank SEQUALS^ character_expression |
	control_iostat SEQUALS^ var_ref[0] ;

control_fmt "control_fmt" : <<isstr(LATEXT(1),FMT)>>? SNAME ;
control_unit "control_unit" : <<isstr(LATEXT(1),UNIT)>>? SNAME ;
control_rec "control_rec" : <<isstr(LATEXT(1),REC)>>? SNAME ;
control_end "control_end" : <<isstr(LATEXT(1),END)>>? SNAME ;
control_err "control_err" : <<isstr(LATEXT(1),ERR)>>? SNAME ;
control_iostat "control_iostat" : <<isstr(LATEXT(1),IOSTAT)>>? SNAME ;
control_file "control_file" : <<isstr(LATEXT(1),FILE)>>? SNAME ;
control_status "control_status" : <<isstr(LATEXT(1),STATUS)>>? SNAME ;
control_access "control_access" : <<isstr(LATEXT(1),ACCESS)>>? SNAME ;
control_position "control_position" : <<isstr(LATEXT(1),POSITION)>>? SNAME ;
control_form "control_form" : <<isstr(LATEXT(1),FORM)>>? SNAME ;
control_recl "control_recl" : <<isstr(LATEXT(1),RECL)>>? SNAME ;
control_blank "control_blank" : <<isstr(LATEXT(1),BLANK)>>? SNAME ;
control_exist "control_exist" : <<isstr(LATEXT(1),EXIST)>>? SNAME ;
control_opened "control_opened" : <<isstr(LATEXT(1),OPENED)>>? SNAME ;
control_number "control_number" : <<isstr(LATEXT(1),NUMBER)>>? SNAME ;
control_named "control_named" : <<isstr(LATEXT(1),NAMED)>>? SNAME ;
control_name "control_name" : <<isstr(LATEXT(1),NAME)>>? SNAME ;
control_sequential "control_sequential" : <<isstr(LATEXT(1),SEQUENTIAL)>>? SNAME ;
control_direct "control_direct" : <<isstr(LATEXT(1),DIRECT)>>? SNAME ;
control_formatted "control_formatted" : <<isstr(LATEXT(1),FORMATTED)>>? SNAME ;
control_unformatted "control_unformatted" : <<isstr(LATEXT(1),UNFORMATTED)>>? SNAME ;
control_nextrec "control_nextrec" : <<isstr(LATEXT(1),NEXTREC)>>? SNAME ;

/* 51 */
close_statement "51 close_statement" : 
	SCLOSE^ SLPAR close_control (SCOMMA close_control)* SRPAR ;

close_control "close_control" : 
	unit_identifier |
	control_unit SEQUALS^ unit_identifier |
	control_err_spec |
	control_status SEQUALS^ character_expression |
	control_iostat SEQUALS^ var_ref[0] ;

/* 52 */
inquire_statement "52 inquire_statement" : 
	SINQUIRE^ SLPAR inquire_control (SCOMMA inquire_control)* SRPAR ;

inquire_control "inquire_control" : 
	control_unit SEQUALS^ unit_identifier|
	control_file SEQUALS^ character_expression |
	control_err_spec |
	(control_iostat|control_exist|control_opened|
	 control_number|control_named|control_name|
	 control_access|control_sequential|control_direct|
	 control_form|control_formatted|control_unformatted|
	 control_recl|control_nextrec|control_blank) 
	  SEQUALS^ var_ref[0]  |
	unit_identifier
	;

/* 53 */
backspace_statement "53 backspace_statement" : SBACKSPACE^ ber_finish ;

/* 54 */
endfile_statement "54 endfile_statement" : SENDFILE^ ber_finish ;

/* 55 */
rewind_statement "55 rewind_statement" : SREWIND^ ber_finish ;

ber_finish "ber_finish": 
	( (unit_identifier SEOS)?(unit_identifier) | 
	  p:SLPAR<<#p->token=SSEP;>>
	  ber_finish_item (SCOMMA ber_finish_item)* SRPAR! ) ;

ber_finish_item "ber_finish_item" : 
	unit_identifier | 
	control_unit SEQUALS^ unit_identifier |
	control_err_spec |
	control_iostat SEQUALS^ var_ref[0];

/* 56 */
unit_identifier "56 unit_identifier" : 
	iexpr | s:SSTAR<<#s->token=SSTARIO;>> ;

/* 57 */
format_identifier "57 format_identifier" : 
	 SHOLLERITH | iexpr | s:SSTAR<<#s->token=SSTARIO;>> ;

/* 58 */
format_statement "58 format_statement" : SFORMAT^ SFMTSPEC ;

/* 59-69 not needed (inside SFMTSPEC) */

/* 70 */
statement_function_statement "70 statement_function_statement" : 
	<< nlist *sfargs = NULL; >>
	<<sfunc_ok(LATEXT(2))>>? sf:SLET^ 
	n:sf_args > [sfargs] SEQUALS! ex:expression 
	<< #sf->token = SSFUNC; 
	   statement_function_decl(#n->attr,sfargs,#ex); >>
	;

sf_args > [nlist *nl] "statement function name and arguments" :
	<< $nl = NULL; >>
	SNAME^ SLPAR! namelist > [$nl] SRPAR!
	;

/* 71 */
call_statement "71 call_statement" : 
	SCALL^ subroutine_name { SLPAR! { call_argument_list } SRPAR! } ;

call_argument_list "call_argument_list" : 
	call_argument (SCOMMA! call_argument)* ;
call_argument "call_argument" : 
	variable_name | 
	expression | 
	SSTAR! l:SICON <<#l->token=SLABEL;>> ;

/* 72 */
return_statement "72 return_statement" : SRETURN^ { integer_expr } ;

/* 74 */
expression "74 expression" : nc_expr {SCOLON^ nc_expr} ;
nc_expr "non-colon expression" : lexpr0 (SCONCAT^ lexpr0)* ;
lexpr0 "lexpr0" : lexpr1 ((SNEQV^|SEQV^) lexpr1)* ;
lexpr1 "lexpr1" : lexpr2 (SOR^ lexpr2)* ;
lexpr2 "lexpr2" : lexpr3 (SAND^ lexpr3)* ;
lexpr3 "lexpr3" : SNOT^ lexpr3 | lexpr4 ;
lexpr4 "lexpr4" : aexpr0 { (SLT^|SLE^|SEQ^|SNE^|SGT^|SGE^) aexpr0 } ;
aexpr0 "aexpr0" : aexpr1 ((SPLUS^|SMINUS^) aexpr1)* ;
aexpr1 "aexpr1" : aexpr2 ((SSTAR^|SSLASH^) aexpr2)* ;
aexpr2 "aexpr2" : (SPLUS^|SMINUS^) aexpr2 | aexpr3 ;
aexpr3 "aexpr3" : aexpr4 { SPOWER^ aexpr3 } ;
aexpr4 "aexpr4" : (unsigned_arithmetic_constant)? | 
		  SHOLLERITH |
		  logical_constant |
		  var_ref[0] |
		  SLPAR^ expression SRPAR! ;

/* integer expression */
iexpr "iexpr" : << fpe_code rc; >>
	iexpr1 > [rc] ((SPLUS^|SMINUS^) iexpr1 > [rc] )* ;

/* integer expression with fpe return code. */
iexpr_code  > [fpe_code rc] "iexpr"  
	: << AST *op; fpe_code r2; $rc = fpe_nil; >>
	iexpr1 > [$rc] 
	((p:SPLUS^ <<op=#p;>>|m:SMINUS^<<op=#m;>>) 
	 iexpr1 > [r2] <<$rc = fpe_combine(op,$rc,r2);>> )* ;
iexpr1 > [fpe_code rc] "iexpr1" 
	: << AST *op; fpe_code r2; $rc = fpe_nil; >>
	iexpr2 > [$rc]
	((m:SSTAR^<<op=#m;>>|d:SSLASH^<<op=#d;>>) 
	 iexpr2 > [r2] <<$rc = fpe_combine(op,$rc,r2);>> )* ;
iexpr2 > [fpe_code rc] "iexpr2" 
	: << AST *op; $rc = fpe_nil; >>
	 (p:SPLUS^<<op=#p;>>|m:SMINUS^<<op=#m;>>) 
	  iexpr2 > [$rc] << $rc = fpe_combine(op,$rc,fpe_noarg); >>
	| iexpr3 > [$rc] ;
iexpr3 > [fpe_code rc] "iexpr3" 
	: << AST *op=NULL; fpe_code r2; $rc = fpe_nil; >>
	iexpr4 > [$rc] { p:SPOWER^ <<op=#p;>> iexpr3 > [r2] } 
	<<if(op != NULL) { $rc = fpe_combine(op,$rc,r2); } >>
	;
iexpr4 > [fpe_code rc] "iexpr4" 
	: << $rc = fpe_nil; >>
	i:SICON << $rc = fpe_combine(#i,fpe_noarg,fpe_noarg);>> 
	| var_ref_code[0] > [$rc]
	| SLPAR^ iexpr_code > [$rc] SRPAR! 
	;

/* 75 */
constant_expr "75 constant_expr" : expression ;

/* 76 */
arithmetic_expression "76 arithmetic_expression" : expression ;

/* 77 */
integer_expr "77 integer_expr" : iexpr ;

/* 78 */
int_real_dp_expr "78 int_real_dp_expr" : expression ;

/* 79 */
arithmetic_const_expr "79 arithmetic_const_expr" : expression ;

/* 80 */
int_constant_expr "80 int_constant_expr" :  expression ;

/* 82 */
character_expression "82 character_expression" : expression ;

/* 84 */
logical_expression "logical_expression" : expression ;

/* 85 */
logical_const_expr "85 logical_const_expr" :  expression ;
	
/* 88 */
array_element_name "88 array_element_name" : 
	<<isarray(LATEXT(1))>>? SNAME^ 
	SLPAR! integer_expr (SCOMMA! integer_expr)* SRPAR! ;

subscripts: SLPAR! { expression (SCOMMA! expression)* } SRPAR! ;

var_ref![int flags] "func or variable reference" :
	n:SNAME
	{ s:subscripts
	  { a:substring_app } }
	<< #0 = determine_ref(#[$n,SNAME],#s,#a,flags,NULL); >>
	;

var_ref_code![int flags] > [fpe_code rv] "func or variable reference" :
	n:SNAME
	{ s:subscripts
	  { a:substring_app } }
	<< #0 = determine_ref(#[$n,SNAME],#s,#a,flags,&$rv); >>
	;

substring_app "substring_app" :
	SLPAR! {nc_expr} SCOLON^ {nc_expr} SRPAR! ;

/* 91 */
variable_name "91 variable_name" : <<isvar(LATEXT(1))>>? 
	n:SNAME <<setvar(#n->attr);>> ;
/* 92 */
array_name "92 array_name" : <<isarray(LATEXT(1))>>? SNAME;

/* 97 */
subroutine_name "97 subroutine_name" : SNAME ;

/* 98 */
function_name "98 function_name" : 
	(SNAME SLPAR)? => <<func_ok(LATEXT(1))>>? n:SNAME^
    	<< setfunc(#n->attr); >> ;

/* 100 */
constant "100 constant" : 
	{ (SPLUS^|SMINUS^) } unsigned_arithmetic_constant |	
	SHOLLERITH | logical_constant 
	;

/* 101 */
unsigned_arithmetic_constant "101 unsigned_arithmetic_constant" : 
	SICON | SRCON | SDCON | complex_constant ;

/* 107 */
complex_constant "107 complex_constant" : 
	h:SLPAR^ << #h->token = SCCON; >> 
	  {(SPLUS|SMINUS)} (SICON|SRCON|SDCON) SCOMMA! 
	  {(SPLUS|SMINUS)} (SICON|SRCON|SDCON) SRPAR! ;

/* 108 */
logical_constant "108 logical_constant" : (STRUE | SFALSE);

/*
 * $Log: fort.g,v $
 * Revision 1.23  1998/10/29  23:12:58  sawdey
 * Apply GPL to TOPAZ.
 *
 * Revision 1.22  1997/06/28  20:07:48  sawdey
 * First TOPAZ version
 *
 * Revision 1.21  1997/06/26  19:13:10  sawdey
 * About to allow multiple refs per var within a def
 *
 * Revision 1.20  1997/06/17  23:01:58  sawdey
 * dgraph with scc handling is working
 *
 * Revision 1.20  1997/06/17  23:01:58  sawdey
 * dgraph with scc handling is working
 *
 * Revision 1.19  1997/05/02  16:58:22  sawdey
 * About to change from backwards ssa traversal
 * to forwards ssa traversal.
 *
 * Revision 1.19  1997/05/02  16:58:22  sawdey
 * About to change from backwards ssa traversal
 * to forwards ssa traversal.
 *
 * Revision 1.18  1997/04/15  17:19:09  sawdey
 * checkpoint 4/15
 * dep ranges work
 * c$fz directives recognized
 * about to answer questions based on directives
 *
 * Revision 1.18  1997/04/15  17:19:09  sawdey
 * checkpoint 4/15
 * dep ranges work
 * c$fz directives recognized
 * about to answer questions based on directives
 *
 * Revision 1.17  1997/03/03  20:38:25  sawdey
 * checkpoint 3/3/97
 * In the midst of DR computation.
 *
 * Revision 1.17  1997/03/03  20:38:25  sawdey
 * checkpoint 3/3/97
 * In the midst of DR computation.
 *
 * Revision 1.16  1997/02/18  19:44:16  sawdey
 * checkpoint 2/18
 * Just before adding SSA analysis
 *
 * Revision 1.16  1997/02/18  19:44:16  sawdey
 * checkpoint 2/18
 * Just before adding SSA analysis
 *
 * Revision 1.15  1997/02/08  22:07:15  sawdey
 * checkpoint 2/8/97
 * dominator tree construction
 *
 * Revision 1.15  1997/02/08  22:07:15  sawdey
 * checkpoint 2/8/97
 * dominator tree construction
 *
 * Revision 1.14  1997/01/23  22:39:29  sawdey
 * Checkpoint 1/23
 * In the middle of detecting FP decls
 *
 * Revision 1.13  1997/01/20  23:27:45  sawdey
 * Checkpoint 1/20
 * Parses/outputs micom and muscl16.
 *
 * Revision 1.12  1997/01/06  18:59:04  sawdey
 * Checkpoint 1/6/97
 * Just finished label transformations:
 *   * Split labels that are DO and GOTO targets
 *   * Convert DO LABEL into DO/ENDDO
 *
 * Revision 1.11  1996/12/13  03:34:01  sawdey
 * checkpoint 12/12
 *
 * Revision 1.10  1996/12/10  17:49:03  sawdey
 * checkpoint 12/10
 *
 * Revision 1.9  1996/12/06  04:40:46  sawdey
 * checkpoint 12/5
 *
 * Revision 1.8  1996/12/03  21:10:31  sawdey
 * checkpoint 12/3
 *
 * Revision 1.7  1996/11/26  00:05:14  sawdey
 * Checkpoint 11/25
 *
 * Revision 1.6  1996/11/21  18:26:04  sawdey
 * Checkpoint 11/21
 *
 * Revision 1.5  1996/11/20  19:02:44  sawdey
 * 11/20 checkpoint
 *
 * Revision 1.4  1996/11/19  18:20:09  sawdey
 * Checkpoint 11/19
 *
 * Revision 1.3  1996/11/15  18:13:46  sawdey
 * Checkpoint 11/15
 *
 * Revision 1.2  1996/11/14  16:52:58  sawdey
 * checkpoint 11/14
 *
 * Revision 1.1  1996/11/12  21:49:46  sawdey
 * Initial revision
 *
 */
