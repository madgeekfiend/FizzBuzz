package contapay.sam.FizzBuzz;

/**
 * FizzBuzz
 * 
 * FizzBuzz is used as quick test to determine the candidates ability to program. I do not know
 * the origin of this test. But the premise is simple: count to 100, every 3rd number print fizz, every fifth number
 * print buzz, if the number is able to be divided by 3 & 5 print out fizzbuzz. This version will take into account
 * that the user may want to go past 100 or less then 100 and allows that to be passed in as a function parameter when calling 
 * runFizzBuzz()
 * 
 * The problem assumes you can figure out from the question that the modulus operator should be used
 * 
 * @author Sam Contapay
 * @since 7/30/2011s
 *
 */
public class App 
{
	/**
	 * Run the fizzbuzz calculation as explained aboves
	 * 
	 * @param numIterations The number of times you want to count
	 */
	public void runFizzBuzz( int numIterations ) {
		
		// Understand the question if they want you to start at 1 or 0 if you start at 0 it will
		// print FizzBuzz
		for ( int x = 0; x < numIterations; ++x )
		{
			if ( x % 15 == 0 ) // Use the least common multiple of 2 numbers to determine if it is divisible by both numbers in the case of 3&5 the LCM is 15
				System.out.println("FizzBuzz");
			else if ( x % 5 == 0 )
				System.out.println("Buzz");
			else if ( x % 3 == 0 )
				System.out.println("Fizz");
			else
				System.out.println(x);
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Simple Fizz buzz" );
        App app = new App();
        
        app.runFizzBuzz( 100 );
    }
}
