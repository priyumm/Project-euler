//Problem 7
//What is the 10 001st prime number?
public class project7 {

	public static void main(String[] args) {
	     int i; int n=1; int c=0; int prime=0;
	     while(prime!=10001)
	     {
	    	 for(i=3;i<=Math.sqrt(n);i+=2)
	    	 {
	    		 if(n%i==0)
	    		 {
	    			 c++;
	    			 break;
	    		 }
	    	 }
	    	 if(c==0)
	    		 prime++;
	    		 if(prime==10001)
	    		 {
	    			 System.out.println(n);
	    		 }
	    			 c=0;
	    			 n+=2;
	     }
}
}
//Output: 104743
