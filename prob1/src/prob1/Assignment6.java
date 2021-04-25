package prob1;

public class Assignment6 {
	  public static void main(String args[]) {
		  double yokin = 100000;//小数点以下を扱うのでdouble型を採用
		  int nensu =1;
		  while(nensu<4) {
			  yokin=yokin*1.1;
			  nensu=nensu+1;
			  
		  }
		  
		  System.out.print(yokin);
	  }
}
