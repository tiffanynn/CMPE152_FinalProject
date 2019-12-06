// Generated from C:/Users/Austin/IdeaProjects/dudecmon\TestLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestLangParser}.
 */
public interface TestLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TestLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TestLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TestLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TestLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TestLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TestLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestLangParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(TestLangParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestLangParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(TestLangParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TestLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TestLangParser.ExprContext ctx);
}