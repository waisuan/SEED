/*
 * generated by Xtext
 */
grammar InternalGherkin;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package uom.ac.uk.msc.cucumber.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uom.ac.uk.msc.cucumber.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uom.ac.uk.msc.cucumber.services.GherkinGrammarAccess;

}

@parser::members {

 	private GherkinGrammarAccess grammarAccess;
 	
    public InternalGherkinParser(TokenStream input, GherkinGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Feature";	
   	}
   	
   	@Override
   	protected GherkinGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); 
	    }
		lv_tags_0_0=ruleTag		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		add(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"Tag");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_1='Feature:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getTitleTitleParserRuleCall_2_0()); 
	    }
		lv_title_2_0=ruleTitle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		set(
       			$current, 
       			"title",
        		lv_title_2_0, 
        		"Title");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_EOL_3=RULE_EOL
    { 
    newLeafNode(this_EOL_3, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
	    }
		lv_narrative_4_0=ruleNarrative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		set(
       			$current, 
       			"narrative",
        		lv_narrative_4_0, 
        		"Narrative");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); 
	    }
		lv_background_5_0=ruleBackground		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		set(
       			$current, 
       			"background",
        		lv_background_5_0, 
        		"Background");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
(
		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0_0()); 
	    }
		lv_scenarios_6_1=ruleScenario		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		add(
       			$current, 
       			"scenarios",
        		lv_scenarios_6_1, 
        		"Scenario");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioOutlineParserRuleCall_6_0_1()); 
	    }
		lv_scenarios_6_2=ruleScenarioOutline		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeatureRule());
	        }
       		add(
       			$current, 
       			"scenarios",
        		lv_scenarios_6_2, 
        		"ScenarioOutline");
	        afterParserOrEnumRuleCall();
	    }

)

)
)+)
;





// Entry rule entryRuleBackground
entryRuleBackground returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBackgroundRule()); }
	 iv_ruleBackground=ruleBackground 
	 { $current=$iv_ruleBackground.current; } 
	 EOF 
;

// Rule Background
ruleBackground returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getBackgroundAccess().getBackgroundKeywordBackgroundKeywordParserRuleCall_0_0()); 
	    }
		lv_backgroundKeyword_0_0=ruleBackgroundKeyword		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBackgroundRule());
	        }
       		set(
       			$current, 
       			"backgroundKeyword",
        		lv_backgroundKeyword_0_0, 
        		"BackgroundKeyword");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBackgroundAccess().getTitleTitleParserRuleCall_1_0()); 
	    }
		lv_title_1_0=ruleTitle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBackgroundRule());
	        }
       		set(
       			$current, 
       			"title",
        		lv_title_1_0, 
        		"Title");
	        afterParserOrEnumRuleCall();
	    }

)
)?(this_EOL_2=RULE_EOL
    { 
    newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getBackgroundAccess().getNarrativeNarrativeParserRuleCall_3_0()); 
	    }
		lv_narrative_3_0=ruleNarrative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBackgroundRule());
	        }
       		set(
       			$current, 
       			"narrative",
        		lv_narrative_3_0, 
        		"Narrative");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0()); 
	    }
		lv_steps_4_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBackgroundRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_4_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	 iv_ruleScenario=ruleScenario 
	 { $current=$iv_ruleScenario.current; } 
	 EOF 
;

// Rule Scenario
ruleScenario returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); 
	    }
		lv_tags_0_0=ruleTag		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		add(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"Tag");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_1='Scenario:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getTitleTitleParserRuleCall_2_0()); 
	    }
		lv_title_2_0=ruleTitle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		set(
       			$current, 
       			"title",
        		lv_title_2_0, 
        		"Title");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_EOL_3=RULE_EOL
    { 
    newLeafNode(this_EOL_3, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
	    }
		lv_narrative_4_0=ruleNarrative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		set(
       			$current, 
       			"narrative",
        		lv_narrative_4_0, 
        		"Narrative");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 
	    }
		lv_steps_5_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_5_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleScenarioOutline
