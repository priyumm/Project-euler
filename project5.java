//Problem 5
/*What is the smallest positive number 
that is evenly divisible by all of the numbers from 1 to 20?*/
import java.math.BigInteger;


public final class project5{
	
	public static void main(String[] args) {
		System.out.println(new project5().run());
	}
	
	public String run() {
		BigInteger allLcm = BigInteger.ONE;
		for (int i = 1; i <= 20; i++)
			allLcm = lcm(BigInteger.valueOf(i), allLcm);
		return allLcm.toString();
	}
	
	
	private static BigInteger lcm(BigInteger x, BigInteger y) {
		return x.divide(x.gcd(y)).multiply(y);
	}
	
}
//Output: 232792560
