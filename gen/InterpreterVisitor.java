// Generated from /home/tiffanynn/CMPE152_FinalProject/src/Interpreter.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(InterpreterParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(InterpreterParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(InterpreterParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(InterpreterParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(InterpreterParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(InterpreterParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(InterpreterParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(InterpreterParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#allexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllexpr(InterpreterParser.AllexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#andexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpr(InterpreterParser.AndexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(InterpreterParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(InterpreterParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(InterpreterParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(InterpreterParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#incdecexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncdecexpr(InterpreterParser.IncdecexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(InterpreterParser.FactorContext ctx);
}