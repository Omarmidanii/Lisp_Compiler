lexer grammar LISPlexer;

// output & input
PRINT: [Pp][Rr][Ii][Nn][Tt];
PRINC: [Pp][Rr][Ii][Nn][Cc];
WRITE_LINE: [Ww][Rr][Ii][Tt][Ee][-][Ll][Ii][Nn][Ee];
WRITE: [Ww][Rr][Ii][Tt][Ee];
READ: [Rr][Ee][Aa][Dd];
WS:[ \t]+ -> channel(HIDDEN);
NEWLINE: [\n\r]+ -> skip;
SINGLECOMMENT: ';' [a-zA-Z1-9{}()|/\\'`~;:,.*-+_^&$%#@!?>< \\[\]]* -> skip;
MULTIECOMMENT: '|#' (.)*? '#|'-> skip;
SETQ: [Ss][Ee][Tt][Qq];
OPEN_B: '(';
CLOSE_B: ')';
HASH:'#';
SINGLE_QUOTE: '\'';
FORMAT: [fF][oO][rR][mM][aA][tT];
T: [tT];

//string
CHAR:'#\\' .;
CHARKEY:('c'|'C')('h'|'H')('a'|'A')('r'|'R');
STRINGKEY:('s'|'S')('t'|'T')('r'|'R')('i'|'I')('n'|'N')('g'|'G');
CONCATENATEKEY:('c'|'C')('o'|'O')('n'|'N')('c'|'C')('a'|'A')('t'|'T')('e'|'E')('n'|'N')('a'|'A')('t'|'T')('e'|'E');
UPCASE:[uU][pP][cC][aA][sS][eE];
DOWNCASE:[dD][oO][wW][nN][cC][aA][sS][eE];
CAPITALIZE:[cC][aA][pP][iI][tT][aA][lL][iI][zZ][eE];
TRIM:'-'[tT][rR][iI][mM];
TRIMLEFT:'-'[tT][rR][iI][mM]'-'[lL][Ee][fF][tT];
TRIMRIGHT:'-'[tT][rR][iI][mM]'-'[rR][iI][gG][hH][tT];
SUBSEQ:[sS][uU][bB][sS][eE][qQ];
SORT:[sS][oO][rR][tT];
MERGE:[mM][Ee][rR][gG][eE];
VECTOR:[vV][Ee][cC][tT][oO][rR];
REVERSE:[rR][Ee][vV][Ee][rR][sS][Ee];


// conditions
IF: [Ii][Ff];
COND: [Cc][Oo][Nn][Dd];
WHEN: [wW][hH][eE][nN];

// loops
DOTIMES: [Dd][Oo][Tt][Ii][Mm][Ee][Ss];
LOOP: [Ll][Oo][Oo][Pp][ ][Ff][Oo][Rr];
DO: [Dd][Oo];
IN: [Ii][Nn];
FROM: [Ff][Rr][Oo][Mm];
TO: [Tt][Oo];
DOLIST: [Dd][Oo][Ll][Ii][Ss][Tt];

//list
LIST: [Ll][Ii][Ss][Tt];
DOT: '.';
CAR: [Cc][Aa][Rr];
CDR: [Cc][Dd][Rr];
APPEND: [Aa][Pp][Pp][Ee][Nn][Dd];
CONS: [cC][oO][nN][sS];
FIRST: [fF][iI][rR][sS][tT];
REST: [rR][eE][sS][tT];
LAST: [lL][aA][sS][tT];
NTH: [nN][tT][hH];
LENGTH: [lL][eE][nN][gG][tT][hH];
REMOVE: [rR][eE][mM][oO][vV][eE];
MEMBER: [mM][eE][mM][bB][eE][rR];
MAPCAR: [mM][aA][pP][cC][aA][rR];
FILTER: [fF][iI][lL][tT][eE][rR];


//function
DEFUN: [Dd][Ee][Ff][Uu][Nn];


// operators
EQUALKEY:'='|('-'('e'|'E')('q'|'Q')('u'|'U')('a'|'A')('l'|'L'));
NOTEQUALKEY:'/='|('-'('n'|'N')('o'|'O')('t'|'T')'-'('e'|'E')('q'|'Q')('u'|'U')('a'|'A')('l'|'L'));
GREATERKEY:'>'|('-'('g'|'G')('r'|'R')('e'|'E')('a'|'A')('t'|'T')('e'|'E')('r'|'R')('p'|'P'));
LESSKEY:'<'|('-'('l'|'L')('e'|'E')('s'|'S')('s'|'S')('p'|'P'));
NOTGREATERKEY:'<='|('-'('n'|'N')('o'|'O')('t'|'T')'-'('g'|'G')('r'|'R')('e'|'E')('a'|'A')('t'|'T')('e'|'E')('r'|'R')('p'|'P'));
NOTLESSKEY:'>='|('-'('n'|'N')('o'|'O')('t'|'T')'-'('l'|'L')('e'|'E')('s'|'S')('s'|'S')('p'|'P'));
ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
AND: [Aa][Nn][Dd];
OR: [Oo][Rr];
EXPT: [Ee][Xx][Pp][Tt];
MOD : [Mm][Oo][Dd];
REM: [Rr][Ee][Mm];
SQRT: [Ss][Qq][Rr][Tt];
LOGAND: [Ll][Oo][Gg][Aa][Nn][Dd];
LOGOR: [Ll][Oo][Gg][Oo][Rr];
LOGXOR: [Ll][Oo][Gg][Xx][Oo][Rr];
LOGNOT: [Ll][Oo][Gg][Nn][Oo][Tt];
FLOOR: [Ff][Ll][Oo][Oo][Rr];
CEILING: [Cc][Ee][Ii][Ll][Ii][Nn][Gg];
ABS: [Aa][Bb][Ss];
NOT: [Nn][Oo][Tt];
ASH: [Aa][Ss][Hh];
LSH: [Ll][Ss][Hh];
NIL: [Nn][Ii][Ll];
LET: [Ll][Ee][Tt];
fragment ALPHA: [a-zA-Z];
fragment DIGIT: [0-9];
NUMBER:  [0-9]+ ( '.' [0-9]+ )?;
STRING:  '"' (~["\r\n])* '"' ;
ID: [a-zA-Z_][a-zA-Z0-9_-]*;