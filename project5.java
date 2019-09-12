//Problem 5
/*What is the smallest positive number 
that is evenly divisible by all of the numbers from 1 to 20?*/
public class project5 {

	public static void main(String[] args) {
		int x=1, y=1, smallest=0;
		
		while(x>0){
			y=1;
		while((x%y==0)&&(y<=20)){
			if(y==20){
				smallest=x;
				break;
				}
				y++;
			}
			x++;		
			if(smallest>0){
				break;
			}
		}
		System.out.println(smallest);
	}

}
//Output: 232792560
