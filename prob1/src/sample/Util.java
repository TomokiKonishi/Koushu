package sample;
import java.util.Random;
import java.util.Scanner;
public class Util {

	public static void main(String[] args) {
		
		int p_hand;
		int c_hand;
		Ini1 i1 = new Ini1();
		Ini2 i2 = new Ini2();
		Hand_change h2= new Hand_change();
		Comment1 c1 = new Comment1();
		Comment2 c2 = new Comment2();
		Hand_show h1 = new Hand_show();
		Judgement j = new Judgement();
		Random rand= new Random();
		Scanner scan = new Scanner(System.in);
		i1.i=0;
		i1.flag=0;
		i1.w=0;
	
		
		
		while(i1.i<i1.match) {
			System.out.println("パーなら1，チョキなら2、グーなら3を入力してください");
			 p_hand=scan.nextInt();
			h2=h1.Hand(p_hand);
			System.out.println("cpuが手を選択しています");
			 c_hand =rand.nextInt(3)+1;
			System.out.println("じゃんけん、ぽん！");
			h2=h1.Hand(p_hand);
			System.out.print("あなたの手は"+h2.change(p_hand));
			h2=h1.Hand(c_hand);
			System.out.println("相手の手は"+h2.change(c_hand)+"なので");
			j.Judge(p_hand,c_hand,i1);
			c1.C1(i1.flag);
			i1.i=i1.i+1;
		}
	    scan.close();
		System.out.println("あなたは"+i1.w+"勝でした！");
		c2.C2(i1.w,i2.a,i2.b,i2.c,i2.d,i2.e);	
		}

}

