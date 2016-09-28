package jsp2.function;

import java.util.*;

public class Functions {
    public static String reverse( String text ) {
        return new StringBuffer( text ).reverse().toString();
    }

    public static int countNum( String text ) {
        String vowels = "abcde";
	int result = 0;
        for( int i = 0; i < text.length(); i++ ) {
	    if( vowels.indexOf( text.charAt( i ) ) != -1 ) {
	        result++;
	    }
	}
	return result;
    }

    public static String toupper( String text ) {
        return text.toUpperCase();
    }
    
    public static String tolower( String text ) {
        return text.toLowerCase();
    }
}
