/*
 * Parser Rules
 */

sql_stmt	: ( select_stmt
                  | update_stmt ) ;

select_stmt
 : ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
   select_or_values ( compound_operator select_or_values )*
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

select_or_values
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;


/*
 * Lexer Rules
 */


fragment S	: ('S'|'s') ;
fragment E	: ('E'|'e') ;
fragment L	: ('L'|'l') ;
fragment C	: ('C'|'c') ;
fragment T	: ('T'|'t') ;

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;

SELECT	: S E L E C T ;

WHITESPACE          : (' ' | 't') ;
 
NEWLINE             : ('r'? 'n' | 'r')+ ;
 
TEXT                : ~[])]+ ;
