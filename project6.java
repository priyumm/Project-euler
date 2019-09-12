//Problem 6
/*Find the difference between the sum of the squares of the first one hundred 
natural numbers and the square of the sum..*/
public class project6 {

	public static void main(String[] args) {
		int x, sumofsquares, squareofsum, difference;
		
		x=1;
		sumofsquares = squareofsum = difference =0;
		for(x=1; x<=100; x++)
		{
			sumofsquares += (x*x);
			squareofsum += x;
			
		}
		System.out.println("The sum of the squares of the first 100 natural numbers: "+sumofsquares);
		squareofsum = squareofsum * squareofsum;
		System.out.println("The square of the sum of the first 100 natural numbers is : "+squareofsum);
		difference = squareofsum - sumofsquares;		
		
		System.out.println("Hence the difference between the squares of the sum and the sum of the squares is: "+difference);
	}

}

//Output: 25164150
