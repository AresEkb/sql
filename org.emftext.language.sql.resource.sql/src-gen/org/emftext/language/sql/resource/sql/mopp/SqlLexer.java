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
    public static final int T__57=57;
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
    public static final int APPROXIMATE_NUMERIC_LITERAL=4;
    public static final int BRACKETED_COMMENT=5;
    public static final int EXACT_NUMERIC_LITERAL=6;
    public static final int IDENTIFIER=7;
    public static final int KEYWORD_BOOLEAN=8;
    public static final int KEYWORD_CHARACTER=9;
    public static final int KEYWORD_COLLATE=10;
    public static final int KEYWORD_CONSTRAINT=11;
    public static final int KEYWORD_CREATE=12;
    public static final int KEYWORD_DATE=13;
    public static final int KEYWORD_DEFAULT=14;
    public static final int KEYWORD_FOREIGN=15;
    public static final int KEYWORD_KEY=16;
    public static final int KEYWORD_N=17;
    public static final int KEYWORD_NOT=18;
    public static final int KEYWORD_NULL=19;
    public static final int KEYWORD_REFERENCES=20;
    public static final int KEYWORD_SET=21;
    public static final int KEYWORD_TABLE=22;
    public static final int KEYWORD_TEMPORARY=23;
    public static final int KEYWORD_TIME=24;
    public static final int KEYWORD_TIMESTAMP=25;
    public static final int KEYWORD_ZONE=26;
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
    public static final int QUOTED_STRING=53;
    public static final int SIMPLE_COMMENT=54;
    public static final int UNSIGNED_INTEGER=55;
    public static final int WHITESPACE=56;

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

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:22:7: ( ',' )
            // Sql.g:22:9: ','
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:23:7: ( '.' )
            // Sql.g:23:9: '.'
            {
            match('.'); 

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
            // Sql.g:24:7: ( ';' )
            // Sql.g:24:9: ';'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:25:7: ( 'BIGINT' )
            // Sql.g:25:9: 'BIGINT'
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:26:7: ( 'BINARY LARGE OBJECT' )
            // Sql.g:26:9: 'BINARY LARGE OBJECT'
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:27:7: ( 'BLOB' )
            // Sql.g:27:9: 'BLOB'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:28:7: ( 'CHAR VARYING' )
            // Sql.g:28:9: 'CHAR VARYING'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:29:7: ( 'CHAR' )
            // Sql.g:29:9: 'CHAR'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:30:7: ( 'CHARACTER VARYING' )
            // Sql.g:30:9: 'CHARACTER VARYING'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:31:7: ( 'CHARACTER' )
            // Sql.g:31:9: 'CHARACTER'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:32:7: ( 'CHARACTERS' )
            // Sql.g:32:9: 'CHARACTERS'
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:33:7: ( 'CODE_UNITS' )
            // Sql.g:33:9: 'CODE_UNITS'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:34:7: ( 'CURRENT_DATE' )
            // Sql.g:34:9: 'CURRENT_DATE'
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:35:7: ( 'CURRENT_TIME' )
            // Sql.g:35:9: 'CURRENT_TIME'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:36:7: ( 'CURRENT_TIMESTAMP' )
            // Sql.g:36:9: 'CURRENT_TIMESTAMP'
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:37:7: ( 'DEC' )
            // Sql.g:37:9: 'DEC'
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:38:7: ( 'DECIMAL' )
            // Sql.g:38:9: 'DECIMAL'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:39:7: ( 'DOUBLE PRECISION' )
            // Sql.g:39:9: 'DOUBLE PRECISION'
            {
            match("DOUBLE PRECISION"); 



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
            // Sql.g:40:7: ( 'FALSE' )
            // Sql.g:40:9: 'FALSE'
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:41:7: ( 'FLOAT' )
            // Sql.g:41:9: 'FLOAT'
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:42:7: ( 'G' )
            // Sql.g:42:9: 'G'
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:43:7: ( 'GLOBAL' )
            // Sql.g:43:9: 'GLOBAL'
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:44:7: ( 'INT' )
            // Sql.g:44:9: 'INT'
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:45:7: ( 'INTEGER' )
            // Sql.g:45:9: 'INTEGER'
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:46:7: ( 'K' )
            // Sql.g:46:9: 'K'
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:47:7: ( 'LOCAL' )
            // Sql.g:47:9: 'LOCAL'
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:48:7: ( 'LOCALTIME' )
            // Sql.g:48:9: 'LOCALTIME'
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:49:7: ( 'LOCALTIMESTAMP' )
            // Sql.g:49:9: 'LOCALTIMESTAMP'
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:50:7: ( 'M' )
            // Sql.g:50:9: 'M'
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:51:7: ( 'NATIONAL CHAR VARYING' )
            // Sql.g:51:9: 'NATIONAL CHAR VARYING'
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:52:7: ( 'NATIONAL CHAR' )
            // Sql.g:52:9: 'NATIONAL CHAR'
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:53:7: ( 'NATIONAL CHARACTER VARYING' )
            // Sql.g:53:9: 'NATIONAL CHARACTER VARYING'
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:54:7: ( 'NATIONAL CHARACTER' )
            // Sql.g:54:9: 'NATIONAL CHARACTER'
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:55:7: ( 'NCHAR VARYING' )
            // Sql.g:55:9: 'NCHAR VARYING'
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:56:7: ( 'NCHAR' )
            // Sql.g:56:9: 'NCHAR'
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:57:7: ( 'NUMERIC' )
            // Sql.g:57:9: 'NUMERIC'
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
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:58:7: ( 'OCTETS' )
            // Sql.g:58:9: 'OCTETS'
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
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:59:7: ( 'PRIMARY KEY' )
            // Sql.g:59:9: 'PRIMARY KEY'
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
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:60:7: ( 'REAL' )
            // Sql.g:60:9: 'REAL'
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
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:61:7: ( 'SMALLINT' )
            // Sql.g:61:9: 'SMALLINT'
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
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:62:7: ( 'TRUE' )
            // Sql.g:62:9: 'TRUE'
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
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:63:8: ( 'UNIQUE' )
            // Sql.g:63:10: 'UNIQUE'
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
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:64:8: ( 'VARCHAR' )
            // Sql.g:64:10: 'VARCHAR'
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
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:65:8: ( 'WITH' )
            // Sql.g:65:10: 'WITH'
            {
            match("WITH"); 



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
            // Sql.g:66:8: ( 'WITHOUT' )
            // Sql.g:66:10: 'WITHOUT'
            {
            match("WITHOUT"); 



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
            // Sql.g:67:8: ( '_' )
            // Sql.g:67:10: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "LETTER_A"
    public final void mLETTER_A() throws RecognitionException {
        try {
            // Sql.g:5252:18: ( ( 'a' | 'A' ) )
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
            // Sql.g:5253:18: ( ( 'b' | 'B' ) )
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
            // Sql.g:5254:18: ( ( 'c' | 'C' ) )
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
            // Sql.g:5255:18: ( ( 'd' | 'D' ) )
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
            // Sql.g:5256:18: ( ( 'e' | 'E' ) )
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
            // Sql.g:5257:18: ( ( 'f' | 'F' ) )
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
            // Sql.g:5258:18: ( ( 'g' | 'G' ) )
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
            // Sql.g:5259:18: ( ( 'h' | 'H' ) )
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
            // Sql.g:5260:18: ( ( 'i' | 'I' ) )
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
            // Sql.g:5261:18: ( ( 'j' | 'J' ) )
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
            // Sql.g:5262:18: ( ( 'k' | 'K' ) )
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
            // Sql.g:5263:18: ( ( 'l' | 'L' ) )
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
            // Sql.g:5264:18: ( ( 'm' | 'M' ) )
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
            // Sql.g:5265:18: ( ( 'n' | 'N' ) )
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
            // Sql.g:5266:18: ( ( 'o' | 'O' ) )
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
            // Sql.g:5267:18: ( ( 'p' | 'P' ) )
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
            // Sql.g:5268:18: ( ( 'q' | 'Q' ) )
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
            // Sql.g:5269:18: ( ( 'r' | 'R' ) )
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
            // Sql.g:5270:18: ( ( 's' | 'S' ) )
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
            // Sql.g:5271:18: ( ( 't' | 'T' ) )
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
            // Sql.g:5272:18: ( ( 'u' | 'U' ) )
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
            // Sql.g:5273:18: ( ( 'v' | 'V' ) )
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
            // Sql.g:5274:18: ( ( 'w' | 'W' ) )
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
            // Sql.g:5275:18: ( ( 'x' | 'X' ) )
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
            // Sql.g:5276:18: ( ( 'y' | 'Y' ) )
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
            // Sql.g:5277:18: ( ( 'z' | 'Z' ) )
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

    // $ANTLR start "KEYWORD_N"
    public final void mKEYWORD_N() throws RecognitionException {
        try {
            int _type = KEYWORD_N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5279:10: ( ( LETTER_N ) )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_N"

    // $ANTLR start "KEYWORD_DATE"
    public final void mKEYWORD_DATE() throws RecognitionException {
        try {
            int _type = KEYWORD_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5281:13: ( ( LETTER_D LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:5281:15: ( LETTER_D LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:5281:15: ( LETTER_D LETTER_A LETTER_T LETTER_E )
            // Sql.g:5281:16: LETTER_D LETTER_A LETTER_T LETTER_E
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
            // Sql.g:5283:13: ( ( LETTER_T LETTER_I LETTER_M LETTER_E ) )
            // Sql.g:5283:15: ( LETTER_T LETTER_I LETTER_M LETTER_E )
            {
            // Sql.g:5283:15: ( LETTER_T LETTER_I LETTER_M LETTER_E )
            // Sql.g:5283:16: LETTER_T LETTER_I LETTER_M LETTER_E
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
            // Sql.g:5285:18: ( ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P ) )
            // Sql.g:5285:20: ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P )
            {
            // Sql.g:5285:20: ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P )
            // Sql.g:5285:21: LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P
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

    // $ANTLR start "KEYWORD_CREATE"
    public final void mKEYWORD_CREATE() throws RecognitionException {
        try {
            int _type = KEYWORD_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5287:15: ( ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:5287:17: ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:5287:17: ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E )
            // Sql.g:5287:18: LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E
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
            // Sql.g:5289:18: ( ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y ) )
            // Sql.g:5289:20: ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y )
            {
            // Sql.g:5289:20: ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y )
            // Sql.g:5289:21: LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y
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
            // Sql.g:5291:14: ( ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E ) )
            // Sql.g:5291:16: ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E )
            {
            // Sql.g:5291:16: ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E )
            // Sql.g:5291:17: LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E
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

    // $ANTLR start "KEYWORD_DEFAULT"
    public final void mKEYWORD_DEFAULT() throws RecognitionException {
        try {
            int _type = KEYWORD_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5293:16: ( ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T ) )
            // Sql.g:5293:18: ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T )
            {
            // Sql.g:5293:18: ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T )
            // Sql.g:5293:19: LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T
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
            // Sql.g:5295:16: ( ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:5295:18: ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:5295:18: ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E )
            // Sql.g:5295:19: LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E
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
            // Sql.g:5297:19: ( ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T ) )
            // Sql.g:5297:21: ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T )
            {
            // Sql.g:5297:21: ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T )
            // Sql.g:5297:22: LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T
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
            // Sql.g:5299:12: ( ( LETTER_N LETTER_O LETTER_T ) )
            // Sql.g:5299:14: ( LETTER_N LETTER_O LETTER_T )
            {
            // Sql.g:5299:14: ( LETTER_N LETTER_O LETTER_T )
            // Sql.g:5299:15: LETTER_N LETTER_O LETTER_T
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
            // Sql.g:5301:13: ( ( LETTER_N LETTER_U LETTER_L LETTER_L ) )
            // Sql.g:5301:15: ( LETTER_N LETTER_U LETTER_L LETTER_L )
            {
            // Sql.g:5301:15: ( LETTER_N LETTER_U LETTER_L LETTER_L )
            // Sql.g:5301:16: LETTER_N LETTER_U LETTER_L LETTER_L
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
            // Sql.g:5303:19: ( ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S ) )
            // Sql.g:5303:21: ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S )
            {
            // Sql.g:5303:21: ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S )
            // Sql.g:5303:22: LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S
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
            // Sql.g:5305:16: ( ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N ) )
            // Sql.g:5305:18: ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N )
            {
            // Sql.g:5305:18: ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N )
            // Sql.g:5305:19: LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N
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
            // Sql.g:5307:12: ( ( LETTER_K LETTER_E LETTER_Y ) )
            // Sql.g:5307:14: ( LETTER_K LETTER_E LETTER_Y )
            {
            // Sql.g:5307:14: ( LETTER_K LETTER_E LETTER_Y )
            // Sql.g:5307:15: LETTER_K LETTER_E LETTER_Y
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

    // $ANTLR start "KEYWORD_CHARACTER"
    public final void mKEYWORD_CHARACTER() throws RecognitionException {
        try {
            int _type = KEYWORD_CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5309:18: ( ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R ) )
            // Sql.g:5309:20: ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R )
            {
            // Sql.g:5309:20: ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R )
            // Sql.g:5309:21: LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R
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
            // Sql.g:5311:12: ( ( LETTER_S LETTER_E LETTER_T ) )
            // Sql.g:5311:14: ( LETTER_S LETTER_E LETTER_T )
            {
            // Sql.g:5311:14: ( LETTER_S LETTER_E LETTER_T )
            // Sql.g:5311:15: LETTER_S LETTER_E LETTER_T
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

    // $ANTLR start "KEYWORD_ZONE"
    public final void mKEYWORD_ZONE() throws RecognitionException {
        try {
            int _type = KEYWORD_ZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5313:13: ( ( LETTER_Z LETTER_O LETTER_N LETTER_E ) )
            // Sql.g:5313:15: ( LETTER_Z LETTER_O LETTER_N LETTER_E )
            {
            // Sql.g:5313:15: ( LETTER_Z LETTER_O LETTER_N LETTER_E )
            // Sql.g:5313:16: LETTER_Z LETTER_O LETTER_N LETTER_E
            {
            mLETTER_Z(); 


            mLETTER_O(); 


            mLETTER_N(); 


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
    // $ANTLR end "KEYWORD_ZONE"

    // $ANTLR start "KEYWORD_BOOLEAN"
    public final void mKEYWORD_BOOLEAN() throws RecognitionException {
        try {
            int _type = KEYWORD_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5315:16: ( ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N ) )
            // Sql.g:5315:18: ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N )
            {
            // Sql.g:5315:18: ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N )
            // Sql.g:5315:19: LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5317:11: ( ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) ) )
            // Sql.g:5318:2: ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\r')||input.LA(1)==' '||input.LA(1)=='\u00A0'||(input.LA(1) >= '\u2000' && input.LA(1) <= '\u200F')||(input.LA(1) >= '\u2028' && input.LA(1) <= '\u2029')||input.LA(1)=='\u3000'||input.LA(1)=='\uFEFF' ) {
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

    // $ANTLR start "SIMPLE_COMMENT"
    public final void mSIMPLE_COMMENT() throws RecognitionException {
        try {
            int _type = SIMPLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5321:15: ( ( '-' '-' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Sql.g:5322:2: ( '-' '-' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Sql.g:5322:2: ( '-' '-' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Sql.g:5322:3: '-' '-' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match('-'); 

            match('-'); 

            // Sql.g:5322:9: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Sql.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
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
            	    break loop1;
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
    // $ANTLR end "SIMPLE_COMMENT"

    // $ANTLR start "BRACKETED_COMMENT"
    public final void mBRACKETED_COMMENT() throws RecognitionException {
        try {
            int _type = BRACKETED_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5324:18: ( ( '/' '*' ( . )* '*' '/' ) )
            // Sql.g:5325:2: ( '/' '*' ( . )* '*' '/' )
            {
            // Sql.g:5325:2: ( '/' '*' ( . )* '*' '/' )
            // Sql.g:5325:3: '/' '*' ( . )* '*' '/'
            {
            match('/'); 

            match('*'); 

            // Sql.g:5325:9: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Sql.g:5325:9: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('*'); 

            match('/'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BRACKETED_COMMENT"

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            int _type = UNSIGNED_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5327:17: ( ( ( ( '0' .. '9' ) )+ ) )
            // Sql.g:5328:2: ( ( ( '0' .. '9' ) )+ )
            {
            // Sql.g:5328:2: ( ( ( '0' .. '9' ) )+ )
            // Sql.g:5328:3: ( ( '0' .. '9' ) )+
            {
            // Sql.g:5328:3: ( ( '0' .. '9' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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

    // $ANTLR start "EXACT_NUMERIC_LITERAL"
    public final void mEXACT_NUMERIC_LITERAL() throws RecognitionException {
        try {
            int _type = EXACT_NUMERIC_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5330:22: ( ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) ) )
            // Sql.g:5331:2: ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) )
            {
            // Sql.g:5331:2: ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) )
            // Sql.g:5331:3: ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ )
            {
            // Sql.g:5331:3: ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='.') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Sql.g:5331:4: ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )?
                    {
                    // Sql.g:5331:4: ( ( '0' .. '9' ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    // Sql.g:5331:17: ( '.' ( ( ( '0' .. '9' ) )+ )? )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='.') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Sql.g:5331:18: '.' ( ( ( '0' .. '9' ) )+ )?
                            {
                            match('.'); 

                            // Sql.g:5331:21: ( ( ( '0' .. '9' ) )+ )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // Sql.g:5331:22: ( ( '0' .. '9' ) )+
                                    {
                                    // Sql.g:5331:22: ( ( '0' .. '9' ) )+
                                    int cnt5=0;
                                    loop5:
                                    do {
                                        int alt5=2;
                                        int LA5_0 = input.LA(1);

                                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                                            alt5=1;
                                        }


                                        switch (alt5) {
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
                                    	    if ( cnt5 >= 1 ) break loop5;
                                                EarlyExitException eee =
                                                    new EarlyExitException(5, input);
                                                throw eee;
                                        }
                                        cnt5++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:5331:40: '.' ( ( '0' .. '9' ) )+
                    {
                    match('.'); 

                    // Sql.g:5331:43: ( ( '0' .. '9' ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXACT_NUMERIC_LITERAL"

    // $ANTLR start "APPROXIMATE_NUMERIC_LITERAL"
    public final void mAPPROXIMATE_NUMERIC_LITERAL() throws RecognitionException {
        try {
            int _type = APPROXIMATE_NUMERIC_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5333:28: ( ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) 'E' ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) )
            // Sql.g:5334:2: ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) 'E' ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Sql.g:5334:2: ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) 'E' ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            // Sql.g:5334:3: ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) 'E' ( '+' | '-' )? ( ( '0' .. '9' ) )+
            {
            // Sql.g:5334:3: ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                alt15=1;
            }
            else if ( (LA15_0=='.') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Sql.g:5334:4: ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )?
                    {
                    // Sql.g:5334:4: ( ( '0' .. '9' ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    // Sql.g:5334:17: ( '.' ( ( ( '0' .. '9' ) )+ )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='.') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Sql.g:5334:18: '.' ( ( ( '0' .. '9' ) )+ )?
                            {
                            match('.'); 

                            // Sql.g:5334:21: ( ( ( '0' .. '9' ) )+ )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // Sql.g:5334:22: ( ( '0' .. '9' ) )+
                                    {
                                    // Sql.g:5334:22: ( ( '0' .. '9' ) )+
                                    int cnt11=0;
                                    loop11:
                                    do {
                                        int alt11=2;
                                        int LA11_0 = input.LA(1);

                                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                                            alt11=1;
                                        }


                                        switch (alt11) {
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
                                    	    if ( cnt11 >= 1 ) break loop11;
                                                EarlyExitException eee =
                                                    new EarlyExitException(11, input);
                                                throw eee;
                                        }
                                        cnt11++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Sql.g:5334:40: '.' ( ( '0' .. '9' ) )+
                    {
                    match('.'); 

                    // Sql.g:5334:43: ( ( '0' .. '9' ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }


            match('E'); 

            // Sql.g:5334:60: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Sql.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // Sql.g:5334:70: ( ( '0' .. '9' ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // $ANTLR end "APPROXIMATE_NUMERIC_LITERAL"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5336:14: ( ( '\\'' (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )* '\\'' ) )
            // Sql.g:5337:2: ( '\\'' (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )* '\\'' )
            {
            // Sql.g:5337:2: ( '\\'' (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )* '\\'' )
            // Sql.g:5337:3: '\\'' (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )* '\\''
            {
            match('\''); 

            // Sql.g:5337:7: (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\'') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='\'') ) {
                        alt18=2;
                    }


                }
                else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\t')||(LA18_0 >= '\u000B' && LA18_0 <= '\f')||(LA18_0 >= '\u000E' && LA18_0 <= '&')||(LA18_0 >= '(' && LA18_0 <= '\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Sql.g:5337:8: ~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // Sql.g:5337:35: ( '\\'' '\\'' )
            	    {
            	    // Sql.g:5337:35: ( '\\'' '\\'' )
            	    // Sql.g:5337:36: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match('\''); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5339:11: ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' ) ) )
            // Sql.g:5340:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' ) )
            {
            // Sql.g:5340:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' ) )
            // Sql.g:5340:3: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' )
            {
            // Sql.g:5340:3: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0 >= 'A' && LA21_0 <= 'Z')||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='\"') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // Sql.g:5340:4: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )*
                    {
                    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Sql.g:5340:23: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Sql.g:5340:63: '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"'
                    {
                    match('\"'); 

                    // Sql.g:5340:66: (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\"') ) {
                            int LA20_1 = input.LA(2);

                            if ( (LA20_1=='\"') ) {
                                alt20=2;
                            }


                        }
                        else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\t')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= '\uFFFF')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Sql.g:5340:67: ~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // Sql.g:5340:93: ( '\"' '\"' )
                    	    {
                    	    // Sql.g:5340:93: ( '\"' '\"' )
                    	    // Sql.g:5340:94: '\"' '\"'
                    	    {
                    	    match('\"'); 

                    	    match('\"'); 

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    match('\"'); 

                    }
                    break;

            }


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

    public void mTokens() throws RecognitionException {
        // Sql.g:1:8: ( T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | KEYWORD_N | KEYWORD_DATE | KEYWORD_TIME | KEYWORD_TIMESTAMP | KEYWORD_CREATE | KEYWORD_TEMPORARY | KEYWORD_TABLE | KEYWORD_DEFAULT | KEYWORD_COLLATE | KEYWORD_CONSTRAINT | KEYWORD_NOT | KEYWORD_NULL | KEYWORD_REFERENCES | KEYWORD_FOREIGN | KEYWORD_KEY | KEYWORD_CHARACTER | KEYWORD_SET | KEYWORD_ZONE | KEYWORD_BOOLEAN | WHITESPACE | SIMPLE_COMMENT | BRACKETED_COMMENT | UNSIGNED_INTEGER | EXACT_NUMERIC_LITERAL | APPROXIMATE_NUMERIC_LITERAL | QUOTED_STRING | IDENTIFIER )
        int alt22=75;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // Sql.g:1:10: T__57
                {
                mT__57(); 


                }
                break;
            case 2 :
                // Sql.g:1:16: T__58
                {
                mT__58(); 


                }
                break;
            case 3 :
                // Sql.g:1:22: T__59
                {
                mT__59(); 


                }
                break;
            case 4 :
                // Sql.g:1:28: T__60
                {
                mT__60(); 


                }
                break;
            case 5 :
                // Sql.g:1:34: T__61
                {
                mT__61(); 


                }
                break;
            case 6 :
                // Sql.g:1:40: T__62
                {
                mT__62(); 


                }
                break;
            case 7 :
                // Sql.g:1:46: T__63
                {
                mT__63(); 


                }
                break;
            case 8 :
                // Sql.g:1:52: T__64
                {
                mT__64(); 


                }
                break;
            case 9 :
                // Sql.g:1:58: T__65
                {
                mT__65(); 


                }
                break;
            case 10 :
                // Sql.g:1:64: T__66
                {
                mT__66(); 


                }
                break;
            case 11 :
                // Sql.g:1:70: T__67
                {
                mT__67(); 


                }
                break;
            case 12 :
                // Sql.g:1:76: T__68
                {
                mT__68(); 


                }
                break;
            case 13 :
                // Sql.g:1:82: T__69
                {
                mT__69(); 


                }
                break;
            case 14 :
                // Sql.g:1:88: T__70
                {
                mT__70(); 


                }
                break;
            case 15 :
                // Sql.g:1:94: T__71
                {
                mT__71(); 


                }
                break;
            case 16 :
                // Sql.g:1:100: T__72
                {
                mT__72(); 


                }
                break;
            case 17 :
                // Sql.g:1:106: T__73
                {
                mT__73(); 


                }
                break;
            case 18 :
                // Sql.g:1:112: T__74
                {
                mT__74(); 


                }
                break;
            case 19 :
                // Sql.g:1:118: T__75
                {
                mT__75(); 


                }
                break;
            case 20 :
                // Sql.g:1:124: T__76
                {
                mT__76(); 


                }
                break;
            case 21 :
                // Sql.g:1:130: T__77
                {
                mT__77(); 


                }
                break;
            case 22 :
                // Sql.g:1:136: T__78
                {
                mT__78(); 


                }
                break;
            case 23 :
                // Sql.g:1:142: T__79
                {
                mT__79(); 


                }
                break;
            case 24 :
                // Sql.g:1:148: T__80
                {
                mT__80(); 


                }
                break;
            case 25 :
                // Sql.g:1:154: T__81
                {
                mT__81(); 


                }
                break;
            case 26 :
                // Sql.g:1:160: T__82
                {
                mT__82(); 


                }
                break;
            case 27 :
                // Sql.g:1:166: T__83
                {
                mT__83(); 


                }
                break;
            case 28 :
                // Sql.g:1:172: T__84
                {
                mT__84(); 


                }
                break;
            case 29 :
                // Sql.g:1:178: T__85
                {
                mT__85(); 


                }
                break;
            case 30 :
                // Sql.g:1:184: T__86
                {
                mT__86(); 


                }
                break;
            case 31 :
                // Sql.g:1:190: T__87
                {
                mT__87(); 


                }
                break;
            case 32 :
                // Sql.g:1:196: T__88
                {
                mT__88(); 


                }
                break;
            case 33 :
                // Sql.g:1:202: T__89
                {
                mT__89(); 


                }
                break;
            case 34 :
                // Sql.g:1:208: T__90
                {
                mT__90(); 


                }
                break;
            case 35 :
                // Sql.g:1:214: T__91
                {
                mT__91(); 


                }
                break;
            case 36 :
                // Sql.g:1:220: T__92
                {
                mT__92(); 


                }
                break;
            case 37 :
                // Sql.g:1:226: T__93
                {
                mT__93(); 


                }
                break;
            case 38 :
                // Sql.g:1:232: T__94
                {
                mT__94(); 


                }
                break;
            case 39 :
                // Sql.g:1:238: T__95
                {
                mT__95(); 


                }
                break;
            case 40 :
                // Sql.g:1:244: T__96
                {
                mT__96(); 


                }
                break;
            case 41 :
                // Sql.g:1:250: T__97
                {
                mT__97(); 


                }
                break;
            case 42 :
                // Sql.g:1:256: T__98
                {
                mT__98(); 


                }
                break;
            case 43 :
                // Sql.g:1:262: T__99
                {
                mT__99(); 


                }
                break;
            case 44 :
                // Sql.g:1:268: T__100
                {
                mT__100(); 


                }
                break;
            case 45 :
                // Sql.g:1:275: T__101
                {
                mT__101(); 


                }
                break;
            case 46 :
                // Sql.g:1:282: T__102
                {
                mT__102(); 


                }
                break;
            case 47 :
                // Sql.g:1:289: T__103
                {
                mT__103(); 


                }
                break;
            case 48 :
                // Sql.g:1:296: T__104
                {
                mT__104(); 


                }
                break;
            case 49 :
                // Sql.g:1:303: KEYWORD_N
                {
                mKEYWORD_N(); 


                }
                break;
            case 50 :
                // Sql.g:1:313: KEYWORD_DATE
                {
                mKEYWORD_DATE(); 


                }
                break;
            case 51 :
                // Sql.g:1:326: KEYWORD_TIME
                {
                mKEYWORD_TIME(); 


                }
                break;
            case 52 :
                // Sql.g:1:339: KEYWORD_TIMESTAMP
                {
                mKEYWORD_TIMESTAMP(); 


                }
                break;
            case 53 :
                // Sql.g:1:357: KEYWORD_CREATE
                {
                mKEYWORD_CREATE(); 


                }
                break;
            case 54 :
                // Sql.g:1:372: KEYWORD_TEMPORARY
                {
                mKEYWORD_TEMPORARY(); 


                }
                break;
            case 55 :
                // Sql.g:1:390: KEYWORD_TABLE
                {
                mKEYWORD_TABLE(); 


                }
                break;
            case 56 :
                // Sql.g:1:404: KEYWORD_DEFAULT
                {
                mKEYWORD_DEFAULT(); 


                }
                break;
            case 57 :
                // Sql.g:1:420: KEYWORD_COLLATE
                {
                mKEYWORD_COLLATE(); 


                }
                break;
            case 58 :
                // Sql.g:1:436: KEYWORD_CONSTRAINT
                {
                mKEYWORD_CONSTRAINT(); 


                }
                break;
            case 59 :
                // Sql.g:1:455: KEYWORD_NOT
                {
                mKEYWORD_NOT(); 


                }
                break;
            case 60 :
                // Sql.g:1:467: KEYWORD_NULL
                {
                mKEYWORD_NULL(); 


                }
                break;
            case 61 :
                // Sql.g:1:480: KEYWORD_REFERENCES
                {
                mKEYWORD_REFERENCES(); 


                }
                break;
            case 62 :
                // Sql.g:1:499: KEYWORD_FOREIGN
                {
                mKEYWORD_FOREIGN(); 


                }
                break;
            case 63 :
                // Sql.g:1:515: KEYWORD_KEY
                {
                mKEYWORD_KEY(); 


                }
                break;
            case 64 :
                // Sql.g:1:527: KEYWORD_CHARACTER
                {
                mKEYWORD_CHARACTER(); 


                }
                break;
            case 65 :
                // Sql.g:1:545: KEYWORD_SET
                {
                mKEYWORD_SET(); 


                }
                break;
            case 66 :
                // Sql.g:1:557: KEYWORD_ZONE
                {
                mKEYWORD_ZONE(); 


                }
                break;
            case 67 :
                // Sql.g:1:570: KEYWORD_BOOLEAN
                {
                mKEYWORD_BOOLEAN(); 


                }
                break;
            case 68 :
                // Sql.g:1:586: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 69 :
                // Sql.g:1:597: SIMPLE_COMMENT
                {
                mSIMPLE_COMMENT(); 


                }
                break;
            case 70 :
                // Sql.g:1:612: BRACKETED_COMMENT
                {
                mBRACKETED_COMMENT(); 


                }
                break;
            case 71 :
                // Sql.g:1:630: UNSIGNED_INTEGER
                {
                mUNSIGNED_INTEGER(); 


                }
                break;
            case 72 :
                // Sql.g:1:647: EXACT_NUMERIC_LITERAL
                {
                mEXACT_NUMERIC_LITERAL(); 


                }
                break;
            case 73 :
                // Sql.g:1:669: APPROXIMATE_NUMERIC_LITERAL
                {
                mAPPROXIMATE_NUMERIC_LITERAL(); 


                }
                break;
            case 74 :
                // Sql.g:1:697: QUOTED_STRING
                {
                mQUOTED_STRING(); 


                }
                break;
            case 75 :
                // Sql.g:1:711: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\4\uffff\1\51\1\uffff\4\50\1\74\1\50\1\76\1\50\1\101\1\105\10\50"+
        "\1\uffff\1\105\11\50\3\uffff\1\126\3\uffff\1\131\21\50\1\uffff\1"+
        "\50\1\uffff\2\50\1\uffff\3\50\1\uffff\20\50\1\uffff\1\131\2\uffff"+
        "\13\50\1\u0090\7\50\1\u0099\1\u009a\5\50\1\u00a0\5\50\1\u00a6\10"+
        "\50\1\131\2\50\1\u00b1\1\50\1\u00b5\7\50\1\uffff\2\50\1\u00bf\5"+
        "\50\2\uffff\4\50\1\u00c9\1\uffff\2\50\1\u00cc\2\50\1\uffff\1\u00cf"+
        "\1\u00d0\4\50\1\u00d7\1\u00d8\2\50\1\uffff\1\50\1\uffff\1\50\1\uffff"+
        "\11\50\1\uffff\1\u00e6\1\u00e7\3\50\1\u00ec\1\50\1\u00ef\1\50\1"+
        "\uffff\2\50\1\uffff\2\50\2\uffff\2\50\1\u00f7\3\50\2\uffff\1\u00fb"+
        "\10\50\1\u0104\3\50\2\uffff\1\50\1\u0109\2\50\1\uffff\1\50\2\uffff"+
        "\1\50\1\u010e\5\50\1\uffff\1\u0114\2\50\2\uffff\1\u0117\3\50\1\u011b"+
        "\2\50\1\uffff\1\u011e\1\u011f\1\uffff\1\u0120\1\uffff\1\u0121\2"+
        "\50\1\u0124\1\uffff\5\50\1\uffff\1\u012a\1\u012b\1\uffff\3\50\1"+
        "\uffff\2\50\4\uffff\2\50\2\uffff\1\50\1\u0135\2\50\2\uffff\1\u013a"+
        "\1\u013b\4\50\1\u0141\1\uffff\1\50\1\uffff\1\u0144\1\u0145\1\uffff"+
        "\1\u0146\2\uffff\1\u0147\1\u0148\3\50\2\uffff\1\u014d\5\uffff\3"+
        "\50\2\uffff\1\u0152\1\u0154\1\50\2\uffff\1\50\1\uffff\1\50\1\u015b"+
        "\1\50\1\u015d\3\uffff\1\50\2\uffff\1\50\1\uffff\1\u0163\2\uffff"+
        "\1\u0166\2\uffff";
    static final String DFA22_eofS =
        "\u0167\uffff";
    static final String DFA22_minS =
        "\1\11\3\uffff\1\60\1\uffff\1\111\1\110\2\101\1\60\1\116\1\60\1\117"+
        "\2\60\1\103\1\122\2\105\1\101\1\116\1\101\1\111\1\uffff\1\60\2\101"+
        "\1\110\1\105\1\117\2\105\2\117\3\uffff\1\56\3\uffff\1\60\1\107\2"+
        "\117\1\101\1\104\1\122\1\105\1\114\1\101\1\103\1\125\1\124\1\106"+
        "\1\114\1\117\1\122\1\117\1\uffff\1\124\1\uffff\1\131\1\103\1\uffff"+
        "\1\124\1\110\1\114\1\uffff\1\124\1\114\1\124\1\111\1\101\1\106\1"+
        "\101\1\124\1\125\2\115\1\102\1\111\1\122\1\124\1\116\1\uffff\1\60"+
        "\2\uffff\1\111\1\101\1\102\1\114\2\122\1\105\1\114\1\123\1\122\1"+
        "\101\1\60\1\101\1\102\1\105\1\123\1\101\1\105\1\102\2\60\1\101\1"+
        "\111\1\101\1\105\1\114\1\60\1\105\1\115\1\114\1\105\1\114\1\60\2"+
        "\105\1\120\1\114\1\121\1\103\1\110\1\105\1\60\1\116\1\122\1\60\1"+
        "\105\1\40\1\101\1\137\1\101\1\124\1\105\1\124\1\115\1\uffff\1\125"+
        "\1\114\1\60\1\105\1\124\1\111\1\101\1\107\2\uffff\1\114\1\117\2"+
        "\122\1\60\1\uffff\1\124\1\101\1\60\1\122\1\114\1\uffff\2\60\1\117"+
        "\1\105\1\125\1\110\2\60\1\124\1\131\1\uffff\1\101\1\uffff\1\103"+
        "\1\uffff\1\103\1\125\1\124\1\122\1\116\1\105\1\101\1\114\1\105\1"+
        "\uffff\2\60\1\107\1\114\1\105\1\60\1\116\1\40\1\111\1\uffff\1\123"+
        "\1\122\1\uffff\1\105\1\111\2\uffff\1\124\1\122\1\60\1\105\1\101"+
        "\1\125\2\uffff\1\60\1\40\1\116\2\124\1\116\1\105\1\101\1\124\1\60"+
        "\1\114\1\124\1\40\2\uffff\1\116\1\60\1\122\1\111\1\uffff\1\101\2"+
        "\uffff\1\103\1\60\1\131\2\116\2\101\1\uffff\1\60\1\122\1\124\2\uffff"+
        "\1\60\2\105\1\111\1\60\1\111\1\137\1\uffff\2\60\1\uffff\1\60\1\uffff"+
        "\1\60\1\115\1\114\1\60\1\uffff\1\40\1\103\1\124\1\115\1\122\1\uffff"+
        "\2\60\1\uffff\2\122\1\124\1\uffff\1\116\1\104\4\uffff\1\105\1\40"+
        "\2\uffff\1\105\1\60\1\120\1\131\2\uffff\1\40\1\60\1\123\1\124\1"+
        "\101\1\111\1\60\1\103\1\123\1\uffff\2\60\1\uffff\1\60\2\uffff\2"+
        "\60\1\124\1\115\1\124\1\uffff\1\110\1\60\5\uffff\2\105\2\101\1\uffff"+
        "\2\60\1\115\1\122\1\uffff\1\124\1\uffff\1\120\1\40\1\101\1\60\1"+
        "\uffff\1\103\1\uffff\1\115\1\uffff\1\124\1\120\1\105\1\60\1\122"+
        "\1\uffff\1\40\2\uffff";
    static final String DFA22_maxS =
        "\1\ufeff\3\uffff\1\71\1\uffff\1\157\1\162\1\145\1\157\1\172\1\116"+
        "\1\172\1\117\2\172\1\103\1\122\2\145\1\151\1\116\1\101\1\111\1\uffff"+
        "\1\172\1\145\1\151\1\162\1\145\1\157\2\145\2\157\3\uffff\1\105\3"+
        "\uffff\1\105\1\116\1\117\1\157\1\141\1\156\1\122\1\145\1\156\1\141"+
        "\1\146\1\125\1\164\1\146\1\114\1\117\1\162\1\117\1\uffff\1\124\1"+
        "\uffff\1\171\1\103\1\uffff\1\124\1\110\1\154\1\uffff\1\164\1\154"+
        "\1\124\1\111\2\146\1\101\1\164\1\125\2\155\1\142\1\111\1\122\1\124"+
        "\1\156\1\uffff\1\105\2\uffff\1\111\1\101\1\102\1\154\2\162\1\105"+
        "\1\154\1\163\1\122\1\141\1\172\1\141\1\102\1\145\1\123\1\101\1\145"+
        "\1\102\2\172\1\101\1\111\1\101\1\105\1\154\1\172\1\105\1\115\1\114"+
        "\1\145\1\114\1\172\1\105\1\145\1\160\1\154\1\121\1\103\1\110\1\145"+
        "\1\105\1\116\1\122\1\172\1\145\1\172\1\141\1\137\1\141\1\164\1\105"+
        "\1\164\1\115\1\uffff\1\165\1\114\1\172\1\105\1\124\1\151\1\101\1"+
        "\107\2\uffff\1\114\1\117\2\122\1\172\1\uffff\1\124\1\101\1\172\1"+
        "\162\1\114\1\uffff\2\172\1\157\1\145\1\125\1\110\2\172\1\124\1\131"+
        "\1\uffff\1\141\1\uffff\1\143\1\uffff\1\143\1\125\1\164\1\162\1\116"+
        "\1\145\1\101\1\154\1\105\1\uffff\2\172\1\147\1\114\1\105\1\172\1"+
        "\116\1\172\1\111\1\uffff\1\123\1\122\1\uffff\1\145\1\111\2\uffff"+
        "\1\164\1\162\1\172\1\105\1\101\1\125\2\uffff\1\172\1\40\1\156\2"+
        "\164\1\116\1\145\1\141\1\124\1\172\1\114\1\164\1\40\2\uffff\1\156"+
        "\1\172\1\122\1\111\1\uffff\1\101\2\uffff\1\103\1\172\1\131\1\156"+
        "\1\116\2\141\1\uffff\1\172\1\122\1\124\2\uffff\1\172\2\145\1\111"+
        "\1\172\1\151\1\137\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\115"+
        "\1\114\1\172\1\uffff\1\40\1\143\1\124\1\155\1\162\1\uffff\2\172"+
        "\1\uffff\2\162\1\124\1\uffff\1\156\1\124\4\uffff\1\105\1\40\2\uffff"+
        "\1\145\1\172\1\160\1\171\2\uffff\2\172\1\123\1\164\1\101\1\111\1"+
        "\172\1\103\1\163\1\uffff\2\172\1\uffff\1\172\2\uffff\2\172\1\124"+
        "\1\115\1\124\1\uffff\1\110\1\172\5\uffff\2\105\2\101\1\uffff\2\172"+
        "\1\115\1\122\1\uffff\1\124\1\uffff\1\120\2\101\1\172\1\uffff\1\103"+
        "\1\uffff\1\115\1\uffff\1\124\1\120\1\105\1\172\1\122\1\uffff\1\40"+
        "\2\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\22\uffff\1\60\12\uffff\1\104\1"+
        "\105\1\106\1\uffff\1\112\1\113\1\4\22\uffff\1\27\1\uffff\1\33\2"+
        "\uffff\1\37\3\uffff\1\61\20\uffff\1\107\1\uffff\1\111\1\110\66\uffff"+
        "\1\22\10\uffff\1\31\1\77\5\uffff\1\73\5\uffff\1\101\12\uffff\1\10"+
        "\1\uffff\1\11\1\uffff\1\12\11\uffff\1\62\11\uffff\1\74\2\uffff\1"+
        "\51\2\uffff\1\53\1\63\6\uffff\1\56\1\102\15\uffff\1\25\1\26\4\uffff"+
        "\1\34\1\uffff\1\44\1\45\7\uffff\1\67\3\uffff\1\6\1\7\7\uffff\1\65"+
        "\2\uffff\1\24\1\uffff\1\30\4\uffff\1\47\5\uffff\1\54\2\uffff\1\103"+
        "\3\uffff\1\71\2\uffff\1\23\1\70\1\76\1\32\2\uffff\1\46\1\50\4\uffff"+
        "\1\55\1\57\11\uffff\1\52\2\uffff\1\13\1\uffff\1\14\1\100\5\uffff"+
        "\1\35\2\uffff\1\64\1\66\1\15\1\16\1\72\4\uffff\1\75\4\uffff\1\17"+
        "\1\uffff\1\20\4\uffff\1\40\1\uffff\1\41\1\uffff\1\36\5\uffff\1\21"+
        "\1\uffff\1\42\1\43";
    static final String DFA22_specialS =
        "\u0167\uffff}>";
    static final String[] DFA22_transitionS = {
            "\5\43\22\uffff\1\43\1\uffff\1\50\4\uffff\1\47\1\1\1\2\2\uffff"+
            "\1\3\1\44\1\4\1\45\12\46\1\uffff\1\5\5\uffff\1\50\1\6\1\7\1"+
            "\10\1\50\1\11\1\12\1\50\1\13\1\50\1\14\1\15\1\16\1\17\1\20\1"+
            "\21\1\50\1\22\1\23\1\24\1\25\1\26\1\27\2\50\1\41\4\uffff\1\30"+
            "\1\uffff\1\50\1\42\1\34\1\32\1\50\1\36\4\50\1\37\2\50\1\31\3"+
            "\50\1\35\1\40\1\33\5\50\1\41\45\uffff\1\43\u1f5f\uffff\20\43"+
            "\30\uffff\2\43\u0fd6\uffff\1\43\ucefe\uffff\1\43",
            "",
            "",
            "",
            "\12\52",
            "",
            "\1\53\2\uffff\1\54\2\uffff\1\55\37\uffff\1\55",
            "\1\56\6\uffff\1\57\2\uffff\1\61\2\uffff\1\60\22\uffff\1\63"+
            "\6\uffff\1\62\2\uffff\1\61",
            "\1\66\3\uffff\1\64\11\uffff\1\65\21\uffff\1\66\3\uffff\1\67",
            "\1\70\12\uffff\1\71\2\uffff\1\72\37\uffff\1\72",
            "\12\50\7\uffff\13\50\1\73\16\50\4\uffff\1\50\1\uffff\32\50",
            "\1\75",
            "\12\50\7\uffff\4\50\1\77\25\50\4\uffff\1\50\1\uffff\4\50\1"+
            "\77\25\50",
            "\1\100",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\1\102\1\50\1\103\13\50\1\106\5\50\1\104\5\50"+
            "\4\uffff\1\50\1\uffff\16\50\1\106\5\50\1\107\5\50",
            "\1\110",
            "\1\111",
            "\1\112\37\uffff\1\113",
            "\1\115\7\uffff\1\114\27\uffff\1\115",
            "\1\121\3\uffff\1\120\3\uffff\1\117\10\uffff\1\116\16\uffff"+
            "\1\121\3\uffff\1\120\3\uffff\1\117",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\12\50\7\uffff\16\50\1\106\5\50\1\107\5\50\4\uffff\1\50\1\uffff"+
            "\16\50\1\106\5\50\1\107\5\50",
            "\1\66\3\uffff\1\67\33\uffff\1\66\3\uffff\1\67",
            "\1\121\3\uffff\1\120\3\uffff\1\117\27\uffff\1\121\3\uffff\1"+
            "\120\3\uffff\1\117",
            "\1\63\6\uffff\1\62\2\uffff\1\61\25\uffff\1\63\6\uffff\1\62"+
            "\2\uffff\1\61",
            "\1\113\37\uffff\1\113",
            "\1\72\37\uffff\1\72",
            "\1\77\37\uffff\1\77",
            "\1\115\37\uffff\1\115",
            "\1\125\37\uffff\1\125",
            "\1\55\37\uffff\1\55",
            "",
            "",
            "",
            "\1\127\1\uffff\12\46\13\uffff\1\130",
            "",
            "",
            "",
            "\12\52\13\uffff\1\130",
            "\1\132\6\uffff\1\133",
            "\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\137",
            "\1\140\7\uffff\1\141\1\uffff\1\142\35\uffff\1\141\1\uffff\1"+
            "\142",
            "\1\143",
            "\1\144\37\uffff\1\144",
            "\1\141\1\uffff\1\142\35\uffff\1\141\1\uffff\1\142",
            "\1\137\37\uffff\1\137",
            "\1\145\2\uffff\1\146\37\uffff\1\146",
            "\1\147",
            "\1\150\37\uffff\1\150",
            "\1\146\37\uffff\1\146",
            "\1\151",
            "\1\152",
            "\1\153\37\uffff\1\153",
            "\1\154",
            "",
            "\1\155",
            "",
            "\1\156\37\uffff\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\163\1\162\36\uffff\1\163",
            "",
            "\1\164\37\uffff\1\164",
            "\1\163\37\uffff\1\163",
            "\1\165",
            "\1\166",
            "\1\167\4\uffff\1\170\37\uffff\1\170",
            "\1\170\37\uffff\1\170",
            "\1\171",
            "\1\172\37\uffff\1\172",
            "\1\173",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "\1\176\37\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "",
            "\12\u0083\13\uffff\1\130",
            "",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0089",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\12\50\7\uffff\10\50\1\u008f\21\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097",
            "\12\50\7\uffff\4\50\1\u0098\25\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\12\u0083\13\uffff\1\130",
            "\1\u00af",
            "\1\u00b0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\17\uffff\12\50\7\uffff\1\u00b4\31\50\4\uffff\1\50"+
            "\1\uffff\1\u00b6\31\50",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\22\50\1\u00d1\7\50\4\uffff\1\50\1\uffff\22\50"+
            "\1\u00d1\7\50",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\50\7\uffff\16\50\1\u00d6\13\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db\37\uffff\1\u00db",
            "",
            "\1\u00dc\37\uffff\1\u00dd",
            "",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\50\7\uffff\23\50\1\u00eb\6\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ed",
            "\1\u00ee\17\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff"+
            "\32\50",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4",
            "",
            "",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6\37\uffff\1\u00f6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00ff",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107",
            "",
            "",
            "\1\u0108\37\uffff\1\u0108",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "",
            "",
            "\1\u010d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0115",
            "\1\u0116",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0118\37\uffff\1\u0119",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0122",
            "\1\u0123",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u012c\37\uffff\1\u012d",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\17\uffff\1\u0131",
            "",
            "",
            "",
            "",
            "\1\u0132",
            "\1\u0133",
            "",
            "",
            "\1\u0134\37\uffff\1\u0134",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0136\37\uffff\1\u0136",
            "\1\u0137\37\uffff\1\u0137",
            "",
            "",
            "\1\u0138\17\uffff\12\50\7\uffff\22\50\1\u0139\7\50\4\uffff"+
            "\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\50\7\uffff\22\50\1\u0140\7\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\1\u014c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\22\50\1\u0153\7\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0155",
            "\1\u0156",
            "",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\u0159\40\uffff\1\u015a",
            "\1\u015c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u015e",
            "",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0164",
            "",
            "\1\u0165",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | KEYWORD_N | KEYWORD_DATE | KEYWORD_TIME | KEYWORD_TIMESTAMP | KEYWORD_CREATE | KEYWORD_TEMPORARY | KEYWORD_TABLE | KEYWORD_DEFAULT | KEYWORD_COLLATE | KEYWORD_CONSTRAINT | KEYWORD_NOT | KEYWORD_NULL | KEYWORD_REFERENCES | KEYWORD_FOREIGN | KEYWORD_KEY | KEYWORD_CHARACTER | KEYWORD_SET | KEYWORD_ZONE | KEYWORD_BOOLEAN | WHITESPACE | SIMPLE_COMMENT | BRACKETED_COMMENT | UNSIGNED_INTEGER | EXACT_NUMERIC_LITERAL | APPROXIMATE_NUMERIC_LITERAL | QUOTED_STRING | IDENTIFIER );";
        }
    }
 

}