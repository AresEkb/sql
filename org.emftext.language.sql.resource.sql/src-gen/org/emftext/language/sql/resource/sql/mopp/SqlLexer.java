// $ANTLR 3.4

	package org.emftext.language.sql.resource.sql.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int BOOLEAN_LITERAL=4;
    public static final int IDENTIFIER=5;
    public static final int KEYWORD_BOOLEAN=6;
    public static final int KEYWORD_CHARACTER=7;
    public static final int KEYWORD_COLLATE=8;
    public static final int KEYWORD_COMMIT=9;
    public static final int KEYWORD_CONSTRAINT=10;
    public static final int KEYWORD_CREATE=11;
    public static final int KEYWORD_DATE=12;
    public static final int KEYWORD_DEFAULT=13;
    public static final int KEYWORD_FOREIGN=14;
    public static final int KEYWORD_INTERVAL=15;
    public static final int KEYWORD_KEY=16;
    public static final int KEYWORD_NOT=17;
    public static final int KEYWORD_NULL=18;
    public static final int KEYWORD_ON=19;
    public static final int KEYWORD_REFERENCES=20;
    public static final int KEYWORD_ROWS=21;
    public static final int KEYWORD_SET=22;
    public static final int KEYWORD_TABLE=23;
    public static final int KEYWORD_TEMPORARY=24;
    public static final int KEYWORD_TIME=25;
    public static final int KEYWORD_TIMESTAMP=26;
    public static final int LETTER_A=27;
    public static final int LETTER_B=28;
    public static final int LETTER_C=29;
    public static final int LETTER_D=30;
    public static final int LETTER_E=31;
    public static final int LETTER_F=32;
    public static final int LETTER_G=33;
    public static final int LETTER_H=34;
    public static final int LETTER_I=35;
    public static final int LETTER_J=36;
    public static final int LETTER_K=37;
    public static final int LETTER_L=38;
    public static final int LETTER_M=39;
    public static final int LETTER_N=40;
    public static final int LETTER_O=41;
    public static final int LETTER_P=42;
    public static final int LETTER_Q=43;
    public static final int LETTER_R=44;
    public static final int LETTER_S=45;
    public static final int LETTER_T=46;
    public static final int LETTER_U=47;
    public static final int LETTER_V=48;
    public static final int LETTER_W=49;
    public static final int LETTER_X=50;
    public static final int LETTER_Y=51;
    public static final int LETTER_Z=52;
    public static final int LINEBREAK=53;
    public static final int SCHEMA_QUALIFIED_NAME=54;
    public static final int TEXT=55;
    public static final int UNSIGNED_INTEGER=56;
    public static final int WHITESPACE=57;

    	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
    	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
    	
    	public void reportError(RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SqlLexer() {} 
    public SqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Sql.g"; }

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:20:7: ( '(' )
            // Sql.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:21:7: ( ')' )
            // Sql.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:22:7: ( '+' )
            // Sql.g:22:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:23:7: ( ',' )
            // Sql.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:24:7: ( '-' )
            // Sql.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:25:7: ( ';' )
            // Sql.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:26:7: ( 'BIGINT' )
            // Sql.g:26:9: 'BIGINT'
            {
            match("BIGINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:27:7: ( 'BINARY LARGE OBJECT' )
            // Sql.g:27:9: 'BINARY LARGE OBJECT'
            {
            match("BINARY LARGE OBJECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:28:7: ( 'BLOB' )
            // Sql.g:28:9: 'BLOB'
            {
            match("BLOB"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:29:7: ( 'CHAR VARYING' )
            // Sql.g:29:9: 'CHAR VARYING'
            {
            match("CHAR VARYING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:30:7: ( 'CHAR' )
            // Sql.g:30:9: 'CHAR'
            {
            match("CHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:31:7: ( 'CHARACTER VARYING' )
            // Sql.g:31:9: 'CHARACTER VARYING'
            {
            match("CHARACTER VARYING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:32:7: ( 'CHARACTER' )
            // Sql.g:32:9: 'CHARACTER'
            {
            match("CHARACTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:33:7: ( 'CHARACTERS' )
            // Sql.g:33:9: 'CHARACTERS'
            {
            match("CHARACTERS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:34:7: ( 'CODE_UNITS' )
            // Sql.g:34:9: 'CODE_UNITS'
            {
            match("CODE_UNITS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:35:7: ( 'CURRENT_DATE' )
            // Sql.g:35:9: 'CURRENT_DATE'
            {
            match("CURRENT_DATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:36:7: ( 'CURRENT_TIME' )
            // Sql.g:36:9: 'CURRENT_TIME'
            {
            match("CURRENT_TIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:37:7: ( 'CURRENT_TIMESTAMP' )
            // Sql.g:37:9: 'CURRENT_TIMESTAMP'
            {
            match("CURRENT_TIMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:38:7: ( 'DATE' )
            // Sql.g:38:9: 'DATE'
            {
            match("DATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:39:7: ( 'DEC' )
            // Sql.g:39:9: 'DEC'
            {
            match("DEC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:40:7: ( 'DECIMAL' )
            // Sql.g:40:9: 'DECIMAL'
            {
            match("DECIMAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:41:7: ( 'DELETE' )
            // Sql.g:41:9: 'DELETE'
            {
            match("DELETE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:42:7: ( 'DOUBLE_PRECISION' )
            // Sql.g:42:9: 'DOUBLE_PRECISION'
            {
            match("DOUBLE_PRECISION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:43:7: ( 'FALSE' )
            // Sql.g:43:9: 'FALSE'
            {
            match("FALSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:44:7: ( 'FLOAT' )
            // Sql.g:44:9: 'FLOAT'
            {
            match("FLOAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:45:7: ( 'G' )
            // Sql.g:45:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:46:7: ( 'GLOBAL' )
            // Sql.g:46:9: 'GLOBAL'
            {
            match("GLOBAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:47:7: ( 'INT' )
            // Sql.g:47:9: 'INT'
            {
            match("INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:48:7: ( 'INTEGER' )
            // Sql.g:48:9: 'INTEGER'
            {
            match("INTEGER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:49:7: ( 'K' )
            // Sql.g:49:9: 'K'
            {
            match('K'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:50:7: ( 'LOCAL' )
            // Sql.g:50:9: 'LOCAL'
            {
            match("LOCAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:51:7: ( 'LOCALTIME' )
            // Sql.g:51:9: 'LOCALTIME'
            {
            match("LOCALTIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:52:7: ( 'LOCALTIMESTAMP' )
            // Sql.g:52:9: 'LOCALTIMESTAMP'
            {
            match("LOCALTIMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:53:7: ( 'M' )
            // Sql.g:53:9: 'M'
            {
            match('M'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:54:7: ( 'NATIONAL CHAR VARYING' )
            // Sql.g:54:9: 'NATIONAL CHAR VARYING'
            {
            match("NATIONAL CHAR VARYING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:55:7: ( 'NATIONAL CHAR' )
            // Sql.g:55:9: 'NATIONAL CHAR'
            {
            match("NATIONAL CHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:56:7: ( 'NATIONAL CHARACTER VARYING' )
            // Sql.g:56:9: 'NATIONAL CHARACTER VARYING'
            {
            match("NATIONAL CHARACTER VARYING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:57:7: ( 'NATIONAL CHARACTER' )
            // Sql.g:57:9: 'NATIONAL CHARACTER'
            {
            match("NATIONAL CHARACTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:58:7: ( 'NCHAR VARYING' )
            // Sql.g:58:9: 'NCHAR VARYING'
            {
            match("NCHAR VARYING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:59:7: ( 'NCHAR' )
            // Sql.g:59:9: 'NCHAR'
            {
            match("NCHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:60:7: ( 'NUMERIC' )
            // Sql.g:60:9: 'NUMERIC'
            {
            match("NUMERIC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:61:7: ( 'OCTETS' )
            // Sql.g:61:9: 'OCTETS'
            {
            match("OCTETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:62:8: ( 'PRESERVE' )
            // Sql.g:62:10: 'PRESERVE'
            {
            match("PRESERVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:63:8: ( 'PRIMARY KEY' )
            // Sql.g:63:10: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:64:8: ( 'REAL' )
            // Sql.g:64:10: 'REAL'
            {
            match("REAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:65:8: ( 'SMALLINT' )
            // Sql.g:65:10: 'SMALLINT'
            {
            match("SMALLINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:66:8: ( 'TIME' )
            // Sql.g:66:10: 'TIME'
            {
            match("TIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:67:8: ( 'TIMESTAMP' )
            // Sql.g:67:10: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:68:8: ( 'TRUE' )
            // Sql.g:68:10: 'TRUE'
            {
            match("TRUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:69:8: ( 'UNIQUE' )
            // Sql.g:69:10: 'UNIQUE'
            {
            match("UNIQUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:70:8: ( 'VARCHAR' )
            // Sql.g:70:10: 'VARCHAR'
            {
            match("VARCHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:71:8: ( 'WITH TIME ZONE' )
            // Sql.g:71:10: 'WITH TIME ZONE'
            {
            match("WITH TIME ZONE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:72:8: ( 'WITHOUT TIME ZONE' )
            // Sql.g:72:10: 'WITHOUT TIME ZONE'
            {
            match("WITHOUT TIME ZONE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "LETTER_A"
    public final void mLETTER_A() throws RecognitionException {
        try {
            // Sql.g:4780:18: ( ( 'a' | 'A' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_A"

    // $ANTLR start "LETTER_B"
    public final void mLETTER_B() throws RecognitionException {
        try {
            // Sql.g:4781:18: ( ( 'b' | 'B' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_B"

    // $ANTLR start "LETTER_C"
    public final void mLETTER_C() throws RecognitionException {
        try {
            // Sql.g:4782:18: ( ( 'c' | 'C' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_C"

    // $ANTLR start "LETTER_D"
    public final void mLETTER_D() throws RecognitionException {
        try {
            // Sql.g:4783:18: ( ( 'd' | 'D' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_D"

    // $ANTLR start "LETTER_E"
    public final void mLETTER_E() throws RecognitionException {
        try {
            // Sql.g:4784:18: ( ( 'e' | 'E' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_E"

    // $ANTLR start "LETTER_F"
    public final void mLETTER_F() throws RecognitionException {
        try {
            // Sql.g:4785:18: ( ( 'f' | 'F' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_F"

    // $ANTLR start "LETTER_G"
    public final void mLETTER_G() throws RecognitionException {
        try {
            // Sql.g:4786:18: ( ( 'g' | 'G' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_G"

    // $ANTLR start "LETTER_H"
    public final void mLETTER_H() throws RecognitionException {
        try {
            // Sql.g:4787:18: ( ( 'h' | 'H' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_H"

    // $ANTLR start "LETTER_I"
    public final void mLETTER_I() throws RecognitionException {
        try {
            // Sql.g:4788:18: ( ( 'i' | 'I' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_I"

    // $ANTLR start "LETTER_J"
    public final void mLETTER_J() throws RecognitionException {
        try {
            // Sql.g:4789:18: ( ( 'j' | 'J' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_J"

    // $ANTLR start "LETTER_K"
    public final void mLETTER_K() throws RecognitionException {
        try {
            // Sql.g:4790:18: ( ( 'k' | 'K' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_K"

    // $ANTLR start "LETTER_L"
    public final void mLETTER_L() throws RecognitionException {
        try {
            // Sql.g:4791:18: ( ( 'l' | 'L' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_L"

    // $ANTLR start "LETTER_M"
    public final void mLETTER_M() throws RecognitionException {
        try {
            // Sql.g:4792:18: ( ( 'm' | 'M' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_M"

    // $ANTLR start "LETTER_N"
    public final void mLETTER_N() throws RecognitionException {
        try {
            // Sql.g:4793:18: ( ( 'n' | 'N' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_N"

    // $ANTLR start "LETTER_O"
    public final void mLETTER_O() throws RecognitionException {
        try {
            // Sql.g:4794:18: ( ( 'o' | 'O' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_O"

    // $ANTLR start "LETTER_P"
    public final void mLETTER_P() throws RecognitionException {
        try {
            // Sql.g:4795:18: ( ( 'p' | 'P' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_P"

    // $ANTLR start "LETTER_Q"
    public final void mLETTER_Q() throws RecognitionException {
        try {
            // Sql.g:4796:18: ( ( 'q' | 'Q' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_Q"

    // $ANTLR start "LETTER_R"
    public final void mLETTER_R() throws RecognitionException {
        try {
            // Sql.g:4797:18: ( ( 'r' | 'R' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_R"

    // $ANTLR start "LETTER_S"
    public final void mLETTER_S() throws RecognitionException {
        try {
            // Sql.g:4798:18: ( ( 's' | 'S' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_S"

    // $ANTLR start "LETTER_T"
    public final void mLETTER_T() throws RecognitionException {
        try {
            // Sql.g:4799:18: ( ( 't' | 'T' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_T"

    // $ANTLR start "LETTER_U"
    public final void mLETTER_U() throws RecognitionException {
        try {
            // Sql.g:4800:18: ( ( 'u' | 'U' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_U"

    // $ANTLR start "LETTER_V"
    public final void mLETTER_V() throws RecognitionException {
        try {
            // Sql.g:4801:18: ( ( 'v' | 'V' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_V"

    // $ANTLR start "LETTER_W"
    public final void mLETTER_W() throws RecognitionException {
        try {
            // Sql.g:4802:18: ( ( 'w' | 'W' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_W"

    // $ANTLR start "LETTER_X"
    public final void mLETTER_X() throws RecognitionException {
        try {
            // Sql.g:4803:18: ( ( 'x' | 'X' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_X"

    // $ANTLR start "LETTER_Y"
    public final void mLETTER_Y() throws RecognitionException {
        try {
            // Sql.g:4804:18: ( ( 'y' | 'Y' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_Y"

    // $ANTLR start "LETTER_Z"
    public final void mLETTER_Z() throws RecognitionException {
        try {
            // Sql.g:4805:18: ( ( 'z' | 'Z' ) )
            // Sql.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER_Z"

    // $ANTLR start "KEYWORD_CREATE"
    public final void mKEYWORD_CREATE() throws RecognitionException {
        try {
            int _type = KEYWORD_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4807:15: ( ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:4807:17: ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:4807:17: ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E )
            // Sql.g:4807:18: LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E
            {
            mLETTER_C(); 


            mLETTER_R(); 


            mLETTER_E(); 


            mLETTER_A(); 


            mLETTER_T(); 


            mLETTER_E(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_CREATE"

    // $ANTLR start "KEYWORD_TEMPORARY"
    public final void mKEYWORD_TEMPORARY() throws RecognitionException {
        try {
            int _type = KEYWORD_TEMPORARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4809:18: ( ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y ) )
            // Sql.g:4809:20: ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y )
            {
            // Sql.g:4809:20: ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y )
            // Sql.g:4809:21: LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y
            {
            mLETTER_T(); 


            mLETTER_E(); 


            mLETTER_M(); 


            mLETTER_P(); 


            mLETTER_O(); 


            mLETTER_R(); 


            mLETTER_A(); 


            mLETTER_R(); 


            mLETTER_Y(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_TEMPORARY"

    // $ANTLR start "KEYWORD_TABLE"
    public final void mKEYWORD_TABLE() throws RecognitionException {
        try {
            int _type = KEYWORD_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4811:14: ( ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E ) )
            // Sql.g:4811:16: ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E )
            {
            // Sql.g:4811:16: ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E )
            // Sql.g:4811:17: LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E
            {
            mLETTER_T(); 


            mLETTER_A(); 


            mLETTER_B(); 


            mLETTER_L(); 


            mLETTER_E(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_TABLE"

    // $ANTLR start "KEYWORD_ON"
    public final void mKEYWORD_ON() throws RecognitionException {
        try {
            int _type = KEYWORD_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4813:11: ( ( LETTER_O LETTER_N ) )
            // Sql.g:4813:13: ( LETTER_O LETTER_N )
            {
            // Sql.g:4813:13: ( LETTER_O LETTER_N )
            // Sql.g:4813:14: LETTER_O LETTER_N
            {
            mLETTER_O(); 


            mLETTER_N(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_ON"

    // $ANTLR start "KEYWORD_COMMIT"
    public final void mKEYWORD_COMMIT() throws RecognitionException {
        try {
            int _type = KEYWORD_COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4815:15: ( ( LETTER_C LETTER_O LETTER_M LETTER_M LETTER_I LETTER_T ) )
            // Sql.g:4815:17: ( LETTER_C LETTER_O LETTER_M LETTER_M LETTER_I LETTER_T )
            {
            // Sql.g:4815:17: ( LETTER_C LETTER_O LETTER_M LETTER_M LETTER_I LETTER_T )
            // Sql.g:4815:18: LETTER_C LETTER_O LETTER_M LETTER_M LETTER_I LETTER_T
            {
            mLETTER_C(); 


            mLETTER_O(); 


            mLETTER_M(); 


            mLETTER_M(); 


            mLETTER_I(); 


            mLETTER_T(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_COMMIT"

    // $ANTLR start "KEYWORD_ROWS"
    public final void mKEYWORD_ROWS() throws RecognitionException {
        try {
            int _type = KEYWORD_ROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4817:13: ( ( LETTER_R LETTER_O LETTER_W LETTER_S ) )
            // Sql.g:4817:15: ( LETTER_R LETTER_O LETTER_W LETTER_S )
            {
            // Sql.g:4817:15: ( LETTER_R LETTER_O LETTER_W LETTER_S )
            // Sql.g:4817:16: LETTER_R LETTER_O LETTER_W LETTER_S
            {
            mLETTER_R(); 


            mLETTER_O(); 


            mLETTER_W(); 


            mLETTER_S(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_ROWS"

    // $ANTLR start "KEYWORD_DEFAULT"
    public final void mKEYWORD_DEFAULT() throws RecognitionException {
        try {
            int _type = KEYWORD_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4819:16: ( ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T ) )
            // Sql.g:4819:18: ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T )
            {
            // Sql.g:4819:18: ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T )
            // Sql.g:4819:19: LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T
            {
            mLETTER_D(); 


            mLETTER_E(); 


            mLETTER_F(); 


            mLETTER_A(); 


            mLETTER_U(); 


            mLETTER_L(); 


            mLETTER_T(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_DEFAULT"

    // $ANTLR start "KEYWORD_COLLATE"
    public final void mKEYWORD_COLLATE() throws RecognitionException {
        try {
            int _type = KEYWORD_COLLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4821:16: ( ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:4821:18: ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:4821:18: ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E )
            // Sql.g:4821:19: LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E
            {
            mLETTER_C(); 


            mLETTER_O(); 


            mLETTER_L(); 


            mLETTER_L(); 


            mLETTER_A(); 


            mLETTER_T(); 


            mLETTER_E(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_COLLATE"

    // $ANTLR start "KEYWORD_CONSTRAINT"
    public final void mKEYWORD_CONSTRAINT() throws RecognitionException {
        try {
            int _type = KEYWORD_CONSTRAINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4823:19: ( ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T ) )
            // Sql.g:4823:21: ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T )
            {
            // Sql.g:4823:21: ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T )
            // Sql.g:4823:22: LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T
            {
            mLETTER_C(); 


            mLETTER_O(); 


            mLETTER_N(); 


            mLETTER_S(); 


            mLETTER_T(); 


            mLETTER_R(); 


            mLETTER_A(); 


            mLETTER_I(); 


            mLETTER_N(); 


            mLETTER_T(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_CONSTRAINT"

    // $ANTLR start "KEYWORD_NOT"
    public final void mKEYWORD_NOT() throws RecognitionException {
        try {
            int _type = KEYWORD_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4825:12: ( ( LETTER_N LETTER_O LETTER_T ) )
            // Sql.g:4825:14: ( LETTER_N LETTER_O LETTER_T )
            {
            // Sql.g:4825:14: ( LETTER_N LETTER_O LETTER_T )
            // Sql.g:4825:15: LETTER_N LETTER_O LETTER_T
            {
            mLETTER_N(); 


            mLETTER_O(); 


            mLETTER_T(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_NOT"

    // $ANTLR start "KEYWORD_NULL"
    public final void mKEYWORD_NULL() throws RecognitionException {
        try {
            int _type = KEYWORD_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4827:13: ( ( LETTER_N LETTER_U LETTER_L LETTER_L ) )
            // Sql.g:4827:15: ( LETTER_N LETTER_U LETTER_L LETTER_L )
            {
            // Sql.g:4827:15: ( LETTER_N LETTER_U LETTER_L LETTER_L )
            // Sql.g:4827:16: LETTER_N LETTER_U LETTER_L LETTER_L
            {
            mLETTER_N(); 


            mLETTER_U(); 


            mLETTER_L(); 


            mLETTER_L(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_NULL"

    // $ANTLR start "KEYWORD_REFERENCES"
    public final void mKEYWORD_REFERENCES() throws RecognitionException {
        try {
            int _type = KEYWORD_REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4829:19: ( ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S ) )
            // Sql.g:4829:21: ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S )
            {
            // Sql.g:4829:21: ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S )
            // Sql.g:4829:22: LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S
            {
            mLETTER_R(); 


            mLETTER_E(); 


            mLETTER_F(); 


            mLETTER_E(); 


            mLETTER_R(); 


            mLETTER_E(); 


            mLETTER_N(); 


            mLETTER_C(); 


            mLETTER_E(); 


            mLETTER_S(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_REFERENCES"

    // $ANTLR start "KEYWORD_FOREIGN"
    public final void mKEYWORD_FOREIGN() throws RecognitionException {
        try {
            int _type = KEYWORD_FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4831:16: ( ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N ) )
            // Sql.g:4831:18: ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N )
            {
            // Sql.g:4831:18: ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N )
            // Sql.g:4831:19: LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N
            {
            mLETTER_F(); 


            mLETTER_O(); 


            mLETTER_R(); 


            mLETTER_E(); 


            mLETTER_I(); 


            mLETTER_G(); 


            mLETTER_N(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_FOREIGN"

    // $ANTLR start "KEYWORD_KEY"
    public final void mKEYWORD_KEY() throws RecognitionException {
        try {
            int _type = KEYWORD_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4833:12: ( ( LETTER_K LETTER_E LETTER_Y ) )
            // Sql.g:4833:14: ( LETTER_K LETTER_E LETTER_Y )
            {
            // Sql.g:4833:14: ( LETTER_K LETTER_E LETTER_Y )
            // Sql.g:4833:15: LETTER_K LETTER_E LETTER_Y
            {
            mLETTER_K(); 


            mLETTER_E(); 


            mLETTER_Y(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_KEY"

    // $ANTLR start "KEYWORD_DATE"
    public final void mKEYWORD_DATE() throws RecognitionException {
        try {
            int _type = KEYWORD_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4835:13: ( ( LETTER_D LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:4835:15: ( LETTER_D LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:4835:15: ( LETTER_D LETTER_A LETTER_T LETTER_E )
            // Sql.g:4835:16: LETTER_D LETTER_A LETTER_T LETTER_E
            {
            mLETTER_D(); 


            mLETTER_A(); 


            mLETTER_T(); 


            mLETTER_E(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_DATE"

    // $ANTLR start "KEYWORD_TIME"
    public final void mKEYWORD_TIME() throws RecognitionException {
        try {
            int _type = KEYWORD_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4837:13: ( ( LETTER_T LETTER_I LETTER_M LETTER_E ) )
            // Sql.g:4837:15: ( LETTER_T LETTER_I LETTER_M LETTER_E )
            {
            // Sql.g:4837:15: ( LETTER_T LETTER_I LETTER_M LETTER_E )
            // Sql.g:4837:16: LETTER_T LETTER_I LETTER_M LETTER_E
            {
            mLETTER_T(); 


            mLETTER_I(); 


            mLETTER_M(); 


            mLETTER_E(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_TIME"

    // $ANTLR start "KEYWORD_TIMESTAMP"
    public final void mKEYWORD_TIMESTAMP() throws RecognitionException {
        try {
            int _type = KEYWORD_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4839:18: ( ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P ) )
            // Sql.g:4839:20: ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P )
            {
            // Sql.g:4839:20: ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P )
            // Sql.g:4839:21: LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P
            {
            mLETTER_T(); 


            mLETTER_I(); 


            mLETTER_M(); 


            mLETTER_E(); 


            mLETTER_S(); 


            mLETTER_T(); 


            mLETTER_A(); 


            mLETTER_M(); 


            mLETTER_P(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_TIMESTAMP"

    // $ANTLR start "KEYWORD_INTERVAL"
    public final void mKEYWORD_INTERVAL() throws RecognitionException {
        try {
            int _type = KEYWORD_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4841:17: ( ( LETTER_I LETTER_N LETTER_T LETTER_E LETTER_R LETTER_V LETTER_A LETTER_L ) )
            // Sql.g:4841:19: ( LETTER_I LETTER_N LETTER_T LETTER_E LETTER_R LETTER_V LETTER_A LETTER_L )
            {
            // Sql.g:4841:19: ( LETTER_I LETTER_N LETTER_T LETTER_E LETTER_R LETTER_V LETTER_A LETTER_L )
            // Sql.g:4841:20: LETTER_I LETTER_N LETTER_T LETTER_E LETTER_R LETTER_V LETTER_A LETTER_L
            {
            mLETTER_I(); 


            mLETTER_N(); 


            mLETTER_T(); 


            mLETTER_E(); 


            mLETTER_R(); 


            mLETTER_V(); 


            mLETTER_A(); 


            mLETTER_L(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_INTERVAL"

    // $ANTLR start "KEYWORD_CHARACTER"
    public final void mKEYWORD_CHARACTER() throws RecognitionException {
        try {
            int _type = KEYWORD_CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4843:18: ( ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R ) )
            // Sql.g:4843:20: ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R )
            {
            // Sql.g:4843:20: ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R )
            // Sql.g:4843:21: LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R
            {
            mLETTER_C(); 


            mLETTER_H(); 


            mLETTER_A(); 


            mLETTER_R(); 


            mLETTER_A(); 


            mLETTER_C(); 


            mLETTER_T(); 


            mLETTER_E(); 


            mLETTER_R(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_CHARACTER"

    // $ANTLR start "KEYWORD_SET"
    public final void mKEYWORD_SET() throws RecognitionException {
        try {
            int _type = KEYWORD_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4845:12: ( ( LETTER_S LETTER_E LETTER_T ) )
            // Sql.g:4845:14: ( LETTER_S LETTER_E LETTER_T )
            {
            // Sql.g:4845:14: ( LETTER_S LETTER_E LETTER_T )
            // Sql.g:4845:15: LETTER_S LETTER_E LETTER_T
            {
            mLETTER_S(); 


            mLETTER_E(); 


            mLETTER_T(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_SET"

    // $ANTLR start "KEYWORD_BOOLEAN"
    public final void mKEYWORD_BOOLEAN() throws RecognitionException {
        try {
            int _type = KEYWORD_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4847:16: ( ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N ) )
            // Sql.g:4847:18: ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N )
            {
            // Sql.g:4847:18: ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N )
            // Sql.g:4847:19: LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N
            {
            mLETTER_B(); 


            mLETTER_O(); 


            mLETTER_O(); 


            mLETTER_L(); 


            mLETTER_E(); 


            mLETTER_A(); 


            mLETTER_N(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_BOOLEAN"

    // $ANTLR start "BOOLEAN_LITERAL"
    public final void mBOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4849:16: ( ( ( 'TRUE' | 'FALSE' | 'UNKNOWN' ) ) )
            // Sql.g:4850:2: ( ( 'TRUE' | 'FALSE' | 'UNKNOWN' ) )
            {
            // Sql.g:4850:2: ( ( 'TRUE' | 'FALSE' | 'UNKNOWN' ) )
            // Sql.g:4850:3: ( 'TRUE' | 'FALSE' | 'UNKNOWN' )
            {
            // Sql.g:4850:3: ( 'TRUE' | 'FALSE' | 'UNKNOWN' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'T':
                {
                alt1=1;
                }
                break;
            case 'F':
                {
                alt1=2;
                }
                break;
            case 'U':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // Sql.g:4850:4: 'TRUE'
                    {
                    match("TRUE"); 



                    }
                    break;
                case 2 :
                    // Sql.g:4850:13: 'FALSE'
                    {
                    match("FALSE"); 



                    }
                    break;
                case 3 :
                    // Sql.g:4850:23: 'UNKNOWN'
                    {
                    match("UNKNOWN"); 



                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN_LITERAL"

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            int _type = UNSIGNED_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4853:17: ( ( ( ( '0' .. '9' ) )+ ) )
            // Sql.g:4854:2: ( ( ( '0' .. '9' ) )+ )
            {
            // Sql.g:4854:2: ( ( ( '0' .. '9' ) )+ )
            // Sql.g:4854:3: ( ( '0' .. '9' ) )+
            {
            // Sql.g:4854:3: ( ( '0' .. '9' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Sql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNSIGNED_INTEGER"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4856:11: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* ) )
            // Sql.g:4857:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )
            {
            // Sql.g:4857:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )
            // Sql.g:4857:3: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Sql.g:4857:22: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Sql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "SCHEMA_QUALIFIED_NAME"
    public final void mSCHEMA_QUALIFIED_NAME() throws RecognitionException {
        try {
            int _type = SCHEMA_QUALIFIED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4859:22: ( ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )? ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' ) ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* ) )
            // Sql.g:4860:2: ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )? ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' ) ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )
            {
            // Sql.g:4860:2: ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )? ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' ) ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )
            // Sql.g:4860:3: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )? ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' ) ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
            {
            // Sql.g:4860:3: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )? ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )
            // Sql.g:4860:4: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )? ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.'
            {
            // Sql.g:4860:4: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // Sql.g:4860:5: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.'
                    {
                    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Sql.g:4860:24: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match('.'); 

                    }
                    break;

            }


            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Sql.g:4860:81: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Sql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('.'); 

            }


            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Sql.g:4860:137: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Sql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCHEMA_QUALIFIED_NAME"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4862:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Sql.g:4863:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Sql.g:4863:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Sql.g:4863:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Sql.g:4863:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='-'||(LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Sql.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4865:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Sql.g:4866:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:4869:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Sql.g:4870:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Sql.g:4870:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Sql.g:4870:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Sql.g:4870:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='\n') ) {
                    alt9=1;
                }
                else {
                    alt9=2;
                }
            }
            else if ( (LA9_0=='\n') ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Sql.g:4870:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Sql.g:4870:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Sql.g:4870:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // Sql.g:1:8: ( T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | KEYWORD_CREATE | KEYWORD_TEMPORARY | KEYWORD_TABLE | KEYWORD_ON | KEYWORD_COMMIT | KEYWORD_ROWS | KEYWORD_DEFAULT | KEYWORD_COLLATE | KEYWORD_CONSTRAINT | KEYWORD_NOT | KEYWORD_NULL | KEYWORD_REFERENCES | KEYWORD_FOREIGN | KEYWORD_KEY | KEYWORD_DATE | KEYWORD_TIME | KEYWORD_TIMESTAMP | KEYWORD_INTERVAL | KEYWORD_CHARACTER | KEYWORD_SET | KEYWORD_BOOLEAN | BOOLEAN_LITERAL | UNSIGNED_INTEGER | IDENTIFIER | SCHEMA_QUALIFIED_NAME | TEXT | WHITESPACE | LINEBREAK )
        int alt10=81;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // Sql.g:1:10: T__58
                {
                mT__58(); 


                }
                break;
            case 2 :
                // Sql.g:1:16: T__59
                {
                mT__59(); 


                }
                break;
            case 3 :
                // Sql.g:1:22: T__60
                {
                mT__60(); 


                }
                break;
            case 4 :
                // Sql.g:1:28: T__61
                {
                mT__61(); 


                }
                break;
            case 5 :
                // Sql.g:1:34: T__62
                {
                mT__62(); 


                }
                break;
            case 6 :
                // Sql.g:1:40: T__63
                {
                mT__63(); 


                }
                break;
            case 7 :
                // Sql.g:1:46: T__64
                {
                mT__64(); 


                }
                break;
            case 8 :
                // Sql.g:1:52: T__65
                {
                mT__65(); 


                }
                break;
            case 9 :
                // Sql.g:1:58: T__66
                {
                mT__66(); 


                }
                break;
            case 10 :
                // Sql.g:1:64: T__67
                {
                mT__67(); 


                }
                break;
            case 11 :
                // Sql.g:1:70: T__68
                {
                mT__68(); 


                }
                break;
            case 12 :
                // Sql.g:1:76: T__69
                {
                mT__69(); 


                }
                break;
            case 13 :
                // Sql.g:1:82: T__70
                {
                mT__70(); 


                }
                break;
            case 14 :
                // Sql.g:1:88: T__71
                {
                mT__71(); 


                }
                break;
            case 15 :
                // Sql.g:1:94: T__72
                {
                mT__72(); 


                }
                break;
            case 16 :
                // Sql.g:1:100: T__73
                {
                mT__73(); 


                }
                break;
            case 17 :
                // Sql.g:1:106: T__74
                {
                mT__74(); 


                }
                break;
            case 18 :
                // Sql.g:1:112: T__75
                {
                mT__75(); 


                }
                break;
            case 19 :
                // Sql.g:1:118: T__76
                {
                mT__76(); 


                }
                break;
            case 20 :
                // Sql.g:1:124: T__77
                {
                mT__77(); 


                }
                break;
            case 21 :
                // Sql.g:1:130: T__78
                {
                mT__78(); 


                }
                break;
            case 22 :
                // Sql.g:1:136: T__79
                {
                mT__79(); 


                }
                break;
            case 23 :
                // Sql.g:1:142: T__80
                {
                mT__80(); 


                }
                break;
            case 24 :
                // Sql.g:1:148: T__81
                {
                mT__81(); 


                }
                break;
            case 25 :
                // Sql.g:1:154: T__82
                {
                mT__82(); 


                }
                break;
            case 26 :
                // Sql.g:1:160: T__83
                {
                mT__83(); 


                }
                break;
            case 27 :
                // Sql.g:1:166: T__84
                {
                mT__84(); 


                }
                break;
            case 28 :
                // Sql.g:1:172: T__85
                {
                mT__85(); 


                }
                break;
            case 29 :
                // Sql.g:1:178: T__86
                {
                mT__86(); 


                }
                break;
            case 30 :
                // Sql.g:1:184: T__87
                {
                mT__87(); 


                }
                break;
            case 31 :
                // Sql.g:1:190: T__88
                {
                mT__88(); 


                }
                break;
            case 32 :
                // Sql.g:1:196: T__89
                {
                mT__89(); 


                }
                break;
            case 33 :
                // Sql.g:1:202: T__90
                {
                mT__90(); 


                }
                break;
            case 34 :
                // Sql.g:1:208: T__91
                {
                mT__91(); 


                }
                break;
            case 35 :
                // Sql.g:1:214: T__92
                {
                mT__92(); 


                }
                break;
            case 36 :
                // Sql.g:1:220: T__93
                {
                mT__93(); 


                }
                break;
            case 37 :
                // Sql.g:1:226: T__94
                {
                mT__94(); 


                }
                break;
            case 38 :
                // Sql.g:1:232: T__95
                {
                mT__95(); 


                }
                break;
            case 39 :
                // Sql.g:1:238: T__96
                {
                mT__96(); 


                }
                break;
            case 40 :
                // Sql.g:1:244: T__97
                {
                mT__97(); 


                }
                break;
            case 41 :
                // Sql.g:1:250: T__98
                {
                mT__98(); 


                }
                break;
            case 42 :
                // Sql.g:1:256: T__99
                {
                mT__99(); 


                }
                break;
            case 43 :
                // Sql.g:1:262: T__100
                {
                mT__100(); 


                }
                break;
            case 44 :
                // Sql.g:1:269: T__101
                {
                mT__101(); 


                }
                break;
            case 45 :
                // Sql.g:1:276: T__102
                {
                mT__102(); 


                }
                break;
            case 46 :
                // Sql.g:1:283: T__103
                {
                mT__103(); 


                }
                break;
            case 47 :
                // Sql.g:1:290: T__104
                {
                mT__104(); 


                }
                break;
            case 48 :
                // Sql.g:1:297: T__105
                {
                mT__105(); 


                }
                break;
            case 49 :
                // Sql.g:1:304: T__106
                {
                mT__106(); 


                }
                break;
            case 50 :
                // Sql.g:1:311: T__107
                {
                mT__107(); 


                }
                break;
            case 51 :
                // Sql.g:1:318: T__108
                {
                mT__108(); 


                }
                break;
            case 52 :
                // Sql.g:1:325: T__109
                {
                mT__109(); 


                }
                break;
            case 53 :
                // Sql.g:1:332: T__110
                {
                mT__110(); 


                }
                break;
            case 54 :
                // Sql.g:1:339: KEYWORD_CREATE
                {
                mKEYWORD_CREATE(); 


                }
                break;
            case 55 :
                // Sql.g:1:354: KEYWORD_TEMPORARY
                {
                mKEYWORD_TEMPORARY(); 


                }
                break;
            case 56 :
                // Sql.g:1:372: KEYWORD_TABLE
                {
                mKEYWORD_TABLE(); 


                }
                break;
            case 57 :
                // Sql.g:1:386: KEYWORD_ON
                {
                mKEYWORD_ON(); 


                }
                break;
            case 58 :
                // Sql.g:1:397: KEYWORD_COMMIT
                {
                mKEYWORD_COMMIT(); 


                }
                break;
            case 59 :
                // Sql.g:1:412: KEYWORD_ROWS
                {
                mKEYWORD_ROWS(); 


                }
                break;
            case 60 :
                // Sql.g:1:425: KEYWORD_DEFAULT
                {
                mKEYWORD_DEFAULT(); 


                }
                break;
            case 61 :
                // Sql.g:1:441: KEYWORD_COLLATE
                {
                mKEYWORD_COLLATE(); 


                }
                break;
            case 62 :
                // Sql.g:1:457: KEYWORD_CONSTRAINT
                {
                mKEYWORD_CONSTRAINT(); 


                }
                break;
            case 63 :
                // Sql.g:1:476: KEYWORD_NOT
                {
                mKEYWORD_NOT(); 


                }
                break;
            case 64 :
                // Sql.g:1:488: KEYWORD_NULL
                {
                mKEYWORD_NULL(); 


                }
                break;
            case 65 :
                // Sql.g:1:501: KEYWORD_REFERENCES
                {
                mKEYWORD_REFERENCES(); 


                }
                break;
            case 66 :
                // Sql.g:1:520: KEYWORD_FOREIGN
                {
                mKEYWORD_FOREIGN(); 


                }
                break;
            case 67 :
                // Sql.g:1:536: KEYWORD_KEY
                {
                mKEYWORD_KEY(); 


                }
                break;
            case 68 :
                // Sql.g:1:548: KEYWORD_DATE
                {
                mKEYWORD_DATE(); 


                }
                break;
            case 69 :
                // Sql.g:1:561: KEYWORD_TIME
                {
                mKEYWORD_TIME(); 


                }
                break;
            case 70 :
                // Sql.g:1:574: KEYWORD_TIMESTAMP
                {
                mKEYWORD_TIMESTAMP(); 


                }
                break;
            case 71 :
                // Sql.g:1:592: KEYWORD_INTERVAL
                {
                mKEYWORD_INTERVAL(); 


                }
                break;
            case 72 :
                // Sql.g:1:609: KEYWORD_CHARACTER
                {
                mKEYWORD_CHARACTER(); 


                }
                break;
            case 73 :
                // Sql.g:1:627: KEYWORD_SET
                {
                mKEYWORD_SET(); 


                }
                break;
            case 74 :
                // Sql.g:1:639: KEYWORD_BOOLEAN
                {
                mKEYWORD_BOOLEAN(); 


                }
                break;
            case 75 :
                // Sql.g:1:655: BOOLEAN_LITERAL
                {
                mBOOLEAN_LITERAL(); 


                }
                break;
            case 76 :
                // Sql.g:1:671: UNSIGNED_INTEGER
                {
                mUNSIGNED_INTEGER(); 


                }
                break;
            case 77 :
                // Sql.g:1:688: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 78 :
                // Sql.g:1:699: SCHEMA_QUALIFIED_NAME
                {
                mSCHEMA_QUALIFIED_NAME(); 


                }
                break;
            case 79 :
                // Sql.g:1:721: TEXT
                {
                mTEXT(); 


                }
                break;
            case 80 :
                // Sql.g:1:726: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 81 :
                // Sql.g:1:737: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA5_eotS =
        "\4\uffff\2\6\2\uffff";
    static final String DFA5_eofS =
        "\10\uffff";
    static final String DFA5_minS =
        "\1\101\2\56\1\101\2\56\2\uffff";
    static final String DFA5_maxS =
        "\6\172\2\uffff";
    static final String DFA5_acceptS =
        "\6\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\10\uffff}>";
    static final String[] DFA5_transitionS = {
            "\32\1\6\uffff\32\1",
            "\1\3\1\uffff\12\2\7\uffff\32\2\6\uffff\32\2",
            "\1\3\1\uffff\12\2\7\uffff\32\2\6\uffff\32\2",
            "\32\4\6\uffff\32\4",
            "\1\7\1\uffff\12\5\7\uffff\32\5\6\uffff\32\5",
            "\1\7\1\uffff\12\5\7\uffff\32\5\6\uffff\32\5",
            "",
            ""
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
            return "4860:4: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* '.' )?";
        }
    }
    static final String DFA10_eotS =
        "\5\uffff\1\51\1\uffff\4\54\1\77\1\54\1\102\1\54\1\105\24\54\1\133"+
        "\1\54\4\uffff\2\54\1\uffff\2\54\1\uffff\17\54\1\uffff\2\54\1\uffff"+
        "\2\54\1\uffff\6\54\1\174\16\54\1\uffff\16\54\1\u009c\7\54\1\u00a5"+
        "\1\54\1\u00a7\5\54\1\u00ad\1\54\1\uffff\6\54\1\u00b5\13\54\1\u00c1"+
        "\1\54\1\u00c5\7\54\1\u00cd\1\u00ce\1\54\1\uffff\10\54\1\uffff\1"+
        "\54\1\uffff\4\54\1\u00dd\1\uffff\3\54\1\u00e1\1\54\1\u00e3\1\54"+
        "\1\uffff\1\u00e6\1\u00e8\1\u00e9\10\54\1\uffff\1\54\1\uffff\1\54"+
        "\1\uffff\1\54\1\46\5\54\2\uffff\4\54\1\u0100\1\u0101\4\54\1\u0107"+
        "\1\54\1\u010a\1\54\1\uffff\3\54\1\uffff\1\54\1\uffff\2\54\1\uffff"+
        "\1\54\2\uffff\1\54\1\u0114\3\54\1\uffff\1\54\1\u0119\4\54\1\46\1"+
        "\u011f\3\54\1\u0123\1\54\1\u0125\2\54\2\uffff\1\54\1\u0129\3\54"+
        "\1\uffff\1\54\2\uffff\1\54\1\u012f\7\54\1\uffff\1\u0137\3\54\2\uffff"+
        "\1\u013b\2\54\1\46\1\uffff\1\u013f\2\54\1\uffff\1\u0142\1\uffff"+
        "\1\u0143\1\46\1\u0145\1\uffff\1\u0146\3\54\1\u014a\1\uffff\7\54"+
        "\1\uffff\1\u0152\1\u0153\1\54\1\uffff\2\54\1\46\1\uffff\1\54\1\46"+
        "\2\uffff\1\46\2\uffff\1\u015c\2\54\1\uffff\1\u015f\1\uffff\1\54"+
        "\1\u0161\3\54\3\uffff\1\u0167\1\u0168\1\46\1\54\3\46\1\uffff\1\u016f"+
        "\2\uffff\1\54\1\uffff\1\u0172\1\u0173\1\u0174\1\uffff\1\u0175\2"+
        "\uffff\1\u0176\1\u0177\3\46\1\54\2\uffff\1\u017d\6\uffff\3\46\1"+
        "\54\2\uffff\1\u0183\1\u0185\1\46\1\54\2\uffff\1\46\1\uffff\1\46"+
        "\1\54\1\u018e\2\46\1\u0191\3\uffff\2\46\2\uffff\1\46\1\u0197\1\uffff"+
        "\1\u0199\3\uffff\1\u019c\2\uffff";
    static final String DFA10_eofS =
        "\u019d\uffff";
    static final String DFA10_minS =
        "\1\11\4\uffff\1\55\1\uffff\37\55\4\uffff\2\55\1\uffff\2\55\1\uffff"+
        "\17\55\1\uffff\2\55\1\uffff\2\55\1\uffff\25\55\1\uffff\40\55\1\uffff"+
        "\24\55\1\40\12\55\1\uffff\10\55\1\uffff\1\55\1\uffff\5\55\1\uffff"+
        "\7\55\1\uffff\10\55\1\40\2\55\1\uffff\1\55\1\uffff\1\55\1\uffff"+
        "\1\55\1\125\5\55\2\uffff\14\55\1\40\1\55\1\uffff\3\55\1\uffff\1"+
        "\55\1\uffff\2\55\1\uffff\1\55\2\uffff\5\55\1\uffff\2\55\1\40\3\55"+
        "\1\116\11\55\2\uffff\5\55\1\uffff\1\55\2\uffff\11\55\1\uffff\4\55"+
        "\2\uffff\3\55\1\111\1\uffff\3\55\1\uffff\1\55\1\uffff\1\55\1\120"+
        "\1\55\1\uffff\5\55\1\uffff\1\55\1\40\5\55\1\uffff\2\55\1\40\1\uffff"+
        "\2\55\1\124\1\uffff\1\55\1\104\2\uffff\1\122\2\uffff\2\55\1\40\1"+
        "\uffff\1\55\1\uffff\5\55\3\uffff\1\40\1\55\1\123\1\55\1\101\1\111"+
        "\1\105\1\uffff\1\55\1\103\1\uffff\1\55\1\uffff\3\55\1\uffff\1\55"+
        "\2\uffff\2\55\1\124\1\115\1\103\1\55\1\uffff\1\110\1\55\6\uffff"+
        "\2\105\1\111\1\55\1\101\1\uffff\2\55\1\123\1\55\1\122\1\uffff\1"+
        "\124\1\uffff\1\111\1\55\1\40\1\101\1\117\1\55\1\uffff\1\103\1\uffff"+
        "\1\115\1\116\1\uffff\1\124\1\120\1\55\1\105\1\55\1\uffff\1\122\1"+
        "\uffff\1\40\2\uffff";
    static final String DFA10_maxS =
        "\1\172\4\uffff\1\172\1\uffff\37\172\4\uffff\2\172\1\uffff\2\172"+
        "\1\uffff\17\172\1\uffff\2\172\1\uffff\2\172\1\uffff\25\172\1\uffff"+
        "\40\172\1\uffff\37\172\1\uffff\10\172\1\uffff\1\172\1\uffff\5\172"+
        "\1\uffff\7\172\1\uffff\13\172\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\1\125\5\172\2\uffff\16\172\1\uffff\3\172\1\uffff\1\172\1"+
        "\uffff\2\172\1\uffff\1\172\2\uffff\5\172\1\uffff\6\172\1\116\11"+
        "\172\2\uffff\5\172\1\uffff\1\172\2\uffff\11\172\1\uffff\4\172\2"+
        "\uffff\3\172\1\111\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\120"+
        "\1\172\1\uffff\5\172\1\uffff\7\172\1\uffff\3\172\1\uffff\2\172\1"+
        "\124\1\uffff\1\172\1\124\2\uffff\1\122\2\uffff\3\172\1\uffff\1\172"+
        "\1\uffff\5\172\3\uffff\2\172\1\123\1\172\1\101\1\111\1\105\1\uffff"+
        "\1\172\1\103\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\2\uffff\2"+
        "\172\1\124\1\115\1\103\1\172\1\uffff\1\110\1\172\6\uffff\2\105\1"+
        "\111\1\172\1\101\1\uffff\2\172\1\123\1\172\1\122\1\uffff\1\124\1"+
        "\uffff\1\111\1\172\2\101\1\117\1\172\1\uffff\1\103\1\uffff\1\115"+
        "\1\116\1\uffff\1\124\1\120\1\172\1\105\1\172\1\uffff\1\122\1\uffff"+
        "\1\40\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\37\uffff\1\117\1\120\1\121"+
        "\1\5\2\uffff\1\115\2\uffff\1\116\17\uffff\1\32\2\uffff\1\36\2\uffff"+
        "\1\42\25\uffff\1\114\40\uffff\1\71\37\uffff\1\24\10\uffff\1\34\1"+
        "\uffff\1\103\5\uffff\1\77\7\uffff\1\111\13\uffff\1\11\1\uffff\1"+
        "\12\1\uffff\1\13\7\uffff\1\23\1\104\16\uffff\1\100\3\uffff\1\55"+
        "\1\uffff\1\73\2\uffff\1\57\1\uffff\1\105\1\61\5\uffff\1\64\20\uffff"+
        "\1\30\1\31\5\uffff\1\37\1\uffff\1\47\1\50\11\uffff\1\70\4\uffff"+
        "\1\7\1\10\4\uffff\1\72\3\uffff\1\66\1\uffff\1\26\3\uffff\1\33\5"+
        "\uffff\1\52\7\uffff\1\62\3\uffff\1\112\3\uffff\1\75\2\uffff\1\25"+
        "\1\74\1\uffff\1\102\1\35\3\uffff\1\51\1\uffff\1\54\5\uffff\1\113"+
        "\1\63\1\65\7\uffff\1\107\2\uffff\1\53\1\uffff\1\56\3\uffff\1\14"+
        "\1\uffff\1\15\1\110\6\uffff\1\40\2\uffff\1\60\1\106\1\67\1\16\1"+
        "\17\1\76\5\uffff\1\101\5\uffff\1\20\1\uffff\1\21\6\uffff\1\43\1"+
        "\uffff\1\44\2\uffff\1\41\5\uffff\1\27\1\uffff\1\22\1\uffff\1\45"+
        "\1\46";
    static final String DFA10_specialS =
        "\u019d\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\47\1\50\1\uffff\1\47\1\50\22\uffff\1\47\7\uffff\1\1\1\2\1"+
            "\uffff\1\3\1\4\1\5\2\uffff\12\44\1\uffff\1\6\5\uffff\1\45\1"+
            "\7\1\10\1\11\1\45\1\12\1\13\1\45\1\14\1\45\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\1\45\1\23\1\24\1\25\1\26\1\27\1\30\3\45\4\uffff"+
            "\1\46\1\uffff\1\45\1\43\1\31\1\35\1\45\1\37\2\45\1\41\1\45\1"+
            "\40\2\45\1\36\1\33\2\45\1\34\1\42\1\32\6\45",
            "",
            "",
            "",
            "",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\52\2\56\1\53\2\56"+
            "\1\55\13\56\4\uffff\1\46\1\uffff\16\56\1\55\13\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\7\56\1\60\6\56\1\61\2\56\1"+
            "\63\2\56\1\62\5\56\4\uffff\1\46\1\uffff\7\56\1\65\6\56\1\64"+
            "\2\56\1\63\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\66\3\56\1\67\11\56\1\70"+
            "\13\56\4\uffff\1\46\1\uffff\1\72\3\56\1\71\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\73\12\56\1\74\2\56\1\75"+
            "\13\56\4\uffff\1\46\1\uffff\16\56\1\75\13\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\76\16\56\4\uffff\1"+
            "\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\100\14\56\4\uffff"+
            "\1\46\1\uffff\15\56\1\101\14\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\103\25\56\4\uffff\1"+
            "\46\1\uffff\4\56\1\103\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\104\13\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\106\1\56\1\107\13\56\1\111"+
            "\5\56\1\110\5\56\4\uffff\1\46\1\uffff\16\56\1\111\5\56\1\112"+
            "\5\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\2\56\1\113\12\56\1\114\14"+
            "\56\4\uffff\1\46\1\uffff\15\56\1\114\14\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\115\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\116\11\56\1\117\13"+
            "\56\4\uffff\1\46\1\uffff\4\56\1\120\11\56\1\117\13\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\122\7\56\1\121\15\56"+
            "\4\uffff\1\46\1\uffff\4\56\1\122\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\126\3\56\1\125\3\56\1\123"+
            "\10\56\1\124\10\56\4\uffff\1\46\1\uffff\1\126\3\56\1\125\3\56"+
            "\1\127\21\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\130\14\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\131\31\56\4\uffff\1\46\1"+
            "\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\132\21\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\7\56\1\65\6\56\1\64\2\56\1"+
            "\63\10\56\4\uffff\1\46\1\uffff\7\56\1\65\6\56\1\64\2\56\1\63"+
            "\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\126\3\56\1\125\3\56\1\127"+
            "\21\56\4\uffff\1\46\1\uffff\1\126\3\56\1\125\3\56\1\127\21\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\114\14\56\4\uffff"+
            "\1\46\1\uffff\15\56\1\114\14\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\120\11\56\1\117\13"+
            "\56\4\uffff\1\46\1\uffff\4\56\1\120\11\56\1\117\13\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\72\3\56\1\71\25\56\4\uffff"+
            "\1\46\1\uffff\1\72\3\56\1\71\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\111\5\56\1\112\5\56"+
            "\4\uffff\1\46\1\uffff\16\56\1\111\5\56\1\112\5\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\75\13\56\4\uffff\1"+
            "\46\1\uffff\16\56\1\75\13\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\103\25\56\4\uffff\1"+
            "\46\1\uffff\4\56\1\103\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\101\14\56\4\uffff"+
            "\1\46\1\uffff\15\56\1\101\14\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\122\25\56\4\uffff\1"+
            "\46\1\uffff\4\56\1\122\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\55\13\56\4\uffff\1"+
            "\46\1\uffff\16\56\1\55\13\56",
            "\1\46\2\uffff\12\44\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "",
            "",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\6\56\1\134\6\56\1\135\14\56"+
            "\4\uffff\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\136\13\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\137\13\56\4\uffff"+
            "\1\46\1\uffff\16\56\1\137\13\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\140\31\56\4\uffff\1\46\1"+
            "\uffff\1\141\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\3\56\1\142\7\56\1\144\1\143"+
            "\1\145\14\56\4\uffff\1\46\1\uffff\13\56\1\144\1\143\1\145\14"+
            "\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\146\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\147\25\56\4\uffff\1"+
            "\46\1\uffff\4\56\1\147\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\144\1\143\1\145\14"+
            "\56\4\uffff\1\46\1\uffff\13\56\1\144\1\143\1\145\14\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\141\31\56\4\uffff\1\46\1"+
            "\uffff\1\141\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\150\6\56\4\uffff\1"+
            "\46\1\uffff\23\56\1\151\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\2\56\1\152\2\56\1\154\5\56"+
            "\1\153\16\56\4\uffff\1\46\1\uffff\5\56\1\154\24\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\24\56\1\155\5\56\4\uffff\1"+
            "\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\5\56\1\154\24\56\4\uffff\1"+
            "\46\1\uffff\5\56\1\154\24\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\151\6\56\4\uffff\1"+
            "\46\1\uffff\23\56\1\151\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\156\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\157\13\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\160\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\160\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\161\13\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\162\6\56\4\uffff\1"+
            "\46\1\uffff\23\56\1\163\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\163\6\56\4\uffff\1"+
            "\46\1\uffff\23\56\1\163\6\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\30\56\1\164\1\56\4\uffff\1"+
            "\46\1\uffff\30\56\1\164\1\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\2\56\1\165\27\56\4\uffff\1"+
            "\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\166\6\56\4\uffff\1"+
            "\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\7\56\1\167\22\56\4\uffff\1"+
            "\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\171\1\170\15\56\4"+
            "\uffff\1\46\1\uffff\13\56\1\171\16\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\172\6\56\4\uffff\1"+
            "\46\1\uffff\23\56\1\172\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\171\16\56\4\uffff"+
            "\1\46\1\uffff\13\56\1\171\16\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\173\6\56\4\uffff\1"+
            "\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\175\3\56\1\176\21\56"+
            "\4\uffff\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\177\4\56\1\u0080\24\56\4"+
            "\uffff\1\46\1\uffff\5\56\1\u0080\24\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\26\56\1\u0081\3\56\4\uffff"+
            "\1\46\1\uffff\26\56\1\u0081\3\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\5\56\1\u0080\24\56\4\uffff"+
            "\1\46\1\uffff\5\56\1\u0080\24\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u0082\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u0083\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u0083\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u0084\15\56\4\uffff"+
            "\1\46\1\uffff\14\56\1\u0085\15\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\24\56\1\u0086\5\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u0087\15\56\4\uffff"+
            "\1\46\1\uffff\14\56\1\u0087\15\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\56\1\u0088\30\56\4\uffff"+
            "\1\46\1\uffff\1\56\1\u0088\30\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u0085\15\56\4\uffff"+
            "\1\46\1\uffff\14\56\1\u0085\15\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u0089\1\56\1\u008a"+
            "\17\56\4\uffff\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u008b\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u008c\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u008d\21\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u008e\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\56\1\u008f\30\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u0090\16\56\4\uffff"+
            "\1\46\1\uffff\13\56\1\u0090\16\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u0091\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u0092\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u0092\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u0092\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u0093\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u0094\15\56\4\uffff"+
            "\1\46\1\uffff\14\56\1\u0094\15\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u0095\16\56\4\uffff"+
            "\1\46\1\uffff\13\56\1\u0095\16\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u0096\7\56\4\uffff"+
            "\1\46\1\uffff\22\56\1\u0096\7\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u0097\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u0098\31\56\4\uffff\1\46"+
            "\1\uffff\1\u0098\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u0099\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u009a\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u009a\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u009a\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u009b\21\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u009d\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u009e\31\56\4\uffff\1\46"+
            "\1\uffff\1\u009e\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\56\1\u009f\30\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u00a0\7\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00a1\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00a2\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00a2\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\56\1\u00a3\30\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00a4\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00a6\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00a6\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00a6\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00a8\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u00a9\21\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00aa\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00ab\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u00ac\16\56\4\uffff"+
            "\1\46\1\uffff\13\56\1\u00ac\16\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00ae\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u00af\7\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u00b0\15\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u00b1\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00b2\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00b2\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u00b3\7\56\4\uffff"+
            "\1\46\1\uffff\22\56\1\u00b3\7\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u00b4\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00b6\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00b7\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00b7\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00b7\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00b8\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\17\56\1\u00b9\12\56\4\uffff"+
            "\1\46\1\uffff\17\56\1\u00b9\12\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u00ba\16\56\4\uffff"+
            "\1\46\1\uffff\13\56\1\u00ba\16\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\20\56\1\u00bb\11\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u00bc\14\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\2\56\1\u00bd\27\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\7\56\1\u00be\22\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u00bf\14\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u00c0\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00c2\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00c2\25\56",
            "\1\u00c3\14\uffff\1\46\1\57\1\uffff\12\56\7\uffff\1\u00c4\31"+
            "\56\4\uffff\1\46\1\uffff\1\u00c6\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00c6\31\56\4\uffff\1\46"+
            "\1\uffff\1\u00c6\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\u00c7\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u00c8\21\56\4\uffff"+
            "\1\46\1\uffff\10\56\1\u00c8\21\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00c9\31\56\4\uffff\1\46"+
            "\1\uffff\1\u00c9\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u00ca\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u00ca\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00cb\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u00cc\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u00cc\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u00cf\15\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u00d0\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\24\56\1\u00d1\5\56\4\uffff"+
            "\1\46\1\uffff\24\56\1\u00d1\5\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u00d2\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00d3\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u00d4\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u00d5\21\56\4\uffff"+
            "\1\46\1\uffff\10\56\1\u00d5\21\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00d6\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\6\56\1\u00d7\12\56\1\u00d8"+
            "\10\56\4\uffff\1\46\1\uffff\21\56\1\u00d8\10\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u00d8\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u00d8\10\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u00d9\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\u00da\13\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u00db\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u00dc\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u00de\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00df\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00e0\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u00e2\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u00e2\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u00e4\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u00e5\7\56\4\uffff"+
            "\1\46\1\uffff\22\56\1\u00e7\7\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u00e7\7\56\4\uffff"+
            "\1\46\1\uffff\22\56\1\u00e7\7\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\u00ea\13\56\4\uffff"+
            "\1\46\1\uffff\16\56\1\u00ea\13\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00eb\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00eb\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\24\56\1\u00ec\5\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\u00ed\13\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\7\56\1\u00ee\22\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\u00ef\14\uffff\1\46\1\57\1\uffff\12\56\7\uffff\16\56\1\u00f0"+
            "\13\56\4\uffff\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u00f1\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\30\56\1\u00f2\1\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00f3\31\56\4\uffff\1\46"+
            "\1\uffff\1\u00f3\31\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\2\56\1\u00f4\27\56\4\uffff"+
            "\1\46\1\uffff\2\56\1\u00f5\27\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\2\56\1\u00f5\27\56\4\uffff"+
            "\1\46\1\uffff\2\56\1\u00f5\27\56",
            "\1\u00f6",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u00f7\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u00f7\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u00f8\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u00f8\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u00f9\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u00f9\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u00fa\14\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00fb\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u00fb\25\56",
            "",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u00fc\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00fd\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u00fe\16\56\4\uffff"+
            "\1\46\1\uffff\13\56\1\u00fe\16\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u00ff\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\6\56\1\u0102\23\56\4\uffff"+
            "\1\46\1\uffff\6\56\1\u0102\23\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u0103\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u0104\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\25\56\1\u0105\4\56\4\uffff"+
            "\1\46\1\uffff\25\56\1\u0105\4\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u0106\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u0108\14\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\u0109\14\uffff\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u010b\21\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u010c\7\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u010d\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u010e\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u010f\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u010f\25\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u0110\21\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u0111\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u0112\6\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u0112\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u0112\6\56",
            "",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u0113\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u0113\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u0115\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\26\56\1\u0116\3\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u0117\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\24\56\1\u0118\5\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\u011a\14\uffff\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u011b\14\56\4\uffff"+
            "\1\46\1\uffff\15\56\1\u011b\14\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u011c\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u011d\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u011d\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u011d\6\56",
            "\1\u011e",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u0120\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u0120\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u0121\31\56\4\uffff\1\46"+
            "\1\uffff\1\u0121\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u0122\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u0124\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u0126\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u0126\6\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\u0127\1\uffff"+
            "\32\56",
            "",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u0128\14\56\4\uffff"+
            "\1\46\1\uffff\15\56\1\u0128\14\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u012a\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u012b\31\56\4\uffff\1\46"+
            "\1\uffff\1\u012b\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u012c\21\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u012d\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\2\56\1\u012e\27\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\25\56\1\u0130\4\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\30\56\1\u0131\1\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u0132\14\56\4\uffff"+
            "\1\46\1\uffff\15\56\1\u0132\14\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u0133\14\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u0134\31\56\4\uffff\1\46"+
            "\1\uffff\1\u0135\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u0135\31\56\4\uffff\1\46"+
            "\1\uffff\1\u0135\31\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u0136\31\56\4\uffff\1\46"+
            "\1\uffff\1\u0136\31\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u0138\14\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u0139\10\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u013a\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u013c\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u013d\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u013d\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u013d\25\56",
            "\1\u013e",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\10\56\1\u0140\21\56\4\uffff"+
            "\1\46\1\uffff\10\56\1\u0140\21\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\u0141\1\uffff"+
            "\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\u0144",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u0147\16\56\4\uffff"+
            "\1\46\1\uffff\13\56\1\u0147\16\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u0148\15\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\13\56\1\u0149\16\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u014b\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\u014c\14\uffff\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\2\56\1\u014d\27\56\4\uffff"+
            "\1\46\1\uffff\2\56\1\u014d\27\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u014e\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u014f\15\56\4\uffff"+
            "\1\46\1\uffff\14\56\1\u0150\15\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u0150\15\56\4\uffff"+
            "\1\46\1\uffff\14\56\1\u0150\15\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u0151\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u0151\10\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\u0154\14\uffff\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u0155\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u0156\10\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\21\56\1\u0156\10\56\4\uffff"+
            "\1\46\1\uffff\21\56\1\u0156\10\56",
            "\1\u0157",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\15\56\1\u0158\14\56\4\uffff"+
            "\1\46\1\uffff\15\56\1\u0158\14\56",
            "\1\u0159\17\uffff\1\u015a",
            "",
            "",
            "\1\u015b",
            "",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u015d\25\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\u015e\14\uffff\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\4\56\1\u0160\25\56\4\uffff"+
            "\1\46\1\uffff\4\56\1\u0160\25\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\17\56\1\u0162\12\56\4\uffff"+
            "\1\46\1\uffff\17\56\1\u0163\12\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\17\56\1\u0163\12\56\4\uffff"+
            "\1\46\1\uffff\17\56\1\u0163\12\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\30\56\1\u0164\1\56\4\uffff"+
            "\1\46\1\uffff\30\56\1\u0164\1\56",
            "",
            "",
            "",
            "\1\u0165\14\uffff\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u0166"+
            "\7\56\4\uffff\1\46\1\uffff\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\u0169",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u016a\6\56\4\uffff"+
            "\1\46\1\uffff\23\56\1\u016a\6\56",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u016e\7\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\u0170",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\22\56\1\u0171\7\56\4\uffff"+
            "\1\46\1\uffff\22\56\1\u0171\7\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\46\1\57\1\uffff\12\56\7\uffff\23\56\1\u017b\6\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "",
            "\1\u017c",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\46\1\57\1\uffff\12\56\7\uffff\1\u0181\31\56\4\uffff\1\46"+
            "\1\uffff\32\56",
            "\1\u0182",
            "",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\46\2\uffff\12\46\7\uffff\22\46\1\u0184\7\46\4\uffff\1\46"+
            "\1\uffff\32\46",
            "\1\u0186",
            "\1\46\1\57\1\uffff\12\56\7\uffff\14\56\1\u0187\15\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\u0188",
            "",
            "\1\u0189",
            "",
            "\1\u018a",
            "\1\46\1\57\1\uffff\12\56\7\uffff\17\56\1\u018b\12\56\4\uffff"+
            "\1\46\1\uffff\32\56",
            "\1\u018c\40\uffff\1\u018d",
            "\1\u018f",
            "\1\u0190",
            "\1\46\1\57\1\uffff\12\56\7\uffff\32\56\4\uffff\1\46\1\uffff"+
            "\32\56",
            "",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\u0196",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0198",
            "\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u019a",
            "",
            "\1\u019b",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | KEYWORD_CREATE | KEYWORD_TEMPORARY | KEYWORD_TABLE | KEYWORD_ON | KEYWORD_COMMIT | KEYWORD_ROWS | KEYWORD_DEFAULT | KEYWORD_COLLATE | KEYWORD_CONSTRAINT | KEYWORD_NOT | KEYWORD_NULL | KEYWORD_REFERENCES | KEYWORD_FOREIGN | KEYWORD_KEY | KEYWORD_DATE | KEYWORD_TIME | KEYWORD_TIMESTAMP | KEYWORD_INTERVAL | KEYWORD_CHARACTER | KEYWORD_SET | KEYWORD_BOOLEAN | BOOLEAN_LITERAL | UNSIGNED_INTEGER | IDENTIFIER | SCHEMA_QUALIFIED_NAME | TEXT | WHITESPACE | LINEBREAK );";
        }
    }
 

}