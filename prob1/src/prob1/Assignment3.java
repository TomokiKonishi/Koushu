package prob1;
import java.util.Scanner;

public class Assignment3 {
	 public static void main(String args[]) {
		    
	      Scanner scanner = new Scanner(System.in);
	 
	      int nenrei = scanner.nextInt();
	      int kakaku  = 0;
	      
	      if(nenrei >=16 ) {
	    	  kakaku=500;
	      } else if (nenrei <=12) {
	    	  kakaku = 0;
	      } else if (nenrei <=15) {
	    	  kakaku = 300;
	      }
	  System.out.print("kakaku = ");
     System.out.print(kakaku);
	      scanner.close();
	    }
	  }


