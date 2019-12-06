// Generated from C:/Users/Austin/IdeaProjects/dudecmon\TestLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TestLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TestLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestLangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TestLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestLangParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(TestLangParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TestLangParser.ExprContext ctx);
}