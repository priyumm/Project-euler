//Problem 6
/*Find the difference between the sum of the squares of the first one hundred 
natural numbers and the square of the sum..*/
public class project6 { 
	public static void main(String[] args) { 
		int size = 100;
		long qos = (long) Math.pow(size * (size + 1) / 2, 2);
		long soq = size * (size + 1) * (2 * size + 1) / 6;

		System.out.println(qos - soq);	
		} 
	}
//Output: 25164150
