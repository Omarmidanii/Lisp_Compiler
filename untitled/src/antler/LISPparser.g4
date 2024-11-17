parser grammar LISPparser;

options {tokenVocab=LISPlexer;}

program: ((OPEN_B* (expr)* CLOSE_B*) | comment EOF)
        ;

compair:EQUALKEY
    | NOTEQUALKEY
    | GREATERKEY
    | LESSKEY
    | NOTGREATERKEY
    | NOTLESSKEY
    | TRIM
    | TRIMLEFT
    | TRIMRIGHT;

exprString: STRINGKEY compair STRING STRING ;

expr : OPEN_B* (print
       | operatorExp
       | assign
       | list
       | operatorList
       | consExpr
       | let
       | write_line
       | write
       | if_else
       | cond
       | when
       | loop
       | dotimes
       | dolist
       | read
       | defun
       | exprChar
       | exprString
       | concatenate
       | format
       | sort
       | stringLenOrReverse
       | chatAtOrsubseq
       | stringCase
       | merge
       | atom
       ) CLOSE_B*
       ;
quoted: SINGLE_QUOTE expr;

read: OPEN_B READ CLOSE_B;

comment: SINGLECOMMENT | MULTIECOMMENT;

format: FORMAT (T | STREAM | NIL);
stringCase: STRINGKEY  SUBTRACT(
                | UPCASE
                | DOWNCASE
                | CAPITALIZE
                );

chatAtOrsubseq: (CHARKEY | SUBSEQ) STRING NUMBER;

stringLenOrReverse: (LENGTH | REVERSE) STRING;

sort:SORT stringVector HASH SINGLE_QUOTE STRINGKEY compair;

merge: MERGE SINGLE_QUOTE VECTOR stringVector stringVector HASH SINGLE_QUOTE STRINGKEY compair;

exprChar: CHARKEY (EQUALKEY
                | NOTEQUALKEY
                | GREATERKEY
                | LESSKEY
                | NOTGREATERKEY
                | NOTLESSKEY
                ) CHAR CHAR
                ;

stringVector: OPEN_B VECTOR STRING+ CLOSE_B;

concatenate: CONCATENATEKEY SINGLE_QUOTE STRINGKEY STRING STRING;

assign: SETQ ID ((NUMBER) | (STRING) | expr);

print: (PRINT | PRINC) expr;
write_line: WRITE_LINE expr;
write: WRITE expr;

list: ((SINGLE_QUOTE OPEN_B) | (OPEN_B LIST)) expr* CLOSE_B;

if_else: IF OPEN_B operatorExp CLOSE_B expr+;
cond: COND expr+;
when: WHEN OPEN_B operatorExp CLOSE_B expr+;

loop: LOOP ID (FROM expr TO expr | IN (list | ID)) insideLoop+;
insideLoop: DO expr;
dotimes: DOTIMES OPEN_B ID+ expr CLOSE_B expr+;

dolist: DOLIST OPEN_B ID (list | ID) CLOSE_B expr*;

defun: DEFUN ID OPEN_B (ID)* CLOSE_B expr+;

operatorExp: (operator1 expr expr*) #OPERATOR1

             | (operator2 expr)+ #OPERATOR2
             ;

operator1 : ADD
            | SUBTRACT
            | MULTIPLY
            | DIVIDE
            | AND
            | OR
            | EXPT
            | MOD
            | REM
            | EQUALKEY
            | GREATERKEY
            | NOTGREATERKEY
            | NOTEQUALKEY
            | NOTLESSKEY
            | LESSKEY
            | LOGAND
            | LOGIOR
            | LOGXOR
            | LOGNOR
            | LOGEQV
            | LOGNOT
            | INCF
            | DECF
            | MAX
            | MIN
            ;

operator2 : FLOOR
            | CEILING
            | ABS
            | NOT
            | ASH
            | LSH
            | SQRT
            | SIN
            ;

atom: NUMBER
     | STRING
     | ID
     | quoted
     | NIL
     | DOT
     ;

let: LET OPEN_B (OPEN_B ID expr* CLOSE_B)* CLOSE_B expr+;
consExpr: CONS expr expr;

operatorList: CAR expr
            | CDR expr
            | APPEND expr (expr)*
            | consExpr
            | FIRST expr
            | REST expr
            | LAST expr
            | NTH NUMBER expr
            | LENGTH expr
            | REMOVE expr expr
            | MEMBER expr expr
            | MAPCAR expr expr
            | FILTER expr expr
            ;