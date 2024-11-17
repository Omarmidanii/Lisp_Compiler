lexer grammar LISPlexer;

// fragments
fragment A: [Aa];
fragment B: [Bb];
fragment C: [Cc];
fragment D: [Dd];
fragment E: [Ee];
fragment F: [Ff];
fragment G: [Gg];
fragment H: [Hh];
fragment I: [Ii];
fragment J: [Jj];
fragment K: [Kk];
fragment L: [Ll];
fragment M: [Mm];
fragment N: [Nn];
fragment O: [Oo];
fragment P: [Pp];
fragment Q: [Qq];
fragment R: [Rr];
fragment S: [Ss];
fragment T: [Tt];
fragment U: [Uu];
fragment V: [Vv];
fragment W: [Ww];
fragment X: [Xx];
fragment Y: [Yy];
fragment Z: [Zz];


// output & input
PRINT: P R I N T;
PRINC: P R I N C;
WRITE_LINE: W R I T E[-]L I N E;
WRITE: W R I T E;
READ: R E A D;
WS:[ \t]+ -> channel(HIDDEN);
NEWLINE: [\n\r]+ -> skip;
SINGLECOMMENT: ';' [a-zA-Z1-9{}()|/\\'`~;:,.*-+_^&$%#@!?>< \\[\]]* -> skip;
MULTIECOMMENT: '|#' (.)*? '#|'-> skip;
SETQ: [Ss][Ee][Tt][Qq];
OPEN_B: '(';
CLOSE_B: ')';
HASH:'#';
SINGLE_QUOTE: '\'';
FORMAT: F O R M A T;


//string
CHAR:'#\\' .;
CHARKEY:C H A R K E Y;
STRINGKEY:S T R I N G;
CONCATENATEKEY:C O N C A T E N A T E;
UPCASE: U P C A S E;
DOWNCASE: D O W N C A S E;
CAPITALIZE: C A P I T A L I Z E;
TRIM:'-'T R I M;
TRIMLEFT: TRIM'-'L E F T;
TRIMRIGHT: TRIM'-'R I G H T;
SUBSEQ: S U B S E Q;
SORT: S O R T;
MERGE: M E R G E;
VECTOR: V E C T O R;
REVERSE:R E V E R S E;


// conditions
IF: I F;
COND: C O N D;
WHEN: W H E N;

// loops
DOTIMES: D O T I M E S;
LOOP: L O O P[ ]F O R;
DO: D O;
IN: I N;
FROM: F R O M;
TO: T O;
DOLIST: D O L I S T;

//list
LIST: L I S T;
DOT: '.';
CAR: C A R;
CDR: C D R;
APPEND: A P P E N D;
CONS: C O N S;
FIRST: F I R S T;
REST: R E S T;
LAST: L A S T;
NTH: N T H;
LENGTH: L E N G T H;
REMOVE: R E M O V E;
MEMBER: M E M B E R;
MAPCAR: M A P C A R;
FILTER: F I L T E R;


//function
DEFUN: D E F U N;


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
AND: A N D;
OR: O R;
EXPT: E X P T;
MOD : M O D;
REM: R E M;
SQRT: S Q R T;
LOGAND: L O G A N D;
// Omar
LOGIOR: L O G I O R;
// end
LOGXOR: L O G X O R;
LOGNOT: L O G N O T;
// Omar
LOGNOR: L O G N O R;
LOGEQV: L O G E Q V;
// end
FLOOR: F L O O R;
CEILING:  C E I L I N G;
ABS: A B S;
NOT: N O T;
ASH: A S H;
LSH: L S H;
// Omar
INCF: I N C F;
DECF: D E C F;
MAX: M A X;
MIN: M I N;
SIN: S I N;
COS: C O S;
TAN: T A N;
ACOS: A C O S;
ASIN: A S I N;
ATAN: A T A N;
// end
NIL: N I L;
LET: L E T;
fragment ALPHA: [a-zA-Z];
fragment DIGIT: [0-9];
NUMBER:  [0-9]+ ( '.' [0-9]+ )?;
STRING:  '"' (~["\r\n])* '"' ;
ID: [a-zA-Z_][a-zA-Z0-9_-]*;