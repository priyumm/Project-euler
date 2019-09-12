//Problem 4
//Find the largest palindrome made from the product of two 3-digit numbers.
public class project4 {

	public static void main(String[] args) {
		int product = 1;
		
		
		int current;
		int greatestCurrent=0;
		for(int x=100; x<1000; x++){
			for(int y=100; y<1000; y++){
				product= x*y;
				if(isPalindrome(Integer.toString(product))){
					System.out.println(product);
					current = product;
					if(current> greatestCurrent){
						greatestCurrent=current;
					}
				}
				
			}
		}		
		System.out.println("Greatest Palindrome is: "+ greatestCurrent);
	}
	public static boolean isPalindrome(String s){
		String string= "";
		for(int i=s.length(); i>0 ; i--){
			string+= s.charAt(i-1);
		}
		if(s.equals(string)){
			return true;
		}
		return false;
	}
}
//Output: 906609