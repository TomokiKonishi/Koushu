package prob1;

public class Assignment7 {
	  public static void main(String args[]) {
		  int a=0;
		  int b=0;
		  int i=0;
		  int h=3;//hの値を繰り返したい回数に設定すればよい
		  
		  while(i<h) {
			 if(a>b) {
				 b=b+1;
				 System.out.println("a="+a+"b="+b+"i="+i);
			 }else {
				 a=a+1;
				 System.out.println("a="+a+"b="+b+"i="+i);
			 }
			 i=i+1;
			 
		  }
		  
	  }
	
}
