package prob1;
import java.util.Scanner;

public class Assignment4 {
	 public static void main(String args[]) {
		    
	      Scanner scanner = new Scanner(System.in);
	      int nenrei = scanner.nextInt();
	      int umare = scanner.nextInt();
	      int kakaku = 0;
	      int mode = scanner.nextInt();//モード1ならand,0ならorで判定する
	      
	      if(mode==0) {
	    	 if( (umare==2001)	&&(nenrei==10)) {
	    		 kakaku=100;
	    	 }
	    		  else { kakaku=500;
	    		 }
	    		  
	    	 }else if(mode==1) {
	    		 if( (umare==2001)	||(nenrei==10)) {
		    	 kakaku=100;
	    		 }else {
		    	 kakaku=500;
		    		 }
	    	 }
	      scanner.close();
	 	 System.out.print(kakaku);  }
}  
	 


	 
