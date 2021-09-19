package prob1;
import java.util.Scanner;

public class Assignment2 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nenrei = scanner.nextInt();
	    int kakaku =0;
	    if(nenrei ==0) {
	    	kakaku =100;
	    }else {
	    	kakaku = 500;
	    }
	    System.out.print("kakaku");
	    System.out.print("=");
	    System.out.print(kakaku); 
	}
}
