// Generated from E:/Projects/Compiler/Lisp_Compiler/untitled/src/antler/LISPparser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LISPparser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LISPparserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LISPparser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LISPparser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#compair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompair(LISPparser.CompairContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#exprString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(LISPparser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LISPparser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#quoted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted(LISPparser.QuotedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LISPparser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(LISPparser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(LISPparser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#stringCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCase(LISPparser.StringCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#chatAtOrsubseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChatAtOrsubseq(LISPparser.ChatAtOrsubseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#stringLenOrReverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLenOrReverse(LISPparser.StringLenOrReverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(LISPparser.SortContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#merge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge(LISPparser.MergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#exprChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprChar(LISPparser.ExprCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#stringVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVector(LISPparser.StringVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#concatenate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate(LISPparser.ConcatenateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LISPparser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LISPparser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#write_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_line(LISPparser.Write_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(LISPparser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LISPparser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(LISPparser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LISPparser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(LISPparser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LISPparser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#insideLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideLoop(LISPparser.InsideLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#dotimes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotimes(LISPparser.DotimesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#dolist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDolist(LISPparser.DolistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#defun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefun(LISPparser.DefunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OPERATOR1}
	 * labeled alternative in {@link LISPparser#operatorExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOPERATOR1(LISPparser.OPERATOR1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code OPERATOR2}
	 * labeled alternative in {@link LISPparser#operatorExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOPERATOR2(LISPparser.OPERATOR2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#operator1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator1(LISPparser.Operator1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#operator2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator2(LISPparser.Operator2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LISPparser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(LISPparser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#consExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsExpr(LISPparser.ConsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LISPparser#operatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorList(LISPparser.OperatorListContext ctx);
}