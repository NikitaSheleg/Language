// Generated from C:/Users/User/Desktop/€пис/FirstAntlr/src/main/java/antlr\AntlrTest.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrTestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrTestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AntlrTestParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineVariable}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVariable(AntlrTestParser.DefineVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idk}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdk(AntlrTestParser.IdkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(AntlrTestParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(AntlrTestParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(AntlrTestParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(AntlrTestParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(AntlrTestParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AntlrTestParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code name}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(AntlrTestParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AntlrTestParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logic}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(AntlrTestParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link AntlrTestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(AntlrTestParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AntlrTestParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AntlrTestParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(AntlrTestParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(AntlrTestParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(AntlrTestParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(AntlrTestParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(AntlrTestParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AntlrTestParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AntlrTestParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(AntlrTestParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrTestParser#cool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCool(AntlrTestParser.CoolContext ctx);
}