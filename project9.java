//Problem 9
/*There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc*/
public class project9 {

	public static void main(String[] args) {
		int a,b,c=0;
		int s=1000;
			for(a=0;a<s/3;a++){
				for(b=a+1;b<s/2;b++){
					c=s-a-b;
					if(a*a+b*b==c*c){
						System.out.println(a*b*c);
					}
				}
			}
	}
}
//Output: 31875000
