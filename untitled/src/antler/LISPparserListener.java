// Generated from E:/Projects/Compiler/Lisp_Compiler/untitled/src/antler/LISPparser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LISPparser}.
 */
public interface LISPparserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LISPparser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LISPparser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LISPparser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#compair}.
	 * @param ctx the parse tree
	 */
	void enterCompair(LISPparser.CompairContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#compair}.
	 * @param ctx the parse tree
	 */
	void exitCompair(LISPparser.CompairContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#exprString}.
	 * @param ctx the parse tree
	 */
	void enterExprString(LISPparser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#exprString}.
	 * @param ctx the parse tree
	 */
	void exitExprString(LISPparser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LISPparser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LISPparser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#quoted}.
	 * @param ctx the parse tree
	 */
	void enterQuoted(LISPparser.QuotedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#quoted}.
	 * @param ctx the parse tree
	 */
	void exitQuoted(LISPparser.QuotedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(LISPparser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(LISPparser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(LISPparser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(LISPparser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(LISPparser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(LISPparser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#stringCase}.
	 * @param ctx the parse tree
	 */
	void enterStringCase(LISPparser.StringCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#stringCase}.
	 * @param ctx the parse tree
	 */
	void exitStringCase(LISPparser.StringCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#chatAtOrsubseq}.
	 * @param ctx the parse tree
	 */
	void enterChatAtOrsubseq(LISPparser.ChatAtOrsubseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#chatAtOrsubseq}.
	 * @param ctx the parse tree
	 */
	void exitChatAtOrsubseq(LISPparser.ChatAtOrsubseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#stringLenOrReverse}.
	 * @param ctx the parse tree
	 */
	void enterStringLenOrReverse(LISPparser.StringLenOrReverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#stringLenOrReverse}.
	 * @param ctx the parse tree
	 */
	void exitStringLenOrReverse(LISPparser.StringLenOrReverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(LISPparser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(LISPparser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#merge}.
	 * @param ctx the parse tree
	 */
	void enterMerge(LISPparser.MergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#merge}.
	 * @param ctx the parse tree
	 */
	void exitMerge(LISPparser.MergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#exprChar}.
	 * @param ctx the parse tree
	 */
	void enterExprChar(LISPparser.ExprCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#exprChar}.
	 * @param ctx the parse tree
	 */
	void exitExprChar(LISPparser.ExprCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#stringVector}.
	 * @param ctx the parse tree
	 */
	void enterStringVector(LISPparser.StringVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#stringVector}.
	 * @param ctx the parse tree
	 */
	void exitStringVector(LISPparser.StringVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#concatenate}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate(LISPparser.ConcatenateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#concatenate}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate(LISPparser.ConcatenateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LISPparser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LISPparser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LISPparser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LISPparser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#write_line}.
	 * @param ctx the parse tree
	 */
	void enterWrite_line(LISPparser.Write_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#write_line}.
	 * @param ctx the parse tree
	 */
	void exitWrite_line(LISPparser.Write_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LISPparser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LISPparser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LISPparser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LISPparser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(LISPparser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(LISPparser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LISPparser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LISPparser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(LISPparser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(LISPparser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(LISPparser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(LISPparser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#insideLoop}.
	 * @param ctx the parse tree
	 */
	void enterInsideLoop(LISPparser.InsideLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#insideLoop}.
	 * @param ctx the parse tree
	 */
	void exitInsideLoop(LISPparser.InsideLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#dotimes}.
	 * @param ctx the parse tree
	 */
	void enterDotimes(LISPparser.DotimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#dotimes}.
	 * @param ctx the parse tree
	 */
	void exitDotimes(LISPparser.DotimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#dolist}.
	 * @param ctx the parse tree
	 */
	void enterDolist(LISPparser.DolistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#dolist}.
	 * @param ctx the parse tree
	 */
	void exitDolist(LISPparser.DolistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#defun}.
	 * @param ctx the parse tree
	 */
	void enterDefun(LISPparser.DefunContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#defun}.
	 * @param ctx the parse tree
	 */
	void exitDefun(LISPparser.DefunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OPERATOR1}
	 * labeled alternative in {@link LISPparser#operatorExp}.
	 * @param ctx the parse tree
	 */
	void enterOPERATOR1(LISPparser.OPERATOR1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code OPERATOR1}
	 * labeled alternative in {@link LISPparser#operatorExp}.
	 * @param ctx the parse tree
	 */
	void exitOPERATOR1(LISPparser.OPERATOR1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code OPERATOR2}
	 * labeled alternative in {@link LISPparser#operatorExp}.
	 * @param ctx the parse tree
	 */
	void enterOPERATOR2(LISPparser.OPERATOR2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code OPERATOR2}
	 * labeled alternative in {@link LISPparser#operatorExp}.
	 * @param ctx the parse tree
	 */
	void exitOPERATOR2(LISPparser.OPERATOR2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#operator1}.
	 * @param ctx the parse tree
	 */
	void enterOperator1(LISPparser.Operator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#operator1}.
	 * @param ctx the parse tree
	 */
	void exitOperator1(LISPparser.Operator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#operator2}.
	 * @param ctx the parse tree
	 */
	void enterOperator2(LISPparser.Operator2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#operator2}.
	 * @param ctx the parse tree
	 */
	void exitOperator2(LISPparser.Operator2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(LISPparser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(LISPparser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(LISPparser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(LISPparser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#consExpr}.
	 * @param ctx the parse tree
	 */
	void enterConsExpr(LISPparser.ConsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#consExpr}.
	 * @param ctx the parse tree
	 */
	void exitConsExpr(LISPparser.ConsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LISPparser#operatorList}.
	 * @param ctx the parse tree
	 */
	void enterOperatorList(LISPparser.OperatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LISPparser#operatorList}.
	 * @param ctx the parse tree
	 */
	void exitOperatorList(LISPparser.OperatorListContext ctx);
}