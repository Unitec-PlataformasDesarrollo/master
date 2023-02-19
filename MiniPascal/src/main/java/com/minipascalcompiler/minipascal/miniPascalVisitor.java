// Generated from java-escape by ANTLR 4.11.1

    package com.minipascalcompiler.minipascal;
    import com.minipascalcompiler.minipascal.tablaSimbolos;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code integertype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegertype(miniPascalParser.IntegertypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chartype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChartype(miniPascalParser.ChartypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleantype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleantype(miniPascalParser.BooleantypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(miniPascalParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(miniPascalParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(miniPascalParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentence_primero}
	 * labeled alternative in {@link miniPascalParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence_primero(miniPascalParser.Sentence_primeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentencesincoma}
	 * labeled alternative in {@link miniPascalParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencesincoma(miniPascalParser.SentencesincomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#sentence_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence_t(miniPascalParser.Sentence_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#sentenceUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenceUnica(miniPascalParser.SentenceUnicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(miniPascalParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(miniPascalParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(miniPascalParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#op_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_t(miniPascalParser.Op_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#op_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_f(miniPascalParser.Op_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(miniPascalParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#exp_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_t(miniPascalParser.Exp_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#exp_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_f(miniPascalParser.Exp_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#bwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBwhile(miniPascalParser.BwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#bif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBif(miniPascalParser.BifContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#bbif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBbif(miniPascalParser.BbifContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#belse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelse(miniPascalParser.BelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(miniPascalParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#bfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfor(miniPascalParser.BforContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(miniPascalParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(miniPascalParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniPascalParser#bid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBid(miniPascalParser.BidContext ctx);
}