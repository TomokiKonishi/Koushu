package prob1;

public class Assignment9 {
	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<5;i++) {
		 	a= rep(a);
		}
	}
	public static int rep(int a) {
		 System.out.println("aの値は"+a+"です。");
		 a=a*2;
		 return a;
		
	}
	
}
