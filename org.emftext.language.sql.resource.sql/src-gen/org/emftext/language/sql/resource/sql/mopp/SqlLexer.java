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
    public static final int KEYWORD_LARGE=17;
    public static final int KEYWORD_N=18;
    public static final int KEYWORD_NATIONAL=19;
    public static final int KEYWORD_NOT=20;
    public static final int KEYWORD_NULL=21;
    public static final int KEYWORD_OBJECT=22;
    public static final int KEYWORD_PRECISION=23;
    public static final int KEYWORD_REFERENCES=24;
    public static final int KEYWORD_SET=25;
    public static final int KEYWORD_TABLE=26;
    public static final int KEYWORD_TEMPORARY=27;
    public static final int KEYWORD_TIME=28;
    public static final int KEYWORD_TIMESTAMP=29;
    public static final int KEYWORD_VARYING=30;
    public static final int KEYWORD_ZONE=31;
    public static final int LETTER_A=32;
    public static final int LETTER_B=33;
    public static final int LETTER_C=34;
    public static final int LETTER_D=35;
    public static final int LETTER_E=36;
    public static final int LETTER_F=37;
    public static final int LETTER_G=38;
    public static final int LETTER_H=39;
    public static final int LETTER_I=40;
    public static final int LETTER_J=41;
    public static final int LETTER_K=42;
    public static final int LETTER_L=43;
    public static final int LETTER_M=44;
    public static final int LETTER_N=45;
    public static final int LETTER_O=46;
    public static final int LETTER_P=47;
    public static final int LETTER_Q=48;
    public static final int LETTER_R=49;
    public static final int LETTER_S=50;
    public static final int LETTER_T=51;
    public static final int LETTER_U=52;
    public static final int LETTER_V=53;
    public static final int LETTER_W=54;
    public static final int LETTER_X=55;
    public static final int LETTER_Y=56;
    public static final int LETTER_Z=57;
    public static final int QUOTED_STRING=58;
    public static final int SIMPLE_COMMENT=59;
    public static final int UNSIGNED_INTEGER=60;
    public static final int WHITESPACE=61;

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

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:26:7: ( 'BINARY' )
            // Sql.g:26:9: 'BINARY'
            {
            match("BINARY"); 



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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:28:7: ( 'CHAR' )
            // Sql.g:28:9: 'CHAR'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:29:7: ( 'CHARACTER' )
            // Sql.g:29:9: 'CHARACTER'
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:30:7: ( 'CHARACTERS' )
            // Sql.g:30:9: 'CHARACTERS'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:31:7: ( 'CODE_UNITS' )
            // Sql.g:31:9: 'CODE_UNITS'
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:32:7: ( 'CURRENT_DATE' )
            // Sql.g:32:9: 'CURRENT_DATE'
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:33:7: ( 'CURRENT_TIME' )
            // Sql.g:33:9: 'CURRENT_TIME'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:34:7: ( 'CURRENT_TIMESTAMP' )
            // Sql.g:34:9: 'CURRENT_TIMESTAMP'
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:35:7: ( 'DEC' )
            // Sql.g:35:9: 'DEC'
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
            // Sql.g:36:7: ( 'DECIMAL' )
            // Sql.g:36:9: 'DECIMAL'
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
            // Sql.g:37:7: ( 'DOUBLE' )
            // Sql.g:37:9: 'DOUBLE'
            {
            match("DOUBLE"); 



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
            // Sql.g:38:7: ( 'FALSE' )
            // Sql.g:38:9: 'FALSE'
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:39:7: ( 'FLOAT' )
            // Sql.g:39:9: 'FLOAT'
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:40:7: ( 'G' )
            // Sql.g:40:9: 'G'
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:41:7: ( 'GLOBAL' )
            // Sql.g:41:9: 'GLOBAL'
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:42:7: ( 'INT' )
            // Sql.g:42:9: 'INT'
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:43:7: ( 'INTEGER' )
            // Sql.g:43:9: 'INTEGER'
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:44:7: ( 'K' )
            // Sql.g:44:9: 'K'
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:45:7: ( 'LOCAL' )
            // Sql.g:45:9: 'LOCAL'
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:46:7: ( 'LOCALTIME' )
            // Sql.g:46:9: 'LOCALTIME'
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:47:7: ( 'LOCALTIMESTAMP' )
            // Sql.g:47:9: 'LOCALTIMESTAMP'
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:48:7: ( 'M' )
            // Sql.g:48:9: 'M'
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:49:7: ( 'NCHAR' )
            // Sql.g:49:9: 'NCHAR'
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:50:7: ( 'NUMERIC' )
            // Sql.g:50:9: 'NUMERIC'
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:51:7: ( 'OCTETS' )
            // Sql.g:51:9: 'OCTETS'
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:52:7: ( 'PRIMARY KEY' )
            // Sql.g:52:9: 'PRIMARY KEY'
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
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:53:7: ( 'REAL' )
            // Sql.g:53:9: 'REAL'
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
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:54:7: ( 'SMALLINT' )
            // Sql.g:54:9: 'SMALLINT'
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
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:55:7: ( 'TRUE' )
            // Sql.g:55:9: 'TRUE'
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
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:56:7: ( 'UNIQUE' )
            // Sql.g:56:9: 'UNIQUE'
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
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:57:7: ( 'VARCHAR' )
            // Sql.g:57:9: 'VARCHAR'
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
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:58:8: ( 'WITH' )
            // Sql.g:58:10: 'WITH'
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
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:59:8: ( 'WITHOUT' )
            // Sql.g:59:10: 'WITHOUT'
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
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:60:8: ( '_' )
            // Sql.g:60:10: '_'
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
    // $ANTLR end "T__102"

    // $ANTLR start "LETTER_A"
    public final void mLETTER_A() throws RecognitionException {
        try {
            // Sql.g:5467:18: ( ( 'a' | 'A' ) )
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
            // Sql.g:5468:18: ( ( 'b' | 'B' ) )
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
            // Sql.g:5469:18: ( ( 'c' | 'C' ) )
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
            // Sql.g:5470:18: ( ( 'd' | 'D' ) )
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
            // Sql.g:5471:18: ( ( 'e' | 'E' ) )
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
            // Sql.g:5472:18: ( ( 'f' | 'F' ) )
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
            // Sql.g:5473:18: ( ( 'g' | 'G' ) )
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
            // Sql.g:5474:18: ( ( 'h' | 'H' ) )
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
            // Sql.g:5475:18: ( ( 'i' | 'I' ) )
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
            // Sql.g:5476:18: ( ( 'j' | 'J' ) )
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
            // Sql.g:5477:18: ( ( 'k' | 'K' ) )
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
            // Sql.g:5478:18: ( ( 'l' | 'L' ) )
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
            // Sql.g:5479:18: ( ( 'm' | 'M' ) )
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
            // Sql.g:5480:18: ( ( 'n' | 'N' ) )
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
            // Sql.g:5481:18: ( ( 'o' | 'O' ) )
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
            // Sql.g:5482:18: ( ( 'p' | 'P' ) )
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
            // Sql.g:5483:18: ( ( 'q' | 'Q' ) )
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
            // Sql.g:5484:18: ( ( 'r' | 'R' ) )
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
            // Sql.g:5485:18: ( ( 's' | 'S' ) )
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
            // Sql.g:5486:18: ( ( 't' | 'T' ) )
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
            // Sql.g:5487:18: ( ( 'u' | 'U' ) )
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
            // Sql.g:5488:18: ( ( 'v' | 'V' ) )
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
            // Sql.g:5489:18: ( ( 'w' | 'W' ) )
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
            // Sql.g:5490:18: ( ( 'x' | 'X' ) )
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
            // Sql.g:5491:18: ( ( 'y' | 'Y' ) )
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
            // Sql.g:5492:18: ( ( 'z' | 'Z' ) )
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
            // Sql.g:5494:10: ( ( LETTER_N ) )
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
            // Sql.g:5496:13: ( ( LETTER_D LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:5496:15: ( LETTER_D LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:5496:15: ( LETTER_D LETTER_A LETTER_T LETTER_E )
            // Sql.g:5496:16: LETTER_D LETTER_A LETTER_T LETTER_E
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
            // Sql.g:5498:13: ( ( LETTER_T LETTER_I LETTER_M LETTER_E ) )
            // Sql.g:5498:15: ( LETTER_T LETTER_I LETTER_M LETTER_E )
            {
            // Sql.g:5498:15: ( LETTER_T LETTER_I LETTER_M LETTER_E )
            // Sql.g:5498:16: LETTER_T LETTER_I LETTER_M LETTER_E
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
            // Sql.g:5500:18: ( ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P ) )
            // Sql.g:5500:20: ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P )
            {
            // Sql.g:5500:20: ( LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P )
            // Sql.g:5500:21: LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P
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
            // Sql.g:5502:15: ( ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:5502:17: ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:5502:17: ( LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E )
            // Sql.g:5502:18: LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E
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
            // Sql.g:5504:18: ( ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y ) )
            // Sql.g:5504:20: ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y )
            {
            // Sql.g:5504:20: ( LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y )
            // Sql.g:5504:21: LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y
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
            // Sql.g:5506:14: ( ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E ) )
            // Sql.g:5506:16: ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E )
            {
            // Sql.g:5506:16: ( LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E )
            // Sql.g:5506:17: LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E
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
            // Sql.g:5508:16: ( ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T ) )
            // Sql.g:5508:18: ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T )
            {
            // Sql.g:5508:18: ( LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T )
            // Sql.g:5508:19: LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T
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
            // Sql.g:5510:16: ( ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E ) )
            // Sql.g:5510:18: ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E )
            {
            // Sql.g:5510:18: ( LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E )
            // Sql.g:5510:19: LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E
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
            // Sql.g:5512:19: ( ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T ) )
            // Sql.g:5512:21: ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T )
            {
            // Sql.g:5512:21: ( LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T )
            // Sql.g:5512:22: LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T
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
            // Sql.g:5514:12: ( ( LETTER_N LETTER_O LETTER_T ) )
            // Sql.g:5514:14: ( LETTER_N LETTER_O LETTER_T )
            {
            // Sql.g:5514:14: ( LETTER_N LETTER_O LETTER_T )
            // Sql.g:5514:15: LETTER_N LETTER_O LETTER_T
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
            // Sql.g:5516:13: ( ( LETTER_N LETTER_U LETTER_L LETTER_L ) )
            // Sql.g:5516:15: ( LETTER_N LETTER_U LETTER_L LETTER_L )
            {
            // Sql.g:5516:15: ( LETTER_N LETTER_U LETTER_L LETTER_L )
            // Sql.g:5516:16: LETTER_N LETTER_U LETTER_L LETTER_L
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
            // Sql.g:5518:19: ( ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S ) )
            // Sql.g:5518:21: ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S )
            {
            // Sql.g:5518:21: ( LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S )
            // Sql.g:5518:22: LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S
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
            // Sql.g:5520:16: ( ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N ) )
            // Sql.g:5520:18: ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N )
            {
            // Sql.g:5520:18: ( LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N )
            // Sql.g:5520:19: LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N
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
            // Sql.g:5522:12: ( ( LETTER_K LETTER_E LETTER_Y ) )
            // Sql.g:5522:14: ( LETTER_K LETTER_E LETTER_Y )
            {
            // Sql.g:5522:14: ( LETTER_K LETTER_E LETTER_Y )
            // Sql.g:5522:15: LETTER_K LETTER_E LETTER_Y
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

    // $ANTLR start "KEYWORD_PRECISION"
    public final void mKEYWORD_PRECISION() throws RecognitionException {
        try {
            int _type = KEYWORD_PRECISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5524:18: ( ( LETTER_P LETTER_R LETTER_E LETTER_C LETTER_I LETTER_S LETTER_I LETTER_O LETTER_N ) )
            // Sql.g:5524:20: ( LETTER_P LETTER_R LETTER_E LETTER_C LETTER_I LETTER_S LETTER_I LETTER_O LETTER_N )
            {
            // Sql.g:5524:20: ( LETTER_P LETTER_R LETTER_E LETTER_C LETTER_I LETTER_S LETTER_I LETTER_O LETTER_N )
            // Sql.g:5524:21: LETTER_P LETTER_R LETTER_E LETTER_C LETTER_I LETTER_S LETTER_I LETTER_O LETTER_N
            {
            mLETTER_P(); 


            mLETTER_R(); 


            mLETTER_E(); 


            mLETTER_C(); 


            mLETTER_I(); 


            mLETTER_S(); 


            mLETTER_I(); 


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
    // $ANTLR end "KEYWORD_PRECISION"

    // $ANTLR start "KEYWORD_VARYING"
    public final void mKEYWORD_VARYING() throws RecognitionException {
        try {
            int _type = KEYWORD_VARYING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5526:16: ( ( LETTER_V LETTER_A LETTER_R LETTER_Y LETTER_I LETTER_N LETTER_G ) )
            // Sql.g:5526:18: ( LETTER_V LETTER_A LETTER_R LETTER_Y LETTER_I LETTER_N LETTER_G )
            {
            // Sql.g:5526:18: ( LETTER_V LETTER_A LETTER_R LETTER_Y LETTER_I LETTER_N LETTER_G )
            // Sql.g:5526:19: LETTER_V LETTER_A LETTER_R LETTER_Y LETTER_I LETTER_N LETTER_G
            {
            mLETTER_V(); 


            mLETTER_A(); 


            mLETTER_R(); 


            mLETTER_Y(); 


            mLETTER_I(); 


            mLETTER_N(); 


            mLETTER_G(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD_VARYING"

    // $ANTLR start "KEYWORD_CHARACTER"
    public final void mKEYWORD_CHARACTER() throws RecognitionException {
        try {
            int _type = KEYWORD_CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5528:18: ( ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R ) )
            // Sql.g:5528:20: ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R )
            {
            // Sql.g:5528:20: ( LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R )
            // Sql.g:5528:21: LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R
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
            // Sql.g:5530:12: ( ( LETTER_S LETTER_E LETTER_T ) )
            // Sql.g:5530:14: ( LETTER_S LETTER_E LETTER_T )
            {
            // Sql.g:5530:14: ( LETTER_S LETTER_E LETTER_T )
            // Sql.g:5530:15: LETTER_S LETTER_E LETTER_T
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

    // $ANTLR start "KEYWORD_NATIONAL"
    public final void mKEYWORD_NATIONAL() throws RecognitionException {
        try {
            int _type = KEYWORD_NATIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5532:17: ( ( LETTER_N LETTER_A LETTER_T LETTER_I LETTER_O LETTER_N LETTER_A LETTER_L ) )
            // Sql.g:5532:19: ( LETTER_N LETTER_A LETTER_T LETTER_I LETTER_O LETTER_N LETTER_A LETTER_L )
            {
            // Sql.g:5532:19: ( LETTER_N LETTER_A LETTER_T LETTER_I LETTER_O LETTER_N LETTER_A LETTER_L )
            // Sql.g:5532:20: LETTER_N LETTER_A LETTER_T LETTER_I LETTER_O LETTER_N LETTER_A LETTER_L
            {
            mLETTER_N(); 


            mLETTER_A(); 


            mLETTER_T(); 


            mLETTER_I(); 


            mLETTER_O(); 


            mLETTER_N(); 


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
    // $ANTLR end "KEYWORD_NATIONAL"

    // $ANTLR start "KEYWORD_LARGE"
    public final void mKEYWORD_LARGE() throws RecognitionException {
        try {
            int _type = KEYWORD_LARGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5534:14: ( ( LETTER_L LETTER_A LETTER_R LETTER_G LETTER_E ) )
            // Sql.g:5534:16: ( LETTER_L LETTER_A LETTER_R LETTER_G LETTER_E )
            {
            // Sql.g:5534:16: ( LETTER_L LETTER_A LETTER_R LETTER_G LETTER_E )
            // Sql.g:5534:17: LETTER_L LETTER_A LETTER_R LETTER_G LETTER_E
            {
            mLETTER_L(); 


            mLETTER_A(); 


            mLETTER_R(); 


            mLETTER_G(); 


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
    // $ANTLR end "KEYWORD_LARGE"

    // $ANTLR start "KEYWORD_OBJECT"
    public final void mKEYWORD_OBJECT() throws RecognitionException {
        try {
            int _type = KEYWORD_OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5536:15: ( ( LETTER_O LETTER_B LETTER_J LETTER_E LETTER_C LETTER_T ) )
            // Sql.g:5536:17: ( LETTER_O LETTER_B LETTER_J LETTER_E LETTER_C LETTER_T )
            {
            // Sql.g:5536:17: ( LETTER_O LETTER_B LETTER_J LETTER_E LETTER_C LETTER_T )
            // Sql.g:5536:18: LETTER_O LETTER_B LETTER_J LETTER_E LETTER_C LETTER_T
            {
            mLETTER_O(); 


            mLETTER_B(); 


            mLETTER_J(); 


            mLETTER_E(); 


            mLETTER_C(); 


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
    // $ANTLR end "KEYWORD_OBJECT"

    // $ANTLR start "KEYWORD_ZONE"
    public final void mKEYWORD_ZONE() throws RecognitionException {
        try {
            int _type = KEYWORD_ZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sql.g:5538:13: ( ( LETTER_Z LETTER_O LETTER_N LETTER_E ) )
            // Sql.g:5538:15: ( LETTER_Z LETTER_O LETTER_N LETTER_E )
            {
            // Sql.g:5538:15: ( LETTER_Z LETTER_O LETTER_N LETTER_E )
            // Sql.g:5538:16: LETTER_Z LETTER_O LETTER_N LETTER_E
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
            // Sql.g:5540:16: ( ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N ) )
            // Sql.g:5540:18: ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N )
            {
            // Sql.g:5540:18: ( LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N )
            // Sql.g:5540:19: LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N
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
            // Sql.g:5542:11: ( ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) ) )
            // Sql.g:5543:2: ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) )
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
            // Sql.g:5546:15: ( ( '-' '-' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Sql.g:5547:2: ( '-' '-' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Sql.g:5547:2: ( '-' '-' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Sql.g:5547:3: '-' '-' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match('-'); 

            match('-'); 

            // Sql.g:5547:9: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
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
            // Sql.g:5549:18: ( ( '/' '*' ( . )* '*' '/' ) )
            // Sql.g:5550:2: ( '/' '*' ( . )* '*' '/' )
            {
            // Sql.g:5550:2: ( '/' '*' ( . )* '*' '/' )
            // Sql.g:5550:3: '/' '*' ( . )* '*' '/'
            {
            match('/'); 

            match('*'); 

            // Sql.g:5550:9: ( . )*
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
            	    // Sql.g:5550:9: .
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
            // Sql.g:5552:17: ( ( ( ( '0' .. '9' ) )+ ) )
            // Sql.g:5553:2: ( ( ( '0' .. '9' ) )+ )
            {
            // Sql.g:5553:2: ( ( ( '0' .. '9' ) )+ )
            // Sql.g:5553:3: ( ( '0' .. '9' ) )+
            {
            // Sql.g:5553:3: ( ( '0' .. '9' ) )+
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
            // Sql.g:5555:22: ( ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) ) )
            // Sql.g:5556:2: ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) )
            {
            // Sql.g:5556:2: ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) )
            // Sql.g:5556:3: ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ )
            {
            // Sql.g:5556:3: ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ )
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
                    // Sql.g:5556:4: ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )?
                    {
                    // Sql.g:5556:4: ( ( '0' .. '9' ) )+
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


                    // Sql.g:5556:17: ( '.' ( ( ( '0' .. '9' ) )+ )? )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='.') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Sql.g:5556:18: '.' ( ( ( '0' .. '9' ) )+ )?
                            {
                            match('.'); 

                            // Sql.g:5556:21: ( ( ( '0' .. '9' ) )+ )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // Sql.g:5556:22: ( ( '0' .. '9' ) )+
                                    {
                                    // Sql.g:5556:22: ( ( '0' .. '9' ) )+
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
                    // Sql.g:5556:40: '.' ( ( '0' .. '9' ) )+
                    {
                    match('.'); 

                    // Sql.g:5556:43: ( ( '0' .. '9' ) )+
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
            // Sql.g:5558:28: ( ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) 'E' ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) )
            // Sql.g:5559:2: ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) 'E' ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Sql.g:5559:2: ( ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) 'E' ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            // Sql.g:5559:3: ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ ) 'E' ( '+' | '-' )? ( ( '0' .. '9' ) )+
            {
            // Sql.g:5559:3: ( ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )? | '.' ( ( '0' .. '9' ) )+ )
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
                    // Sql.g:5559:4: ( ( '0' .. '9' ) )+ ( '.' ( ( ( '0' .. '9' ) )+ )? )?
                    {
                    // Sql.g:5559:4: ( ( '0' .. '9' ) )+
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


                    // Sql.g:5559:17: ( '.' ( ( ( '0' .. '9' ) )+ )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='.') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Sql.g:5559:18: '.' ( ( ( '0' .. '9' ) )+ )?
                            {
                            match('.'); 

                            // Sql.g:5559:21: ( ( ( '0' .. '9' ) )+ )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // Sql.g:5559:22: ( ( '0' .. '9' ) )+
                                    {
                                    // Sql.g:5559:22: ( ( '0' .. '9' ) )+
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
                    // Sql.g:5559:40: '.' ( ( '0' .. '9' ) )+
                    {
                    match('.'); 

                    // Sql.g:5559:43: ( ( '0' .. '9' ) )+
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

            // Sql.g:5559:60: ( '+' | '-' )?
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


            // Sql.g:5559:70: ( ( '0' .. '9' ) )+
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
            // Sql.g:5561:14: ( ( '\\'' (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )* '\\'' ) )
            // Sql.g:5562:2: ( '\\'' (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )* '\\'' )
            {
            // Sql.g:5562:2: ( '\\'' (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )* '\\'' )
            // Sql.g:5562:3: '\\'' (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )* '\\''
            {
            match('\''); 

            // Sql.g:5562:7: (~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\\'' '\\'' ) )*
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
            	    // Sql.g:5562:8: ~ ( '\\'' | ( '\\r\\n' | '\\r' | '\\n' ) )
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
            	    // Sql.g:5562:35: ( '\\'' '\\'' )
            	    {
            	    // Sql.g:5562:35: ( '\\'' '\\'' )
            	    // Sql.g:5562:36: '\\'' '\\''
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
            // Sql.g:5564:11: ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' ) ) )
            // Sql.g:5565:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' ) )
            {
            // Sql.g:5565:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' ) )
            // Sql.g:5565:3: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' )
            {
            // Sql.g:5565:3: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )* | '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"' )
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
                    // Sql.g:5565:4: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )*
                    {
                    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Sql.g:5565:23: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( ( '0' .. '9' ) | '_' ) )*
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
                    // Sql.g:5565:63: '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+ '\"'
                    {
                    match('\"'); 

                    // Sql.g:5565:66: (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) | ( '\"' '\"' ) )+
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
                    	    // Sql.g:5565:67: ~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) )
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
                    	    // Sql.g:5565:93: ( '\"' '\"' )
                    	    {
                    	    // Sql.g:5565:93: ( '\"' '\"' )
                    	    // Sql.g:5565:94: '\"' '\"'
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
        // Sql.g:1:8: ( T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | KEYWORD_N | KEYWORD_DATE | KEYWORD_TIME | KEYWORD_TIMESTAMP | KEYWORD_CREATE | KEYWORD_TEMPORARY | KEYWORD_TABLE | KEYWORD_DEFAULT | KEYWORD_COLLATE | KEYWORD_CONSTRAINT | KEYWORD_NOT | KEYWORD_NULL | KEYWORD_REFERENCES | KEYWORD_FOREIGN | KEYWORD_KEY | KEYWORD_PRECISION | KEYWORD_VARYING | KEYWORD_CHARACTER | KEYWORD_SET | KEYWORD_NATIONAL | KEYWORD_LARGE | KEYWORD_OBJECT | KEYWORD_ZONE | KEYWORD_BOOLEAN | WHITESPACE | SIMPLE_COMMENT | BRACKETED_COMMENT | UNSIGNED_INTEGER | EXACT_NUMERIC_LITERAL | APPROXIMATE_NUMERIC_LITERAL | QUOTED_STRING | IDENTIFIER )
        int alt22=73;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // Sql.g:1:10: T__62
                {
                mT__62(); 


                }
                break;
            case 2 :
                // Sql.g:1:16: T__63
                {
                mT__63(); 


                }
                break;
            case 3 :
                // Sql.g:1:22: T__64
                {
                mT__64(); 


                }
                break;
            case 4 :
                // Sql.g:1:28: T__65
                {
                mT__65(); 


                }
                break;
            case 5 :
                // Sql.g:1:34: T__66
                {
                mT__66(); 


                }
                break;
            case 6 :
                // Sql.g:1:40: T__67
                {
                mT__67(); 


                }
                break;
            case 7 :
                // Sql.g:1:46: T__68
                {
                mT__68(); 


                }
                break;
            case 8 :
                // Sql.g:1:52: T__69
                {
                mT__69(); 


                }
                break;
            case 9 :
                // Sql.g:1:58: T__70
                {
                mT__70(); 


                }
                break;
            case 10 :
                // Sql.g:1:64: T__71
                {
                mT__71(); 


                }
                break;
            case 11 :
                // Sql.g:1:70: T__72
                {
                mT__72(); 


                }
                break;
            case 12 :
                // Sql.g:1:76: T__73
                {
                mT__73(); 


                }
                break;
            case 13 :
                // Sql.g:1:82: T__74
                {
                mT__74(); 


                }
                break;
            case 14 :
                // Sql.g:1:88: T__75
                {
                mT__75(); 


                }
                break;
            case 15 :
                // Sql.g:1:94: T__76
                {
                mT__76(); 


                }
                break;
            case 16 :
                // Sql.g:1:100: T__77
                {
                mT__77(); 


                }
                break;
            case 17 :
                // Sql.g:1:106: T__78
                {
                mT__78(); 


                }
                break;
            case 18 :
                // Sql.g:1:112: T__79
                {
                mT__79(); 


                }
                break;
            case 19 :
                // Sql.g:1:118: T__80
                {
                mT__80(); 


                }
                break;
            case 20 :
                // Sql.g:1:124: T__81
                {
                mT__81(); 


                }
                break;
            case 21 :
                // Sql.g:1:130: T__82
                {
                mT__82(); 


                }
                break;
            case 22 :
                // Sql.g:1:136: T__83
                {
                mT__83(); 


                }
                break;
            case 23 :
                // Sql.g:1:142: T__84
                {
                mT__84(); 


                }
                break;
            case 24 :
                // Sql.g:1:148: T__85
                {
                mT__85(); 


                }
                break;
            case 25 :
                // Sql.g:1:154: T__86
                {
                mT__86(); 


                }
                break;
            case 26 :
                // Sql.g:1:160: T__87
                {
                mT__87(); 


                }
                break;
            case 27 :
                // Sql.g:1:166: T__88
                {
                mT__88(); 


                }
                break;
            case 28 :
                // Sql.g:1:172: T__89
                {
                mT__89(); 


                }
                break;
            case 29 :
                // Sql.g:1:178: T__90
                {
                mT__90(); 


                }
                break;
            case 30 :
                // Sql.g:1:184: T__91
                {
                mT__91(); 


                }
                break;
            case 31 :
                // Sql.g:1:190: T__92
                {
                mT__92(); 


                }
                break;
            case 32 :
                // Sql.g:1:196: T__93
                {
                mT__93(); 


                }
                break;
            case 33 :
                // Sql.g:1:202: T__94
                {
                mT__94(); 


                }
                break;
            case 34 :
                // Sql.g:1:208: T__95
                {
                mT__95(); 


                }
                break;
            case 35 :
                // Sql.g:1:214: T__96
                {
                mT__96(); 


                }
                break;
            case 36 :
                // Sql.g:1:220: T__97
                {
                mT__97(); 


                }
                break;
            case 37 :
                // Sql.g:1:226: T__98
                {
                mT__98(); 


                }
                break;
            case 38 :
                // Sql.g:1:232: T__99
                {
                mT__99(); 


                }
                break;
            case 39 :
                // Sql.g:1:238: T__100
                {
                mT__100(); 


                }
                break;
            case 40 :
                // Sql.g:1:245: T__101
                {
                mT__101(); 


                }
                break;
            case 41 :
                // Sql.g:1:252: T__102
                {
                mT__102(); 


                }
                break;
            case 42 :
                // Sql.g:1:259: KEYWORD_N
                {
                mKEYWORD_N(); 


                }
                break;
            case 43 :
                // Sql.g:1:269: KEYWORD_DATE
                {
                mKEYWORD_DATE(); 


                }
                break;
            case 44 :
                // Sql.g:1:282: KEYWORD_TIME
                {
                mKEYWORD_TIME(); 


                }
                break;
            case 45 :
                // Sql.g:1:295: KEYWORD_TIMESTAMP
                {
                mKEYWORD_TIMESTAMP(); 


                }
                break;
            case 46 :
                // Sql.g:1:313: KEYWORD_CREATE
                {
                mKEYWORD_CREATE(); 


                }
                break;
            case 47 :
                // Sql.g:1:328: KEYWORD_TEMPORARY
                {
                mKEYWORD_TEMPORARY(); 


                }
                break;
            case 48 :
                // Sql.g:1:346: KEYWORD_TABLE
                {
                mKEYWORD_TABLE(); 


                }
                break;
            case 49 :
                // Sql.g:1:360: KEYWORD_DEFAULT
                {
                mKEYWORD_DEFAULT(); 


                }
                break;
            case 50 :
                // Sql.g:1:376: KEYWORD_COLLATE
                {
                mKEYWORD_COLLATE(); 


                }
                break;
            case 51 :
                // Sql.g:1:392: KEYWORD_CONSTRAINT
                {
                mKEYWORD_CONSTRAINT(); 


                }
                break;
            case 52 :
                // Sql.g:1:411: KEYWORD_NOT
                {
                mKEYWORD_NOT(); 


                }
                break;
            case 53 :
                // Sql.g:1:423: KEYWORD_NULL
                {
                mKEYWORD_NULL(); 


                }
                break;
            case 54 :
                // Sql.g:1:436: KEYWORD_REFERENCES
                {
                mKEYWORD_REFERENCES(); 


                }
                break;
            case 55 :
                // Sql.g:1:455: KEYWORD_FOREIGN
                {
                mKEYWORD_FOREIGN(); 


                }
                break;
            case 56 :
                // Sql.g:1:471: KEYWORD_KEY
                {
                mKEYWORD_KEY(); 


                }
                break;
            case 57 :
                // Sql.g:1:483: KEYWORD_PRECISION
                {
                mKEYWORD_PRECISION(); 


                }
                break;
            case 58 :
                // Sql.g:1:501: KEYWORD_VARYING
                {
                mKEYWORD_VARYING(); 


                }
                break;
            case 59 :
                // Sql.g:1:517: KEYWORD_CHARACTER
                {
                mKEYWORD_CHARACTER(); 


                }
                break;
            case 60 :
                // Sql.g:1:535: KEYWORD_SET
                {
                mKEYWORD_SET(); 


                }
                break;
            case 61 :
                // Sql.g:1:547: KEYWORD_NATIONAL
                {
                mKEYWORD_NATIONAL(); 


                }
                break;
            case 62 :
                // Sql.g:1:564: KEYWORD_LARGE
                {
                mKEYWORD_LARGE(); 


                }
                break;
            case 63 :
                // Sql.g:1:578: KEYWORD_OBJECT
                {
                mKEYWORD_OBJECT(); 


                }
                break;
            case 64 :
                // Sql.g:1:593: KEYWORD_ZONE
                {
                mKEYWORD_ZONE(); 


                }
                break;
            case 65 :
                // Sql.g:1:606: KEYWORD_BOOLEAN
                {
                mKEYWORD_BOOLEAN(); 


                }
                break;
            case 66 :
                // Sql.g:1:622: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 67 :
                // Sql.g:1:633: SIMPLE_COMMENT
                {
                mSIMPLE_COMMENT(); 


                }
                break;
            case 68 :
                // Sql.g:1:648: BRACKETED_COMMENT
                {
                mBRACKETED_COMMENT(); 


                }
                break;
            case 69 :
                // Sql.g:1:666: UNSIGNED_INTEGER
                {
                mUNSIGNED_INTEGER(); 


                }
                break;
            case 70 :
                // Sql.g:1:683: EXACT_NUMERIC_LITERAL
                {
                mEXACT_NUMERIC_LITERAL(); 


                }
                break;
            case 71 :
                // Sql.g:1:705: APPROXIMATE_NUMERIC_LITERAL
                {
                mAPPROXIMATE_NUMERIC_LITERAL(); 


                }
                break;
            case 72 :
                // Sql.g:1:733: QUOTED_STRING
                {
                mQUOTED_STRING(); 


                }
                break;
            case 73 :
                // Sql.g:1:747: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\4\uffff\1\55\1\uffff\4\54\1\100\1\54\1\102\1\54\1\106\1\111\10"+
        "\54\1\uffff\1\111\15\54\3\uffff\1\136\3\uffff\1\141\21\54\1\uffff"+
        "\1\54\1\uffff\3\54\1\uffff\2\54\1\uffff\24\54\1\uffff\1\141\2\uffff"+
        "\13\54\1\u009c\7\54\1\u00a5\1\u00a6\5\54\1\u00ac\10\54\1\u00b5\11"+
        "\54\1\141\2\54\1\u00c1\1\54\1\u00c4\7\54\1\uffff\2\54\1\u00ce\5"+
        "\54\2\uffff\4\54\1\u00d8\1\uffff\5\54\1\u00de\2\54\1\uffff\1\u00e1"+
        "\1\u00e2\5\54\1\u00ea\1\u00eb\2\54\1\uffff\2\54\1\uffff\11\54\1"+
        "\uffff\1\u00f9\1\u00fa\3\54\1\u00ff\1\u0100\1\u0101\1\54\1\uffff"+
        "\5\54\1\uffff\2\54\2\uffff\2\54\1\u010c\4\54\2\uffff\1\u0111\1\u0112"+
        "\7\54\1\u011a\2\54\1\u011d\2\uffff\1\54\1\u011f\2\54\3\uffff\2\54"+
        "\1\u0124\1\u0125\6\54\1\uffff\1\u012c\3\54\2\uffff\1\u0130\3\54"+
        "\1\u0134\2\54\1\uffff\1\u0137\1\u0138\1\uffff\1\u0139\1\uffff\1"+
        "\u013a\1\54\1\u013c\1\54\2\uffff\6\54\1\uffff\1\u0144\1\u0145\1"+
        "\u0146\1\uffff\3\54\1\uffff\2\54\4\uffff\1\54\1\uffff\1\u014e\1"+
        "\uffff\2\54\1\u0151\2\54\3\uffff\1\u0155\1\u0156\4\54\1\u015c\1"+
        "\uffff\1\u015d\1\54\1\uffff\1\u015f\1\u0160\1\u0161\2\uffff\1\u0162"+
        "\1\u0163\3\54\2\uffff\1\u0167\5\uffff\3\54\1\uffff\1\u016b\1\u016d"+
        "\1\54\1\uffff\1\54\1\uffff\2\54\1\u0172\1\54\1\uffff\1\54\1\u0175"+
        "\1\uffff";
    static final String DFA22_eofS =
        "\u0176\uffff";
    static final String DFA22_minS =
        "\1\11\3\uffff\1\60\1\uffff\1\111\1\110\2\101\1\60\1\116\1\60\1\101"+
        "\2\60\1\102\1\122\2\105\1\101\1\116\1\101\1\111\1\uffff\1\60\2\101"+
        "\1\110\1\105\1\117\1\105\1\122\1\101\1\105\1\101\1\102\2\117\3\uffff"+
        "\1\56\3\uffff\1\60\1\107\2\117\1\101\1\104\1\122\1\105\1\114\1\101"+
        "\1\103\1\125\1\124\1\106\1\114\1\117\1\122\1\117\1\uffff\1\124\1"+
        "\uffff\1\131\1\103\1\122\1\uffff\1\110\1\114\1\uffff\1\124\1\114"+
        "\2\124\1\112\2\105\1\101\1\106\1\101\1\124\1\125\2\115\1\102\1\111"+
        "\2\122\1\124\1\116\1\uffff\1\60\2\uffff\1\111\1\101\1\102\1\114"+
        "\2\122\1\105\1\114\1\123\1\122\1\101\1\60\1\101\1\102\1\105\1\123"+
        "\1\101\1\105\1\102\2\60\1\101\1\107\1\101\1\105\1\114\1\60\1\111"+
        "\2\105\1\115\1\103\1\114\1\105\1\114\1\60\2\105\1\120\1\114\1\121"+
        "\1\103\1\131\1\110\1\105\1\60\1\116\1\122\1\60\1\105\1\60\1\101"+
        "\1\137\1\101\1\124\1\105\1\124\1\115\1\uffff\1\125\1\114\1\60\1"+
        "\105\1\124\1\111\1\101\1\107\2\uffff\1\114\1\105\2\122\1\60\1\uffff"+
        "\1\117\1\124\1\103\1\101\1\111\1\60\1\122\1\114\1\uffff\2\60\1\117"+
        "\1\105\1\125\1\110\1\111\2\60\1\124\1\131\1\uffff\1\101\1\103\1"+
        "\uffff\1\103\1\125\1\124\1\122\1\116\1\105\1\101\1\114\1\105\1\uffff"+
        "\2\60\1\107\1\114\1\105\3\60\1\111\1\uffff\1\116\1\123\1\124\1\122"+
        "\1\123\1\uffff\1\105\1\111\2\uffff\1\124\1\122\1\60\1\105\1\101"+
        "\1\116\1\125\2\uffff\2\60\1\116\2\124\1\116\1\105\1\101\1\124\1"+
        "\60\1\114\1\124\1\60\2\uffff\1\116\1\60\1\122\1\111\3\uffff\1\103"+
        "\1\101\2\60\1\131\1\111\2\116\2\101\1\uffff\1\60\1\122\1\107\1\124"+
        "\2\uffff\1\60\2\105\1\111\1\60\1\111\1\137\1\uffff\2\60\1\uffff"+
        "\1\60\1\uffff\1\60\1\115\1\60\1\114\2\uffff\1\40\1\117\1\103\1\124"+
        "\1\115\1\122\1\uffff\3\60\1\uffff\2\122\1\124\1\uffff\1\116\1\104"+
        "\4\uffff\1\105\1\uffff\1\60\1\uffff\1\116\1\105\1\60\1\120\1\131"+
        "\3\uffff\2\60\1\123\1\124\1\101\1\111\1\60\1\uffff\1\60\1\123\1"+
        "\uffff\3\60\2\uffff\2\60\1\124\1\115\1\124\2\uffff\1\60\5\uffff"+
        "\2\105\1\101\1\uffff\2\60\1\115\1\uffff\1\124\1\uffff\1\120\1\101"+
        "\1\60\1\115\1\uffff\1\120\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\ufeff\3\uffff\1\71\1\uffff\1\157\1\162\1\145\1\157\1\172\1\116"+
        "\1\172\1\141\2\172\1\142\1\162\2\145\1\151\1\116\1\141\1\111\1\uffff"+
        "\1\172\1\145\1\151\1\162\1\145\1\157\1\145\1\162\1\141\1\145\1\141"+
        "\1\142\2\157\3\uffff\1\105\3\uffff\1\105\1\116\1\117\1\157\1\141"+
        "\1\156\1\122\1\145\1\156\1\141\1\146\1\125\1\164\1\146\1\114\1\117"+
        "\1\162\1\117\1\uffff\1\124\1\uffff\1\171\1\103\1\162\1\uffff\1\110"+
        "\1\154\1\uffff\1\164\1\154\1\164\1\124\1\152\2\145\2\146\1\101\1"+
        "\164\1\125\2\155\1\142\1\111\2\162\1\124\1\156\1\uffff\1\105\2\uffff"+
        "\1\111\1\101\1\102\1\154\2\162\1\105\1\154\1\163\1\122\1\141\1\172"+
        "\1\141\1\102\1\145\1\123\1\101\1\145\1\102\2\172\1\101\1\147\1\101"+
        "\1\105\1\154\1\172\1\151\1\105\1\145\1\115\1\143\1\114\1\145\1\114"+
        "\1\172\1\105\1\145\1\160\1\154\1\121\2\171\1\110\1\145\1\105\1\116"+
        "\1\122\1\172\1\145\1\172\1\141\1\137\1\141\1\164\1\105\1\164\1\115"+
        "\1\uffff\1\165\1\114\1\172\1\105\1\124\1\151\1\101\1\107\2\uffff"+
        "\1\114\1\145\2\122\1\172\1\uffff\1\157\1\124\1\143\1\101\1\151\1"+
        "\172\1\162\1\114\1\uffff\2\172\1\157\1\145\1\125\1\110\1\151\2\172"+
        "\1\124\1\131\1\uffff\1\141\1\143\1\uffff\1\143\1\125\1\164\1\162"+
        "\1\116\1\145\1\101\1\154\1\105\1\uffff\2\172\1\147\1\114\1\105\3"+
        "\172\1\111\1\uffff\1\156\1\123\1\164\1\122\1\163\1\uffff\1\145\1"+
        "\111\2\uffff\1\164\1\162\1\172\1\105\1\101\1\156\1\125\2\uffff\2"+
        "\172\1\156\2\164\1\116\1\145\1\141\1\124\1\172\1\114\1\164\1\172"+
        "\2\uffff\1\156\1\172\1\122\1\111\3\uffff\1\103\1\141\2\172\1\131"+
        "\1\151\1\156\1\116\2\141\1\uffff\1\172\1\122\1\147\1\124\2\uffff"+
        "\1\172\2\145\1\111\1\172\1\151\1\137\1\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\1\172\1\115\1\172\1\154\2\uffff\1\40\1\157\1\143\1\124"+
        "\1\155\1\162\1\uffff\3\172\1\uffff\2\162\1\124\1\uffff\1\156\1\124"+
        "\4\uffff\1\105\1\uffff\1\172\1\uffff\1\156\1\145\1\172\1\160\1\171"+
        "\3\uffff\2\172\1\123\1\164\1\101\1\111\1\172\1\uffff\1\172\1\163"+
        "\1\uffff\3\172\2\uffff\2\172\1\124\1\115\1\124\2\uffff\1\172\5\uffff"+
        "\2\105\1\101\1\uffff\2\172\1\115\1\uffff\1\124\1\uffff\1\120\1\101"+
        "\1\172\1\115\1\uffff\1\120\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\22\uffff\1\51\16\uffff\1\102\1"+
        "\103\1\104\1\uffff\1\110\1\111\1\4\22\uffff\1\25\1\uffff\1\31\3"+
        "\uffff\1\35\2\uffff\1\52\24\uffff\1\105\1\uffff\1\107\1\106\72\uffff"+
        "\1\20\10\uffff\1\27\1\70\5\uffff\1\64\10\uffff\1\74\13\uffff\1\10"+
        "\2\uffff\1\11\11\uffff\1\53\11\uffff\1\65\5\uffff\1\42\2\uffff\1"+
        "\44\1\54\7\uffff\1\47\1\100\15\uffff\1\23\1\24\4\uffff\1\32\1\76"+
        "\1\36\12\uffff\1\60\4\uffff\1\6\1\7\7\uffff\1\56\2\uffff\1\22\1"+
        "\uffff\1\26\4\uffff\1\40\1\77\6\uffff\1\45\3\uffff\1\101\3\uffff"+
        "\1\62\2\uffff\1\21\1\61\1\67\1\30\1\uffff\1\37\1\uffff\1\41\5\uffff"+
        "\1\46\1\72\1\50\7\uffff\1\75\2\uffff\1\43\3\uffff\1\12\1\73\5\uffff"+
        "\1\33\1\71\1\uffff\1\55\1\57\1\13\1\14\1\63\3\uffff\1\66\3\uffff"+
        "\1\15\1\uffff\1\16\4\uffff\1\34\2\uffff\1\17";
    static final String DFA22_specialS =
        "\u0176\uffff}>";
    static final String[] DFA22_transitionS = {
            "\5\47\22\uffff\1\47\1\uffff\1\54\4\uffff\1\53\1\1\1\2\2\uffff"+
            "\1\3\1\50\1\4\1\51\12\52\1\uffff\1\5\5\uffff\1\54\1\6\1\7\1"+
            "\10\1\54\1\11\1\12\1\54\1\13\1\54\1\14\1\15\1\16\1\17\1\20\1"+
            "\21\1\54\1\22\1\23\1\24\1\25\1\26\1\27\2\54\1\45\4\uffff\1\30"+
            "\1\uffff\1\54\1\46\1\34\1\32\1\54\1\36\4\54\1\37\1\43\1\54\1"+
            "\31\1\44\1\40\1\54\1\35\1\42\1\33\1\54\1\41\3\54\1\45\45\uffff"+
            "\1\47\u1f5f\uffff\20\47\30\uffff\2\47\u0fd6\uffff\1\47\ucefe"+
            "\uffff\1\47",
            "",
            "",
            "",
            "\12\56",
            "",
            "\1\57\2\uffff\1\60\2\uffff\1\61\37\uffff\1\61",
            "\1\62\6\uffff\1\63\2\uffff\1\65\2\uffff\1\64\22\uffff\1\67"+
            "\6\uffff\1\66\2\uffff\1\65",
            "\1\72\3\uffff\1\70\11\uffff\1\71\21\uffff\1\72\3\uffff\1\73",
            "\1\74\12\uffff\1\75\2\uffff\1\76\37\uffff\1\76",
            "\12\54\7\uffff\13\54\1\77\16\54\4\uffff\1\54\1\uffff\32\54",
            "\1\101",
            "\12\54\7\uffff\4\54\1\103\25\54\4\uffff\1\54\1\uffff\4\54\1"+
            "\103\25\54",
            "\1\105\15\uffff\1\104\21\uffff\1\105",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\1\114\1\54\1\107\13\54\1\112\5\54\1\110\5\54"+
            "\4\uffff\1\54\1\uffff\1\114\15\54\1\112\5\54\1\113\5\54",
            "\1\116\1\115\36\uffff\1\116",
            "\1\117\37\uffff\1\120",
            "\1\121\37\uffff\1\122",
            "\1\124\7\uffff\1\123\27\uffff\1\124",
            "\1\130\3\uffff\1\127\3\uffff\1\126\10\uffff\1\125\16\uffff"+
            "\1\130\3\uffff\1\127\3\uffff\1\126",
            "\1\131",
            "\1\132\37\uffff\1\133",
            "\1\134",
            "",
            "\12\54\7\uffff\1\114\15\54\1\112\5\54\1\113\5\54\4\uffff\1"+
            "\54\1\uffff\1\114\15\54\1\112\5\54\1\113\5\54",
            "\1\72\3\uffff\1\73\33\uffff\1\72\3\uffff\1\73",
            "\1\130\3\uffff\1\127\3\uffff\1\126\27\uffff\1\130\3\uffff\1"+
            "\127\3\uffff\1\126",
            "\1\67\6\uffff\1\66\2\uffff\1\65\25\uffff\1\67\6\uffff\1\66"+
            "\2\uffff\1\65",
            "\1\122\37\uffff\1\122",
            "\1\76\37\uffff\1\76",
            "\1\103\37\uffff\1\103",
            "\1\120\37\uffff\1\120",
            "\1\133\37\uffff\1\133",
            "\1\124\37\uffff\1\124",
            "\1\105\37\uffff\1\105",
            "\1\116\37\uffff\1\116",
            "\1\135\37\uffff\1\135",
            "\1\61\37\uffff\1\61",
            "",
            "",
            "",
            "\1\137\1\uffff\12\52\13\uffff\1\140",
            "",
            "",
            "",
            "\12\56\13\uffff\1\140",
            "\1\142\6\uffff\1\143",
            "\1\144",
            "\1\145\37\uffff\1\145",
            "\1\146\37\uffff\1\147",
            "\1\150\7\uffff\1\151\1\uffff\1\152\35\uffff\1\151\1\uffff\1"+
            "\152",
            "\1\153",
            "\1\154\37\uffff\1\154",
            "\1\151\1\uffff\1\152\35\uffff\1\151\1\uffff\1\152",
            "\1\147\37\uffff\1\147",
            "\1\155\2\uffff\1\156\37\uffff\1\156",
            "\1\157",
            "\1\160\37\uffff\1\160",
            "\1\156\37\uffff\1\156",
            "\1\161",
            "\1\162",
            "\1\163\37\uffff\1\163",
            "\1\164",
            "",
            "\1\165",
            "",
            "\1\166\37\uffff\1\166",
            "\1\167",
            "\1\170\37\uffff\1\170",
            "",
            "\1\171",
            "\1\173\1\172\36\uffff\1\173",
            "",
            "\1\174\37\uffff\1\174",
            "\1\173\37\uffff\1\173",
            "\1\175\37\uffff\1\175",
            "\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0081\3\uffff\1\u0080\33\uffff\1\u0081",
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\4\uffff\1\u0083\37\uffff\1\u0083",
            "\1\u0083\37\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b\37\uffff\1\u008c",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "",
            "\12\u008f\13\uffff\1\140",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0095",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0098",
            "\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "\12\54\7\uffff\10\54\1\u009b\21\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3",
            "\12\54\7\uffff\4\54\1\u00a4\25\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\25\uffff\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\12\u008f\13\uffff\1\140",
            "\1\u00bf",
            "\1\u00c0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c2\37\uffff\1\u00c2",
            "\12\54\7\uffff\1\u00c3\31\54\4\uffff\1\54\1\uffff\1\u00c5\31"+
            "\54",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dc",
            "\1\u00dd\37\uffff\1\u00dd",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\22\54\1\u00e3\7\54\4\uffff\1\54\1\uffff\22\54"+
            "\1\u00e3\7\54",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\12\54\7\uffff\16\54\1\u00e9\13\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00f0",
            "",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\u00f8",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\54\7\uffff\23\54\1\u00fe\6\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0102",
            "",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109",
            "",
            "",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0115",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u011e\37\uffff\1\u011e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "",
            "\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u012f",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0131\37\uffff\1\u0132",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u013b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u013d\37\uffff\1\u013d",
            "",
            "",
            "\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0147\37\uffff\1\u0148",
            "\1\u0148\37\uffff\1\u0148",
            "\1\u0149",
            "",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\17\uffff\1\u014c",
            "",
            "",
            "",
            "",
            "\1\u014d",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0152\37\uffff\1\u0152",
            "\1\u0153\37\uffff\1\u0153",
            "",
            "",
            "",
            "\12\54\7\uffff\22\54\1\u0154\7\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\54\7\uffff\22\54\1\u015b\7\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u015e\37\uffff\1\u015e",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\22\54\1\u016c\7\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u016e",
            "",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\u0171",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0173",
            "",
            "\1\u0174",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
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
            return "1:1: Tokens : ( T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | KEYWORD_N | KEYWORD_DATE | KEYWORD_TIME | KEYWORD_TIMESTAMP | KEYWORD_CREATE | KEYWORD_TEMPORARY | KEYWORD_TABLE | KEYWORD_DEFAULT | KEYWORD_COLLATE | KEYWORD_CONSTRAINT | KEYWORD_NOT | KEYWORD_NULL | KEYWORD_REFERENCES | KEYWORD_FOREIGN | KEYWORD_KEY | KEYWORD_PRECISION | KEYWORD_VARYING | KEYWORD_CHARACTER | KEYWORD_SET | KEYWORD_NATIONAL | KEYWORD_LARGE | KEYWORD_OBJECT | KEYWORD_ZONE | KEYWORD_BOOLEAN | WHITESPACE | SIMPLE_COMMENT | BRACKETED_COMMENT | UNSIGNED_INTEGER | EXACT_NUMERIC_LITERAL | APPROXIMATE_NUMERIC_LITERAL | QUOTED_STRING | IDENTIFIER );";
        }
    }
 

}