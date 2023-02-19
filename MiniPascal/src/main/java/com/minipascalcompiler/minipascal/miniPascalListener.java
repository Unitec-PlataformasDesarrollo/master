// Generated from java-escape by ANTLR 4.11.1

    package com.minipascalcompiler.minipascal;
    import com.minipascalcompiler.minipascal.tablaSimbolos;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniPascalParser}.
 */
public interface miniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code integertype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntegertype(miniPascalParser.IntegertypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integertype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntegertype(miniPascalParser.IntegertypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chartype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterChartype(miniPascalParser.ChartypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chartype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitChartype(miniPascalParser.ChartypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleantype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleantype(miniPascalParser.BooleantypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleantype}
	 * labeled alternative in {@link miniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleantype(miniPascalParser.BooleantypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(miniPascalParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(miniPascalParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(miniPascalParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(miniPascalParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(miniPascalParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(miniPascalParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentence_primero}
	 * labeled alternative in {@link miniPascalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence_primero(miniPascalParser.Sentence_primeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentence_primero}
	 * labeled alternative in {@link miniPascalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence_primero(miniPascalParser.Sentence_primeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentencesincoma}
	 * labeled alternative in {@link miniPascalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentencesincoma(miniPascalParser.SentencesincomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentencesincoma}
	 * labeled alternative in {@link miniPascalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentencesincoma(miniPascalParser.SentencesincomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#sentence_t}.
	 * @param ctx the parse tree
	 */
	void enterSentence_t(miniPascalParser.Sentence_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#sentence_t}.
	 * @param ctx the parse tree
	 */
	void exitSentence_t(miniPascalParser.Sentence_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#sentenceUnica}.
	 * @param ctx the parse tree
	 */
	void enterSentenceUnica(miniPascalParser.SentenceUnicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#sentenceUnica}.
	 * @param ctx the parse tree
	 */
	void exitSentenceUnica(miniPascalParser.SentenceUnicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(miniPascalParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(miniPascalParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(miniPascalParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(miniPascalParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(miniPascalParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(miniPascalParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#op_t}.
	 * @param ctx the parse tree
	 */
	void enterOp_t(miniPascalParser.Op_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#op_t}.
	 * @param ctx the parse tree
	 */
	void exitOp_t(miniPascalParser.Op_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#op_f}.
	 * @param ctx the parse tree
	 */
	void enterOp_f(miniPascalParser.Op_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#op_f}.
	 * @param ctx the parse tree
	 */
	void exitOp_f(miniPascalParser.Op_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(miniPascalParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(miniPascalParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#exp_t}.
	 * @param ctx the parse tree
	 */
	void enterExp_t(miniPascalParser.Exp_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#exp_t}.
	 * @param ctx the parse tree
	 */
	void exitExp_t(miniPascalParser.Exp_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#exp_f}.
	 * @param ctx the parse tree
	 */
	void enterExp_f(miniPascalParser.Exp_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#exp_f}.
	 * @param ctx the parse tree
	 */
	void exitExp_f(miniPascalParser.Exp_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#bwhile}.
	 * @param ctx the parse tree
	 */
	void enterBwhile(miniPascalParser.BwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#bwhile}.
	 * @param ctx the parse tree
	 */
	void exitBwhile(miniPascalParser.BwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#bif}.
	 * @param ctx the parse tree
	 */
	void enterBif(miniPascalParser.BifContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#bif}.
	 * @param ctx the parse tree
	 */
	void exitBif(miniPascalParser.BifContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#bbif}.
	 * @param ctx the parse tree
	 */
	void enterBbif(miniPascalParser.BbifContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#bbif}.
	 * @param ctx the parse tree
	 */
	void exitBbif(miniPascalParser.BbifContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#belse}.
	 * @param ctx the parse tree
	 */
	void enterBelse(miniPascalParser.BelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#belse}.
	 * @param ctx the parse tree
	 */
	void exitBelse(miniPascalParser.BelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(miniPascalParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(miniPascalParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#bfor}.
	 * @param ctx the parse tree
	 */
	void enterBfor(miniPascalParser.BforContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#bfor}.
	 * @param ctx the parse tree
	 */
	void exitBfor(miniPascalParser.BforContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(miniPascalParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(miniPascalParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(miniPascalParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(miniPascalParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniPascalParser#bid}.
	 * @param ctx the parse tree
	 */
	void enterBid(miniPascalParser.BidContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniPascalParser#bid}.
	 * @param ctx the parse tree
	 */
	void exitBid(miniPascalParser.BidContext ctx);
}