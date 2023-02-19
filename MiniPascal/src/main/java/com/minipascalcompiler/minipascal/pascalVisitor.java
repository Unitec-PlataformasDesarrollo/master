package com.minipascalcompiler.minipascal;

import java.util.ArrayList;

public class pascalVisitor  extends miniPascalBaseVisitor<Object> {
        String out = "";
        tablaSimbolos tabla;
	
        @Override
	public Object visitIntegertype(miniPascalParser.IntegertypeContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitChartype(miniPascalParser.ChartypeContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitBooleantype(miniPascalParser.BooleantypeContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitAssign(miniPascalParser.AssignContext ctx) {
            String tipo = "";
            String identificador = ctx.ID().getText();
            int i = 0;
            for (fila f : tabla.getFilas()){
                if(f.getIdentifiador().equals(identificador))
                    tipo = f.getTipo();
                i++;
            }
            String tipoAsignado = "";
            if( ctx.op().op_t().op_f().BOOL() != null ){
                tipoAsignado = "boolean";
            }else if( ctx.op().op_t().op_f().CHAR() != null ){
                tipoAsignado = "char";
            }else if( ctx.op().op_t().op_f().NUM() != null ){
                tipoAsignado = "integer";
            }else if( ctx.op().op_t().op_f().ID() != null ){
                for (fila f : tabla.getFilas()){
                    if(f.getIdentifiador().equals(ctx.op().op_t().op_f().ID().getText())){
                        tipoAsignado = f.getTipo();
                    }
                }
            }
            if(tipo.equals( tipoAsignado )){
                //bien
                
            }else{
                System.out.println("Error de tipos. Se asigno al identificador " + identificador + " el tipo " + tipoAsignado + ". Se esperaba " + tipo);
            }
            return visitChildren(ctx);
        }
	
        @Override
	public Object visitProg(miniPascalParser.ProgContext ctx) {
            return visitChildren(ctx); 
        }
	
        @Override
	public Object visitHeader(miniPascalParser.HeaderContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitSentence_primero(miniPascalParser.Sentence_primeroContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitSentencesincoma(miniPascalParser.SentencesincomaContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitSentence_t(miniPascalParser.Sentence_tContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitSentenceUnica(miniPascalParser.SentenceUnicaContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitRead(miniPascalParser.ReadContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitWrite(miniPascalParser.WriteContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitOp(miniPascalParser.OpContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitOp_t(miniPascalParser.Op_tContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitOp_f(miniPascalParser.Op_fContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitExp(miniPascalParser.ExpContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitExp_t(miniPascalParser.Exp_tContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitExp_f(miniPascalParser.Exp_fContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitBwhile(miniPascalParser.BwhileContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitBif(miniPascalParser.BifContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitBbif(miniPascalParser.BbifContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitBelse(miniPascalParser.BelseContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitRepeat(miniPascalParser.RepeatContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitBfor(miniPascalParser.BforContext ctx) { return visitChildren(ctx); }
	
        @Override
	public Object visitVar(miniPascalParser.VarContext ctx) { return visitChildren(ctx); }
        
        
        String tipo;
        @Override
	public Object visitVars(miniPascalParser.VarsContext ctx) {
            tipo = ctx.type().getText();
            return visitChildren(ctx); 
        }
	
        @Override
	public Object visitBid(miniPascalParser.BidContext ctx) {
            String id = ctx.ID().toString();  
            boolean existe = false;
            for (fila f : tabla.getFilas())
                if(f.getIdentifiador().equals(id))
                    existe = true;

            if(!existe)
                tabla.getFilas().add(new fila(id, tipo));
            else
                System.out.println("Error: identificador duplicado -> " + id);
            return visitChildren(ctx); 
        }
}

