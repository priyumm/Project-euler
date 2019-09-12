//Problem 3
//What is the largest prime factor of the number 600851475143
public class project3 {

	public static void main(String[] args) {

			long x=600851475143L;
			long max;
			for(long t=3;t<x;t=t+2)
			{
				while(x%t==0 && t<x)
				{
					x=x/t;
				}
			}
			max=x;
			System.out.println("largest prime factor="+max);
	}

}
//Output: 6857