entryRuleScenarioOutline returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getScenarioOutlineRule()); }
	 iv_ruleScenarioOutline=ruleScenarioOutline 
	 { $current=$iv_ruleScenarioOutline.current; } 
	 EOF 
;

// Rule ScenarioOutline
ruleScenarioOutline returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0()); 
	    }
		lv_tags_0_0=ruleTag		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
	        }
       		add(
       			$current, 
       			"tags",
        		lv_tags_0_0, 
        		"Tag");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_1='Scenario Outline:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTitleTitleParserRuleCall_2_0()); 
	    }
		lv_title_2_0=ruleTitle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
	        }
       		set(
       			$current, 
       			"title",
        		lv_title_2_0, 
        		"Title");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_EOL_3=RULE_EOL
    { 
    newLeafNode(this_EOL_3, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
	    }
		lv_narrative_4_0=ruleNarrative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
	        }
       		set(
       			$current, 
       			"narrative",
        		lv_narrative_4_0, 
        		"Narrative");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0()); 
	    }
		lv_steps_5_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_5_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0()); 
	    }
		lv_examples_6_0=ruleExamples		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
	        }
       		set(
       			$current, 
       			"examples",
        		lv_examples_6_0, 
        		"Examples");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	 iv_ruleStep=ruleStep 
	 { $current=$iv_ruleStep.current; } 
	 EOF 
;

// Rule Step
ruleStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getStepAccess().getStepKeywordStepKeywordParserRuleCall_0_0()); 
	    }
		lv_stepKeyword_0_0=ruleStepKeyword		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStepRule());
	        }
       		set(
       			$current, 
       			"stepKeyword",
        		lv_stepKeyword_0_0, 
        		"StepKeyword");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStepAccess().getDescriptionStepDescriptionParserRuleCall_1_0()); 
	    }
		lv_description_1_0=ruleStepDescription		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStepRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_1_0, 
        		"StepDescription");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_EOL_2=RULE_EOL
    { 
    newLeafNode(this_EOL_2, grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getStepAccess().getTablesTableParserRuleCall_3_0()); 
	    }
		lv_tables_3_0=ruleTable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStepRule());
	        }
       		add(
       			$current, 
       			"tables",
        		lv_tables_3_0, 
        		"Table");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getStepAccess().getCodeDocStringParserRuleCall_4_0()); 
	    }
		lv_code_4_0=ruleDocString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStepRule());
	        }
       		set(
       			$current, 
       			"code",
        		lv_code_4_0, 
        		"DocString");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getStepAccess().getTablesTableParserRuleCall_5_0()); 
	    }
		lv_tables_5_0=ruleTable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStepRule());
	        }
       		add(
       			$current, 
       			"tables",
        		lv_tables_5_0, 
        		"Table");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleExamples
entryRuleExamples returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExamplesRule()); }
	 iv_ruleExamples=ruleExamples 
	 { $current=$iv_ruleExamples.current; } 
	 EOF 
;

// Rule Examples
ruleExamples returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Examples:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExamplesAccess().getExamplesKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExamplesAccess().getTitleTitleParserRuleCall_1_0()); 
	    }
		lv_title_1_0=ruleTitle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExamplesRule());
	        }
       		set(
       			$current, 
       			"title",
        		lv_title_1_0, 
        		"Title");
	        afterParserOrEnumRuleCall();
	    }

)
)?(this_EOL_2=RULE_EOL
    { 
    newLeafNode(this_EOL_2, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_2()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getExamplesAccess().getNarrativeNarrativeParserRuleCall_3_0()); 
	    }
		lv_narrative_3_0=ruleNarrative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExamplesRule());
	        }
       		set(
       			$current, 
       			"narrative",
        		lv_narrative_3_0, 
        		"Narrative");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getExamplesAccess().getTableTableParserRuleCall_4_0()); 
	    }
		lv_table_4_0=ruleTable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExamplesRule());
	        }
       		set(
       			$current, 
       			"table",
        		lv_table_4_0, 
        		"Table");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	 iv_ruleTable=ruleTable 
	 { $current=$iv_ruleTable.current; } 
	 EOF 
