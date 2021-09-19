package prob1;
import java.util.Scanner;
public class Assignment5 {
	 public static void main(String args[]) {
		    
	      Scanner scanner = new Scanner(System.in);
	      int a = scanner.nextInt();
	      int b = 5;
	      int count = 0;
	      
	      while(a<b) {
	    	  a=a+1;
	    	  count=count+1;
	    	  	  
	      }
	      System.out.println("aの値は"+ a +"です。");
	      System.out.println("繰り返した回数は"+ count +"です。");
	      scanner.close();
	    }
}
