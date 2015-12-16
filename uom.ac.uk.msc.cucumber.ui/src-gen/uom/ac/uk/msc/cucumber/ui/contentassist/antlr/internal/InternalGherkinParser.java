package uom.ac.uk.msc.cucumber.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import uom.ac.uk.msc.cucumber.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STEP_KEYWORD", "RULE_WORD", "RULE_NUMBER", "RULE_STRING", "RULE_PLACEHOLDER", "RULE_TAGNAME", "RULE_EOL", "RULE_TABLE_ROW", "RULE_DOC_STRING", "RULE_NL", "RULE_SL_COMMENT", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_ANY_OTHER", "'Background:'", "'Feature:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'"
    };
    public static final int RULE_TABLE_ROW=11;
    public static final int RULE_ID=16;
    public static final int RULE_TAGNAME=9;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_PLACEHOLDER=8;
    public static final int RULE_NL=13;
    public static final int RULE_EOL=10;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_DOC_STRING=12;
    public static final int RULE_STRING=7;
    public static final int RULE_NUMBER=6;
    public static final int RULE_INT=17;
    public static final int RULE_STEP_KEYWORD=4;
    public static final int RULE_WS=15;
    public static final int RULE_WORD=5;

    // delegates
    // delegators


        public InternalGherkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGherkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGherkinParser.tokenNames; }
    public String getGrammarFileName() { return "../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g"; }


     
     	private GherkinGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GherkinGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleFeature"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:60:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:61:1: ( ruleFeature EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:62:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature61);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:69:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:73:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:74:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:74:1: ( ( rule__Feature__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:75:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:76:1: ( rule__Feature__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:76:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature94);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleBackground"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:88:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:89:1: ( ruleBackground EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:90:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_ruleBackground_in_entryRuleBackground121);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackground128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:97:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:101:2: ( ( ( rule__Background__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:102:1: ( ( rule__Background__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:102:1: ( ( rule__Background__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:103:1: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:104:1: ( rule__Background__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:104:2: rule__Background__Group__0
            {
            pushFollow(FOLLOW_rule__Background__Group__0_in_ruleBackground154);
            rule__Background__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:116:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:117:1: ( ruleScenario EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:118:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario181);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:125:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:129:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:130:1: ( ( rule__Scenario__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:130:1: ( ( rule__Scenario__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:131:1: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:132:1: ( rule__Scenario__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:132:2: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0_in_ruleScenario214);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioOutline"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:144:1: entryRuleScenarioOutline : ruleScenarioOutline EOF ;
    public final void entryRuleScenarioOutline() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:145:1: ( ruleScenarioOutline EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:146:1: ruleScenarioOutline EOF
            {
             before(grammarAccess.getScenarioOutlineRule()); 
            pushFollow(FOLLOW_ruleScenarioOutline_in_entryRuleScenarioOutline241);
            ruleScenarioOutline();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarioOutline248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenarioOutline"


    // $ANTLR start "ruleScenarioOutline"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:153:1: ruleScenarioOutline : ( ( rule__ScenarioOutline__Group__0 ) ) ;
    public final void ruleScenarioOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:157:2: ( ( ( rule__ScenarioOutline__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:158:1: ( ( rule__ScenarioOutline__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:158:1: ( ( rule__ScenarioOutline__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:159:1: ( rule__ScenarioOutline__Group__0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:160:1: ( rule__ScenarioOutline__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:160:2: rule__ScenarioOutline__Group__0
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__Group__0_in_ruleScenarioOutline274);
            rule__ScenarioOutline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleStep"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:172:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:173:1: ( ruleStep EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:174:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep301);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:181:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:185:2: ( ( ( rule__Step__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:186:1: ( ( rule__Step__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:186:1: ( ( rule__Step__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:187:1: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:188:1: ( rule__Step__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:188:2: rule__Step__Group__0
            {
            pushFollow(FOLLOW_rule__Step__Group__0_in_ruleStep334);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleExamples"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:200:1: entryRuleExamples : ruleExamples EOF ;
    public final void entryRuleExamples() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:201:1: ( ruleExamples EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:202:1: ruleExamples EOF
            {
             before(grammarAccess.getExamplesRule()); 
            pushFollow(FOLLOW_ruleExamples_in_entryRuleExamples361);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getExamplesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExamples368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:209:1: ruleExamples : ( ( rule__Examples__Group__0 ) ) ;
    public final void ruleExamples() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:213:2: ( ( ( rule__Examples__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:214:1: ( ( rule__Examples__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:214:1: ( ( rule__Examples__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:215:1: ( rule__Examples__Group__0 )
            {
             before(grammarAccess.getExamplesAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:216:1: ( rule__Examples__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:216:2: rule__Examples__Group__0
            {
            pushFollow(FOLLOW_rule__Examples__Group__0_in_ruleExamples394);
            rule__Examples__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleTable"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:228:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:229:1: ( ruleTable EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:230:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable421);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:237:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:241:2: ( ( ( rule__Table__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:242:1: ( ( rule__Table__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:242:1: ( ( rule__Table__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:243:1: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:244:1: ( rule__Table__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:244:2: rule__Table__Group__0
            {
            pushFollow(FOLLOW_rule__Table__Group__0_in_ruleTable454);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleDocString"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:256:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:257:1: ( ruleDocString EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:258:1: ruleDocString EOF
            {
             before(grammarAccess.getDocStringRule()); 
            pushFollow(FOLLOW_ruleDocString_in_entryRuleDocString481);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getDocStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocString488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocString"


    // $ANTLR start "ruleDocString"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:265:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:269:2: ( ( ( rule__DocString__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:270:1: ( ( rule__DocString__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:270:1: ( ( rule__DocString__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:271:1: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:272:1: ( rule__DocString__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:272:2: rule__DocString__Group__0
            {
            pushFollow(FOLLOW_rule__DocString__Group__0_in_ruleDocString514);
            rule__DocString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocString"


    // $ANTLR start "entryRuleTitle"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:284:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:285:1: ( ruleTitle EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:286:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle541);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:293:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:297:2: ( ( ( rule__Title__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:298:1: ( ( rule__Title__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:298:1: ( ( rule__Title__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:299:1: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:300:1: ( rule__Title__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:300:2: rule__Title__Group__0
            {
            pushFollow(FOLLOW_rule__Title__Group__0_in_ruleTitle574);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleNarrative"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:312:1: entryRuleNarrative : ruleNarrative EOF ;
    public final void entryRuleNarrative() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:313:1: ( ruleNarrative EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:314:1: ruleNarrative EOF
            {
             before(grammarAccess.getNarrativeRule()); 
            pushFollow(FOLLOW_ruleNarrative_in_entryRuleNarrative601);
            ruleNarrative();

            state._fsp--;

             after(grammarAccess.getNarrativeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNarrative608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNarrative"


    // $ANTLR start "ruleNarrative"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:321:1: ruleNarrative : ( ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* ) ) ;
    public final void ruleNarrative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:325:2: ( ( ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:326:1: ( ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:326:1: ( ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:327:1: ( ( rule__Narrative__Group__0 ) ) ( ( rule__Narrative__Group__0 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:327:1: ( ( rule__Narrative__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:328:1: ( rule__Narrative__Group__0 )
            {
             before(grammarAccess.getNarrativeAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:329:1: ( rule__Narrative__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:329:2: rule__Narrative__Group__0
            {
            pushFollow(FOLLOW_rule__Narrative__Group__0_in_ruleNarrative636);
            rule__Narrative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNarrativeAccess().getGroup()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:332:1: ( ( rule__Narrative__Group__0 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:333:1: ( rule__Narrative__Group__0 )*
            {
             before(grammarAccess.getNarrativeAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:334:1: ( rule__Narrative__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_PLACEHOLDER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:334:2: rule__Narrative__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Narrative__Group__0_in_ruleNarrative648);
            	    rule__Narrative__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNarrativeAccess().getGroup()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNarrative"


    // $ANTLR start "entryRuleStepDescription"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:347:1: entryRuleStepDescription : ruleStepDescription EOF ;
    public final void entryRuleStepDescription() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:348:1: ( ruleStepDescription EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:349:1: ruleStepDescription EOF
            {
             before(grammarAccess.getStepDescriptionRule()); 
            pushFollow(FOLLOW_ruleStepDescription_in_entryRuleStepDescription678);
            ruleStepDescription();

            state._fsp--;

             after(grammarAccess.getStepDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepDescription685); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepDescription"


    // $ANTLR start "ruleStepDescription"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:356:1: ruleStepDescription : ( ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* ) ) ;
    public final void ruleStepDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:360:2: ( ( ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:361:1: ( ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:361:1: ( ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:362:1: ( ( rule__StepDescription__Alternatives ) ) ( ( rule__StepDescription__Alternatives )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:362:1: ( ( rule__StepDescription__Alternatives ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:363:1: ( rule__StepDescription__Alternatives )
            {
             before(grammarAccess.getStepDescriptionAccess().getAlternatives()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:364:1: ( rule__StepDescription__Alternatives )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:364:2: rule__StepDescription__Alternatives
            {
            pushFollow(FOLLOW_rule__StepDescription__Alternatives_in_ruleStepDescription713);
            rule__StepDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepDescriptionAccess().getAlternatives()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:367:1: ( ( rule__StepDescription__Alternatives )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:368:1: ( rule__StepDescription__Alternatives )*
            {
             before(grammarAccess.getStepDescriptionAccess().getAlternatives()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:369:1: ( rule__StepDescription__Alternatives )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:369:2: rule__StepDescription__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__StepDescription__Alternatives_in_ruleStepDescription725);
            	    rule__StepDescription__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStepDescriptionAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepDescription"


    // $ANTLR start "entryRuleStepKeyword"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:382:1: entryRuleStepKeyword : ruleStepKeyword EOF ;
    public final void entryRuleStepKeyword() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:383:1: ( ruleStepKeyword EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:384:1: ruleStepKeyword EOF
            {
             before(grammarAccess.getStepKeywordRule()); 
            pushFollow(FOLLOW_ruleStepKeyword_in_entryRuleStepKeyword755);
            ruleStepKeyword();

            state._fsp--;

             after(grammarAccess.getStepKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepKeyword762); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepKeyword"


    // $ANTLR start "ruleStepKeyword"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:391:1: ruleStepKeyword : ( RULE_STEP_KEYWORD ) ;
    public final void ruleStepKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:395:2: ( ( RULE_STEP_KEYWORD ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:396:1: ( RULE_STEP_KEYWORD )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:396:1: ( RULE_STEP_KEYWORD )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:397:1: RULE_STEP_KEYWORD
            {
             before(grammarAccess.getStepKeywordAccess().getSTEP_KEYWORDTerminalRuleCall()); 
            match(input,RULE_STEP_KEYWORD,FOLLOW_RULE_STEP_KEYWORD_in_ruleStepKeyword788); 
             after(grammarAccess.getStepKeywordAccess().getSTEP_KEYWORDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepKeyword"


    // $ANTLR start "entryRuleBackgroundKeyword"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:410:1: entryRuleBackgroundKeyword : ruleBackgroundKeyword EOF ;
    public final void entryRuleBackgroundKeyword() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:411:1: ( ruleBackgroundKeyword EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:412:1: ruleBackgroundKeyword EOF
            {
             before(grammarAccess.getBackgroundKeywordRule()); 
            pushFollow(FOLLOW_ruleBackgroundKeyword_in_entryRuleBackgroundKeyword814);
            ruleBackgroundKeyword();

            state._fsp--;

             after(grammarAccess.getBackgroundKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackgroundKeyword821); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackgroundKeyword"


    // $ANTLR start "ruleBackgroundKeyword"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:419:1: ruleBackgroundKeyword : ( 'Background:' ) ;
    public final void ruleBackgroundKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:423:2: ( ( 'Background:' ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:424:1: ( 'Background:' )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:424:1: ( 'Background:' )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:425:1: 'Background:'
            {
             before(grammarAccess.getBackgroundKeywordAccess().getBackgroundKeyword()); 
            match(input,20,FOLLOW_20_in_ruleBackgroundKeyword848); 
             after(grammarAccess.getBackgroundKeywordAccess().getBackgroundKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackgroundKeyword"


    // $ANTLR start "entryRuleTag"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:440:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:441:1: ( ruleTag EOF )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:442:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_ruleTag_in_entryRuleTag876);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTag883); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:449:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:453:2: ( ( ( rule__Tag__Group__0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:454:1: ( ( rule__Tag__Group__0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:454:1: ( ( rule__Tag__Group__0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:455:1: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:456:1: ( rule__Tag__Group__0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:456:2: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_rule__Tag__Group__0_in_ruleTag909);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "rule__Feature__ScenariosAlternatives_6_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:468:1: rule__Feature__ScenariosAlternatives_6_0 : ( ( ruleScenario ) | ( ruleScenarioOutline ) );
    public final void rule__Feature__ScenariosAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:472:1: ( ( ruleScenario ) | ( ruleScenarioOutline ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:473:1: ( ruleScenario )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:473:1: ( ruleScenario )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:474:1: ruleScenario
                    {
                     before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_ruleScenario_in_rule__Feature__ScenariosAlternatives_6_0945);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:479:6: ( ruleScenarioOutline )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:479:6: ( ruleScenarioOutline )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:480:1: ruleScenarioOutline
                    {
                     before(grammarAccess.getFeatureAccess().getScenariosScenarioOutlineParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_ruleScenarioOutline_in_rule__Feature__ScenariosAlternatives_6_0962);
                    ruleScenarioOutline();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getScenariosScenarioOutlineParserRuleCall_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ScenariosAlternatives_6_0"


    // $ANTLR start "rule__Title__Alternatives_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:490:1: rule__Title__Alternatives_0 : ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) );
    public final void rule__Title__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:494:1: ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt4=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:495:1: ( RULE_WORD )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:495:1: ( RULE_WORD )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:496:1: RULE_WORD
                    {
                     before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Title__Alternatives_0994); 
                     after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:501:6: ( RULE_NUMBER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:501:6: ( RULE_NUMBER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:502:1: RULE_NUMBER
                    {
                     before(grammarAccess.getTitleAccess().getNUMBERTerminalRuleCall_0_1()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Title__Alternatives_01011); 
                     after(grammarAccess.getTitleAccess().getNUMBERTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:507:6: ( RULE_STRING )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:507:6: ( RULE_STRING )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:508:1: RULE_STRING
                    {
                     before(grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_0_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Title__Alternatives_01028); 
                     after(grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:513:6: ( RULE_PLACEHOLDER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:513:6: ( RULE_PLACEHOLDER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:514:1: RULE_PLACEHOLDER
                    {
                     before(grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
                    match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_rule__Title__Alternatives_01045); 
                     after(grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Alternatives_0"


    // $ANTLR start "rule__Title__Alternatives_1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:524:1: rule__Title__Alternatives_1 : ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) );
    public final void rule__Title__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:528:1: ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt5=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt5=4;
                }
                break;
            case RULE_STEP_KEYWORD:
                {
                alt5=5;
                }
                break;
            case RULE_TAGNAME:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:529:1: ( RULE_WORD )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:529:1: ( RULE_WORD )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:530:1: RULE_WORD
                    {
                     before(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_1_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Title__Alternatives_11077); 
                     after(grammarAccess.getTitleAccess().getWORDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:535:6: ( RULE_NUMBER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:535:6: ( RULE_NUMBER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:536:1: RULE_NUMBER
                    {
                     before(grammarAccess.getTitleAccess().getNUMBERTerminalRuleCall_1_1()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Title__Alternatives_11094); 
                     after(grammarAccess.getTitleAccess().getNUMBERTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:541:6: ( RULE_STRING )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:541:6: ( RULE_STRING )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:542:1: RULE_STRING
                    {
                     before(grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_1_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Title__Alternatives_11111); 
                     after(grammarAccess.getTitleAccess().getSTRINGTerminalRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:547:6: ( RULE_PLACEHOLDER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:547:6: ( RULE_PLACEHOLDER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:548:1: RULE_PLACEHOLDER
                    {
                     before(grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
                    match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_rule__Title__Alternatives_11128); 
                     after(grammarAccess.getTitleAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:553:6: ( RULE_STEP_KEYWORD )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:553:6: ( RULE_STEP_KEYWORD )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:554:1: RULE_STEP_KEYWORD
                    {
                     before(grammarAccess.getTitleAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
                    match(input,RULE_STEP_KEYWORD,FOLLOW_RULE_STEP_KEYWORD_in_rule__Title__Alternatives_11145); 
                     after(grammarAccess.getTitleAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:559:6: ( RULE_TAGNAME )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:559:6: ( RULE_TAGNAME )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:560:1: RULE_TAGNAME
                    {
                     before(grammarAccess.getTitleAccess().getTAGNAMETerminalRuleCall_1_5()); 
                    match(input,RULE_TAGNAME,FOLLOW_RULE_TAGNAME_in_rule__Title__Alternatives_11162); 
                     after(grammarAccess.getTitleAccess().getTAGNAMETerminalRuleCall_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Alternatives_1"


    // $ANTLR start "rule__Narrative__Alternatives_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:570:1: rule__Narrative__Alternatives_0 : ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) );
    public final void rule__Narrative__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:574:1: ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt6=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:575:1: ( RULE_WORD )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:575:1: ( RULE_WORD )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:576:1: RULE_WORD
                    {
                     before(grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Narrative__Alternatives_01194); 
                     after(grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:581:6: ( RULE_NUMBER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:581:6: ( RULE_NUMBER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:582:1: RULE_NUMBER
                    {
                     before(grammarAccess.getNarrativeAccess().getNUMBERTerminalRuleCall_0_1()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Narrative__Alternatives_01211); 
                     after(grammarAccess.getNarrativeAccess().getNUMBERTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:587:6: ( RULE_STRING )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:587:6: ( RULE_STRING )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:588:1: RULE_STRING
                    {
                     before(grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_0_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Narrative__Alternatives_01228); 
                     after(grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:593:6: ( RULE_PLACEHOLDER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:593:6: ( RULE_PLACEHOLDER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:594:1: RULE_PLACEHOLDER
                    {
                     before(grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 
                    match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_rule__Narrative__Alternatives_01245); 
                     after(grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Alternatives_0"


    // $ANTLR start "rule__Narrative__Alternatives_1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:604:1: rule__Narrative__Alternatives_1 : ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) );
    public final void rule__Narrative__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:608:1: ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt7=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt7=4;
                }
                break;
            case RULE_STEP_KEYWORD:
                {
                alt7=5;
                }
                break;
            case RULE_TAGNAME:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:609:1: ( RULE_WORD )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:609:1: ( RULE_WORD )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:610:1: RULE_WORD
                    {
                     before(grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_1_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Narrative__Alternatives_11277); 
                     after(grammarAccess.getNarrativeAccess().getWORDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:615:6: ( RULE_NUMBER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:615:6: ( RULE_NUMBER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:616:1: RULE_NUMBER
                    {
                     before(grammarAccess.getNarrativeAccess().getNUMBERTerminalRuleCall_1_1()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Narrative__Alternatives_11294); 
                     after(grammarAccess.getNarrativeAccess().getNUMBERTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:621:6: ( RULE_STRING )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:621:6: ( RULE_STRING )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:622:1: RULE_STRING
                    {
                     before(grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_1_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Narrative__Alternatives_11311); 
                     after(grammarAccess.getNarrativeAccess().getSTRINGTerminalRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:627:6: ( RULE_PLACEHOLDER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:627:6: ( RULE_PLACEHOLDER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:628:1: RULE_PLACEHOLDER
                    {
                     before(grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 
                    match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_rule__Narrative__Alternatives_11328); 
                     after(grammarAccess.getNarrativeAccess().getPLACEHOLDERTerminalRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:633:6: ( RULE_STEP_KEYWORD )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:633:6: ( RULE_STEP_KEYWORD )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:634:1: RULE_STEP_KEYWORD
                    {
                     before(grammarAccess.getNarrativeAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 
                    match(input,RULE_STEP_KEYWORD,FOLLOW_RULE_STEP_KEYWORD_in_rule__Narrative__Alternatives_11345); 
                     after(grammarAccess.getNarrativeAccess().getSTEP_KEYWORDTerminalRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:639:6: ( RULE_TAGNAME )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:639:6: ( RULE_TAGNAME )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:640:1: RULE_TAGNAME
                    {
                     before(grammarAccess.getNarrativeAccess().getTAGNAMETerminalRuleCall_1_5()); 
                    match(input,RULE_TAGNAME,FOLLOW_RULE_TAGNAME_in_rule__Narrative__Alternatives_11362); 
                     after(grammarAccess.getNarrativeAccess().getTAGNAMETerminalRuleCall_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Alternatives_1"


    // $ANTLR start "rule__StepDescription__Alternatives"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:650:1: rule__StepDescription__Alternatives : ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) );
    public final void rule__StepDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:654:1: ( ( RULE_WORD ) | ( RULE_NUMBER ) | ( RULE_STRING ) | ( RULE_PLACEHOLDER ) | ( RULE_STEP_KEYWORD ) | ( RULE_TAGNAME ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt8=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case RULE_PLACEHOLDER:
                {
                alt8=4;
                }
                break;
            case RULE_STEP_KEYWORD:
                {
                alt8=5;
                }
                break;
            case RULE_TAGNAME:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:655:1: ( RULE_WORD )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:655:1: ( RULE_WORD )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:656:1: RULE_WORD
                    {
                     before(grammarAccess.getStepDescriptionAccess().getWORDTerminalRuleCall_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__StepDescription__Alternatives1394); 
                     after(grammarAccess.getStepDescriptionAccess().getWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:661:6: ( RULE_NUMBER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:661:6: ( RULE_NUMBER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:662:1: RULE_NUMBER
                    {
                     before(grammarAccess.getStepDescriptionAccess().getNUMBERTerminalRuleCall_1()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__StepDescription__Alternatives1411); 
                     after(grammarAccess.getStepDescriptionAccess().getNUMBERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:667:6: ( RULE_STRING )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:667:6: ( RULE_STRING )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:668:1: RULE_STRING
                    {
                     before(grammarAccess.getStepDescriptionAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StepDescription__Alternatives1428); 
                     after(grammarAccess.getStepDescriptionAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:673:6: ( RULE_PLACEHOLDER )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:673:6: ( RULE_PLACEHOLDER )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:674:1: RULE_PLACEHOLDER
                    {
                     before(grammarAccess.getStepDescriptionAccess().getPLACEHOLDERTerminalRuleCall_3()); 
                    match(input,RULE_PLACEHOLDER,FOLLOW_RULE_PLACEHOLDER_in_rule__StepDescription__Alternatives1445); 
                     after(grammarAccess.getStepDescriptionAccess().getPLACEHOLDERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:679:6: ( RULE_STEP_KEYWORD )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:679:6: ( RULE_STEP_KEYWORD )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:680:1: RULE_STEP_KEYWORD
                    {
                     before(grammarAccess.getStepDescriptionAccess().getSTEP_KEYWORDTerminalRuleCall_4()); 
                    match(input,RULE_STEP_KEYWORD,FOLLOW_RULE_STEP_KEYWORD_in_rule__StepDescription__Alternatives1462); 
                     after(grammarAccess.getStepDescriptionAccess().getSTEP_KEYWORDTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:685:6: ( RULE_TAGNAME )
                    {
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:685:6: ( RULE_TAGNAME )
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:686:1: RULE_TAGNAME
                    {
                     before(grammarAccess.getStepDescriptionAccess().getTAGNAMETerminalRuleCall_5()); 
                    match(input,RULE_TAGNAME,FOLLOW_RULE_TAGNAME_in_rule__StepDescription__Alternatives1479); 
                     after(grammarAccess.getStepDescriptionAccess().getTAGNAMETerminalRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDescription__Alternatives"


    // $ANTLR start "rule__Feature__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:698:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:702:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:703:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01509);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01512);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:710:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:714:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:715:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:715:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:716:1: ( rule__Feature__TagsAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:717:1: ( rule__Feature__TagsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TAGNAME) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:717:2: rule__Feature__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1539);
            	    rule__Feature__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:727:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:731:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:732:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11570);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11573);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:739:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:743:1: ( ( 'Feature:' ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:744:1: ( 'Feature:' )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:744:1: ( 'Feature:' )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:745:1: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group__1__Impl1601); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:758:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:762:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:763:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21632);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21635);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:770:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TitleAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:774:1: ( ( ( rule__Feature__TitleAssignment_2 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:775:1: ( ( rule__Feature__TitleAssignment_2 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:775:1: ( ( rule__Feature__TitleAssignment_2 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:776:1: ( rule__Feature__TitleAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:777:1: ( rule__Feature__TitleAssignment_2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:777:2: rule__Feature__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__TitleAssignment_2_in_rule__Feature__Group__2__Impl1662);
            rule__Feature__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:787:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:791:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:792:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31692);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__31695);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:799:1: rule__Feature__Group__3__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:803:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:804:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:804:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:805:1: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:805:1: ( ( RULE_EOL ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:806:1: ( RULE_EOL )
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:807:1: ( RULE_EOL )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:807:3: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Feature__Group__3__Impl1725); 

            }

             after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:810:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:811:1: ( RULE_EOL )*
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:812:1: ( RULE_EOL )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_EOL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:812:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Feature__Group__3__Impl1738); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:823:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:827:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:828:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__41771);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__41774);
            rule__Feature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:835:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__NarrativeAssignment_4 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:839:1: ( ( ( rule__Feature__NarrativeAssignment_4 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:840:1: ( ( rule__Feature__NarrativeAssignment_4 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:840:1: ( ( rule__Feature__NarrativeAssignment_4 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:841:1: ( rule__Feature__NarrativeAssignment_4 )?
            {
             before(grammarAccess.getFeatureAccess().getNarrativeAssignment_4()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:842:1: ( rule__Feature__NarrativeAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_WORD && LA11_0<=RULE_PLACEHOLDER)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:842:2: rule__Feature__NarrativeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Feature__NarrativeAssignment_4_in_rule__Feature__Group__4__Impl1801);
                    rule__Feature__NarrativeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getNarrativeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:852:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:856:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:857:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51832);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__51835);
            rule__Feature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:864:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__BackgroundAssignment_5 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:868:1: ( ( ( rule__Feature__BackgroundAssignment_5 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:869:1: ( ( rule__Feature__BackgroundAssignment_5 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:869:1: ( ( rule__Feature__BackgroundAssignment_5 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:870:1: ( rule__Feature__BackgroundAssignment_5 )?
            {
             before(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:871:1: ( rule__Feature__BackgroundAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:871:2: rule__Feature__BackgroundAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Feature__BackgroundAssignment_5_in_rule__Feature__Group__5__Impl1862);
                    rule__Feature__BackgroundAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__6"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:881:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:885:1: ( rule__Feature__Group__6__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:886:2: rule__Feature__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__61893);
            rule__Feature__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__6"


    // $ANTLR start "rule__Feature__Group__6__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:892:1: rule__Feature__Group__6__Impl : ( ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* ) ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:896:1: ( ( ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:897:1: ( ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:897:1: ( ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:898:1: ( ( rule__Feature__ScenariosAssignment_6 ) ) ( ( rule__Feature__ScenariosAssignment_6 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:898:1: ( ( rule__Feature__ScenariosAssignment_6 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:899:1: ( rule__Feature__ScenariosAssignment_6 )
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:900:1: ( rule__Feature__ScenariosAssignment_6 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:900:2: rule__Feature__ScenariosAssignment_6
            {
            pushFollow(FOLLOW_rule__Feature__ScenariosAssignment_6_in_rule__Feature__Group__6__Impl1922);
            rule__Feature__ScenariosAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:903:1: ( ( rule__Feature__ScenariosAssignment_6 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:904:1: ( rule__Feature__ScenariosAssignment_6 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:905:1: ( rule__Feature__ScenariosAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TAGNAME||(LA13_0>=22 && LA13_0<=23)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:905:2: rule__Feature__ScenariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Feature__ScenariosAssignment_6_in_rule__Feature__Group__6__Impl1934);
            	    rule__Feature__ScenariosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__6__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:930:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:934:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:935:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__01981);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__1_in_rule__Background__Group__01984);
            rule__Background__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__0"


    // $ANTLR start "rule__Background__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:942:1: rule__Background__Group__0__Impl : ( ( rule__Background__BackgroundKeywordAssignment_0 ) ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:946:1: ( ( ( rule__Background__BackgroundKeywordAssignment_0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:947:1: ( ( rule__Background__BackgroundKeywordAssignment_0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:947:1: ( ( rule__Background__BackgroundKeywordAssignment_0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:948:1: ( rule__Background__BackgroundKeywordAssignment_0 )
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeywordAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:949:1: ( rule__Background__BackgroundKeywordAssignment_0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:949:2: rule__Background__BackgroundKeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Background__BackgroundKeywordAssignment_0_in_rule__Background__Group__0__Impl2011);
            rule__Background__BackgroundKeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getBackgroundKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:959:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:963:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:964:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12041);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12044);
            rule__Background__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__1"


    // $ANTLR start "rule__Background__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:971:1: rule__Background__Group__1__Impl : ( ( rule__Background__TitleAssignment_1 )? ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:975:1: ( ( ( rule__Background__TitleAssignment_1 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:976:1: ( ( rule__Background__TitleAssignment_1 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:976:1: ( ( rule__Background__TitleAssignment_1 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:977:1: ( rule__Background__TitleAssignment_1 )?
            {
             before(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:978:1: ( rule__Background__TitleAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_WORD && LA14_0<=RULE_PLACEHOLDER)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:978:2: rule__Background__TitleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Background__TitleAssignment_1_in_rule__Background__Group__1__Impl2071);
                    rule__Background__TitleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:988:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:992:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:993:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22102);
            rule__Background__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__3_in_rule__Background__Group__22105);
            rule__Background__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__2"


    // $ANTLR start "rule__Background__Group__2__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1000:1: rule__Background__Group__2__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1004:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1005:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1005:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1006:1: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1006:1: ( ( RULE_EOL ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1007:1: ( RULE_EOL )
            {
             before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1008:1: ( RULE_EOL )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1008:3: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Background__Group__2__Impl2135); 

            }

             after(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1011:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1012:1: ( RULE_EOL )*
            {
             before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1013:1: ( RULE_EOL )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_EOL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1013:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Background__Group__2__Impl2148); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__2__Impl"


    // $ANTLR start "rule__Background__Group__3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1024:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1028:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1029:2: rule__Background__Group__3__Impl rule__Background__Group__4
            {
            pushFollow(FOLLOW_rule__Background__Group__3__Impl_in_rule__Background__Group__32181);
            rule__Background__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Background__Group__4_in_rule__Background__Group__32184);
            rule__Background__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__3"


    // $ANTLR start "rule__Background__Group__3__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1036:1: rule__Background__Group__3__Impl : ( ( rule__Background__NarrativeAssignment_3 )? ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1040:1: ( ( ( rule__Background__NarrativeAssignment_3 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1041:1: ( ( rule__Background__NarrativeAssignment_3 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1041:1: ( ( rule__Background__NarrativeAssignment_3 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1042:1: ( rule__Background__NarrativeAssignment_3 )?
            {
             before(grammarAccess.getBackgroundAccess().getNarrativeAssignment_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1043:1: ( rule__Background__NarrativeAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_WORD && LA16_0<=RULE_PLACEHOLDER)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1043:2: rule__Background__NarrativeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Background__NarrativeAssignment_3_in_rule__Background__Group__3__Impl2211);
                    rule__Background__NarrativeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBackgroundAccess().getNarrativeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__3__Impl"


    // $ANTLR start "rule__Background__Group__4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1053:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1057:1: ( rule__Background__Group__4__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1058:2: rule__Background__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Background__Group__4__Impl_in_rule__Background__Group__42242);
            rule__Background__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__4"


    // $ANTLR start "rule__Background__Group__4__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1064:1: rule__Background__Group__4__Impl : ( ( ( rule__Background__StepsAssignment_4 ) ) ( ( rule__Background__StepsAssignment_4 )* ) ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1068:1: ( ( ( ( rule__Background__StepsAssignment_4 ) ) ( ( rule__Background__StepsAssignment_4 )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1069:1: ( ( ( rule__Background__StepsAssignment_4 ) ) ( ( rule__Background__StepsAssignment_4 )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1069:1: ( ( ( rule__Background__StepsAssignment_4 ) ) ( ( rule__Background__StepsAssignment_4 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1070:1: ( ( rule__Background__StepsAssignment_4 ) ) ( ( rule__Background__StepsAssignment_4 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1070:1: ( ( rule__Background__StepsAssignment_4 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1071:1: ( rule__Background__StepsAssignment_4 )
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1072:1: ( rule__Background__StepsAssignment_4 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1072:2: rule__Background__StepsAssignment_4
            {
            pushFollow(FOLLOW_rule__Background__StepsAssignment_4_in_rule__Background__Group__4__Impl2271);
            rule__Background__StepsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1075:1: ( ( rule__Background__StepsAssignment_4 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1076:1: ( rule__Background__StepsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1077:1: ( rule__Background__StepsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STEP_KEYWORD) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1077:2: rule__Background__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Background__StepsAssignment_4_in_rule__Background__Group__4__Impl2283);
            	    rule__Background__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1098:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1102:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1103:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__02326);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__02329);
            rule__Scenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1110:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )* ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1114:1: ( ( ( rule__Scenario__TagsAssignment_0 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1115:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1115:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1116:1: ( rule__Scenario__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1117:1: ( rule__Scenario__TagsAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_TAGNAME) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1117:2: rule__Scenario__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl2356);
            	    rule__Scenario__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1127:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1131:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1132:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__12387);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__12390);
            rule__Scenario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1139:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1143:1: ( ( 'Scenario:' ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1144:1: ( 'Scenario:' )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1144:1: ( 'Scenario:' )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1145:1: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Scenario__Group__1__Impl2418); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1158:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1162:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1163:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__22449);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__22452);
            rule__Scenario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1170:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__TitleAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1174:1: ( ( ( rule__Scenario__TitleAssignment_2 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1175:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1175:1: ( ( rule__Scenario__TitleAssignment_2 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1176:1: ( rule__Scenario__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1177:1: ( rule__Scenario__TitleAssignment_2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1177:2: rule__Scenario__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Scenario__TitleAssignment_2_in_rule__Scenario__Group__2__Impl2479);
            rule__Scenario__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1187:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1191:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1192:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__32509);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__32512);
            rule__Scenario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1199:1: rule__Scenario__Group__3__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1203:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1204:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1204:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1205:1: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1205:1: ( ( RULE_EOL ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1206:1: ( RULE_EOL )
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1207:1: ( RULE_EOL )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1207:3: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Scenario__Group__3__Impl2542); 

            }

             after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1210:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1211:1: ( RULE_EOL )*
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1212:1: ( RULE_EOL )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_EOL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1212:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Scenario__Group__3__Impl2555); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1223:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1227:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1228:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__42588);
            rule__Scenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__5_in_rule__Scenario__Group__42591);
            rule__Scenario__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1235:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__NarrativeAssignment_4 )? ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1239:1: ( ( ( rule__Scenario__NarrativeAssignment_4 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1240:1: ( ( rule__Scenario__NarrativeAssignment_4 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1240:1: ( ( rule__Scenario__NarrativeAssignment_4 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1241:1: ( rule__Scenario__NarrativeAssignment_4 )?
            {
             before(grammarAccess.getScenarioAccess().getNarrativeAssignment_4()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1242:1: ( rule__Scenario__NarrativeAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_WORD && LA20_0<=RULE_PLACEHOLDER)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1242:2: rule__Scenario__NarrativeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Scenario__NarrativeAssignment_4_in_rule__Scenario__Group__4__Impl2618);
                    rule__Scenario__NarrativeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getNarrativeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__5"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1252:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1256:1: ( rule__Scenario__Group__5__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1257:2: rule__Scenario__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__5__Impl_in_rule__Scenario__Group__52649);
            rule__Scenario__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__5"


    // $ANTLR start "rule__Scenario__Group__5__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1263:1: rule__Scenario__Group__5__Impl : ( ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* ) ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1267:1: ( ( ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1268:1: ( ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1268:1: ( ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1269:1: ( ( rule__Scenario__StepsAssignment_5 ) ) ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1269:1: ( ( rule__Scenario__StepsAssignment_5 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1270:1: ( rule__Scenario__StepsAssignment_5 )
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1271:1: ( rule__Scenario__StepsAssignment_5 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1271:2: rule__Scenario__StepsAssignment_5
            {
            pushFollow(FOLLOW_rule__Scenario__StepsAssignment_5_in_rule__Scenario__Group__5__Impl2678);
            rule__Scenario__StepsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1274:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1275:1: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1276:1: ( rule__Scenario__StepsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STEP_KEYWORD) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1276:2: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Scenario__StepsAssignment_5_in_rule__Scenario__Group__5__Impl2690);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__5__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1299:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1303:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1304:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__Group__0__Impl_in_rule__ScenarioOutline__Group__02735);
            rule__ScenarioOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioOutline__Group__1_in_rule__ScenarioOutline__Group__02738);
            rule__ScenarioOutline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__0"


    // $ANTLR start "rule__ScenarioOutline__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1311:1: rule__ScenarioOutline__Group__0__Impl : ( ( rule__ScenarioOutline__TagsAssignment_0 )* ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1315:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1316:1: ( ( rule__ScenarioOutline__TagsAssignment_0 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1316:1: ( ( rule__ScenarioOutline__TagsAssignment_0 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1317:1: ( rule__ScenarioOutline__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1318:1: ( rule__ScenarioOutline__TagsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TAGNAME) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1318:2: rule__ScenarioOutline__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioOutline__TagsAssignment_0_in_rule__ScenarioOutline__Group__0__Impl2765);
            	    rule__ScenarioOutline__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1328:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1332:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1333:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__Group__1__Impl_in_rule__ScenarioOutline__Group__12796);
            rule__ScenarioOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioOutline__Group__2_in_rule__ScenarioOutline__Group__12799);
            rule__ScenarioOutline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__1"


    // $ANTLR start "rule__ScenarioOutline__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1340:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1344:1: ( ( 'Scenario Outline:' ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1345:1: ( 'Scenario Outline:' )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1345:1: ( 'Scenario Outline:' )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1346:1: 'Scenario Outline:'
            {
             before(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ScenarioOutline__Group__1__Impl2827); 
             after(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1359:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1363:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1364:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__Group__2__Impl_in_rule__ScenarioOutline__Group__22858);
            rule__ScenarioOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioOutline__Group__3_in_rule__ScenarioOutline__Group__22861);
            rule__ScenarioOutline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__2"


    // $ANTLR start "rule__ScenarioOutline__Group__2__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1371:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__TitleAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1375:1: ( ( ( rule__ScenarioOutline__TitleAssignment_2 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1376:1: ( ( rule__ScenarioOutline__TitleAssignment_2 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1376:1: ( ( rule__ScenarioOutline__TitleAssignment_2 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1377:1: ( rule__ScenarioOutline__TitleAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1378:1: ( rule__ScenarioOutline__TitleAssignment_2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1378:2: rule__ScenarioOutline__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__TitleAssignment_2_in_rule__ScenarioOutline__Group__2__Impl2888);
            rule__ScenarioOutline__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__2__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1388:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1392:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1393:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__Group__3__Impl_in_rule__ScenarioOutline__Group__32918);
            rule__ScenarioOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioOutline__Group__4_in_rule__ScenarioOutline__Group__32921);
            rule__ScenarioOutline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__3"


    // $ANTLR start "rule__ScenarioOutline__Group__3__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1400:1: rule__ScenarioOutline__Group__3__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1404:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1405:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1405:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1406:1: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1406:1: ( ( RULE_EOL ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1407:1: ( RULE_EOL )
            {
             before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1408:1: ( RULE_EOL )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1408:3: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__ScenarioOutline__Group__3__Impl2951); 

            }

             after(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1411:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1412:1: ( RULE_EOL )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1413:1: ( RULE_EOL )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_EOL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1413:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__ScenarioOutline__Group__3__Impl2964); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__3__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1424:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1428:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1429:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__Group__4__Impl_in_rule__ScenarioOutline__Group__42997);
            rule__ScenarioOutline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioOutline__Group__5_in_rule__ScenarioOutline__Group__43000);
            rule__ScenarioOutline__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__4"


    // $ANTLR start "rule__ScenarioOutline__Group__4__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1436:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__NarrativeAssignment_4 )? ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1440:1: ( ( ( rule__ScenarioOutline__NarrativeAssignment_4 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1441:1: ( ( rule__ScenarioOutline__NarrativeAssignment_4 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1441:1: ( ( rule__ScenarioOutline__NarrativeAssignment_4 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1442:1: ( rule__ScenarioOutline__NarrativeAssignment_4 )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getNarrativeAssignment_4()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1443:1: ( rule__ScenarioOutline__NarrativeAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_WORD && LA24_0<=RULE_PLACEHOLDER)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1443:2: rule__ScenarioOutline__NarrativeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ScenarioOutline__NarrativeAssignment_4_in_rule__ScenarioOutline__Group__4__Impl3027);
                    rule__ScenarioOutline__NarrativeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioOutlineAccess().getNarrativeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__4__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__5"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1453:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1457:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1458:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__Group__5__Impl_in_rule__ScenarioOutline__Group__53058);
            rule__ScenarioOutline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScenarioOutline__Group__6_in_rule__ScenarioOutline__Group__53061);
            rule__ScenarioOutline__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__5"


    // $ANTLR start "rule__ScenarioOutline__Group__5__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1465:1: rule__ScenarioOutline__Group__5__Impl : ( ( ( rule__ScenarioOutline__StepsAssignment_5 ) ) ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1469:1: ( ( ( ( rule__ScenarioOutline__StepsAssignment_5 ) ) ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1470:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 ) ) ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1470:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 ) ) ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1471:1: ( ( rule__ScenarioOutline__StepsAssignment_5 ) ) ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1471:1: ( ( rule__ScenarioOutline__StepsAssignment_5 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1472:1: ( rule__ScenarioOutline__StepsAssignment_5 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1473:1: ( rule__ScenarioOutline__StepsAssignment_5 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1473:2: rule__ScenarioOutline__StepsAssignment_5
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__StepsAssignment_5_in_rule__ScenarioOutline__Group__5__Impl3090);
            rule__ScenarioOutline__StepsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1476:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1477:1: ( rule__ScenarioOutline__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1478:1: ( rule__ScenarioOutline__StepsAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STEP_KEYWORD) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1478:2: rule__ScenarioOutline__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ScenarioOutline__StepsAssignment_5_in_rule__ScenarioOutline__Group__5__Impl3102);
            	    rule__ScenarioOutline__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__5__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__6"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1489:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1493:1: ( rule__ScenarioOutline__Group__6__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1494:2: rule__ScenarioOutline__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__Group__6__Impl_in_rule__ScenarioOutline__Group__63135);
            rule__ScenarioOutline__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__6"


    // $ANTLR start "rule__ScenarioOutline__Group__6__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1500:1: rule__ScenarioOutline__Group__6__Impl : ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1504:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1505:1: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1505:1: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1506:1: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1507:1: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1507:2: rule__ScenarioOutline__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_rule__ScenarioOutline__ExamplesAssignment_6_in_rule__ScenarioOutline__Group__6__Impl3162);
            rule__ScenarioOutline__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__6__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1531:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1535:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1536:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__03206);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__1_in_rule__Step__Group__03209);
            rule__Step__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1543:1: rule__Step__Group__0__Impl : ( ( rule__Step__StepKeywordAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1547:1: ( ( ( rule__Step__StepKeywordAssignment_0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1548:1: ( ( rule__Step__StepKeywordAssignment_0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1548:1: ( ( rule__Step__StepKeywordAssignment_0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1549:1: ( rule__Step__StepKeywordAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getStepKeywordAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1550:1: ( rule__Step__StepKeywordAssignment_0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1550:2: rule__Step__StepKeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Step__StepKeywordAssignment_0_in_rule__Step__Group__0__Impl3236);
            rule__Step__StepKeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getStepKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1560:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1564:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1565:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__13266);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__2_in_rule__Step__Group__13269);
            rule__Step__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1572:1: rule__Step__Group__1__Impl : ( ( rule__Step__DescriptionAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1576:1: ( ( ( rule__Step__DescriptionAssignment_1 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1577:1: ( ( rule__Step__DescriptionAssignment_1 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1577:1: ( ( rule__Step__DescriptionAssignment_1 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1578:1: ( rule__Step__DescriptionAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getDescriptionAssignment_1()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1579:1: ( rule__Step__DescriptionAssignment_1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1579:2: rule__Step__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Step__DescriptionAssignment_1_in_rule__Step__Group__1__Impl3296);
            rule__Step__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1589:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1593:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1594:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__23326);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__3_in_rule__Step__Group__23329);
            rule__Step__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1601:1: rule__Step__Group__2__Impl : ( ( RULE_EOL )* ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1605:1: ( ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1606:1: ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1606:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1607:1: ( RULE_EOL )*
            {
             before(grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1608:1: ( RULE_EOL )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_EOL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1608:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Step__Group__2__Impl3357); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1618:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1622:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1623:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_rule__Step__Group__3__Impl_in_rule__Step__Group__33388);
            rule__Step__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__4_in_rule__Step__Group__33391);
            rule__Step__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1630:1: rule__Step__Group__3__Impl : ( ( rule__Step__TablesAssignment_3 )* ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1634:1: ( ( ( rule__Step__TablesAssignment_3 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1635:1: ( ( rule__Step__TablesAssignment_3 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1635:1: ( ( rule__Step__TablesAssignment_3 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1636:1: ( rule__Step__TablesAssignment_3 )*
            {
             before(grammarAccess.getStepAccess().getTablesAssignment_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1637:1: ( rule__Step__TablesAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_TABLE_ROW) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1637:2: rule__Step__TablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Step__TablesAssignment_3_in_rule__Step__Group__3__Impl3418);
            	    rule__Step__TablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getTablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__Step__Group__4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1647:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1651:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1652:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_rule__Step__Group__4__Impl_in_rule__Step__Group__43449);
            rule__Step__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Step__Group__5_in_rule__Step__Group__43452);
            rule__Step__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4"


    // $ANTLR start "rule__Step__Group__4__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1659:1: rule__Step__Group__4__Impl : ( ( rule__Step__CodeAssignment_4 )? ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1663:1: ( ( ( rule__Step__CodeAssignment_4 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1664:1: ( ( rule__Step__CodeAssignment_4 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1664:1: ( ( rule__Step__CodeAssignment_4 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1665:1: ( rule__Step__CodeAssignment_4 )?
            {
             before(grammarAccess.getStepAccess().getCodeAssignment_4()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1666:1: ( rule__Step__CodeAssignment_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DOC_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1666:2: rule__Step__CodeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Step__CodeAssignment_4_in_rule__Step__Group__4__Impl3479);
                    rule__Step__CodeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getCodeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__4__Impl"


    // $ANTLR start "rule__Step__Group__5"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1676:1: rule__Step__Group__5 : rule__Step__Group__5__Impl ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1680:1: ( rule__Step__Group__5__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1681:2: rule__Step__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Step__Group__5__Impl_in_rule__Step__Group__53510);
            rule__Step__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5"


    // $ANTLR start "rule__Step__Group__5__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1687:1: rule__Step__Group__5__Impl : ( ( rule__Step__TablesAssignment_5 )* ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1691:1: ( ( ( rule__Step__TablesAssignment_5 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1692:1: ( ( rule__Step__TablesAssignment_5 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1692:1: ( ( rule__Step__TablesAssignment_5 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1693:1: ( rule__Step__TablesAssignment_5 )*
            {
             before(grammarAccess.getStepAccess().getTablesAssignment_5()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1694:1: ( rule__Step__TablesAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_TABLE_ROW) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1694:2: rule__Step__TablesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Step__TablesAssignment_5_in_rule__Step__Group__5__Impl3537);
            	    rule__Step__TablesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getTablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__5__Impl"


    // $ANTLR start "rule__Examples__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1716:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1720:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1721:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_rule__Examples__Group__0__Impl_in_rule__Examples__Group__03580);
            rule__Examples__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Examples__Group__1_in_rule__Examples__Group__03583);
            rule__Examples__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__0"


    // $ANTLR start "rule__Examples__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1728:1: rule__Examples__Group__0__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1732:1: ( ( 'Examples:' ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1733:1: ( 'Examples:' )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1733:1: ( 'Examples:' )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1734:1: 'Examples:'
            {
             before(grammarAccess.getExamplesAccess().getExamplesKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Examples__Group__0__Impl3611); 
             after(grammarAccess.getExamplesAccess().getExamplesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__0__Impl"


    // $ANTLR start "rule__Examples__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1747:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1751:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1752:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_rule__Examples__Group__1__Impl_in_rule__Examples__Group__13642);
            rule__Examples__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Examples__Group__2_in_rule__Examples__Group__13645);
            rule__Examples__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__1"


    // $ANTLR start "rule__Examples__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1759:1: rule__Examples__Group__1__Impl : ( ( rule__Examples__TitleAssignment_1 )? ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1763:1: ( ( ( rule__Examples__TitleAssignment_1 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1764:1: ( ( rule__Examples__TitleAssignment_1 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1764:1: ( ( rule__Examples__TitleAssignment_1 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1765:1: ( rule__Examples__TitleAssignment_1 )?
            {
             before(grammarAccess.getExamplesAccess().getTitleAssignment_1()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1766:1: ( rule__Examples__TitleAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_WORD && LA30_0<=RULE_PLACEHOLDER)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1766:2: rule__Examples__TitleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Examples__TitleAssignment_1_in_rule__Examples__Group__1__Impl3672);
                    rule__Examples__TitleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamplesAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__1__Impl"


    // $ANTLR start "rule__Examples__Group__2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1776:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1780:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1781:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
            {
            pushFollow(FOLLOW_rule__Examples__Group__2__Impl_in_rule__Examples__Group__23703);
            rule__Examples__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Examples__Group__3_in_rule__Examples__Group__23706);
            rule__Examples__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__2"


    // $ANTLR start "rule__Examples__Group__2__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1788:1: rule__Examples__Group__2__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1792:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1793:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1793:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1794:1: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1794:1: ( ( RULE_EOL ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1795:1: ( RULE_EOL )
            {
             before(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1796:1: ( RULE_EOL )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1796:3: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Examples__Group__2__Impl3736); 

            }

             after(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_2()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1799:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1800:1: ( RULE_EOL )*
            {
             before(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1801:1: ( RULE_EOL )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_EOL) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1801:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Examples__Group__2__Impl3749); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__2__Impl"


    // $ANTLR start "rule__Examples__Group__3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1812:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1816:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1817:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
            {
            pushFollow(FOLLOW_rule__Examples__Group__3__Impl_in_rule__Examples__Group__33782);
            rule__Examples__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Examples__Group__4_in_rule__Examples__Group__33785);
            rule__Examples__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__3"


    // $ANTLR start "rule__Examples__Group__3__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1824:1: rule__Examples__Group__3__Impl : ( ( rule__Examples__NarrativeAssignment_3 )? ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1828:1: ( ( ( rule__Examples__NarrativeAssignment_3 )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1829:1: ( ( rule__Examples__NarrativeAssignment_3 )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1829:1: ( ( rule__Examples__NarrativeAssignment_3 )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1830:1: ( rule__Examples__NarrativeAssignment_3 )?
            {
             before(grammarAccess.getExamplesAccess().getNarrativeAssignment_3()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1831:1: ( rule__Examples__NarrativeAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_WORD && LA32_0<=RULE_PLACEHOLDER)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1831:2: rule__Examples__NarrativeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Examples__NarrativeAssignment_3_in_rule__Examples__Group__3__Impl3812);
                    rule__Examples__NarrativeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamplesAccess().getNarrativeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__3__Impl"


    // $ANTLR start "rule__Examples__Group__4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1841:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1845:1: ( rule__Examples__Group__4__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1846:2: rule__Examples__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Examples__Group__4__Impl_in_rule__Examples__Group__43843);
            rule__Examples__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__4"


    // $ANTLR start "rule__Examples__Group__4__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1852:1: rule__Examples__Group__4__Impl : ( ( rule__Examples__TableAssignment_4 ) ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1856:1: ( ( ( rule__Examples__TableAssignment_4 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1857:1: ( ( rule__Examples__TableAssignment_4 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1857:1: ( ( rule__Examples__TableAssignment_4 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1858:1: ( rule__Examples__TableAssignment_4 )
            {
             before(grammarAccess.getExamplesAccess().getTableAssignment_4()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1859:1: ( rule__Examples__TableAssignment_4 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1859:2: rule__Examples__TableAssignment_4
            {
            pushFollow(FOLLOW_rule__Examples__TableAssignment_4_in_rule__Examples__Group__4__Impl3870);
            rule__Examples__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getTableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1879:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1883:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1884:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03910);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03913);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1891:1: rule__Table__Group__0__Impl : ( ( ( rule__Table__RowsAssignment_0 ) ) ( ( rule__Table__RowsAssignment_0 )* ) ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1895:1: ( ( ( ( rule__Table__RowsAssignment_0 ) ) ( ( rule__Table__RowsAssignment_0 )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1896:1: ( ( ( rule__Table__RowsAssignment_0 ) ) ( ( rule__Table__RowsAssignment_0 )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1896:1: ( ( ( rule__Table__RowsAssignment_0 ) ) ( ( rule__Table__RowsAssignment_0 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1897:1: ( ( rule__Table__RowsAssignment_0 ) ) ( ( rule__Table__RowsAssignment_0 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1897:1: ( ( rule__Table__RowsAssignment_0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1898:1: ( rule__Table__RowsAssignment_0 )
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1899:1: ( rule__Table__RowsAssignment_0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1899:2: rule__Table__RowsAssignment_0
            {
            pushFollow(FOLLOW_rule__Table__RowsAssignment_0_in_rule__Table__Group__0__Impl3942);
            rule__Table__RowsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRowsAssignment_0()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1902:1: ( ( rule__Table__RowsAssignment_0 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1903:1: ( rule__Table__RowsAssignment_0 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1904:1: ( rule__Table__RowsAssignment_0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_TABLE_ROW) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1904:2: rule__Table__RowsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Table__RowsAssignment_0_in_rule__Table__Group__0__Impl3954);
            	    rule__Table__RowsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getRowsAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1915:1: rule__Table__Group__1 : rule__Table__Group__1__Impl ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1919:1: ( rule__Table__Group__1__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1920:2: rule__Table__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13987);
            rule__Table__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1926:1: rule__Table__Group__1__Impl : ( ( RULE_EOL )* ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1930:1: ( ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1931:1: ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1931:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1932:1: ( RULE_EOL )*
            {
             before(grammarAccess.getTableAccess().getEOLTerminalRuleCall_1()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1933:1: ( RULE_EOL )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_EOL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1933:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Table__Group__1__Impl4015); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__DocString__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1947:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1951:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1952:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_rule__DocString__Group__0__Impl_in_rule__DocString__Group__04050);
            rule__DocString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DocString__Group__1_in_rule__DocString__Group__04053);
            rule__DocString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__0"


    // $ANTLR start "rule__DocString__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1959:1: rule__DocString__Group__0__Impl : ( ( rule__DocString__ContentAssignment_0 ) ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1963:1: ( ( ( rule__DocString__ContentAssignment_0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1964:1: ( ( rule__DocString__ContentAssignment_0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1964:1: ( ( rule__DocString__ContentAssignment_0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1965:1: ( rule__DocString__ContentAssignment_0 )
            {
             before(grammarAccess.getDocStringAccess().getContentAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1966:1: ( rule__DocString__ContentAssignment_0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1966:2: rule__DocString__ContentAssignment_0
            {
            pushFollow(FOLLOW_rule__DocString__ContentAssignment_0_in_rule__DocString__Group__0__Impl4080);
            rule__DocString__ContentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getContentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__0__Impl"


    // $ANTLR start "rule__DocString__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1976:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1980:1: ( rule__DocString__Group__1__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1981:2: rule__DocString__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DocString__Group__1__Impl_in_rule__DocString__Group__14110);
            rule__DocString__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__1"


    // $ANTLR start "rule__DocString__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1987:1: rule__DocString__Group__1__Impl : ( ( RULE_EOL )* ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1991:1: ( ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1992:1: ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1992:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1993:1: ( RULE_EOL )*
            {
             before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1994:1: ( RULE_EOL )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_EOL) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:1994:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__DocString__Group__1__Impl4138); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2008:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2012:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2013:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_rule__Title__Group__0__Impl_in_rule__Title__Group__04173);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Title__Group__1_in_rule__Title__Group__04176);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2020:1: rule__Title__Group__0__Impl : ( ( rule__Title__Alternatives_0 ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2024:1: ( ( ( rule__Title__Alternatives_0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2025:1: ( ( rule__Title__Alternatives_0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2025:1: ( ( rule__Title__Alternatives_0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2026:1: ( rule__Title__Alternatives_0 )
            {
             before(grammarAccess.getTitleAccess().getAlternatives_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2027:1: ( rule__Title__Alternatives_0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2027:2: rule__Title__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Title__Alternatives_0_in_rule__Title__Group__0__Impl4203);
            rule__Title__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2037:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2041:1: ( rule__Title__Group__1__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2042:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Title__Group__1__Impl_in_rule__Title__Group__14233);
            rule__Title__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2048:1: rule__Title__Group__1__Impl : ( ( rule__Title__Alternatives_1 )* ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2052:1: ( ( ( rule__Title__Alternatives_1 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2053:1: ( ( rule__Title__Alternatives_1 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2053:1: ( ( rule__Title__Alternatives_1 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2054:1: ( rule__Title__Alternatives_1 )*
            {
             before(grammarAccess.getTitleAccess().getAlternatives_1()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2055:1: ( rule__Title__Alternatives_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_STEP_KEYWORD && LA36_0<=RULE_TAGNAME)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2055:2: rule__Title__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Title__Alternatives_1_in_rule__Title__Group__1__Impl4260);
            	    rule__Title__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getTitleAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Narrative__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2069:1: rule__Narrative__Group__0 : rule__Narrative__Group__0__Impl rule__Narrative__Group__1 ;
    public final void rule__Narrative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2073:1: ( rule__Narrative__Group__0__Impl rule__Narrative__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2074:2: rule__Narrative__Group__0__Impl rule__Narrative__Group__1
            {
            pushFollow(FOLLOW_rule__Narrative__Group__0__Impl_in_rule__Narrative__Group__04295);
            rule__Narrative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Narrative__Group__1_in_rule__Narrative__Group__04298);
            rule__Narrative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__0"


    // $ANTLR start "rule__Narrative__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2081:1: rule__Narrative__Group__0__Impl : ( ( rule__Narrative__Alternatives_0 ) ) ;
    public final void rule__Narrative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2085:1: ( ( ( rule__Narrative__Alternatives_0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2086:1: ( ( rule__Narrative__Alternatives_0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2086:1: ( ( rule__Narrative__Alternatives_0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2087:1: ( rule__Narrative__Alternatives_0 )
            {
             before(grammarAccess.getNarrativeAccess().getAlternatives_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2088:1: ( rule__Narrative__Alternatives_0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2088:2: rule__Narrative__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Narrative__Alternatives_0_in_rule__Narrative__Group__0__Impl4325);
            rule__Narrative__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNarrativeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__0__Impl"


    // $ANTLR start "rule__Narrative__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2098:1: rule__Narrative__Group__1 : rule__Narrative__Group__1__Impl rule__Narrative__Group__2 ;
    public final void rule__Narrative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2102:1: ( rule__Narrative__Group__1__Impl rule__Narrative__Group__2 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2103:2: rule__Narrative__Group__1__Impl rule__Narrative__Group__2
            {
            pushFollow(FOLLOW_rule__Narrative__Group__1__Impl_in_rule__Narrative__Group__14355);
            rule__Narrative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Narrative__Group__2_in_rule__Narrative__Group__14358);
            rule__Narrative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__1"


    // $ANTLR start "rule__Narrative__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2110:1: rule__Narrative__Group__1__Impl : ( ( rule__Narrative__Alternatives_1 )* ) ;
    public final void rule__Narrative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2114:1: ( ( ( rule__Narrative__Alternatives_1 )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2115:1: ( ( rule__Narrative__Alternatives_1 )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2115:1: ( ( rule__Narrative__Alternatives_1 )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2116:1: ( rule__Narrative__Alternatives_1 )*
            {
             before(grammarAccess.getNarrativeAccess().getAlternatives_1()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2117:1: ( rule__Narrative__Alternatives_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_STEP_KEYWORD && LA37_0<=RULE_TAGNAME)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2117:2: rule__Narrative__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Narrative__Alternatives_1_in_rule__Narrative__Group__1__Impl4385);
            	    rule__Narrative__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getNarrativeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__1__Impl"


    // $ANTLR start "rule__Narrative__Group__2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2127:1: rule__Narrative__Group__2 : rule__Narrative__Group__2__Impl ;
    public final void rule__Narrative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2131:1: ( rule__Narrative__Group__2__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2132:2: rule__Narrative__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Narrative__Group__2__Impl_in_rule__Narrative__Group__24416);
            rule__Narrative__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__2"


    // $ANTLR start "rule__Narrative__Group__2__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2138:1: rule__Narrative__Group__2__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Narrative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2142:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2143:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2143:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2144:1: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2144:1: ( ( RULE_EOL ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2145:1: ( RULE_EOL )
            {
             before(grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2146:1: ( RULE_EOL )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2146:3: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Narrative__Group__2__Impl4446); 

            }

             after(grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 

            }

            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2149:1: ( ( RULE_EOL )* )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2150:1: ( RULE_EOL )*
            {
             before(grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2151:1: ( RULE_EOL )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_EOL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2151:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Narrative__Group__2__Impl4459); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getNarrativeAccess().getEOLTerminalRuleCall_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narrative__Group__2__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2168:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2172:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2173:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_rule__Tag__Group__0__Impl_in_rule__Tag__Group__04498);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tag__Group__1_in_rule__Tag__Group__04501);
            rule__Tag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2180:1: rule__Tag__Group__0__Impl : ( ( rule__Tag__IdAssignment_0 ) ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2184:1: ( ( ( rule__Tag__IdAssignment_0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2185:1: ( ( rule__Tag__IdAssignment_0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2185:1: ( ( rule__Tag__IdAssignment_0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2186:1: ( rule__Tag__IdAssignment_0 )
            {
             before(grammarAccess.getTagAccess().getIdAssignment_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2187:1: ( rule__Tag__IdAssignment_0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2187:2: rule__Tag__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Tag__IdAssignment_0_in_rule__Tag__Group__0__Impl4528);
            rule__Tag__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2197:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2201:1: ( rule__Tag__Group__1__Impl )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2202:2: rule__Tag__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Tag__Group__1__Impl_in_rule__Tag__Group__14558);
            rule__Tag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2208:1: rule__Tag__Group__1__Impl : ( ( RULE_EOL )? ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2212:1: ( ( ( RULE_EOL )? ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2213:1: ( ( RULE_EOL )? )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2213:1: ( ( RULE_EOL )? )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2214:1: ( RULE_EOL )?
            {
             before(grammarAccess.getTagAccess().getEOLTerminalRuleCall_1()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2215:1: ( RULE_EOL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_EOL) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2215:3: RULE_EOL
                    {
                    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Tag__Group__1__Impl4586); 

                    }
                    break;

            }

             after(grammarAccess.getTagAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Feature__TagsAssignment_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2230:1: rule__Feature__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2234:1: ( ( ruleTag ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2235:1: ( ruleTag )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2235:1: ( ruleTag )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2236:1: ruleTag
            {
             before(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTag_in_rule__Feature__TagsAssignment_04626);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TagsAssignment_0"


    // $ANTLR start "rule__Feature__TitleAssignment_2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2245:1: rule__Feature__TitleAssignment_2 : ( ruleTitle ) ;
    public final void rule__Feature__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2249:1: ( ( ruleTitle ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2250:1: ( ruleTitle )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2250:1: ( ruleTitle )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2251:1: ruleTitle
            {
             before(grammarAccess.getFeatureAccess().getTitleTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTitle_in_rule__Feature__TitleAssignment_24657);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTitleTitleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TitleAssignment_2"


    // $ANTLR start "rule__Feature__NarrativeAssignment_4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2260:1: rule__Feature__NarrativeAssignment_4 : ( ruleNarrative ) ;
    public final void rule__Feature__NarrativeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2264:1: ( ( ruleNarrative ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2265:1: ( ruleNarrative )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2265:1: ( ruleNarrative )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2266:1: ruleNarrative
            {
             before(grammarAccess.getFeatureAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNarrative_in_rule__Feature__NarrativeAssignment_44688);
            ruleNarrative();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNarrativeNarrativeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NarrativeAssignment_4"


    // $ANTLR start "rule__Feature__BackgroundAssignment_5"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2275:1: rule__Feature__BackgroundAssignment_5 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2279:1: ( ( ruleBackground ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2280:1: ( ruleBackground )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2280:1: ( ruleBackground )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2281:1: ruleBackground
            {
             before(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBackground_in_rule__Feature__BackgroundAssignment_54719);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__BackgroundAssignment_5"


    // $ANTLR start "rule__Feature__ScenariosAssignment_6"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2290:1: rule__Feature__ScenariosAssignment_6 : ( ( rule__Feature__ScenariosAlternatives_6_0 ) ) ;
    public final void rule__Feature__ScenariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2294:1: ( ( ( rule__Feature__ScenariosAlternatives_6_0 ) ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2295:1: ( ( rule__Feature__ScenariosAlternatives_6_0 ) )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2295:1: ( ( rule__Feature__ScenariosAlternatives_6_0 ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2296:1: ( rule__Feature__ScenariosAlternatives_6_0 )
            {
             before(grammarAccess.getFeatureAccess().getScenariosAlternatives_6_0()); 
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2297:1: ( rule__Feature__ScenariosAlternatives_6_0 )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2297:2: rule__Feature__ScenariosAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Feature__ScenariosAlternatives_6_0_in_rule__Feature__ScenariosAssignment_64750);
            rule__Feature__ScenariosAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getScenariosAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ScenariosAssignment_6"


    // $ANTLR start "rule__Background__BackgroundKeywordAssignment_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2306:1: rule__Background__BackgroundKeywordAssignment_0 : ( ruleBackgroundKeyword ) ;
    public final void rule__Background__BackgroundKeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2310:1: ( ( ruleBackgroundKeyword ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2311:1: ( ruleBackgroundKeyword )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2311:1: ( ruleBackgroundKeyword )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2312:1: ruleBackgroundKeyword
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeywordBackgroundKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBackgroundKeyword_in_rule__Background__BackgroundKeywordAssignment_04783);
            ruleBackgroundKeyword();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getBackgroundKeywordBackgroundKeywordParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__BackgroundKeywordAssignment_0"


    // $ANTLR start "rule__Background__TitleAssignment_1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2321:1: rule__Background__TitleAssignment_1 : ( ruleTitle ) ;
    public final void rule__Background__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2325:1: ( ( ruleTitle ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2326:1: ( ruleTitle )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2326:1: ( ruleTitle )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2327:1: ruleTitle
            {
             before(grammarAccess.getBackgroundAccess().getTitleTitleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTitle_in_rule__Background__TitleAssignment_14814);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getTitleTitleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__TitleAssignment_1"


    // $ANTLR start "rule__Background__NarrativeAssignment_3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2336:1: rule__Background__NarrativeAssignment_3 : ( ruleNarrative ) ;
    public final void rule__Background__NarrativeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2340:1: ( ( ruleNarrative ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2341:1: ( ruleNarrative )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2341:1: ( ruleNarrative )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2342:1: ruleNarrative
            {
             before(grammarAccess.getBackgroundAccess().getNarrativeNarrativeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNarrative_in_rule__Background__NarrativeAssignment_34845);
            ruleNarrative();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getNarrativeNarrativeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__NarrativeAssignment_3"


    // $ANTLR start "rule__Background__StepsAssignment_4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2351:1: rule__Background__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2355:1: ( ( ruleStep ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2356:1: ( ruleStep )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2356:1: ( ruleStep )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2357:1: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Background__StepsAssignment_44876);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__StepsAssignment_4"


    // $ANTLR start "rule__Scenario__TagsAssignment_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2366:1: rule__Scenario__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2370:1: ( ( ruleTag ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2371:1: ( ruleTag )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2371:1: ( ruleTag )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2372:1: ruleTag
            {
             before(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTag_in_rule__Scenario__TagsAssignment_04907);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__TagsAssignment_0"


    // $ANTLR start "rule__Scenario__TitleAssignment_2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2381:1: rule__Scenario__TitleAssignment_2 : ( ruleTitle ) ;
    public final void rule__Scenario__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2385:1: ( ( ruleTitle ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2386:1: ( ruleTitle )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2386:1: ( ruleTitle )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2387:1: ruleTitle
            {
             before(grammarAccess.getScenarioAccess().getTitleTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTitle_in_rule__Scenario__TitleAssignment_24938);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTitleTitleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__TitleAssignment_2"


    // $ANTLR start "rule__Scenario__NarrativeAssignment_4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2396:1: rule__Scenario__NarrativeAssignment_4 : ( ruleNarrative ) ;
    public final void rule__Scenario__NarrativeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2400:1: ( ( ruleNarrative ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2401:1: ( ruleNarrative )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2401:1: ( ruleNarrative )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2402:1: ruleNarrative
            {
             before(grammarAccess.getScenarioAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNarrative_in_rule__Scenario__NarrativeAssignment_44969);
            ruleNarrative();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getNarrativeNarrativeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__NarrativeAssignment_4"


    // $ANTLR start "rule__Scenario__StepsAssignment_5"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2411:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2415:1: ( ( ruleStep ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2416:1: ( ruleStep )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2416:1: ( ruleStep )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2417:1: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_55000);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__StepsAssignment_5"


    // $ANTLR start "rule__ScenarioOutline__TagsAssignment_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2426:1: rule__ScenarioOutline__TagsAssignment_0 : ( ruleTag ) ;
    public final void rule__ScenarioOutline__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2430:1: ( ( ruleTag ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2431:1: ( ruleTag )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2431:1: ( ruleTag )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2432:1: ruleTag
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTag_in_rule__ScenarioOutline__TagsAssignment_05031);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__TagsAssignment_0"


    // $ANTLR start "rule__ScenarioOutline__TitleAssignment_2"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2441:1: rule__ScenarioOutline__TitleAssignment_2 : ( ruleTitle ) ;
    public final void rule__ScenarioOutline__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2445:1: ( ( ruleTitle ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2446:1: ( ruleTitle )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2446:1: ( ruleTitle )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2447:1: ruleTitle
            {
             before(grammarAccess.getScenarioOutlineAccess().getTitleTitleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTitle_in_rule__ScenarioOutline__TitleAssignment_25062);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getTitleTitleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__TitleAssignment_2"


    // $ANTLR start "rule__ScenarioOutline__NarrativeAssignment_4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2456:1: rule__ScenarioOutline__NarrativeAssignment_4 : ( ruleNarrative ) ;
    public final void rule__ScenarioOutline__NarrativeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2460:1: ( ( ruleNarrative ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2461:1: ( ruleNarrative )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2461:1: ( ruleNarrative )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2462:1: ruleNarrative
            {
             before(grammarAccess.getScenarioOutlineAccess().getNarrativeNarrativeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNarrative_in_rule__ScenarioOutline__NarrativeAssignment_45093);
            ruleNarrative();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getNarrativeNarrativeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__NarrativeAssignment_4"


    // $ANTLR start "rule__ScenarioOutline__StepsAssignment_5"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2471:1: rule__ScenarioOutline__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2475:1: ( ( ruleStep ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2476:1: ( ruleStep )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2476:1: ( ruleStep )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2477:1: ruleStep
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__ScenarioOutline__StepsAssignment_55124);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__StepsAssignment_5"


    // $ANTLR start "rule__ScenarioOutline__ExamplesAssignment_6"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2486:1: rule__ScenarioOutline__ExamplesAssignment_6 : ( ruleExamples ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2490:1: ( ( ruleExamples ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2491:1: ( ruleExamples )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2491:1: ( ruleExamples )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2492:1: ruleExamples
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleExamples_in_rule__ScenarioOutline__ExamplesAssignment_65155);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__ExamplesAssignment_6"


    // $ANTLR start "rule__Step__StepKeywordAssignment_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2501:1: rule__Step__StepKeywordAssignment_0 : ( ruleStepKeyword ) ;
    public final void rule__Step__StepKeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2505:1: ( ( ruleStepKeyword ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2506:1: ( ruleStepKeyword )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2506:1: ( ruleStepKeyword )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2507:1: ruleStepKeyword
            {
             before(grammarAccess.getStepAccess().getStepKeywordStepKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStepKeyword_in_rule__Step__StepKeywordAssignment_05186);
            ruleStepKeyword();

            state._fsp--;

             after(grammarAccess.getStepAccess().getStepKeywordStepKeywordParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__StepKeywordAssignment_0"


    // $ANTLR start "rule__Step__DescriptionAssignment_1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2516:1: rule__Step__DescriptionAssignment_1 : ( ruleStepDescription ) ;
    public final void rule__Step__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2520:1: ( ( ruleStepDescription ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2521:1: ( ruleStepDescription )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2521:1: ( ruleStepDescription )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2522:1: ruleStepDescription
            {
             before(grammarAccess.getStepAccess().getDescriptionStepDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStepDescription_in_rule__Step__DescriptionAssignment_15217);
            ruleStepDescription();

            state._fsp--;

             after(grammarAccess.getStepAccess().getDescriptionStepDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__DescriptionAssignment_1"


    // $ANTLR start "rule__Step__TablesAssignment_3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2531:1: rule__Step__TablesAssignment_3 : ( ruleTable ) ;
    public final void rule__Step__TablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2535:1: ( ( ruleTable ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2536:1: ( ruleTable )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2536:1: ( ruleTable )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2537:1: ruleTable
            {
             before(grammarAccess.getStepAccess().getTablesTableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Step__TablesAssignment_35248);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTablesTableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TablesAssignment_3"


    // $ANTLR start "rule__Step__CodeAssignment_4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2546:1: rule__Step__CodeAssignment_4 : ( ruleDocString ) ;
    public final void rule__Step__CodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2550:1: ( ( ruleDocString ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2551:1: ( ruleDocString )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2551:1: ( ruleDocString )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2552:1: ruleDocString
            {
             before(grammarAccess.getStepAccess().getCodeDocStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDocString_in_rule__Step__CodeAssignment_45279);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getStepAccess().getCodeDocStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__CodeAssignment_4"


    // $ANTLR start "rule__Step__TablesAssignment_5"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2561:1: rule__Step__TablesAssignment_5 : ( ruleTable ) ;
    public final void rule__Step__TablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2565:1: ( ( ruleTable ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2566:1: ( ruleTable )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2566:1: ( ruleTable )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2567:1: ruleTable
            {
             before(grammarAccess.getStepAccess().getTablesTableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Step__TablesAssignment_55310);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getStepAccess().getTablesTableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__TablesAssignment_5"


    // $ANTLR start "rule__Examples__TitleAssignment_1"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2576:1: rule__Examples__TitleAssignment_1 : ( ruleTitle ) ;
    public final void rule__Examples__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2580:1: ( ( ruleTitle ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2581:1: ( ruleTitle )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2581:1: ( ruleTitle )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2582:1: ruleTitle
            {
             before(grammarAccess.getExamplesAccess().getTitleTitleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTitle_in_rule__Examples__TitleAssignment_15341);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTitleTitleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__TitleAssignment_1"


    // $ANTLR start "rule__Examples__NarrativeAssignment_3"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2591:1: rule__Examples__NarrativeAssignment_3 : ( ruleNarrative ) ;
    public final void rule__Examples__NarrativeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2595:1: ( ( ruleNarrative ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2596:1: ( ruleNarrative )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2596:1: ( ruleNarrative )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2597:1: ruleNarrative
            {
             before(grammarAccess.getExamplesAccess().getNarrativeNarrativeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNarrative_in_rule__Examples__NarrativeAssignment_35372);
            ruleNarrative();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getNarrativeNarrativeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__NarrativeAssignment_3"


    // $ANTLR start "rule__Examples__TableAssignment_4"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2606:1: rule__Examples__TableAssignment_4 : ( ruleTable ) ;
    public final void rule__Examples__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2610:1: ( ( ruleTable ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2611:1: ( ruleTable )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2611:1: ( ruleTable )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2612:1: ruleTable
            {
             before(grammarAccess.getExamplesAccess().getTableTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Examples__TableAssignment_45403);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTableTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__TableAssignment_4"


    // $ANTLR start "rule__Table__RowsAssignment_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2621:1: rule__Table__RowsAssignment_0 : ( RULE_TABLE_ROW ) ;
    public final void rule__Table__RowsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2625:1: ( ( RULE_TABLE_ROW ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2626:1: ( RULE_TABLE_ROW )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2626:1: ( RULE_TABLE_ROW )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2627:1: RULE_TABLE_ROW
            {
             before(grammarAccess.getTableAccess().getRowsTABLE_ROWTerminalRuleCall_0_0()); 
            match(input,RULE_TABLE_ROW,FOLLOW_RULE_TABLE_ROW_in_rule__Table__RowsAssignment_05434); 
             after(grammarAccess.getTableAccess().getRowsTABLE_ROWTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RowsAssignment_0"


    // $ANTLR start "rule__DocString__ContentAssignment_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2636:1: rule__DocString__ContentAssignment_0 : ( RULE_DOC_STRING ) ;
    public final void rule__DocString__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2640:1: ( ( RULE_DOC_STRING ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2641:1: ( RULE_DOC_STRING )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2641:1: ( RULE_DOC_STRING )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2642:1: RULE_DOC_STRING
            {
             before(grammarAccess.getDocStringAccess().getContentDOC_STRINGTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_STRING,FOLLOW_RULE_DOC_STRING_in_rule__DocString__ContentAssignment_05465); 
             after(grammarAccess.getDocStringAccess().getContentDOC_STRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__ContentAssignment_0"


    // $ANTLR start "rule__Tag__IdAssignment_0"
    // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2651:1: rule__Tag__IdAssignment_0 : ( RULE_TAGNAME ) ;
    public final void rule__Tag__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2655:1: ( ( RULE_TAGNAME ) )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2656:1: ( RULE_TAGNAME )
            {
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2656:1: ( RULE_TAGNAME )
            // ../uom.ac.uk.msc.cucumber.ui/src-gen/uom/ac/uk/msc/cucumber/ui/contentassist/antlr/internal/InternalGherkin.g:2657:1: RULE_TAGNAME
            {
             before(grammarAccess.getTagAccess().getIdTAGNAMETerminalRuleCall_0_0()); 
            match(input,RULE_TAGNAME,FOLLOW_RULE_TAGNAME_in_rule__Tag__IdAssignment_05496); 
             after(grammarAccess.getTagAccess().getIdTAGNAMETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__IdAssignment_0"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\1\1\1\uffff\1\11\7\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\4\7\uffff";
    static final String DFA2_maxS =
        "\1\30\1\uffff\1\30\7\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\2\1\uffff\7\1";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\5\3\3\1\11\uffff\3\1",
            "",
            "\1\10\1\4\1\5\1\6\1\7\4\11\11\uffff\3\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 369:1: ( rule__StepDescription__Alternatives )*";
        }
    }
    static final String DFA3_eotS =
        "\5\uffff";
    static final String DFA3_eofS =
        "\5\uffff";
    static final String DFA3_minS =
        "\2\11\2\uffff\1\11";
    static final String DFA3_maxS =
        "\2\27\2\uffff\1\27";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA3_specialS =
        "\5\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\14\uffff\1\2\1\3",
            "\1\1\1\4\13\uffff\1\2\1\3",
            "",
            "",
            "\1\1\14\uffff\1\2\1\3"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "468:1: rule__Feature__ScenariosAlternatives_6_0 : ( ( ruleScenario ) | ( ruleScenarioOutline ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackground128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__0_in_ruleBackground154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0_in_ruleScenario214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioOutline_in_entryRuleScenarioOutline241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarioOutline248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__0_in_ruleScenarioOutline274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0_in_ruleStep334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExamples_in_entryRuleExamples361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExamples368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Examples__Group__0_in_ruleExamples394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0_in_ruleTable454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocString_in_entryRuleDocString481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocString488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocString__Group__0_in_ruleDocString514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__0_in_ruleTitle574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrative_in_entryRuleNarrative601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNarrative608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Narrative__Group__0_in_ruleNarrative636 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_rule__Narrative__Group__0_in_ruleNarrative648 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_ruleStepDescription_in_entryRuleStepDescription678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepDescription685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepDescription__Alternatives_in_ruleStepDescription713 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_rule__StepDescription__Alternatives_in_ruleStepDescription725 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_ruleStepKeyword_in_entryRuleStepKeyword755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepKeyword762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STEP_KEYWORD_in_ruleStepKeyword788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackgroundKeyword_in_entryRuleBackgroundKeyword814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackgroundKeyword821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBackgroundKeyword848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_entryRuleTag876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTag883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group__0_in_ruleTag909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__Feature__ScenariosAlternatives_6_0945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioOutline_in_rule__Feature__ScenariosAlternatives_6_0962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Title__Alternatives_0994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Title__Alternatives_01011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Title__Alternatives_01028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_rule__Title__Alternatives_01045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Title__Alternatives_11077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Title__Alternatives_11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Title__Alternatives_11111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_rule__Title__Alternatives_11128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STEP_KEYWORD_in_rule__Title__Alternatives_11145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAGNAME_in_rule__Title__Alternatives_11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Narrative__Alternatives_01194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Narrative__Alternatives_01211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Narrative__Alternatives_01228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_rule__Narrative__Alternatives_01245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Narrative__Alternatives_11277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Narrative__Alternatives_11294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Narrative__Alternatives_11311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_rule__Narrative__Alternatives_11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STEP_KEYWORD_in_rule__Narrative__Alternatives_11345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAGNAME_in_rule__Narrative__Alternatives_11362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__StepDescription__Alternatives1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__StepDescription__Alternatives1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StepDescription__Alternatives1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLACEHOLDER_in_rule__StepDescription__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STEP_KEYWORD_in_rule__StepDescription__Alternatives1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAGNAME_in_rule__StepDescription__Alternatives1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01509 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TagsAssignment_0_in_rule__Feature__Group__0__Impl1539 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11570 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group__1__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21632 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TitleAssignment_2_in_rule__Feature__Group__2__Impl1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31692 = new BitSet(new long[]{0x0000000000D003E0L});
    public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__31695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Feature__Group__3__Impl1725 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Feature__Group__3__Impl1738 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__41771 = new BitSet(new long[]{0x0000000000D003E0L});
    public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__41774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NarrativeAssignment_4_in_rule__Feature__Group__4__Impl1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51832 = new BitSet(new long[]{0x0000000000D003E0L});
    public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__51835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__BackgroundAssignment_5_in_rule__Feature__Group__5__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__61893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ScenariosAssignment_6_in_rule__Feature__Group__6__Impl1922 = new BitSet(new long[]{0x0000000000D003E2L});
    public static final BitSet FOLLOW_rule__Feature__ScenariosAssignment_6_in_rule__Feature__Group__6__Impl1934 = new BitSet(new long[]{0x0000000000D003E2L});
    public static final BitSet FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__01981 = new BitSet(new long[]{0x00000000000005E0L});
    public static final BitSet FOLLOW_rule__Background__Group__1_in_rule__Background__Group__01984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__BackgroundKeywordAssignment_0_in_rule__Background__Group__0__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12041 = new BitSet(new long[]{0x00000000000005E0L});
    public static final BitSet FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__TitleAssignment_1_in_rule__Background__Group__1__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22102 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Background__Group__3_in_rule__Background__Group__22105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Background__Group__2__Impl2135 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Background__Group__2__Impl2148 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Background__Group__3__Impl_in_rule__Background__Group__32181 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Background__Group__4_in_rule__Background__Group__32184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__NarrativeAssignment_3_in_rule__Background__Group__3__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__Group__4__Impl_in_rule__Background__Group__42242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Background__StepsAssignment_4_in_rule__Background__Group__4__Impl2271 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_rule__Background__StepsAssignment_4_in_rule__Background__Group__4__Impl2283 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__02326 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__02329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__TagsAssignment_0_in_rule__Scenario__Group__0__Impl2356 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__12387 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Scenario__Group__1__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__22449 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__22452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__TitleAssignment_2_in_rule__Scenario__Group__2__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__32509 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__32512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Scenario__Group__3__Impl2542 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Scenario__Group__3__Impl2555 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__42588 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Scenario__Group__5_in_rule__Scenario__Group__42591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__NarrativeAssignment_4_in_rule__Scenario__Group__4__Impl2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__5__Impl_in_rule__Scenario__Group__52649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_5_in_rule__Scenario__Group__5__Impl2678 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_rule__Scenario__StepsAssignment_5_in_rule__Scenario__Group__5__Impl2690 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__0__Impl_in_rule__ScenarioOutline__Group__02735 = new BitSet(new long[]{0x0000000000D003E0L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__1_in_rule__ScenarioOutline__Group__02738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__TagsAssignment_0_in_rule__ScenarioOutline__Group__0__Impl2765 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__1__Impl_in_rule__ScenarioOutline__Group__12796 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__2_in_rule__ScenarioOutline__Group__12799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ScenarioOutline__Group__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__2__Impl_in_rule__ScenarioOutline__Group__22858 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__3_in_rule__ScenarioOutline__Group__22861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__TitleAssignment_2_in_rule__ScenarioOutline__Group__2__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__3__Impl_in_rule__ScenarioOutline__Group__32918 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__4_in_rule__ScenarioOutline__Group__32921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__ScenarioOutline__Group__3__Impl2951 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__ScenarioOutline__Group__3__Impl2964 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__4__Impl_in_rule__ScenarioOutline__Group__42997 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__5_in_rule__ScenarioOutline__Group__43000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__NarrativeAssignment_4_in_rule__ScenarioOutline__Group__4__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__5__Impl_in_rule__ScenarioOutline__Group__53058 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__6_in_rule__ScenarioOutline__Group__53061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__StepsAssignment_5_in_rule__ScenarioOutline__Group__5__Impl3090 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__StepsAssignment_5_in_rule__ScenarioOutline__Group__5__Impl3102 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__Group__6__Impl_in_rule__ScenarioOutline__Group__63135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioOutline__ExamplesAssignment_6_in_rule__ScenarioOutline__Group__6__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__0__Impl_in_rule__Step__Group__03206 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_rule__Step__Group__1_in_rule__Step__Group__03209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__StepKeywordAssignment_0_in_rule__Step__Group__0__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__1__Impl_in_rule__Step__Group__13266 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_rule__Step__Group__2_in_rule__Step__Group__13269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__DescriptionAssignment_1_in_rule__Step__Group__1__Impl3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__2__Impl_in_rule__Step__Group__23326 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_rule__Step__Group__3_in_rule__Step__Group__23329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Step__Group__2__Impl3357 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Step__Group__3__Impl_in_rule__Step__Group__33388 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_rule__Step__Group__4_in_rule__Step__Group__33391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__TablesAssignment_3_in_rule__Step__Group__3__Impl3418 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Step__Group__4__Impl_in_rule__Step__Group__43449 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_rule__Step__Group__5_in_rule__Step__Group__43452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__CodeAssignment_4_in_rule__Step__Group__4__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__Group__5__Impl_in_rule__Step__Group__53510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Step__TablesAssignment_5_in_rule__Step__Group__5__Impl3537 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Examples__Group__0__Impl_in_rule__Examples__Group__03580 = new BitSet(new long[]{0x00000000000005E0L});
    public static final BitSet FOLLOW_rule__Examples__Group__1_in_rule__Examples__Group__03583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Examples__Group__0__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Examples__Group__1__Impl_in_rule__Examples__Group__13642 = new BitSet(new long[]{0x00000000000005E0L});
    public static final BitSet FOLLOW_rule__Examples__Group__2_in_rule__Examples__Group__13645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Examples__TitleAssignment_1_in_rule__Examples__Group__1__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Examples__Group__2__Impl_in_rule__Examples__Group__23703 = new BitSet(new long[]{0x00000000000009E0L});
    public static final BitSet FOLLOW_rule__Examples__Group__3_in_rule__Examples__Group__23706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Examples__Group__2__Impl3736 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Examples__Group__2__Impl3749 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Examples__Group__3__Impl_in_rule__Examples__Group__33782 = new BitSet(new long[]{0x00000000000009E0L});
    public static final BitSet FOLLOW_rule__Examples__Group__4_in_rule__Examples__Group__33785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Examples__NarrativeAssignment_3_in_rule__Examples__Group__3__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Examples__Group__4__Impl_in_rule__Examples__Group__43843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Examples__TableAssignment_4_in_rule__Examples__Group__4__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__03910 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__03913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__RowsAssignment_0_in_rule__Table__Group__0__Impl3942 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Table__RowsAssignment_0_in_rule__Table__Group__0__Impl3954 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__13987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Table__Group__1__Impl4015 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__DocString__Group__0__Impl_in_rule__DocString__Group__04050 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__DocString__Group__1_in_rule__DocString__Group__04053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocString__ContentAssignment_0_in_rule__DocString__Group__0__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocString__Group__1__Impl_in_rule__DocString__Group__14110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__DocString__Group__1__Impl4138 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Title__Group__0__Impl_in_rule__Title__Group__04173 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_rule__Title__Group__1_in_rule__Title__Group__04176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Alternatives_0_in_rule__Title__Group__0__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__1__Impl_in_rule__Title__Group__14233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Alternatives_1_in_rule__Title__Group__1__Impl4260 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_rule__Narrative__Group__0__Impl_in_rule__Narrative__Group__04295 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_rule__Narrative__Group__1_in_rule__Narrative__Group__04298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Narrative__Alternatives_0_in_rule__Narrative__Group__0__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Narrative__Group__1__Impl_in_rule__Narrative__Group__14355 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_rule__Narrative__Group__2_in_rule__Narrative__Group__14358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Narrative__Alternatives_1_in_rule__Narrative__Group__1__Impl4385 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_rule__Narrative__Group__2__Impl_in_rule__Narrative__Group__24416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Narrative__Group__2__Impl4446 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Narrative__Group__2__Impl4459 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Tag__Group__0__Impl_in_rule__Tag__Group__04498 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Tag__Group__1_in_rule__Tag__Group__04501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__IdAssignment_0_in_rule__Tag__Group__0__Impl4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tag__Group__1__Impl_in_rule__Tag__Group__14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Tag__Group__1__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_rule__Feature__TagsAssignment_04626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rule__Feature__TitleAssignment_24657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrative_in_rule__Feature__NarrativeAssignment_44688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackground_in_rule__Feature__BackgroundAssignment_54719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ScenariosAlternatives_6_0_in_rule__Feature__ScenariosAssignment_64750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackgroundKeyword_in_rule__Background__BackgroundKeywordAssignment_04783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rule__Background__TitleAssignment_14814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrative_in_rule__Background__NarrativeAssignment_34845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Background__StepsAssignment_44876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_rule__Scenario__TagsAssignment_04907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rule__Scenario__TitleAssignment_24938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrative_in_rule__Scenario__NarrativeAssignment_44969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__Scenario__StepsAssignment_55000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTag_in_rule__ScenarioOutline__TagsAssignment_05031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rule__ScenarioOutline__TitleAssignment_25062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrative_in_rule__ScenarioOutline__NarrativeAssignment_45093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__ScenarioOutline__StepsAssignment_55124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExamples_in_rule__ScenarioOutline__ExamplesAssignment_65155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepKeyword_in_rule__Step__StepKeywordAssignment_05186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepDescription_in_rule__Step__DescriptionAssignment_15217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Step__TablesAssignment_35248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocString_in_rule__Step__CodeAssignment_45279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Step__TablesAssignment_55310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rule__Examples__TitleAssignment_15341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNarrative_in_rule__Examples__NarrativeAssignment_35372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Examples__TableAssignment_45403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TABLE_ROW_in_rule__Table__RowsAssignment_05434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_STRING_in_rule__DocString__ContentAssignment_05465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAGNAME_in_rule__Tag__IdAssignment_05496 = new BitSet(new long[]{0x0000000000000002L});

}