package info.thinkmore;

import java.io.PrintStream;

public class SimpleAssert {
    static boolean enableAssert = true;
    public static void enableAssert(){
        enableAssert = true;
    }

    static public boolean isEnableAssert(){
        return enableAssert;
    }

    static private void raiseException( String msg ){
        AssertError ae = new AssertError( msg );
        ae.printStackTrace( new PrintStream(System.err) );
        throw ae;
    }

    public static class AssertError extends RuntimeException{
        static final long serialVersionUID = 1000; 
        public AssertError(String message){
            super(message);
        }
    }
    
    static public void assertTrue( boolean exp ){
        if( !exp ){
          raiseException( "Assert failed" );
        }
    }

    static public <T> void assertEquals( T left, T right ){
        if( !left.equals(right) ){
            raiseException( String.format( "Expect %s, but got %s", left.toString(), right.toString() ) );
        }
    }
}
