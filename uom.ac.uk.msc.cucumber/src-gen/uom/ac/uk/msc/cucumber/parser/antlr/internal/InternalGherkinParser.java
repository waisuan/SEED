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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_TABLE_ROW", "RULE_DOC_STRING", "RULE_WORD", "RULE_NUMBER", "RULE_STRING", "RULE_PLACEHOLDER", "RULE_STEP_KEYWORD", "RULE_TAGNAME", "RULE_NL", "RULE_SL_COMMENT", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_ANY_OTHER", "'Feature:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'Background:'"
    };
    public static final int RULE_TABLE_ROW=5;
    public static final int RULE_ID=16;
    public static final int RULE_TAGNAME=12;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_PLACEHOLDER=10;
    public static final int RULE_NL=13;
    public static final int RULE_EOL=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_DOC_STRING=6;
    public static final int RULE_STRING=9;
    public static final int RULE_NUMBER=8;
    public static final int RULE_INT=17;
    public static final int RULE_STEP_KEYWORD=11;
    public static final int RULE_WS=15;
    public static final int RULE_WORD=7;

    // delegates
    // delegators


        public InternalGherkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGherkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGherkinParser.tokenNames; }
    public String getGrammarFileName() { return "../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g"; }



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



    // $ANTLR start "entryRuleFeature"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:67:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:68:2: (iv_ruleFeature= ruleFeature EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:69:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature75);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:76:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( ( (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline ) ) )+ ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_narrative_4_0 = null;

        EObject lv_background_5_0 = null;

        EObject lv_scenarios_6_1 = null;

        EObject lv_scenarios_6_2 = null;


         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:79:28: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( ( (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline ) ) )+ ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:80:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( ( (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline ) ) )+ )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:80:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( ( (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline ) ) )+ )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:80:2: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Feature:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_background_5_0= ruleBackground ) )? ( ( (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline ) ) )+
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:80:2: ( (lv_tags_0_0= ruleTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TAGNAME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:81:1: (lv_tags_0_0= ruleTag )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:81:1: (lv_tags_0_0= ruleTag )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:82:3: lv_tags_0_0= ruleTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTag_in_ruleFeature131);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"Tag");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleFeature144); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
                
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:102:1: ( (lv_title_2_0= ruleTitle ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:103:1: (lv_title_2_0= ruleTitle )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:103:1: (lv_title_2_0= ruleTitle )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:104:3: lv_title_2_0= ruleTitle
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTitleTitleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTitle_in_ruleFeature165);
            lv_title_2_0=ruleTitle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"Title");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:120:2: (this_EOL_3= RULE_EOL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_EOL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:120:3: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleFeature177); 
            	     
            	        newLeafNode(this_EOL_3, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:124:3: ( (lv_narrative_4_0= ruleNarrative ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_PLACEHOLDER)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:125:1: (lv_narrative_4_0= ruleNarrative )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:125:1: (lv_narrative_4_0= ruleNarrative )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:126:3: lv_narrative_4_0= ruleNarrative
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNarrative_in_ruleFeature199);
                    lv_narrative_4_0=ruleNarrative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"narrative",
                            		lv_narrative_4_0, 
                            		"Narrative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:142:3: ( (lv_background_5_0= ruleBackground ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:143:1: (lv_background_5_0= ruleBackground )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:143:1: (lv_background_5_0= ruleBackground )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:144:3: lv_background_5_0= ruleBackground
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBackground_in_ruleFeature221);
                    lv_background_5_0=ruleBackground();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"background",
                            		lv_background_5_0, 
                            		"Background");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:160:3: ( ( (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_TAGNAME||(LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:161:1: ( (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline ) )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:161:1: ( (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline ) )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:162:1: (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:162:1: (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline )
            	    int alt5=2;
            	    alt5 = dfa5.predict(input);
            	    switch (alt5) {
            	        case 1 :
            	            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:163:3: lv_scenarios_6_1= ruleScenario
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleScenario_in_ruleFeature245);
            	            lv_scenarios_6_1=ruleScenario();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"scenarios",
            	                    		lv_scenarios_6_1, 
            	                    		"Scenario");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:178:8: lv_scenarios_6_2= ruleScenarioOutline
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioOutlineParserRuleCall_6_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleScenarioOutline_in_ruleFeature264);
            	            lv_scenarios_6_2=ruleScenarioOutline();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"scenarios",
            	                    		lv_scenarios_6_2, 
            	                    		"ScenarioOutline");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleBackground"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:204:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:205:2: (iv_ruleBackground= ruleBackground EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:206:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground304);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground314); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:213:1: ruleBackground returns [EObject current=null] : ( ( (lv_backgroundKeyword_0_0= ruleBackgroundKeyword ) ) ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_steps_4_0= ruleStep ) )+ ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_backgroundKeyword_0_0 = null;

        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_narrative_3_0 = null;

        EObject lv_steps_4_0 = null;


         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:216:28: ( ( ( (lv_backgroundKeyword_0_0= ruleBackgroundKeyword ) ) ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_steps_4_0= ruleStep ) )+ ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:217:1: ( ( (lv_backgroundKeyword_0_0= ruleBackgroundKeyword ) ) ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_steps_4_0= ruleStep ) )+ )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:217:1: ( ( (lv_backgroundKeyword_0_0= ruleBackgroundKeyword ) ) ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_steps_4_0= ruleStep ) )+ )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:217:2: ( (lv_backgroundKeyword_0_0= ruleBackgroundKeyword ) ) ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_steps_4_0= ruleStep ) )+
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:217:2: ( (lv_backgroundKeyword_0_0= ruleBackgroundKeyword ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:218:1: (lv_backgroundKeyword_0_0= ruleBackgroundKeyword )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:218:1: (lv_backgroundKeyword_0_0= ruleBackgroundKeyword )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:219:3: lv_backgroundKeyword_0_0= ruleBackgroundKeyword
            {
             
            	        newCompositeNode(grammarAccess.getBackgroundAccess().getBackgroundKeywordBackgroundKeywordParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBackgroundKeyword_in_ruleBackground360);
            lv_backgroundKeyword_0_0=ruleBackgroundKeyword();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	        }
                   		set(
                   			current, 
                   			"backgroundKeyword",
                    		lv_backgroundKeyword_0_0, 
                    		"BackgroundKeyword");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:235:2: ( (lv_title_1_0= ruleTitle ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_WORD && LA7_0<=RULE_PLACEHOLDER)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:236:1: (lv_title_1_0= ruleTitle )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:236:1: (lv_title_1_0= ruleTitle )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:237:3: lv_title_1_0= ruleTitle
                    {
                     
                    	        newCompositeNode(grammarAccess.getBackgroundAccess().getTitleTitleParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTitle_in_ruleBackground381);
                    lv_title_1_0=ruleTitle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_1_0, 
                            		"Title");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:253:3: (this_EOL_2= RULE_EOL )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_EOL) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:253:4: this_EOL_2= RULE_EOL
            	    {
            	    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleBackground394); 
            	     
            	        newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:257:3: ( (lv_narrative_3_0= ruleNarrative ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_WORD && LA9_0<=RULE_PLACEHOLDER)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:258:1: (lv_narrative_3_0= ruleNarrative )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:258:1: (lv_narrative_3_0= ruleNarrative )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:259:3: lv_narrative_3_0= ruleNarrative
                    {
                     
                    	        newCompositeNode(grammarAccess.getBackgroundAccess().getNarrativeNarrativeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNarrative_in_ruleBackground416);
                    lv_narrative_3_0=ruleNarrative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
                    	        }
                           		set(
                           			current, 
                           			"narrative",
                            		lv_narrative_3_0, 
                            		"Narrative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:275:3: ( (lv_steps_4_0= ruleStep ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STEP_KEYWORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:276:1: (lv_steps_4_0= ruleStep )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:276:1: (lv_steps_4_0= ruleStep )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:277:3: lv_steps_4_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleBackground438);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_4_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:301:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:302:2: (iv_ruleScenario= ruleScenario EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:303:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario475);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario485); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:310:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_narrative_4_0 = null;

        EObject lv_steps_5_0 = null;


         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:313:28: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:314:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:314:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:314:2: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:314:2: ( (lv_tags_0_0= ruleTag ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TAGNAME) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:315:1: (lv_tags_0_0= ruleTag )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:315:1: (lv_tags_0_0= ruleTag )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:316:3: lv_tags_0_0= ruleTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTag_in_ruleScenario531);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"Tag");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleScenario544); 

                	newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
                
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:336:1: ( (lv_title_2_0= ruleTitle ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:337:1: (lv_title_2_0= ruleTitle )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:337:1: (lv_title_2_0= ruleTitle )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:338:3: lv_title_2_0= ruleTitle
            {
             
            	        newCompositeNode(grammarAccess.getScenarioAccess().getTitleTitleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTitle_in_ruleScenario565);
            lv_title_2_0=ruleTitle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"Title");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:354:2: (this_EOL_3= RULE_EOL )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_EOL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:354:3: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleScenario577); 
            	     
            	        newLeafNode(this_EOL_3, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:358:3: ( (lv_narrative_4_0= ruleNarrative ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_WORD && LA13_0<=RULE_PLACEHOLDER)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:359:1: (lv_narrative_4_0= ruleNarrative )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:359:1: (lv_narrative_4_0= ruleNarrative )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:360:3: lv_narrative_4_0= ruleNarrative
                    {
                     
                    	        newCompositeNode(grammarAccess.getScenarioAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNarrative_in_ruleScenario599);
                    lv_narrative_4_0=ruleNarrative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	        }
                           		set(
                           			current, 
                           			"narrative",
                            		lv_narrative_4_0, 
                            		"Narrative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:376:3: ( (lv_steps_5_0= ruleStep ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STEP_KEYWORD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:377:1: (lv_steps_5_0= ruleStep )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:377:1: (lv_steps_5_0= ruleStep )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:378:3: lv_steps_5_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenario621);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_5_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioOutline"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:402:1: entryRuleScenarioOutline returns [EObject current=null] : iv_ruleScenarioOutline= ruleScenarioOutline EOF ;
    public final EObject entryRuleScenarioOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOutline = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:403:2: (iv_ruleScenarioOutline= ruleScenarioOutline EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:404:2: iv_ruleScenarioOutline= ruleScenarioOutline EOF
            {
             newCompositeNode(grammarAccess.getScenarioOutlineRule()); 
            pushFollow(FOLLOW_ruleScenarioOutline_in_entryRuleScenarioOutline658);
            iv_ruleScenarioOutline=ruleScenarioOutline();

            state._fsp--;

             current =iv_ruleScenarioOutline; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarioOutline668); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioOutline"


    // $ANTLR start "ruleScenarioOutline"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:411:1: ruleScenarioOutline returns [EObject current=null] : ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ( (lv_examples_6_0= ruleExamples ) ) ) ;
    public final EObject ruleScenarioOutline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EOL_3=null;
        EObject lv_tags_0_0 = null;

        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_narrative_4_0 = null;

        EObject lv_steps_5_0 = null;

        EObject lv_examples_6_0 = null;


         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:414:28: ( ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ( (lv_examples_6_0= ruleExamples ) ) ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:415:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ( (lv_examples_6_0= ruleExamples ) ) )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:415:1: ( ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ( (lv_examples_6_0= ruleExamples ) ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:415:2: ( (lv_tags_0_0= ruleTag ) )* otherlv_1= 'Scenario Outline:' ( (lv_title_2_0= ruleTitle ) ) (this_EOL_3= RULE_EOL )+ ( (lv_narrative_4_0= ruleNarrative ) )? ( (lv_steps_5_0= ruleStep ) )+ ( (lv_examples_6_0= ruleExamples ) )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:415:2: ( (lv_tags_0_0= ruleTag ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TAGNAME) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:416:1: (lv_tags_0_0= ruleTag )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:416:1: (lv_tags_0_0= ruleTag )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:417:3: lv_tags_0_0= ruleTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTag_in_ruleScenarioOutline714);
            	    lv_tags_0_0=ruleTag();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tags",
            	            		lv_tags_0_0, 
            	            		"Tag");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleScenarioOutline727); 

                	newLeafNode(otherlv_1, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
                
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:437:1: ( (lv_title_2_0= ruleTitle ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:438:1: (lv_title_2_0= ruleTitle )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:438:1: (lv_title_2_0= ruleTitle )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:439:3: lv_title_2_0= ruleTitle
            {
             
            	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTitleTitleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTitle_in_ruleScenarioOutline748);
            lv_title_2_0=ruleTitle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"Title");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:455:2: (this_EOL_3= RULE_EOL )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_EOL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:455:3: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleScenarioOutline760); 
            	     
            	        newLeafNode(this_EOL_3, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:459:3: ( (lv_narrative_4_0= ruleNarrative ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_WORD && LA17_0<=RULE_PLACEHOLDER)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:460:1: (lv_narrative_4_0= ruleNarrative )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:460:1: (lv_narrative_4_0= ruleNarrative )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:461:3: lv_narrative_4_0= ruleNarrative
                    {
                     
                    	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNarrative_in_ruleScenarioOutline782);
                    lv_narrative_4_0=ruleNarrative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
                    	        }
                           		set(
                           			current, 
                           			"narrative",
                            		lv_narrative_4_0, 
                            		"Narrative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:477:3: ( (lv_steps_5_0= ruleStep ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STEP_KEYWORD) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:478:1: (lv_steps_5_0= ruleStep )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:478:1: (lv_steps_5_0= ruleStep )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:479:3: lv_steps_5_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStep_in_ruleScenarioOutline804);
            	    lv_steps_5_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_5_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:495:3: ( (lv_examples_6_0= ruleExamples ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:496:1: (lv_examples_6_0= ruleExamples )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:496:1: (lv_examples_6_0= ruleExamples )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:497:3: lv_examples_6_0= ruleExamples
            {
             
            	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExamples_in_ruleScenarioOutline826);
            lv_examples_6_0=ruleExamples();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	        }
                   		set(
                   			current, 
                   			"examples",
                    		lv_examples_6_0, 
                    		"Examples");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleStep"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:521:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:522:2: (iv_ruleStep= ruleStep EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:523:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep862);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:530:1: ruleStep returns [EObject current=null] : ( ( (lv_stepKeyword_0_0= ruleStepKeyword ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( (lv_tables_3_0= ruleTable ) )* ( (lv_code_4_0= ruleDocString ) )? ( (lv_tables_5_0= ruleTable ) )* ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_stepKeyword_0_0 = null;

        AntlrDatatypeRuleToken lv_description_1_0 = null;

        EObject lv_tables_3_0 = null;

        EObject lv_code_4_0 = null;

        EObject lv_tables_5_0 = null;


         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:533:28: ( ( ( (lv_stepKeyword_0_0= ruleStepKeyword ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( (lv_tables_3_0= ruleTable ) )* ( (lv_code_4_0= ruleDocString ) )? ( (lv_tables_5_0= ruleTable ) )* ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:534:1: ( ( (lv_stepKeyword_0_0= ruleStepKeyword ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( (lv_tables_3_0= ruleTable ) )* ( (lv_code_4_0= ruleDocString ) )? ( (lv_tables_5_0= ruleTable ) )* )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:534:1: ( ( (lv_stepKeyword_0_0= ruleStepKeyword ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( (lv_tables_3_0= ruleTable ) )* ( (lv_code_4_0= ruleDocString ) )? ( (lv_tables_5_0= ruleTable ) )* )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:534:2: ( (lv_stepKeyword_0_0= ruleStepKeyword ) ) ( (lv_description_1_0= ruleStepDescription ) ) (this_EOL_2= RULE_EOL )* ( (lv_tables_3_0= ruleTable ) )* ( (lv_code_4_0= ruleDocString ) )? ( (lv_tables_5_0= ruleTable ) )*
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:534:2: ( (lv_stepKeyword_0_0= ruleStepKeyword ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:535:1: (lv_stepKeyword_0_0= ruleStepKeyword )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:535:1: (lv_stepKeyword_0_0= ruleStepKeyword )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:536:3: lv_stepKeyword_0_0= ruleStepKeyword
            {
             
            	        newCompositeNode(grammarAccess.getStepAccess().getStepKeywordStepKeywordParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStepKeyword_in_ruleStep918);
            lv_stepKeyword_0_0=ruleStepKeyword();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStepRule());
            	        }
                   		set(
                   			current, 
                   			"stepKeyword",
                    		lv_stepKeyword_0_0, 
                    		"StepKeyword");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:552:2: ( (lv_description_1_0= ruleStepDescription ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:553:1: (lv_description_1_0= ruleStepDescription )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:553:1: (lv_description_1_0= ruleStepDescription )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:554:3: lv_description_1_0= ruleStepDescription
            {
             
            	        newCompositeNode(grammarAccess.getStepAccess().getDescriptionStepDescriptionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStepDescription_in_ruleStep939);
            lv_description_1_0=ruleStepDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStepRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"StepDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:570:2: (this_EOL_2= RULE_EOL )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_EOL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:570:3: this_EOL_2= RULE_EOL
            	    {
            	    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleStep951); 
            	     
            	        newLeafNode(this_EOL_2, grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:574:3: ( (lv_tables_3_0= ruleTable ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_TABLE_ROW) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:575:1: (lv_tables_3_0= ruleTable )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:575:1: (lv_tables_3_0= ruleTable )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:576:3: lv_tables_3_0= ruleTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStepAccess().getTablesTableParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTable_in_ruleStep973);
            	    lv_tables_3_0=ruleTable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tables",
            	            		lv_tables_3_0, 
            	            		"Table");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:592:3: ( (lv_code_4_0= ruleDocString ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOC_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:593:1: (lv_code_4_0= ruleDocString )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:593:1: (lv_code_4_0= ruleDocString )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:594:3: lv_code_4_0= ruleDocString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getCodeDocStringParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocString_in_ruleStep995);
                    lv_code_4_0=ruleDocString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStepRule());
                    	        }
                           		set(
                           			current, 
                           			"code",
                            		lv_code_4_0, 
                            		"DocString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:610:3: ( (lv_tables_5_0= ruleTable ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TABLE_ROW) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:611:1: (lv_tables_5_0= ruleTable )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:611:1: (lv_tables_5_0= ruleTable )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:612:3: lv_tables_5_0= ruleTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStepAccess().getTablesTableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTable_in_ruleStep1017);
            	    lv_tables_5_0=ruleTable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tables",
            	            		lv_tables_5_0, 
            	            		"Table");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleExamples"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:636:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:637:2: (iv_ruleExamples= ruleExamples EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:638:2: iv_ruleExamples= ruleExamples EOF
            {
             newCompositeNode(grammarAccess.getExamplesRule()); 
            pushFollow(FOLLOW_ruleExamples_in_entryRuleExamples1054);
            iv_ruleExamples=ruleExamples();

            state._fsp--;

             current =iv_ruleExamples; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExamples1064); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:645:1: ruleExamples returns [EObject current=null] : (otherlv_0= 'Examples:' ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_table_4_0= ruleTable ) ) ) ;
    public final EObject ruleExamples() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EOL_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_narrative_3_0 = null;

        EObject lv_table_4_0 = null;


         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:648:28: ( (otherlv_0= 'Examples:' ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_table_4_0= ruleTable ) ) ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:649:1: (otherlv_0= 'Examples:' ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_table_4_0= ruleTable ) ) )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:649:1: (otherlv_0= 'Examples:' ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_table_4_0= ruleTable ) ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:649:3: otherlv_0= 'Examples:' ( (lv_title_1_0= ruleTitle ) )? (this_EOL_2= RULE_EOL )+ ( (lv_narrative_3_0= ruleNarrative ) )? ( (lv_table_4_0= ruleTable ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleExamples1101); 

                	newLeafNode(otherlv_0, grammarAccess.getExamplesAccess().getExamplesKeyword_0());
                
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:653:1: ( (lv_title_1_0= ruleTitle ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_WORD && LA23_0<=RULE_PLACEHOLDER)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:654:1: (lv_title_1_0= ruleTitle )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:654:1: (lv_title_1_0= ruleTitle )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:655:3: lv_title_1_0= ruleTitle
                    {
                     
                    	        newCompositeNode(grammarAccess.getExamplesAccess().getTitleTitleParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTitle_in_ruleExamples1122);
                    lv_title_1_0=ruleTitle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExamplesRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_1_0, 
                            		"Title");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:671:3: (this_EOL_2= RULE_EOL )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_EOL) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:671:4: this_EOL_2= RULE_EOL
            	    {
            	    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleExamples1135); 
            	     
            	        newLeafNode(this_EOL_2, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:675:3: ( (lv_narrative_3_0= ruleNarrative ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_PLACEHOLDER)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:676:1: (lv_narrative_3_0= ruleNarrative )
                    {
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:676:1: (lv_narrative_3_0= ruleNarrative )
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:677:3: lv_narrative_3_0= ruleNarrative
                    {
                     
                    	        newCompositeNode(grammarAccess.getExamplesAccess().getNarrativeNarrativeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNarrative_in_ruleExamples1157);
                    lv_narrative_3_0=ruleNarrative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExamplesRule());
                    	        }
                           		set(
                           			current, 
                           			"narrative",
                            		lv_narrative_3_0, 
                            		"Narrative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:693:3: ( (lv_table_4_0= ruleTable ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:694:1: (lv_table_4_0= ruleTable )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:694:1: (lv_table_4_0= ruleTable )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:695:3: lv_table_4_0= ruleTable
            {
             
            	        newCompositeNode(grammarAccess.getExamplesAccess().getTableTableParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTable_in_ruleExamples1179);
            lv_table_4_0=ruleTable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExamplesRule());
            	        }
                   		set(
                   			current, 
                   			"table",
                    		lv_table_4_0, 
                    		"Table");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleTable"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:719:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:720:2: (iv_ruleTable= ruleTable EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:721:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable1215);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable1225); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:728:1: ruleTable returns [EObject current=null] : ( ( (lv_rows_0_0= RULE_TABLE_ROW ) )+ (this_EOL_1= RULE_EOL )* ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_rows_0_0=null;
        Token this_EOL_1=null;

         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:731:28: ( ( ( (lv_rows_0_0= RULE_TABLE_ROW ) )+ (this_EOL_1= RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:732:1: ( ( (lv_rows_0_0= RULE_TABLE_ROW ) )+ (this_EOL_1= RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:732:1: ( ( (lv_rows_0_0= RULE_TABLE_ROW ) )+ (this_EOL_1= RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:732:2: ( (lv_rows_0_0= RULE_TABLE_ROW ) )+ (this_EOL_1= RULE_EOL )*
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:732:2: ( (lv_rows_0_0= RULE_TABLE_ROW ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_TABLE_ROW) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:733:1: (lv_rows_0_0= RULE_TABLE_ROW )
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:733:1: (lv_rows_0_0= RULE_TABLE_ROW )
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:734:3: lv_rows_0_0= RULE_TABLE_ROW
            	    {
            	    lv_rows_0_0=(Token)match(input,RULE_TABLE_ROW,FOLLOW_RULE_TABLE_ROW_in_ruleTable1267); 

            	    			newLeafNode(lv_rows_0_0, grammarAccess.getTableAccess().getRowsTABLE_ROWTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"rows",
            	            		lv_rows_0_0, 
            	            		"TABLE_ROW");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:750:3: (this_EOL_1= RULE_EOL )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_EOL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:750:4: this_EOL_1= RULE_EOL
            	    {
            	    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleTable1285); 
            	     
            	        newLeafNode(this_EOL_1, grammarAccess.getTableAccess().getEOLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleDocString"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:762:1: entryRuleDocString returns [EObject current=null] : iv_ruleDocString= ruleDocString EOF ;
    public final EObject entryRuleDocString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocString = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:763:2: (iv_ruleDocString= ruleDocString EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:764:2: iv_ruleDocString= ruleDocString EOF
            {
             newCompositeNode(grammarAccess.getDocStringRule()); 
            pushFollow(FOLLOW_ruleDocString_in_entryRuleDocString1322);
            iv_ruleDocString=ruleDocString();

            state._fsp--;

             current =iv_ruleDocString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocString1332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocString"


    // $ANTLR start "ruleDocString"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:771:1: ruleDocString returns [EObject current=null] : ( ( (lv_content_0_0= RULE_DOC_STRING ) ) (this_EOL_1= RULE_EOL )* ) ;
    public final EObject ruleDocString() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;
        Token this_EOL_1=null;

         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:774:28: ( ( ( (lv_content_0_0= RULE_DOC_STRING ) ) (this_EOL_1= RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:775:1: ( ( (lv_content_0_0= RULE_DOC_STRING ) ) (this_EOL_1= RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:775:1: ( ( (lv_content_0_0= RULE_DOC_STRING ) ) (this_EOL_1= RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:775:2: ( (lv_content_0_0= RULE_DOC_STRING ) ) (this_EOL_1= RULE_EOL )*
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:775:2: ( (lv_content_0_0= RULE_DOC_STRING ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:776:1: (lv_content_0_0= RULE_DOC_STRING )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:776:1: (lv_content_0_0= RULE_DOC_STRING )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:777:3: lv_content_0_0= RULE_DOC_STRING
            {
            lv_content_0_0=(Token)match(input,RULE_DOC_STRING,FOLLOW_RULE_DOC_STRING_in_ruleDocString1374); 

            			newLeafNode(lv_content_0_0, grammarAccess.getDocStringAccess().getContentDOC_STRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_0_0, 
                    		"DOC_STRING");
            	    

            }


            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:793:2: (this_EOL_1= RULE_EOL )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EOL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:793:3: this_EOL_1= RULE_EOL
            	    {
            	    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleDocString1391); 
            	     
            	        newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocString"


    // $ANTLR start "entryRuleTitle"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:805:1: entryRuleTitle returns [String current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final String entryRuleTitle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTitle = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:806:2: (iv_ruleTitle= ruleTitle EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:807:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle1429);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle1440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:814:1: ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* ) ;
    public final AntlrDatatypeRuleToken ruleTitle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_NUMBER_1=null;
        Token this_STRING_2=null;
        Token this_PLACEHOLDER_3=null;
        Token this_WORD_4=null;
        Token this_NUMBER_5=null;
        Token this_STRING_6=null;
        Token this_PLACEHOLDER_7=null;
        Token this_STEP_KEYWORD_8=null;
        Token this_TAGNAME_9=null;

         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:817:28: ( ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:818:1: ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:818:1: ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:818:2: (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )*
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:818:2: (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER )
            int alt29=4;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt29=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt29=2;
                }
                break;
            case RULE_STRING:
                {
                alt29=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:818:7: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTitle1481); 

                    		current.merge(this_WORD_0);
                        
                     
                        newLeafNode(this_WORD_0, grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:826:10: this_NUMBER_1= RULE_NUMBER
                    {
                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleTitle1507); 

                    		current.merge(this_NUMBER_1);
                        
                     
                        newLeafNode(this_NUMBER_1, grammarAccess.getTitleAccess().getNUMBERTerminalRuleCall_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:834:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTitle1533); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_0_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:842:10: this_PLACEHOLDER_3= RULE_PLACEHOLDER
                    {
                    this_PLACEHOLDER_3=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_ruleTitle1559); 

                    		current.merge(this_PLACEHOLDER_3);
                        
                     
                        newLeafNode(this_PLACEHOLDER_3, grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
                        

                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:849:2: (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )*
            loop30:
            do {
                int alt30=7;
                switch ( input.LA(1) ) {
                case RULE_WORD:
                    {
                    alt30=1;
                    }
                    break;
                case RULE_NUMBER:
                    {
                    alt30=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt30=3;
                    }
                    break;
                case RULE_PLACEHOLDER:
                    {
                    alt30=4;
                    }
                    break;
                case RULE_STEP_KEYWORD:
                    {
                    alt30=5;
                    }
                    break;
                case RULE_TAGNAME:
                    {
                    alt30=6;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:849:7: this_WORD_4= RULE_WORD
            	    {
            	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleTitle1581); 

            	    		current.merge(this_WORD_4);
            	        
            	     
            	        newLeafNode(this_WORD_4, grammarAccess.getTitleAccess().getWORDTerminalRuleCall_1_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:857:10: this_NUMBER_5= RULE_NUMBER
            	    {
            	    this_NUMBER_5=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleTitle1607); 

            	    		current.merge(this_NUMBER_5);
            	        
            	     
            	        newLeafNode(this_NUMBER_5, grammarAccess.getTitleAccess().getNUMBERTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:865:10: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTitle1633); 

            	    		current.merge(this_STRING_6);
            	        
            	     
            	        newLeafNode(this_STRING_6, grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_1_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:873:10: this_PLACEHOLDER_7= RULE_PLACEHOLDER
            	    {
            	    this_PLACEHOLDER_7=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_ruleTitle1659); 

            	    		current.merge(this_PLACEHOLDER_7);
            	        
            	     
            	        newLeafNode(this_PLACEHOLDER_7, grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:881:10: this_STEP_KEYWORD_8= RULE_STEP_KEYWORD
            	    {
            	    this_STEP_KEYWORD_8=(Token)match(input,RULE_STEP_KEYWORD,FOLLOW_RULE_STEP_KEYWORD_in_ruleTitle1685); 

            	    		current.merge(this_STEP_KEYWORD_8);
            	        
            	     
            	        newLeafNode(this_STEP_KEYWORD_8, grammarAccess.getTitleAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:889:10: this_TAGNAME_9= RULE_TAGNAME
            	    {
            	    this_TAGNAME_9=(Token)match(input,RULE_TAGNAME,FOLLOW_RULE_TAGNAME_in_ruleTitle1711); 

            	    		current.merge(this_TAGNAME_9);
            	        
            	     
            	        newLeafNode(this_TAGNAME_9, grammarAccess.getTitleAccess().getTAGNAMETerminalRuleCall_1_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleNarrative"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:904:1: entryRuleNarrative returns [String current=null] : iv_ruleNarrative= ruleNarrative EOF ;
    public final String entryRuleNarrative() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNarrative = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:905:2: (iv_ruleNarrative= ruleNarrative EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:906:2: iv_ruleNarrative= ruleNarrative EOF
            {
             newCompositeNode(grammarAccess.getNarrativeRule()); 
            pushFollow(FOLLOW_ruleNarrative_in_entryRuleNarrative1759);
            iv_ruleNarrative=ruleNarrative();

            state._fsp--;

             current =iv_ruleNarrative.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNarrative1770); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNarrative"


    // $ANTLR start "ruleNarrative"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:913:1: ruleNarrative returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+ )+ ;
    public final AntlrDatatypeRuleToken ruleNarrative() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_NUMBER_1=null;
        Token this_STRING_2=null;
        Token this_PLACEHOLDER_3=null;
        Token this_WORD_4=null;
        Token this_NUMBER_5=null;
        Token this_STRING_6=null;
        Token this_PLACEHOLDER_7=null;
        Token this_STEP_KEYWORD_8=null;
        Token this_TAGNAME_9=null;
        Token this_EOL_10=null;

         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:916:28: ( ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+ )+ )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:917:1: ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+ )+
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:917:1: ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+ )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_WORD && LA34_0<=RULE_PLACEHOLDER)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:917:2: (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER ) (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )* (this_EOL_10= RULE_EOL )+
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:917:2: (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER )
            	    int alt31=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_WORD:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    case RULE_PLACEHOLDER:
            	        {
            	        alt31=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:917:7: this_WORD_0= RULE_WORD
            	            {
            	            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleNarrative1811); 

            	            		current.merge(this_WORD_0);
            	                
            	             
            	                newLeafNode(this_WORD_0, grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:925:10: this_NUMBER_1= RULE_NUMBER
            	            {
            	            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNarrative1837); 

            	            		current.merge(this_NUMBER_1);
            	                
            	             
            	                newLeafNode(this_NUMBER_1, grammarAccess.getNarrativeAccess().getNUMBERTerminalRuleCall_0_1()); 
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:933:10: this_STRING_2= RULE_STRING
            	            {
            	            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNarrative1863); 

            	            		current.merge(this_STRING_2);
            	                
            	             
            	                newLeafNode(this_STRING_2, grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_0_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:941:10: this_PLACEHOLDER_3= RULE_PLACEHOLDER
            	            {
            	            this_PLACEHOLDER_3=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_ruleNarrative1889); 

            	            		current.merge(this_PLACEHOLDER_3);
            	                
            	             
            	                newLeafNode(this_PLACEHOLDER_3, grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:948:2: (this_WORD_4= RULE_WORD | this_NUMBER_5= RULE_NUMBER | this_STRING_6= RULE_STRING | this_PLACEHOLDER_7= RULE_PLACEHOLDER | this_STEP_KEYWORD_8= RULE_STEP_KEYWORD | this_TAGNAME_9= RULE_TAGNAME )*
            	    loop32:
            	    do {
            	        int alt32=7;
            	        switch ( input.LA(1) ) {
            	        case RULE_WORD:
            	            {
            	            alt32=1;
            	            }
            	            break;
            	        case RULE_NUMBER:
            	            {
            	            alt32=2;
            	            }
            	            break;
            	        case RULE_STRING:
            	            {
            	            alt32=3;
            	            }
            	            break;
            	        case RULE_PLACEHOLDER:
            	            {
            	            alt32=4;
            	            }
            	            break;
            	        case RULE_STEP_KEYWORD:
            	            {
            	            alt32=5;
            	            }
            	            break;
            	        case RULE_TAGNAME:
            	            {
            	            alt32=6;
            	            }
            	            break;

            	        }

            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:948:7: this_WORD_4= RULE_WORD
            	    	    {
            	    	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleNarrative1911); 

            	    	    		current.merge(this_WORD_4);
            	    	        
            	    	     
            	    	        newLeafNode(this_WORD_4, grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_1_0()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:956:10: this_NUMBER_5= RULE_NUMBER
            	    	    {
            	    	    this_NUMBER_5=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNarrative1937); 

            	    	    		current.merge(this_NUMBER_5);
            	    	        
            	    	     
            	    	        newLeafNode(this_NUMBER_5, grammarAccess.getNarrativeAccess().getNUMBERTerminalRuleCall_1_1()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:964:10: this_STRING_6= RULE_STRING
            	    	    {
            	    	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNarrative1963); 

            	    	    		current.merge(this_STRING_6);
            	    	        
            	    	     
            	    	        newLeafNode(this_STRING_6, grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_1_2()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:972:10: this_PLACEHOLDER_7= RULE_PLACEHOLDER
            	    	    {
            	    	    this_PLACEHOLDER_7=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_ruleNarrative1989); 

            	    	    		current.merge(this_PLACEHOLDER_7);
            	    	        
            	    	     
            	    	        newLeafNode(this_PLACEHOLDER_7, grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:980:10: this_STEP_KEYWORD_8= RULE_STEP_KEYWORD
            	    	    {
            	    	    this_STEP_KEYWORD_8=(Token)match(input,RULE_STEP_KEYWORD,FOLLOW_RULE_STEP_KEYWORD_in_ruleNarrative2015); 

            	    	    		current.merge(this_STEP_KEYWORD_8);
            	    	        
            	    	     
            	    	        newLeafNode(this_STEP_KEYWORD_8, grammarAccess.getNarrativeAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:988:10: this_TAGNAME_9= RULE_TAGNAME
            	    	    {
            	    	    this_TAGNAME_9=(Token)match(input,RULE_TAGNAME,FOLLOW_RULE_TAGNAME_in_ruleNarrative2041); 

            	    	    		current.merge(this_TAGNAME_9);
            	    	        
            	    	     
            	    	        newLeafNode(this_TAGNAME_9, grammarAccess.getNarrativeAccess().getTAGNAMETerminalRuleCall_1_5()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:995:3: (this_EOL_10= RULE_EOL )+
            	    int cnt33=0;
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==RULE_EOL) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:995:8: this_EOL_10= RULE_EOL
            	    	    {
            	    	    this_EOL_10=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleNarrative2064); 

            	    	    		current.merge(this_EOL_10);
            	    	        
            	    	     
            	    	        newLeafNode(this_EOL_10, grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt33 >= 1 ) break loop33;
            	                EarlyExitException eee =
            	                    new EarlyExitException(33, input);
            	                throw eee;
            	        }
            	        cnt33++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNarrative"


    // $ANTLR start "entryRuleStepDescription"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1010:1: entryRuleStepDescription returns [String current=null] : iv_ruleStepDescription= ruleStepDescription EOF ;
    public final String entryRuleStepDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepDescription = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1011:2: (iv_ruleStepDescription= ruleStepDescription EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1012:2: iv_ruleStepDescription= ruleStepDescription EOF
            {
             newCompositeNode(grammarAccess.getStepDescriptionRule()); 
            pushFollow(FOLLOW_ruleStepDescription_in_entryRuleStepDescription2113);
            iv_ruleStepDescription=ruleStepDescription();

            state._fsp--;

             current =iv_ruleStepDescription.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepDescription2124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepDescription"


    // $ANTLR start "ruleStepDescription"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1019:1: ruleStepDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER | this_STEP_KEYWORD_4= RULE_STEP_KEYWORD | this_TAGNAME_5= RULE_TAGNAME )+ ;
    public final AntlrDatatypeRuleToken ruleStepDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_NUMBER_1=null;
        Token this_STRING_2=null;
        Token this_PLACEHOLDER_3=null;
        Token this_STEP_KEYWORD_4=null;
        Token this_TAGNAME_5=null;

         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1022:28: ( (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER | this_STEP_KEYWORD_4= RULE_STEP_KEYWORD | this_TAGNAME_5= RULE_TAGNAME )+ )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1023:1: (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER | this_STEP_KEYWORD_4= RULE_STEP_KEYWORD | this_TAGNAME_5= RULE_TAGNAME )+
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1023:1: (this_WORD_0= RULE_WORD | this_NUMBER_1= RULE_NUMBER | this_STRING_2= RULE_STRING | this_PLACEHOLDER_3= RULE_PLACEHOLDER | this_STEP_KEYWORD_4= RULE_STEP_KEYWORD | this_TAGNAME_5= RULE_TAGNAME )+
            int cnt35=0;
            loop35:
            do {
                int alt35=7;
                switch ( input.LA(1) ) {
                case RULE_TAGNAME:
                    {
                    alt35=6;
                    }
                    break;
                case RULE_STEP_KEYWORD:
                    {
                    alt35=5;
                    }
                    break;
                case RULE_WORD:
                    {
                    alt35=1;
                    }
                    break;
                case RULE_NUMBER:
                    {
                    alt35=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt35=3;
                    }
                    break;
                case RULE_PLACEHOLDER:
                    {
                    alt35=4;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1023:6: this_WORD_0= RULE_WORD
            	    {
            	    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleStepDescription2164); 

            	    		current.merge(this_WORD_0);
            	        
            	     
            	        newLeafNode(this_WORD_0, grammarAccess.getStepDescriptionAccess().getWORDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1031:10: this_NUMBER_1= RULE_NUMBER
            	    {
            	    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleStepDescription2190); 

            	    		current.merge(this_NUMBER_1);
            	        
            	     
            	        newLeafNode(this_NUMBER_1, grammarAccess.getStepDescriptionAccess().getNUMBERTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1039:10: this_STRING_2= RULE_STRING
            	    {
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStepDescription2216); 

            	    		current.merge(this_STRING_2);
            	        
            	     
            	        newLeafNode(this_STRING_2, grammarAccess.getStepDescriptionAccess().getSTRINGTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1047:10: this_PLACEHOLDER_3= RULE_PLACEHOLDER
            	    {
            	    this_PLACEHOLDER_3=(Token)match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_ruleStepDescription2242); 

            	    		current.merge(this_PLACEHOLDER_3);
            	        
            	     
            	        newLeafNode(this_PLACEHOLDER_3, grammarAccess.getStepDescriptionAccess().getPLACEHOLDERTerminalRuleCall_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1055:10: this_STEP_KEYWORD_4= RULE_STEP_KEYWORD
            	    {
            	    this_STEP_KEYWORD_4=(Token)match(input,RULE_STEP_KEYWORD,FOLLOW_RULE_STEP_KEYWORD_in_ruleStepDescription2268); 

            	    		current.merge(this_STEP_KEYWORD_4);
            	        
            	     
            	        newLeafNode(this_STEP_KEYWORD_4, grammarAccess.getStepDescriptionAccess().getSTEP_KEYWORDTerminalRuleCall_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1063:10: this_TAGNAME_5= RULE_TAGNAME
            	    {
            	    this_TAGNAME_5=(Token)match(input,RULE_TAGNAME,FOLLOW_RULE_TAGNAME_in_ruleStepDescription2294); 

            	    		current.merge(this_TAGNAME_5);
            	        
            	     
            	        newLeafNode(this_TAGNAME_5, grammarAccess.getStepDescriptionAccess().getTAGNAMETerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepDescription"


    // $ANTLR start "entryRuleStepKeyword"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1078:1: entryRuleStepKeyword returns [String current=null] : iv_ruleStepKeyword= ruleStepKeyword EOF ;
    public final String entryRuleStepKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepKeyword = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1079:2: (iv_ruleStepKeyword= ruleStepKeyword EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1080:2: iv_ruleStepKeyword= ruleStepKeyword EOF
            {
             newCompositeNode(grammarAccess.getStepKeywordRule()); 
            pushFollow(FOLLOW_ruleStepKeyword_in_entryRuleStepKeyword2341);
            iv_ruleStepKeyword=ruleStepKeyword();

            state._fsp--;

             current =iv_ruleStepKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepKeyword2352); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepKeyword"


    // $ANTLR start "ruleStepKeyword"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1087:1: ruleStepKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STEP_KEYWORD_0= RULE_STEP_KEYWORD ;
    public final AntlrDatatypeRuleToken ruleStepKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STEP_KEYWORD_0=null;

         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1090:28: (this_STEP_KEYWORD_0= RULE_STEP_KEYWORD )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1091:5: this_STEP_KEYWORD_0= RULE_STEP_KEYWORD
            {
            this_STEP_KEYWORD_0=(Token)match(input,RULE_STEP_KEYWORD,FOLLOW_RULE_STEP_KEYWORD_in_ruleStepKeyword2391); 

            		current.merge(this_STEP_KEYWORD_0);
                
             
                newLeafNode(this_STEP_KEYWORD_0, grammarAccess.getStepKeywordAccess().getSTEP_KEYWORDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepKeyword"


    // $ANTLR start "entryRuleBackgroundKeyword"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1106:1: entryRuleBackgroundKeyword returns [String current=null] : iv_ruleBackgroundKeyword= ruleBackgroundKeyword EOF ;
    public final String entryRuleBackgroundKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBackgroundKeyword = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1107:2: (iv_ruleBackgroundKeyword= ruleBackgroundKeyword EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1108:2: iv_ruleBackgroundKeyword= ruleBackgroundKeyword EOF
            {
             newCompositeNode(grammarAccess.getBackgroundKeywordRule()); 
            pushFollow(FOLLOW_ruleBackgroundKeyword_in_entryRuleBackgroundKeyword2436);
            iv_ruleBackgroundKeyword=ruleBackgroundKeyword();

            state._fsp--;

             current =iv_ruleBackgroundKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackgroundKeyword2447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackgroundKeyword"


    // $ANTLR start "ruleBackgroundKeyword"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1115:1: ruleBackgroundKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Background:' ;
    public final AntlrDatatypeRuleToken ruleBackgroundKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1118:28: (kw= 'Background:' )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1120:2: kw= 'Background:'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleBackgroundKeyword2484); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBackgroundKeywordAccess().getBackgroundKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackgroundKeyword"


    // $ANTLR start "entryRuleTag"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1133:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1134:2: (iv_ruleTag= ruleTag EOF )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1135:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_ruleTag_in_entryRuleTag2523);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTag2533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1142:1: ruleTag returns [EObject current=null] : ( ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )? ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token this_EOL_1=null;

         enterRule(); 
            
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1145:28: ( ( ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )? ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1146:1: ( ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )? )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1146:1: ( ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )? )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1146:2: ( (lv_id_0_0= RULE_TAGNAME ) ) (this_EOL_1= RULE_EOL )?
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1146:2: ( (lv_id_0_0= RULE_TAGNAME ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1147:1: (lv_id_0_0= RULE_TAGNAME )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1147:1: (lv_id_0_0= RULE_TAGNAME )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1148:3: lv_id_0_0= RULE_TAGNAME
            {
            lv_id_0_0=(Token)match(input,RULE_TAGNAME,FOLLOW_RULE_TAGNAME_in_ruleTag2575); 

            			newLeafNode(lv_id_0_0, grammarAccess.getTagAccess().getIdTAGNAMETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTagRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"TAGNAME");
            	    

            }


            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1164:2: (this_EOL_1= RULE_EOL )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_EOL) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1164:3: this_EOL_1= RULE_EOL
                    {
                    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleTag2592); 
                     
                        newLeafNode(this_EOL_1, grammarAccess.getTagAccess().getEOLTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\1\14\1\4\2\uffff\1\14";
    static final String DFA5_maxS =
        "\2\26\2\uffff\1\26";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\10\uffff\1\2\1\3",
            "\1\4\7\uffff\1\1\10\uffff\1\2\1\3",
            "",
            "",
            "\1\1\10\uffff\1\2\1\3"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "162:1: (lv_scenarios_6_1= ruleScenario | lv_scenarios_6_2= ruleScenarioOutline )";
        }
    }
 

    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_ruleFeature131 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleFeature144 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleFeature165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleFeature177 = new BitSet(new long[]{0x0000000001701790L});
    public static final BitSet FOLLOW_ruleNarrative_in_ruleFeature199 = new BitSet(new long[]{0x0000000001701780L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleFeature221 = new BitSet(new long[]{0x0000000001701780L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleFeature245 = new BitSet(new long[]{0x0000000001701782L});
    public static final BitSet FOLLOW_ruleScenarioOutline_in_ruleFeature264 = new BitSet(new long[]{0x0000000001701782L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackgroundKeyword_in_ruleBackground360 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleBackground381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleBackground394 = new BitSet(new long[]{0x0000000000000F90L});
    public static final BitSet FOLLOW_ruleNarrative_in_ruleBackground416 = new BitSet(new long[]{0x0000000000000F80L});
    public static final BitSet FOLLOW_ruleStep_in_ruleBackground438 = new BitSet(new long[]{0x0000000000000F82L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_ruleScenario531 = new BitSet(new long[]{0x0000000000301000L});
    public static final BitSet FOLLOW_21_in_ruleScenario544 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleScenario565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleScenario577 = new BitSet(new long[]{0x0000000000000F90L});
    public static final BitSet FOLLOW_ruleNarrative_in_ruleScenario599 = new BitSet(new long[]{0x0000000000000F80L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenario621 = new BitSet(new long[]{0x0000000000000F82L});
    public static final BitSet FOLLOW_ruleScenarioOutline_in_entryRuleScenarioOutline658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarioOutline668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_ruleScenarioOutline714 = new BitSet(new long[]{0x0000000000501000L});
    public static final BitSet FOLLOW_22_in_ruleScenarioOutline727 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleScenarioOutline748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleScenarioOutline760 = new BitSet(new long[]{0x0000000000000F90L});
    public static final BitSet FOLLOW_ruleNarrative_in_ruleScenarioOutline782 = new BitSet(new long[]{0x0000000000000F80L});
    public static final BitSet FOLLOW_ruleStep_in_ruleScenarioOutline804 = new BitSet(new long[]{0x0000000000800F80L});
    public static final BitSet FOLLOW_ruleExamples_in_ruleScenarioOutline826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepKeyword_in_ruleStep918 = new BitSet(new long[]{0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleStepDescription_in_ruleStep939 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleStep951 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_ruleTable_in_ruleStep973 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleDocString_in_ruleStep995 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTable_in_ruleStep1017 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleExamples_in_entryRuleExamples1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExamples1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleExamples1101 = new BitSet(new long[]{0x0000000000000790L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleExamples1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleExamples1135 = new BitSet(new long[]{0x00000000000007B0L});
    public static final BitSet FOLLOW_ruleNarrative_in_ruleExamples1157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTable_in_ruleExamples1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_in_ruleTable1267 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleTable1285 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDocString_in_entryRuleDocString1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocString1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_STRING_in_ruleDocString1374 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleDocString1391 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTitle1481 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleTitle1507 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTitle1533 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_ruleTitle1559 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleTitle1581 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleTitle1607 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTitle1633 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_ruleTitle1659 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_STEP_KEYWORD_in_ruleTitle1685 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_TAGNAME_in_ruleTitle1711 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_ruleNarrative_in_entryRuleNarrative1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNarrative1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleNarrative1811 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNarrative1837 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNarrative1863 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_ruleNarrative1889 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleNarrative1911 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNarrative1937 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNarrative1963 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_ruleNarrative1989 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_STEP_KEYWORD_in_ruleNarrative2015 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_TAGNAME_in_ruleNarrative2041 = new BitSet(new long[]{0x0000000000001F90L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleNarrative2064 = new BitSet(new long[]{0x0000000000000792L});
    public static final BitSet FOLLOW_ruleStepDescription_in_entryRuleStepDescription2113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepDescription2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleStepDescription2164 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleStepDescription2190 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStepDescription2216 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_ruleStepDescription2242 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_STEP_KEYWORD_in_ruleStepDescription2268 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_RULE_TAGNAME_in_ruleStepDescription2294 = new BitSet(new long[]{0x0000000000001F82L});
    public static final BitSet FOLLOW_ruleStepKeyword_in_entryRuleStepKeyword2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepKeyword2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STEP_KEYWORD_in_ruleStepKeyword2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackgroundKeyword_in_entryRuleBackgroundKeyword2436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackgroundKeyword2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBackgroundKeyword2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_entryRuleTag2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTag2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAGNAME_in_ruleTag2575 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleTag2592 = new BitSet(new long[]{0x0000000000000002L});

}