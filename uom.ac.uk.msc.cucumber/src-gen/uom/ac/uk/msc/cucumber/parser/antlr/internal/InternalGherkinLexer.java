package uom.ac.uk.msc.cucumber.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_DOC_STRING=6;
    public static final int RULE_STRING=9;
    public static final int RULE_NUMBER=8;
    public static final int RULE_STEP_KEYWORD=11;
    public static final int RULE_INT=17;
    public static final int RULE_WS=15;
    public static final int RULE_WORD=7;

    // delegates
    // delegators

    public InternalGherkinLexer() {;} 
    public InternalGherkinLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGherkinLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:11:7: ( 'Feature:' )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:11:9: 'Feature:'
            {
            match("Feature:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:12:7: ( 'Scenario:' )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:12:9: 'Scenario:'
            {
            match("Scenario:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:13:7: ( 'Scenario Outline:' )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:13:9: 'Scenario Outline:'
            {
            match("Scenario Outline:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:14:7: ( 'Examples:' )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:14:9: 'Examples:'
            {
            match("Examples:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:15:7: ( 'Background:' )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:15:9: 'Background:'
            {
            match("Background:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:13: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:15: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:15: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:20: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:32: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:33: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:37: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1175:38: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_STEP_KEYWORD"
    public final void mRULE_STEP_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_STEP_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:19: ( ( 'Given' | 'When' | 'Then' | 'And' | 'But' ) ( ' ' | '\\t' )+ )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:21: ( 'Given' | 'When' | 'Then' | 'And' | 'But' ) ( ' ' | '\\t' )+
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:21: ( 'Given' | 'When' | 'Then' | 'And' | 'But' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 'G':
                {
                alt5=1;
                }
                break;
            case 'W':
                {
                alt5=2;
                }
                break;
            case 'T':
                {
                alt5=3;
                }
                break;
            case 'A':
                {
                alt5=4;
                }
                break;
            case 'B':
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:22: 'Given'
                    {
                    match("Given"); 


                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:30: 'When'
                    {
                    match("When"); 


                    }
                    break;
                case 3 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:37: 'Then'
                    {
                    match("Then"); 


                    }
                    break;
                case 4 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:44: 'And'
                    {
                    match("And"); 


                    }
                    break;
                case 5 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:50: 'But'
                    {
                    match("But"); 


                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1177:57: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STEP_KEYWORD"

    // $ANTLR start "RULE_PLACEHOLDER"
    public final void mRULE_PLACEHOLDER() throws RecognitionException {
        try {
            int _type = RULE_PLACEHOLDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1179:18: ( '<' (~ ( ( '>' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+ '>' )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1179:20: '<' (~ ( ( '>' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+ '>'
            {
            match('<'); 
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1179:24: (~ ( ( '>' | ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||(LA7_0>='!' && LA7_0<='=')||(LA7_0>='?' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1179:24: ~ ( ( '>' | ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLACEHOLDER"

    // $ANTLR start "RULE_TABLE_ROW"
    public final void mRULE_TABLE_ROW() throws RecognitionException {
        try {
            int _type = RULE_TABLE_ROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1181:16: ( '|' ( (~ ( ( '|' | '\\n' | '\\r' ) ) )* '|' )+ ( ' ' | '\\t' )* RULE_NL )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1181:18: '|' ( (~ ( ( '|' | '\\n' | '\\r' ) ) )* '|' )+ ( ' ' | '\\t' )* RULE_NL
            {
            match('|'); 
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1181:22: ( (~ ( ( '|' | '\\n' | '\\r' ) ) )* '|' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1181:23: (~ ( ( '|' | '\\n' | '\\r' ) ) )* '|'
            	    {
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1181:23: (~ ( ( '|' | '\\n' | '\\r' ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='{')||(LA8_0>='}' && LA8_0<='\uFFFF')) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1181:23: ~ ( ( '|' | '\\n' | '\\r' ) )
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    match('|'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1181:49: ( ' ' | '\\t' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TABLE_ROW"

    // $ANTLR start "RULE_DOC_STRING"
    public final void mRULE_DOC_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOC_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:17: ( ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ) RULE_NL )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:19: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' ) RULE_NL
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:19: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:20: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:26: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\"') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='\"') ) {
                                int LA11_3 = input.LA(3);

                                if ( (LA11_3=='\"') ) {
                                    alt11=2;
                                }
                                else if ( ((LA11_3>='\u0000' && LA11_3<='!')||(LA11_3>='#' && LA11_3<='\uFFFF')) ) {
                                    alt11=1;
                                }


                            }
                            else if ( ((LA11_1>='\u0000' && LA11_1<='!')||(LA11_1>='#' && LA11_1<='\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:54: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:64: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:73: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\'') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='\'') ) {
                                int LA12_3 = input.LA(3);

                                if ( (LA12_3=='\'') ) {
                                    alt12=2;
                                }
                                else if ( ((LA12_3>='\u0000' && LA12_3<='&')||(LA12_3>='(' && LA12_3<='\uFFFF')) ) {
                                    alt12=1;
                                }


                            }
                            else if ( ((LA12_1>='\u0000' && LA12_1<='&')||(LA12_1>='(' && LA12_1<='\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1183:101: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;

            }

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_STRING"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:66: ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:96: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:101: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:102: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1185:147: ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1187:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* RULE_NL )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1187:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* RULE_NL
            {
            match('#'); 
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1187:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1187:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_TAGNAME"
    public final void mRULE_TAGNAME() throws RecognitionException {
        try {
            int _type = RULE_TAGNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1189:14: ( '@' (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )+ )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1189:16: '@' (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            {
            match('@'); 
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1189:20: (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='!' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1189:20: ~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAGNAME"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1191:11: (~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )* )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1191:13: ~ ( ( '@' | '|' | ' ' | '\\t' | '\\n' | '\\r' ) ) (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )*
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1191:45: (~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='!' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1191:45: ~ ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1193:9: ( ( ' ' | '\\t' ) )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1193:11: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1195:10: ( RULE_NL )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1195:12: RULE_NL
            {
            mRULE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1197:18: ( ( '\\r' )? ( '\\n' )? )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1197:20: ( '\\r' )? ( '\\n' )?
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1197:20: ( '\\r' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1197:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1197:26: ( '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1197:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1199:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1199:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1199:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1199:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1199:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1201:10: ( ( '0' .. '9' )+ )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1201:12: ( '0' .. '9' )+
            {
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1201:12: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1201:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1203:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1203:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1203:24: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='*') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='/') ) {
                        alt25=2;
                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='.')||(LA25_1>='0' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<=')')||(LA25_0>='+' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1203:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1205:16: ( . )
            // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1205:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | RULE_NUMBER | RULE_STEP_KEYWORD | RULE_PLACEHOLDER | RULE_TABLE_ROW | RULE_DOC_STRING | RULE_STRING | RULE_SL_COMMENT | RULE_TAGNAME | RULE_WORD | RULE_WS | RULE_EOL | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_ANY_OTHER )
        int alt26=20;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:40: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 7 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:52: RULE_STEP_KEYWORD
                {
                mRULE_STEP_KEYWORD(); 

                }
                break;
            case 8 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:70: RULE_PLACEHOLDER
                {
                mRULE_PLACEHOLDER(); 

                }
                break;
            case 9 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:87: RULE_TABLE_ROW
                {
                mRULE_TABLE_ROW(); 

                }
                break;
            case 10 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:102: RULE_DOC_STRING
                {
                mRULE_DOC_STRING(); 

                }
                break;
            case 11 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:118: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:130: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:146: RULE_TAGNAME
                {
                mRULE_TAGNAME(); 

                }
                break;
            case 14 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:159: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 15 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:169: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:177: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 17 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:186: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:194: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:203: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../uom.ac.uk.msc.cucumber/src-gen/uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.g:1:219: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA9_eotS =
        "\2\2\2\uffff";
    static final String DFA9_eofS =
        "\4\uffff";
    static final String DFA9_minS =
        "\2\0\2\uffff";
    static final String DFA9_maxS =
        "\2\uffff\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\1\0\1\1\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\3\1\1\1\uffff\2\3\1\uffff\22\3\1\1\uffdf\3",
            "\11\3\1\1\1\uffff\2\3\1\uffff\22\3\1\1\uffdf\3",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1181:22: ( (~ ( ( '|' | '\\n' | '\\r' ) ) )* '|' )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='\t'||LA9_0==' ') ) {s = 1;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<='\uFFFF')) ) {s = 3;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_1 = input.LA(1);

                        s = -1;
                        if ( ((LA9_1>='\u0000' && LA9_1<='\b')||(LA9_1>='\u000B' && LA9_1<='\f')||(LA9_1>='\u000E' && LA9_1<='\u001F')||(LA9_1>='!' && LA9_1<='\uFFFF')) ) {s = 3;}

                        else if ( (LA9_1=='\t'||LA9_1==' ') ) {s = 1;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\1\25\5\32\1\41\5\32\1\51\2\32\1\63\1\51\1\32\4\uffff\2\32\1\uffff"+
        "\1\32\1\uffff\5\32\1\41\1\uffff\1\41\6\32\2\uffff\1\56\2\32\1\uffff"+
        "\1\56\2\32\1\63\2\uffff\1\32\1\uffff\6\32\1\41\4\32\1\124\2\32\1"+
        "\56\2\32\1\56\2\32\1\uffff\4\32\1\uffff\3\32\1\uffff\2\32\1\uffff"+
        "\16\32\2\127\4\32\1\160\3\32\1\uffff\1\165\1\uffff\1\166\1\32\2"+
        "\uffff\1\32\1\171\1\uffff";
    static final String DFA26_eofS =
        "\172\uffff";
    static final String DFA26_minS =
        "\1\0\5\60\1\0\4\60\6\0\1\101\4\uffff\1\60\1\52\1\uffff\1\60\1\uffff"+
        "\5\60\1\0\1\uffff\1\0\5\60\1\0\2\uffff\1\0\1\42\1\0\1\uffff\1\0"+
        "\1\42\2\0\2\uffff\1\60\1\uffff\1\0\4\60\1\11\1\0\3\60\1\11\11\0"+
        "\1\uffff\4\60\1\uffff\1\60\2\11\1\uffff\2\0\1\uffff\3\0\4\60\1\11"+
        "\2\0\4\60\2\0\4\60\1\0\1\40\2\60\1\uffff\1\0\1\uffff\1\0\1\60\2"+
        "\uffff\1\60\1\0\1\uffff";
    static final String DFA26_maxS =
        "\1\uffff\4\172\1\71\1\uffff\4\172\6\uffff\1\172\4\uffff\1\172\1"+
        "\52\1\uffff\1\172\1\uffff\5\172\1\uffff\1\uffff\1\uffff\1\71\4\172"+
        "\1\uffff\2\uffff\1\uffff\1\165\1\uffff\1\uffff\1\uffff\1\165\2\uffff"+
        "\2\uffff\1\172\1\uffff\1\uffff\5\172\1\uffff\4\172\11\uffff\1\uffff"+
        "\4\172\1\uffff\3\172\1\uffff\2\uffff\1\uffff\3\uffff\5\172\2\uffff"+
        "\4\172\2\uffff\4\172\1\uffff\3\172\1\uffff\1\uffff\1\uffff\1\uffff"+
        "\1\172\2\uffff\1\172\1\uffff\1\uffff";
    static final String DFA26_acceptS =
        "\22\uffff\1\17\3\20\2\uffff\1\16\1\uffff\1\16\6\uffff\1\6\7\uffff"+
        "\1\24\1\11\3\uffff\1\13\4\uffff\1\14\1\15\1\uffff\1\17\24\uffff"+
        "\1\23\4\uffff\1\7\3\uffff\1\10\2\uffff\1\12\30\uffff\1\1\1\uffff"+
        "\1\3\2\uffff\1\2\1\4\2\uffff\1\5";
    static final String DFA26_specialS =
        "\1\20\5\uffff\1\16\4\uffff\1\10\1\21\1\35\1\5\1\22\1\37\17\uffff"+
        "\1\26\1\uffff\1\33\5\uffff\1\23\2\uffff\1\15\1\uffff\1\13\1\uffff"+
        "\1\6\1\uffff\1\30\1\46\4\uffff\1\3\5\uffff\1\0\4\uffff\1\47\1\44"+
        "\1\11\1\12\1\32\1\34\1\7\1\41\1\45\12\uffff\1\31\1\40\1\uffff\1"+
        "\17\1\25\1\4\5\uffff\1\42\1\24\4\uffff\1\27\1\43\4\uffff\1\36\4"+
        "\uffff\1\14\1\uffff\1\2\4\uffff\1\1\1\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\30\1\22\1\24\2\30\1\23\22\30\1\22\1\30\1\15\1\17\3\30\1"+
            "\16\5\30\1\5\1\30\1\27\12\6\2\30\1\13\3\30\1\20\1\12\1\4\2\26"+
            "\1\3\1\1\1\7\13\26\1\2\1\11\2\26\1\10\3\26\3\30\1\21\1\26\1"+
            "\30\32\26\1\30\1\14\uff83\30",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\31\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\2\33\1\34\27\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\27\33\1\35\2\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\36\23\33\1\37"+
            "\5\33",
            "\12\40",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\15\32\1\43\1\32"+
            "\12\42\uffc6\32",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\44\21\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\7\33\1\45\22\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\7\33\1\46\22\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\47\14\33",
            "\11\50\2\uffff\2\50\1\uffff\22\50\1\uffff\35\50\1\uffff\uffc1"+
            "\50",
            "\12\52\1\uffff\2\52\1\uffff\ufff2\52",
            "\11\55\1\56\1\uffff\2\55\1\uffff\22\55\1\56\1\55\1\53\71\55"+
            "\1\54\uffa3\55",
            "\11\61\1\56\1\uffff\2\61\1\uffff\22\61\1\56\6\61\1\57\64\61"+
            "\1\60\uffa3\61",
            "\11\62\2\uffff\2\62\1\uffff\22\62\1\uffff\uffdf\62",
            "\11\64\2\uffff\2\64\1\uffff\22\64\1\uffff\uffdf\64",
            "\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\67",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\70\31\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\71\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\72\31\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\2\33\1\73\27\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\74\6\33",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\15\32\1\43\1\32"+
            "\12\40\uffc6\32",
            "",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\15\32\1\43\1\32"+
            "\12\42\uffc6\32",
            "\12\75",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\25\33\1\76\4\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\77\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\100\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\3\33\1\101\26\33",
            "\11\50\2\uffff\2\50\1\uffff\22\50\1\uffff\35\50\1\102\uffc1"+
            "\50",
            "",
            "",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\1\32\1\103\uffdd"+
            "\32",
            "\1\104\4\uffff\1\104\64\uffff\1\104\5\uffff\1\104\3\uffff"+
            "\1\104\7\uffff\1\104\3\uffff\1\104\1\uffff\2\104",
            "\11\55\1\56\1\uffff\2\55\1\uffff\22\55\1\56\1\55\1\105\71"+
            "\55\1\54\uffa3\55",
            "",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\6\32\1\106\uffd8"+
            "\32",
            "\1\107\4\uffff\1\107\64\uffff\1\107\5\uffff\1\107\3\uffff"+
            "\1\107\7\uffff\1\107\3\uffff\1\107\1\uffff\2\107",
            "\11\61\1\56\1\uffff\2\61\1\uffff\22\61\1\56\6\61\1\110\64"+
            "\61\1\60\uffa3\61",
            "\11\62\2\uffff\2\62\1\uffff\22\62\1\uffff\uffdf\62",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\11\112\2\113\2\112\1\113\22\112\1\113\11\112\1\111\uffd5"+
            "\112",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\114\6\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\115\14\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\14\33\1\116\15\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\12\33\1\117\17\33",
            "\1\120\26\uffff\1\120\17\uffff\12\33\7\uffff\32\33\4\uffff"+
            "\1\33\1\uffff\32\33",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\17\32\12\75\uffc6"+
            "\32",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\121\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\122\14\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\123\14\33",
            "\1\120\26\uffff\1\120\17\uffff\12\33\7\uffff\32\33\4\uffff"+
            "\1\33\1\uffff\32\33",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\uffdf\32",
            "\11\126\2\127\2\126\1\127\22\126\1\127\1\126\1\125\uffdd\126",
            "\11\55\1\56\1\uffff\2\55\1\uffff\22\55\1\56\1\55\1\105\71"+
            "\55\1\54\uffa3\55",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\uffdf\32",
            "\11\131\2\127\2\131\1\127\22\131\1\127\6\131\1\130\uffd8\131",
            "\11\61\1\56\1\uffff\2\61\1\uffff\22\61\1\56\6\61\1\110\64"+
            "\61\1\60\uffa3\61",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\uffdf\32",
            "\11\112\2\113\2\112\1\113\22\112\1\113\11\112\1\111\4\112"+
            "\1\132\uffd0\112",
            "\11\112\2\113\2\112\1\113\22\112\1\113\11\112\1\111\uffd5"+
            "\112",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\24\33\1\133\5\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\1\134\31\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\17\33\1\135\12\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\6\33\1\136\23\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\137\14\33",
            "\1\120\26\uffff\1\120\17\uffff\12\33\7\uffff\32\33\4\uffff"+
            "\1\33\1\uffff\32\33",
            "\1\120\26\uffff\1\120\17\uffff\12\33\7\uffff\32\33\4\uffff"+
            "\1\33\1\uffff\32\33",
            "",
            "\11\126\2\127\2\126\1\127\22\126\1\127\1\126\1\140\uffdd\126",
            "\11\126\2\127\2\126\1\127\22\126\1\127\1\126\1\125\uffdd\126",
            "",
            "\11\131\2\127\2\131\1\127\22\131\1\127\6\131\1\141\uffd8\131",
            "\11\131\2\127\2\131\1\127\22\131\1\127\6\131\1\130\uffd8\131",
            "\11\112\2\113\2\112\1\113\22\112\1\113\11\112\1\111\uffd5"+
            "\112",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\142\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\143\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\144\16\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\145\10\33",
            "\1\120\26\uffff\1\120\17\uffff\12\33\7\uffff\32\33\4\uffff"+
            "\1\33\1\uffff\32\33",
            "\11\126\2\127\2\126\1\127\22\126\1\127\1\126\1\146\uffdd\126",
            "\11\131\2\127\2\131\1\127\22\131\1\127\6\131\1\147\uffd8\131",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\150\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\151\21\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\152\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\153\13\33",
            "\11\126\2\uffff\2\126\1\uffff\22\126\1\uffff\1\126\1\146\uffdd"+
            "\126",
            "\11\131\2\uffff\2\131\1\uffff\22\131\1\uffff\6\131\1\147\uffd8"+
            "\131",
            "\12\33\1\154\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\155\13\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\156\7\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\24\33\1\157\5\33",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\uffdf\32",
            "\1\162\17\uffff\12\33\1\161\6\uffff\32\33\4\uffff\1\33\1\uffff"+
            "\32\33",
            "\12\33\1\163\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\164\14\33",
            "",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\uffdf\32",
            "",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\uffdf\32",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\3\33\1\167\26\33",
            "",
            "",
            "\12\33\1\170\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\11\32\2\uffff\2\32\1\uffff\22\32\1\uffff\uffdf\32",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | RULE_NUMBER | RULE_STEP_KEYWORD | RULE_PLACEHOLDER | RULE_TABLE_ROW | RULE_DOC_STRING | RULE_STRING | RULE_SL_COMMENT | RULE_TAGNAME | RULE_WORD | RULE_WS | RULE_EOL | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_61 = input.LA(1);

                        s = -1;
                        if ( ((LA26_61>='0' && LA26_61<='9')) ) {s = 61;}

                        else if ( ((LA26_61>='\u0000' && LA26_61<='\b')||(LA26_61>='\u000B' && LA26_61<='\f')||(LA26_61>='\u000E' && LA26_61<='\u001F')||(LA26_61>='!' && LA26_61<='/')||(LA26_61>=':' && LA26_61<='\uFFFF')) ) {s = 26;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_120 = input.LA(1);

                        s = -1;
                        if ( ((LA26_120>='\u0000' && LA26_120<='\b')||(LA26_120>='\u000B' && LA26_120<='\f')||(LA26_120>='\u000E' && LA26_120<='\u001F')||(LA26_120>='!' && LA26_120<='\uFFFF')) ) {s = 26;}

                        else s = 121;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_115 = input.LA(1);

                        s = -1;
                        if ( ((LA26_115>='\u0000' && LA26_115<='\b')||(LA26_115>='\u000B' && LA26_115<='\f')||(LA26_115>='\u000E' && LA26_115<='\u001F')||(LA26_115>='!' && LA26_115<='\uFFFF')) ) {s = 26;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_55 = input.LA(1);

                        s = -1;
                        if ( (LA26_55=='*') ) {s = 73;}

                        else if ( ((LA26_55>='\u0000' && LA26_55<='\b')||(LA26_55>='\u000B' && LA26_55<='\f')||(LA26_55>='\u000E' && LA26_55<='\u001F')||(LA26_55>='!' && LA26_55<=')')||(LA26_55>='+' && LA26_55<='\uFFFF')) ) {s = 74;}

                        else if ( ((LA26_55>='\t' && LA26_55<='\n')||LA26_55=='\r'||LA26_55==' ') ) {s = 75;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_90 = input.LA(1);

                        s = -1;
                        if ( (LA26_90=='*') ) {s = 73;}

                        else if ( ((LA26_90>='\u0000' && LA26_90<='\b')||(LA26_90>='\u000B' && LA26_90<='\f')||(LA26_90>='\u000E' && LA26_90<='\u001F')||(LA26_90>='!' && LA26_90<=')')||(LA26_90>='+' && LA26_90<='\uFFFF')) ) {s = 74;}

                        else if ( ((LA26_90>='\t' && LA26_90<='\n')||LA26_90=='\r'||LA26_90==' ') ) {s = 75;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_14 = input.LA(1);

                        s = -1;
                        if ( (LA26_14=='\'') ) {s = 47;}

                        else if ( (LA26_14=='\\') ) {s = 48;}

                        else if ( ((LA26_14>='\u0000' && LA26_14<='\b')||(LA26_14>='\u000B' && LA26_14<='\f')||(LA26_14>='\u000E' && LA26_14<='\u001F')||(LA26_14>='!' && LA26_14<='&')||(LA26_14>='(' && LA26_14<='[')||(LA26_14>=']' && LA26_14<='\uFFFF')) ) {s = 49;}

                        else if ( (LA26_14=='\t'||LA26_14==' ') ) {s = 46;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_47 = input.LA(1);

                        s = -1;
                        if ( (LA26_47=='\'') ) {s = 70;}

                        else if ( ((LA26_47>='\u0000' && LA26_47<='\b')||(LA26_47>='\u000B' && LA26_47<='\f')||(LA26_47>='\u000E' && LA26_47<='\u001F')||(LA26_47>='!' && LA26_47<='&')||(LA26_47>='(' && LA26_47<='\uFFFF')) ) {s = 26;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_72 = input.LA(1);

                        s = -1;
                        if ( ((LA26_72>='\u0000' && LA26_72<='\b')||(LA26_72>='\u000B' && LA26_72<='\f')||(LA26_72>='\u000E' && LA26_72<='\u001F')||(LA26_72>='!' && LA26_72<='\uFFFF')) ) {s = 26;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_11 = input.LA(1);

                        s = -1;
                        if ( ((LA26_11>='\u0000' && LA26_11<='\b')||(LA26_11>='\u000B' && LA26_11<='\f')||(LA26_11>='\u000E' && LA26_11<='\u001F')||(LA26_11>='!' && LA26_11<='=')||(LA26_11>='?' && LA26_11<='\uFFFF')) ) {s = 40;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_68 = input.LA(1);

                        s = -1;
                        if ( (LA26_68=='\"') ) {s = 69;}

                        else if ( (LA26_68=='\\') ) {s = 44;}

                        else if ( ((LA26_68>='\u0000' && LA26_68<='\b')||(LA26_68>='\u000B' && LA26_68<='\f')||(LA26_68>='\u000E' && LA26_68<='\u001F')||LA26_68=='!'||(LA26_68>='#' && LA26_68<='[')||(LA26_68>=']' && LA26_68<='\uFFFF')) ) {s = 45;}

                        else if ( (LA26_68=='\t'||LA26_68==' ') ) {s = 46;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_69 = input.LA(1);

                        s = -1;
                        if ( ((LA26_69>='\u0000' && LA26_69<='\b')||(LA26_69>='\u000B' && LA26_69<='\f')||(LA26_69>='\u000E' && LA26_69<='\u001F')||(LA26_69>='!' && LA26_69<='\uFFFF')) ) {s = 26;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_45 = input.LA(1);

                        s = -1;
                        if ( (LA26_45=='\"') ) {s = 69;}

                        else if ( (LA26_45=='\\') ) {s = 44;}

                        else if ( ((LA26_45>='\u0000' && LA26_45<='\b')||(LA26_45>='\u000B' && LA26_45<='\f')||(LA26_45>='\u000E' && LA26_45<='\u001F')||LA26_45=='!'||(LA26_45>='#' && LA26_45<='[')||(LA26_45>=']' && LA26_45<='\uFFFF')) ) {s = 45;}

                        else if ( (LA26_45=='\t'||LA26_45==' ') ) {s = 46;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_113 = input.LA(1);

                        s = -1;
                        if ( ((LA26_113>='\u0000' && LA26_113<='\b')||(LA26_113>='\u000B' && LA26_113<='\f')||(LA26_113>='\u000E' && LA26_113<='\u001F')||(LA26_113>='!' && LA26_113<='\uFFFF')) ) {s = 26;}

                        else s = 117;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_43 = input.LA(1);

                        s = -1;
                        if ( (LA26_43=='\"') ) {s = 67;}

                        else if ( ((LA26_43>='\u0000' && LA26_43<='\b')||(LA26_43>='\u000B' && LA26_43<='\f')||(LA26_43>='\u000E' && LA26_43<='\u001F')||LA26_43=='!'||(LA26_43>='#' && LA26_43<='\uFFFF')) ) {s = 26;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA26_6 = input.LA(1);

                        s = -1;
                        if ( ((LA26_6>='0' && LA26_6<='9')) ) {s = 34;}

                        else if ( (LA26_6=='.') ) {s = 35;}

                        else if ( ((LA26_6>='\u0000' && LA26_6<='\b')||(LA26_6>='\u000B' && LA26_6<='\f')||(LA26_6>='\u000E' && LA26_6<='\u001F')||(LA26_6>='!' && LA26_6<='-')||LA26_6=='/'||(LA26_6>=':' && LA26_6<='\uFFFF')) ) {s = 26;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA26_88 = input.LA(1);

                        s = -1;
                        if ( (LA26_88=='\'') ) {s = 97;}

                        else if ( ((LA26_88>='\u0000' && LA26_88<='\b')||(LA26_88>='\u000B' && LA26_88<='\f')||(LA26_88>='\u000E' && LA26_88<='\u001F')||(LA26_88>='!' && LA26_88<='&')||(LA26_88>='(' && LA26_88<='\uFFFF')) ) {s = 89;}

                        else if ( ((LA26_88>='\t' && LA26_88<='\n')||LA26_88=='\r'||LA26_88==' ') ) {s = 87;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='F') ) {s = 1;}

                        else if ( (LA26_0=='S') ) {s = 2;}

                        else if ( (LA26_0=='E') ) {s = 3;}

                        else if ( (LA26_0=='B') ) {s = 4;}

                        else if ( (LA26_0=='-') ) {s = 5;}

                        else if ( ((LA26_0>='0' && LA26_0<='9')) ) {s = 6;}

                        else if ( (LA26_0=='G') ) {s = 7;}

                        else if ( (LA26_0=='W') ) {s = 8;}

                        else if ( (LA26_0=='T') ) {s = 9;}

                        else if ( (LA26_0=='A') ) {s = 10;}

                        else if ( (LA26_0=='<') ) {s = 11;}

                        else if ( (LA26_0=='|') ) {s = 12;}

                        else if ( (LA26_0=='\"') ) {s = 13;}

                        else if ( (LA26_0=='\'') ) {s = 14;}

                        else if ( (LA26_0=='#') ) {s = 15;}

                        else if ( (LA26_0=='@') ) {s = 16;}

                        else if ( (LA26_0=='^') ) {s = 17;}

                        else if ( (LA26_0=='\t'||LA26_0==' ') ) {s = 18;}

                        else if ( (LA26_0=='\r') ) {s = 19;}

                        else if ( (LA26_0=='\n') ) {s = 20;}

                        else if ( ((LA26_0>='C' && LA26_0<='D')||(LA26_0>='H' && LA26_0<='R')||(LA26_0>='U' && LA26_0<='V')||(LA26_0>='X' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {s = 22;}

                        else if ( (LA26_0=='/') ) {s = 23;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='!'||(LA26_0>='$' && LA26_0<='&')||(LA26_0>='(' && LA26_0<=',')||LA26_0=='.'||(LA26_0>=':' && LA26_0<=';')||(LA26_0>='=' && LA26_0<='?')||(LA26_0>='[' && LA26_0<=']')||LA26_0=='`'||LA26_0=='{'||(LA26_0>='}' && LA26_0<='\uFFFF')) ) {s = 24;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA26_12 = input.LA(1);

                        s = -1;
                        if ( ((LA26_12>='\u0000' && LA26_12<='\t')||(LA26_12>='\u000B' && LA26_12<='\f')||(LA26_12>='\u000E' && LA26_12<='\uFFFF')) ) {s = 42;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA26_15 = input.LA(1);

                        s = -1;
                        if ( ((LA26_15>='\u0000' && LA26_15<='\b')||(LA26_15>='\u000B' && LA26_15<='\f')||(LA26_15>='\u000E' && LA26_15<='\u001F')||(LA26_15>='!' && LA26_15<='\uFFFF')) ) {s = 50;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA26_40 = input.LA(1);

                        s = -1;
                        if ( (LA26_40=='>') ) {s = 66;}

                        else if ( ((LA26_40>='\u0000' && LA26_40<='\b')||(LA26_40>='\u000B' && LA26_40<='\f')||(LA26_40>='\u000E' && LA26_40<='\u001F')||(LA26_40>='!' && LA26_40<='=')||(LA26_40>='?' && LA26_40<='\uFFFF')) ) {s = 40;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA26_97 = input.LA(1);

                        s = -1;
                        if ( (LA26_97=='\'') ) {s = 103;}

                        else if ( ((LA26_97>='\u0000' && LA26_97<='\b')||(LA26_97>='\u000B' && LA26_97<='\f')||(LA26_97>='\u000E' && LA26_97<='\u001F')||(LA26_97>='!' && LA26_97<='&')||(LA26_97>='(' && LA26_97<='\uFFFF')) ) {s = 89;}

                        else if ( ((LA26_97>='\t' && LA26_97<='\n')||LA26_97=='\r'||LA26_97==' ') ) {s = 87;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA26_89 = input.LA(1);

                        s = -1;
                        if ( (LA26_89=='\'') ) {s = 88;}

                        else if ( ((LA26_89>='\u0000' && LA26_89<='\b')||(LA26_89>='\u000B' && LA26_89<='\f')||(LA26_89>='\u000E' && LA26_89<='\u001F')||(LA26_89>='!' && LA26_89<='&')||(LA26_89>='(' && LA26_89<='\uFFFF')) ) {s = 89;}

                        else if ( ((LA26_89>='\t' && LA26_89<='\n')||LA26_89=='\r'||LA26_89==' ') ) {s = 87;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA26_32 = input.LA(1);

                        s = -1;
                        if ( (LA26_32=='.') ) {s = 35;}

                        else if ( ((LA26_32>='0' && LA26_32<='9')) ) {s = 32;}

                        else if ( ((LA26_32>='\u0000' && LA26_32<='\b')||(LA26_32>='\u000B' && LA26_32<='\f')||(LA26_32>='\u000E' && LA26_32<='\u001F')||(LA26_32>='!' && LA26_32<='-')||LA26_32=='/'||(LA26_32>=':' && LA26_32<='\uFFFF')) ) {s = 26;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA26_102 = input.LA(1);

                        s = -1;
                        if ( (LA26_102=='\"') ) {s = 102;}

                        else if ( ((LA26_102>='\u0000' && LA26_102<='\b')||(LA26_102>='\u000B' && LA26_102<='\f')||(LA26_102>='\u000E' && LA26_102<='\u001F')||LA26_102=='!'||(LA26_102>='#' && LA26_102<='\uFFFF')) ) {s = 86;}

                        else s = 87;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA26_49 = input.LA(1);

                        s = -1;
                        if ( (LA26_49=='\'') ) {s = 72;}

                        else if ( (LA26_49=='\\') ) {s = 48;}

                        else if ( ((LA26_49>='\u0000' && LA26_49<='\b')||(LA26_49>='\u000B' && LA26_49<='\f')||(LA26_49>='\u000E' && LA26_49<='\u001F')||(LA26_49>='!' && LA26_49<='&')||(LA26_49>='(' && LA26_49<='[')||(LA26_49>=']' && LA26_49<='\uFFFF')) ) {s = 49;}

                        else if ( (LA26_49=='\t'||LA26_49==' ') ) {s = 46;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA26_85 = input.LA(1);

                        s = -1;
                        if ( (LA26_85=='\"') ) {s = 96;}

                        else if ( ((LA26_85>='\u0000' && LA26_85<='\b')||(LA26_85>='\u000B' && LA26_85<='\f')||(LA26_85>='\u000E' && LA26_85<='\u001F')||LA26_85=='!'||(LA26_85>='#' && LA26_85<='\uFFFF')) ) {s = 86;}

                        else if ( ((LA26_85>='\t' && LA26_85<='\n')||LA26_85=='\r'||LA26_85==' ') ) {s = 87;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA26_70 = input.LA(1);

                        s = -1;
                        if ( (LA26_70=='\'') ) {s = 88;}

                        else if ( ((LA26_70>='\u0000' && LA26_70<='\b')||(LA26_70>='\u000B' && LA26_70<='\f')||(LA26_70>='\u000E' && LA26_70<='\u001F')||(LA26_70>='!' && LA26_70<='&')||(LA26_70>='(' && LA26_70<='\uFFFF')) ) {s = 89;}

                        else if ( ((LA26_70>='\t' && LA26_70<='\n')||LA26_70=='\r'||LA26_70==' ') ) {s = 87;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA26_34 = input.LA(1);

                        s = -1;
                        if ( ((LA26_34>='0' && LA26_34<='9')) ) {s = 34;}

                        else if ( (LA26_34=='.') ) {s = 35;}

                        else if ( ((LA26_34>='\u0000' && LA26_34<='\b')||(LA26_34>='\u000B' && LA26_34<='\f')||(LA26_34>='\u000E' && LA26_34<='\u001F')||(LA26_34>='!' && LA26_34<='-')||LA26_34=='/'||(LA26_34>=':' && LA26_34<='\uFFFF')) ) {s = 26;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA26_71 = input.LA(1);

                        s = -1;
                        if ( (LA26_71=='\'') ) {s = 72;}

                        else if ( (LA26_71=='\\') ) {s = 48;}

                        else if ( ((LA26_71>='\u0000' && LA26_71<='\b')||(LA26_71>='\u000B' && LA26_71<='\f')||(LA26_71>='\u000E' && LA26_71<='\u001F')||(LA26_71>='!' && LA26_71<='&')||(LA26_71>='(' && LA26_71<='[')||(LA26_71>=']' && LA26_71<='\uFFFF')) ) {s = 49;}

                        else if ( (LA26_71=='\t'||LA26_71==' ') ) {s = 46;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA26_13 = input.LA(1);

                        s = -1;
                        if ( (LA26_13=='\"') ) {s = 43;}

                        else if ( (LA26_13=='\\') ) {s = 44;}

                        else if ( ((LA26_13>='\u0000' && LA26_13<='\b')||(LA26_13>='\u000B' && LA26_13<='\f')||(LA26_13>='\u000E' && LA26_13<='\u001F')||LA26_13=='!'||(LA26_13>='#' && LA26_13<='[')||(LA26_13>=']' && LA26_13<='\uFFFF')) ) {s = 45;}

                        else if ( (LA26_13=='\t'||LA26_13==' ') ) {s = 46;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA26_108 = input.LA(1);

                        s = -1;
                        if ( ((LA26_108>='\u0000' && LA26_108<='\b')||(LA26_108>='\u000B' && LA26_108<='\f')||(LA26_108>='\u000E' && LA26_108<='\u001F')||(LA26_108>='!' && LA26_108<='\uFFFF')) ) {s = 26;}

                        else s = 112;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA26_16 = input.LA(1);

                        s = -1;
                        if ( ((LA26_16>='\u0000' && LA26_16<='\b')||(LA26_16>='\u000B' && LA26_16<='\f')||(LA26_16>='\u000E' && LA26_16<='\u001F')||(LA26_16>='!' && LA26_16<='\uFFFF')) ) {s = 52;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA26_86 = input.LA(1);

                        s = -1;
                        if ( (LA26_86=='\"') ) {s = 85;}

                        else if ( ((LA26_86>='\u0000' && LA26_86<='\b')||(LA26_86>='\u000B' && LA26_86<='\f')||(LA26_86>='\u000E' && LA26_86<='\u001F')||LA26_86=='!'||(LA26_86>='#' && LA26_86<='\uFFFF')) ) {s = 86;}

                        else if ( ((LA26_86>='\t' && LA26_86<='\n')||LA26_86=='\r'||LA26_86==' ') ) {s = 87;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA26_73 = input.LA(1);

                        s = -1;
                        if ( (LA26_73=='/') ) {s = 90;}

                        else if ( (LA26_73=='*') ) {s = 73;}

                        else if ( ((LA26_73>='\u0000' && LA26_73<='\b')||(LA26_73>='\u000B' && LA26_73<='\f')||(LA26_73>='\u000E' && LA26_73<='\u001F')||(LA26_73>='!' && LA26_73<=')')||(LA26_73>='+' && LA26_73<='.')||(LA26_73>='0' && LA26_73<='\uFFFF')) ) {s = 74;}

                        else if ( ((LA26_73>='\t' && LA26_73<='\n')||LA26_73=='\r'||LA26_73==' ') ) {s = 75;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA26_96 = input.LA(1);

                        s = -1;
                        if ( (LA26_96=='\"') ) {s = 102;}

                        else if ( ((LA26_96>='\u0000' && LA26_96<='\b')||(LA26_96>='\u000B' && LA26_96<='\f')||(LA26_96>='\u000E' && LA26_96<='\u001F')||LA26_96=='!'||(LA26_96>='#' && LA26_96<='\uFFFF')) ) {s = 86;}

                        else if ( ((LA26_96>='\t' && LA26_96<='\n')||LA26_96=='\r'||LA26_96==' ') ) {s = 87;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA26_103 = input.LA(1);

                        s = -1;
                        if ( (LA26_103=='\'') ) {s = 103;}

                        else if ( ((LA26_103>='\u0000' && LA26_103<='\b')||(LA26_103>='\u000B' && LA26_103<='\f')||(LA26_103>='\u000E' && LA26_103<='\u001F')||(LA26_103>='!' && LA26_103<='&')||(LA26_103>='(' && LA26_103<='\uFFFF')) ) {s = 89;}

                        else s = 87;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA26_67 = input.LA(1);

                        s = -1;
                        if ( (LA26_67=='\"') ) {s = 85;}

                        else if ( ((LA26_67>='\u0000' && LA26_67<='\b')||(LA26_67>='\u000B' && LA26_67<='\f')||(LA26_67>='\u000E' && LA26_67<='\u001F')||LA26_67=='!'||(LA26_67>='#' && LA26_67<='\uFFFF')) ) {s = 86;}

                        else if ( ((LA26_67>='\t' && LA26_67<='\n')||LA26_67=='\r'||LA26_67==' ') ) {s = 87;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA26_74 = input.LA(1);

                        s = -1;
                        if ( (LA26_74=='*') ) {s = 73;}

                        else if ( ((LA26_74>='\u0000' && LA26_74<='\b')||(LA26_74>='\u000B' && LA26_74<='\f')||(LA26_74>='\u000E' && LA26_74<='\u001F')||(LA26_74>='!' && LA26_74<=')')||(LA26_74>='+' && LA26_74<='\uFFFF')) ) {s = 74;}

                        else if ( ((LA26_74>='\t' && LA26_74<='\n')||LA26_74=='\r'||LA26_74==' ') ) {s = 75;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA26_50 = input.LA(1);

                        s = -1;
                        if ( ((LA26_50>='\u0000' && LA26_50<='\b')||(LA26_50>='\u000B' && LA26_50<='\f')||(LA26_50>='\u000E' && LA26_50<='\u001F')||(LA26_50>='!' && LA26_50<='\uFFFF')) ) {s = 50;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA26_66 = input.LA(1);

                        s = -1;
                        if ( ((LA26_66>='\u0000' && LA26_66<='\b')||(LA26_66>='\u000B' && LA26_66<='\f')||(LA26_66>='\u000E' && LA26_66<='\u001F')||(LA26_66>='!' && LA26_66<='\uFFFF')) ) {s = 26;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}