;

// Rule Table
ruleTable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_rows_0_0=RULE_TABLE_ROW
		{
			newLeafNode(lv_rows_0_0, grammarAccess.getTableAccess().getRowsTABLE_ROWTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"rows",
        		lv_rows_0_0, 
        		"TABLE_ROW");
	    }

)
)+(this_EOL_1=RULE_EOL
    { 
    newLeafNode(this_EOL_1, grammarAccess.getTableAccess().getEOLTerminalRuleCall_1()); 
    }
)*)
;





// Entry rule entryRuleDocString
entryRuleDocString returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDocStringRule()); }
	 iv_ruleDocString=ruleDocString 
	 { $current=$iv_ruleDocString.current; } 
	 EOF 
;

// Rule DocString
ruleDocString returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_content_0_0=RULE_DOC_STRING
		{
			newLeafNode(lv_content_0_0, grammarAccess.getDocStringAccess().getContentDOC_STRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDocStringRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"content",
        		lv_content_0_0, 
        		"DOC_STRING");
	    }

)
)(this_EOL_1=RULE_EOL
    { 
    newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1()); 
    }
)*)
;





// Entry rule entryRuleTitle
entryRuleTitle returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTitleRule()); } 
	 iv_ruleTitle=ruleTitle 
	 { $current=$iv_ruleTitle.current.getText(); }  
	 EOF 
;

