//Problem 2
/*By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.*/

public class project2 {

	public static void main(String[] args) {
		int sum = 0;
		int x = 1;  
		int y = 2;  
		while (x <= 4000000) {
			if (x % 2 == 0)
				sum += x;
			int z = x + y;
			x = y;
			y = z;
		}
		System.out.println("Sum: "+sum);
	}

}
//Output: 4613732

