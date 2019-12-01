// Generated from /home/tiffanynn/CMPE152_FinalProject/src/Interpreter.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpreterParser}.
 */
public interface InterpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(InterpreterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(InterpreterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(InterpreterParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(InterpreterParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(InterpreterParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(InterpreterParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(InterpreterParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(InterpreterParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(InterpreterParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(InterpreterParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(InterpreterParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(InterpreterParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(InterpreterParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(InterpreterParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(InterpreterParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(InterpreterParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void enterAllexpr(InterpreterParser.AllexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void exitAllexpr(InterpreterParser.AllexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(InterpreterParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(InterpreterParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(InterpreterParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(InterpreterParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(InterpreterParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(InterpreterParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(InterpreterParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(InterpreterParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(InterpreterParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(InterpreterParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#incdecexpr}.
	 * @param ctx the parse tree
	 */
	void enterIncdecexpr(InterpreterParser.IncdecexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#incdecexpr}.
	 * @param ctx the parse tree
	 */
	void exitIncdecexpr(InterpreterParser.IncdecexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(InterpreterParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(InterpreterParser.FactorContext ctx);
}