// Rule Title
ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((    this_WORD_0=RULE_WORD    {
		$current.merge(this_WORD_0);
    }

    { 
    newLeafNode(this_WORD_0, grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0_0()); 
    }

    |    this_NUMBER_1=RULE_NUMBER    {
		$current.merge(this_NUMBER_1);
    }

    { 
    newLeafNode(this_NUMBER_1, grammarAccess.getTitleAccess().getNUMBERTerminalRuleCall_0_1()); 
    }

    |    this_STRING_2=RULE_STRING    {
		$current.merge(this_STRING_2);
    }

    { 
    newLeafNode(this_STRING_2, grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_0_2()); 
    }

    |    this_PLACEHOLDER_3=RULE_PLACEHOLDER    {
		$current.merge(this_PLACEHOLDER_3);
    }

    { 
    newLeafNode(this_PLACEHOLDER_3, grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
    }
)(    this_WORD_4=RULE_WORD    {
		$current.merge(this_WORD_4);
    }

    { 
    newLeafNode(this_WORD_4, grammarAccess.getTitleAccess().getWORDTerminalRuleCall_1_0()); 
    }

    |    this_NUMBER_5=RULE_NUMBER    {
		$current.merge(this_NUMBER_5);
    }

    { 
    newLeafNode(this_NUMBER_5, grammarAccess.getTitleAccess().getNUMBERTerminalRuleCall_1_1()); 
    }

    |    this_STRING_6=RULE_STRING    {
		$current.merge(this_STRING_6);
    }

    { 
    newLeafNode(this_STRING_6, grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_1_2()); 
    }

    |    this_PLACEHOLDER_7=RULE_PLACEHOLDER    {
		$current.merge(this_PLACEHOLDER_7);
    }

    { 
    newLeafNode(this_PLACEHOLDER_7, grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
    }

    |    this_STEP_KEYWORD_8=RULE_STEP_KEYWORD    {
		$current.merge(this_STEP_KEYWORD_8);
    }

    { 
    newLeafNode(this_STEP_KEYWORD_8, grammarAccess.getTitleAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
    }

    |    this_TAGNAME_9=RULE_TAGNAME    {
		$current.merge(this_TAGNAME_9);
    }

    { 
    newLeafNode(this_TAGNAME_9, grammarAccess.getTitleAccess().getTAGNAMETerminalRuleCall_1_5()); 
    }
)*)
    ;





// Entry rule entryRuleNarrative
entryRuleNarrative returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNarrativeRule()); } 
	 iv_ruleNarrative=ruleNarrative 
	 { $current=$iv_ruleNarrative.current.getText(); }  
	 EOF 
;

// Rule Narrative
ruleNarrative returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((    this_WORD_0=RULE_WORD    {
		$current.merge(this_WORD_0);
    }

    { 
    newLeafNode(this_WORD_0, grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_0_0()); 
    }

    |    this_NUMBER_1=RULE_NUMBER    {
		$current.merge(this_NUMBER_1);
    }

    { 
    newLeafNode(this_NUMBER_1, grammarAccess.getNarrativeAccess().getNUMBERTerminalRuleCall_0_1()); 
    }

    |    this_STRING_2=RULE_STRING    {
		$current.merge(this_STRING_2);
    }

    { 
    newLeafNode(this_STRING_2, grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_0_2()); 
    }

    |    this_PLACEHOLDER_3=RULE_PLACEHOLDER    {
		$current.merge(this_PLACEHOLDER_3);
    }

    { 
    newLeafNode(this_PLACEHOLDER_3, grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
    }
)(    this_WORD_4=RULE_WORD    {
		$current.merge(this_WORD_4);
    }

    { 
    newLeafNode(this_WORD_4, grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_1_0()); 
    }

    |    this_NUMBER_5=RULE_NUMBER    {
		$current.merge(this_NUMBER_5);
    }

    { 
    newLeafNode(this_NUMBER_5, grammarAccess.getNarrativeAccess().getNUMBERTerminalRuleCall_1_1()); 
    }

    |    this_STRING_6=RULE_STRING    {
		$current.merge(this_STRING_6);
    }

    { 
    newLeafNode(this_STRING_6, grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_1_2()); 
    }

    |    this_PLACEHOLDER_7=RULE_PLACEHOLDER    {
		$current.merge(this_PLACEHOLDER_7);
    }

    { 
    newLeafNode(this_PLACEHOLDER_7, grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
    }

    |    this_STEP_KEYWORD_8=RULE_STEP_KEYWORD    {
		$current.merge(this_STEP_KEYWORD_8);
    }

    { 
    newLeafNode(this_STEP_KEYWORD_8, grammarAccess.getNarrativeAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
    }

    |    this_TAGNAME_9=RULE_TAGNAME    {
		$current.merge(this_TAGNAME_9);
    }

    { 
    newLeafNode(this_TAGNAME_9, grammarAccess.getNarrativeAccess().getTAGNAMETerminalRuleCall_1_5()); 
    }
)*(    this_EOL_10=RULE_EOL    {
		$current.merge(this_EOL_10);
    }

    { 
    newLeafNode(this_EOL_10, grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 
    }
)+)+
    ;





// Entry rule entryRuleStepDescription
entryRuleStepDescription returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepDescriptionRule()); } 
	 iv_ruleStepDescription=ruleStepDescription 
	 { $current=$iv_ruleStepDescription.current.getText(); }  
	 EOF 
;

// Rule StepDescription
ruleStepDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_WORD_0=RULE_WORD    {
		$current.merge(this_WORD_0);
    }

    { 
    newLeafNode(this_WORD_0, grammarAccess.getStepDescriptionAccess().getWORDTerminalRuleCall_0()); 
    }

    |    this_NUMBER_1=RULE_NUMBER    {
		$current.merge(this_NUMBER_1);
    }

    { 
    newLeafNode(this_NUMBER_1, grammarAccess.getStepDescriptionAccess().getNUMBERTerminalRuleCall_1()); 
    }

    |    this_STRING_2=RULE_STRING    {
		$current.merge(this_STRING_2);
    }

    { 
    newLeafNode(this_STRING_2, grammarAccess.getStepDescriptionAccess().getSTRINGTerminalRuleCall_2()); 
    }

    |    this_PLACEHOLDER_3=RULE_PLACEHOLDER    {
		$current.merge(this_PLACEHOLDER_3);
    }

    { 
    newLeafNode(this_PLACEHOLDER_3, grammarAccess.getStepDescriptionAccess().getPLACEHOLDERTerminalRuleCall_3()); 
    }

    |    this_STEP_KEYWORD_4=RULE_STEP_KEYWORD    {
		$current.merge(this_STEP_KEYWORD_4);
    }

    { 
    newLeafNode(this_STEP_KEYWORD_4, grammarAccess.getStepDescriptionAccess().getSTEP_KEYWORDTerminalRuleCall_4()); 
    }

    |    this_TAGNAME_5=RULE_TAGNAME    {
		$current.merge(this_TAGNAME_5);
    }

    { 
    newLeafNode(this_TAGNAME_5, grammarAccess.getStepDescriptionAccess().getTAGNAMETerminalRuleCall_5()); 
    }
)+
    ;





// Entry rule entryRuleStepKeyword
entryRuleStepKeyword returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepKeywordRule()); } 
	 iv_ruleStepKeyword=ruleStepKeyword 
	 { $current=$iv_ruleStepKeyword.current.getText(); }  
	 EOF 
