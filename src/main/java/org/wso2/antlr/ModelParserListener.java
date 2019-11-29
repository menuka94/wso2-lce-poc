package org.wso2.antlr;

// Generated from ModelParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelParser}.
 */
public interface ModelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ModelParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ModelParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ModelParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ModelParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ModelParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ModelParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(ModelParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(ModelParser.ComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ModelParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ModelParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(ModelParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(ModelParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ModelParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ModelParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(ModelParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(ModelParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ModelParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ModelParser.PropertyContext ctx);
}