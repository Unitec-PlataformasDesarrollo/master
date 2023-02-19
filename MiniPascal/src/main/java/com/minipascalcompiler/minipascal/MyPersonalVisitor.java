package com.minipascalcompiler.minipascal;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

/*
 * Click nbfs://nbhost/SystemFileSystem/Objectemplates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Objectemplates/Classes/Class.java to edit this template
 */

/**
 *
 * @author James Josue Molina
 */
public class MyPersonalVisitor extends miniPascalBaseVisitor<Object>{
    	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
         String out = "";
         String outXML = "";
         String outJSON = "";
         int tabs = 2;
         int tabsXML = 0;
         int tabsJSON = 0;
         tablaSimbolos tabla;
	@Override public Object visitIntegertype(miniPascalParser.IntegertypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitChartype(miniPascalParser.ChartypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBooleantype(miniPascalParser.BooleantypeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Object visitAssign(miniPascalParser.AssignContext ctx) {
            try{
                String tipo = "";
            
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            
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
            tabjson();
            tabxml();
            outXML += "<assing>\n";
            outJSON += "\"assing\": {\n";
            tabsJSON++;
            tabsXML++;
            tabjson();
            tabxml();
            outXML += "<var>" + ctx.ID().toString() + "</var>\n";
            outJSON += "\"var\": \"" + ctx.ID().toString() + "\"\n";

            tabjson();
            tabxml();
            
            outXML += "<value>" + ctx.op().getText() + "</value>\n";
            outJSON += "\"value\": \"" + ctx.op().getText() + "\"\n";
            
            int linea = ctx.getStart().getLine();
            
            tabsJSON--;
            tabsXML--;
            tabjson();
            tabxml();
            outXML += "</assing>\n";
            outJSON += "}\n";
            if(tipo.equals( tipoAsignado )){
                //bien
                
            }else{
                System.out.println("linea " + linea + " se asigno '" + tipoAsignado + "' se esperaba '" + tipo + "'");
                System.out.println("    " + ctx.getText());
                System.out.println("      ^");
            }
            out += ctx.ID().toString() + " = " + ctx.op().getText() + ";\n";
            }catch(Exception e){
            }
            return visitChildren(ctx);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitProg(miniPascalParser.ProgContext ctx) {
            return visitChildren(ctx);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitHeader(miniPascalParser.HeaderContext ctx) { 
            String programName = ctx.ID().toString();
            out = "package " + programName.toLowerCase() + ";\nimport java.util.Scanner;\n"
                    + "public class " + programName +"{\n"
                    + "    public static void main(String[] args){\n"
                    + "        Scanner sc = new Scanner(System.in);\n";
            outXML += "<" + programName + ">\n";
            outJSON += "\"" + programName + "\": {\n";
            tabsXML++;
            tabsJSON++;
            Object vc = visitChildren(ctx);
            
            outJSON += "}";
            outXML += "</" + programName + ">";
            return vc;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSentence_primero(miniPascalParser.Sentence_primeroContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSentencesincoma(miniPascalParser.SentencesincomaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSentence_t(miniPascalParser.Sentence_tContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSentenceUnica(miniPascalParser.SentenceUnicaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitRead(miniPascalParser.ReadContext ctx) { 
            try{
                String id = ctx.ID().toString();
                String tipo = "";
                tabjson();
                tabxml();
            
                for (int i = 0; i < tabs; i++) {
                    out += "    ";
                }
                for (fila f : tabla.getFilas())
                    if(f.getIdentifiador().equals(id))
                        tipo = f.getTipo();
                outXML += "<read>" + tipo + "</read>\n";
                outJSON += "\"read\": \"" + tipo + "\",\n";
                String next = "";
                if(tipo.equals("integer"))
                    next = "Int();";
                else if(tipo.equals("character"))
                    next = "().charAt(0);";
                else
                    next = "Boolean();";
                out += id + " = sc.next" + next + "\n";
                
            }catch(Exception ex){
                
            }
            return visitChildren(ctx);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitWrite(miniPascalParser.WriteContext ctx) { 
            tabjson();
            tabxml();
            outXML += "<write>";
            outJSON += "\"write\": ";
            String cS = ctx.CONSTSTR().toString();
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            cS = cS.substring(1, cS.length()-1);
            cS = "\"" + cS + "\"";
            out += "System.out.println(" + cS;
            outXML += cS + "</write>\n";
            outJSON += cS + ",\n";
            if(ctx.op() != null)
                out += " + " + ctx.op().toString();
            out += ");\n";
            return visitChildren(ctx);
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitOp(miniPascalParser.OpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitOp_t(miniPascalParser.Op_tContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitOp_f(miniPascalParser.Op_fContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExp(miniPascalParser.ExpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExp_t(miniPascalParser.Exp_tContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExp_f(miniPascalParser.Exp_fContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBwhile(miniPascalParser.BwhileContext ctx) { 
            tabjson();
            tabxml();
            outJSON += "\"while\" {\n";
            outXML += "<while>\n";
            tabsJSON++;
            tabsXML++;
            tabjson();
            tabxml();
            outJSON += "\"exp\": \"" + ctx.exp().getText() + "\"\n";
            outXML += "<exp>" + ctx.exp().getText() + "</exp>\n";
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            out += "while(" + ctx.exp().getText()+ "){\n";
            tabs++;
            Object vc =  visitChildren(ctx);
            tabs--;
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            out += "}\n";
            
            tabsJSON--;
            tabsXML--;
            tabjson();
            tabxml();
            outJSON += "}\n";
            outXML += "</while>\n";
            
            return vc;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBif(miniPascalParser.BifContext ctx) {
            Object vc =  visitChildren(ctx);
            return vc;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBbif(miniPascalParser.BbifContext ctx) { 
            String resto = ctx.exp().getText();
            tabjson();
            tabxml();
            outJSON += "\"if\": {\n";
            outXML += "<if>\n";
            
            tabsJSON++;
            tabsXML++;
            tabjson();
            tabxml();
            outJSON += "\"exp\": \"" + resto + "\",\n";
            outXML += "<exp>" + resto + "</exp>\n";
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            out += "if(" + resto + "){\n";
            tabs++;
            Object cv = visitChildren(ctx);
            tabs--;
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            tabsJSON--;
            tabsXML--;
            tabjson();
            tabxml();
            outXML += "</if>\n";
            outJSON += "}\n";
            out += "}\n";
            return cv;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBelse(miniPascalParser.BelseContext ctx) { 
            tabjson();
            tabxml();
            outJSON += "\"else\": {\n";
            outXML += "<else>\n";
            tabsJSON++;
            tabsXML++;
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            out += "else{\n";
            tabs++;
            Object vc = visitChildren(ctx);
            tabs--;
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            tabsJSON--;
            tabsXML--;
            tabjson();
            tabxml();
            outJSON += "}\n";
            outXML += "<else>";
            
            out += "}\n";
            return vc;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitRepeat(miniPascalParser.RepeatContext ctx) {
            tabjson();
            tabxml();
            outJSON += "\"repeat\": {\n";
            outXML += "<repeat>\n";
            tabsJSON++;
            tabsXML++;
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            out += "do{\n";
            tabs++;
            Object vc = visitChildren(ctx); 
            tabs--;
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            out += "}while(";
            out += ctx.exp().getText()+ ");\n";
            outJSON += "\"until\": \"" + ctx.exp().getText() + "\"\n";
            outXML += "<until>" + ctx.exp().getText() +  "</until>\n";
            tabsJSON--;
            tabsXML--;
            tabjson();
            tabxml();
            outJSON += "}\n";
            outXML += "</repeat>\n";
            return vc;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBfor(miniPascalParser.BforContext ctx) { 
            tabjson();
            tabxml();
            outJSON += "\"for\": {\n";
            outXML += "<for>\n";
            tabsJSON++;
            tabsXML++;

            tabjson();
            tabxml();
            outJSON += "\"exp\": ";
            outXML += "<exp>";
            outJSON += "\"" + ctx.ID().toString() + " = " + ctx.NUM(0).toString() + "\",\n";
            outXML += ctx.ID().toString() + " = " + ctx.NUM(0).toString() + "</exp>\n";
            
            tabjson();
            tabxml();
            outJSON += "\"exp\": ";
            outXML += "<exp>";
            outJSON += "\"" + ctx.ID().toString() + " < " + ctx.NUM(1) + "\",\n";
            outXML += ctx.ID().toString() + " < " + ctx.NUM(1) + "</exp>\n";
            
            tabjson();
            tabxml();
            outJSON += "\"exp\": ";
            outXML += "<exp>";
            outJSON += "\"" + ctx.ID().toString() + "++" + "\",\n";
            outXML += ctx.ID().toString() + "++" + "</exp>\n";
            
            
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            out += "for(" + ctx.ID().toString() + " = " + ctx.NUM(0).toString() + "; "
                    + ctx.ID().toString() + " < " + ctx.NUM(1) + "; " + ctx.ID().toString() + "++) {\n";
            tabs++;
            Object vc = visitChildren(ctx); 
            tabs--;
            for (int i = 0; i < tabs; i++) {
                out += "    ";
            }
            out += "}\n";
            
            tabsJSON--;
            tabsXML--;
            tabjson();
            tabxml();
            outJSON += "},\n";
            outXML += "</for>\n";
            return vc;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitVar(miniPascalParser.VarContext ctx) { 
            tabxml();
            tabjson();
            tabsXML++;
            tabsJSON++;
            outXML += "<var>\n";
            outJSON += "\"var\": {\n";
            Object vs = visitChildren(ctx);
            tabsXML--;
            tabsJSON--;
            tabxml();
            tabjson();
            outXML += "</var>\n";
            outJSON += "},\n";
            return vs;
        }
        
        private void tabxml(){
            for (int i = 0; i < tabsXML; i++)
                outXML += "    ";
        }
        private void tabjson(){
            for (int i = 0; i < tabsJSON; i++)
                outJSON += "    ";
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Objecthe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
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

            if(!existe){
                
                for (int i = 0; i < tabs; i++) {
                    out += "    ";
                }
                tabla.getFilas().add(new fila(id, tipo));
                if(tipo.equals("character"))
                    out += "char ";
                else if(tipo.equals("integer"))
                    out += "int ";
                else
                    out += "boolean ";
                out += id + ";\n";
                
                
                
                tabxml();
                tabjson();
                outXML += "<" + tipo + ">" + id + "</" + tipo + ">\n";
                outJSON += "\""+tipo + "\":" + "\"" + id + "\",\n";
                
            }else{
                int linea = ctx.getStart().getLine();
                System.out.println("linea " + linea + " identificador duplicado " + ctx.getText());
                System.out.println("    " +  id);
            }
            return visitChildren(ctx); 
        }
}