;

// Rule StepKeyword
ruleStepKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_STEP_KEYWORD_0=RULE_STEP_KEYWORD    {
		$current.merge(this_STEP_KEYWORD_0);
    }

    { 
    newLeafNode(this_STEP_KEYWORD_0, grammarAccess.getStepKeywordAccess().getSTEP_KEYWORDTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleBackgroundKeyword
entryRuleBackgroundKeyword returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getBackgroundKeywordRule()); } 
	 iv_ruleBackgroundKeyword=ruleBackgroundKeyword 
	 { $current=$iv_ruleBackgroundKeyword.current.getText(); }  
	 EOF 
;

// Rule BackgroundKeyword
ruleBackgroundKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='Background:' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getBackgroundKeywordAccess().getBackgroundKeyword()); 
    }

    ;





// Entry rule entryRuleTag
entryRuleTag returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTagRule()); }
	 iv_ruleTag=ruleTag 
	 { $current=$iv_ruleTag.current; } 
	 EOF 
;

// Rule Tag
ruleTag returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_id_0_0=RULE_TAGNAME
		{
			newLeafNode(lv_id_0_0, grammarAccess.getTagAccess().getIdTAGNAMETerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTagRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_0_0, 
        		"TAGNAME");
	    }

)
)(this_EOL_1=RULE_EOL
    { 
    newLeafNode(this_EOL_1, grammarAccess.getTagAccess().getEOLTerminalRuleCall_1()); 
    }
)?)
;





RULE_NUMBER : '-'? ('0'..'9')+ ('.' ('0'..'9')+)?;

RULE_STEP_KEYWORD : ('Given'|'When'|'Then'|'And'|'But') (' '|'\t')+;

RULE_PLACEHOLDER : '<' ~(('>'|' '|'\t'|'\n'|'\r'))+ '>';

RULE_TABLE_ROW : '|' (~(('|'|'\n'|'\r'))* '|')+ (' '|'\t')* RULE_NL;

RULE_DOC_STRING : ('"""' ( options {greedy=false;} : . )*'"""'|'\'\'\'' ( options {greedy=false;} : . )*'\'\'\'') RULE_NL;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* RULE_NL;

RULE_TAGNAME : '@' ~((' '|'\t'|'\n'|'\r'))+;

RULE_WORD : ~(('@'|'|'|' '|'\t'|'\n'|'\r')) ~((' '|'\t'|'\n'|'\r'))*;

RULE_WS : (' '|'\t');

RULE_EOL : RULE_NL;

fragment RULE_NL : '\r'? '\n'?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_ANY_OTHER : .;


