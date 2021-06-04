package prob1;
import java.util.Scanner;
public class Assignment10_1 {
	public static void main(String[] args) {
		 System.out.println("モードを選択してください。（1or2)：");
		 Scanner scanner = new Scanner(System.in);
	      int mode = scanner.nextInt();
	      System.out.println("生まれた年を西暦で入力してください：");
	      int umare = scanner.nextInt();
	 
		 //以下モード判定
	      while(mode !=1 && mode !=2) {
	    	  System.out.println("正しいモードが入力されませんでした。入力しなおしてください");
	    	  mode =scanner.nextInt();
	      }
	      if(mode==1) {
	    	  calcage(umare);
	      }else if(mode ==2) {
	    	 calcyear(umare);
	      }
	      scanner.close();
	}
	public static  void calcage(int k) {
		  System.out.println("調べたい年を西暦で入力してください。:");
		  Scanner scanner = new Scanner(System.in);
		  int year = scanner.nextInt();
		  int nenrei= year -k;
		  System.out.println("西暦"+year+"年の時、あなたは"+nenrei+"歳です");
		  scanner.close();
	}
		  
  	public static  void calcyear(int p) {
  		  System.out.println("調べたい年齢を入力してください。:");
		  Scanner scanner = new Scanner(System.in);
		  int nenrei = scanner.nextInt();
		  int year= nenrei + p;
		  System.out.println("あなたが"+nenrei+"歳の時は西暦"+year+"年です");
		  scanner.close();	
  	}
	
  	}
