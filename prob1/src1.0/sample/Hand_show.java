package sample;

public class Hand_show {
	public static void Hand(int p_hand) {
		if(p_hand==1) {
			System.out.println("あなたの手はパーです");
		}else if(p_hand ==2) {
			System.out.println("あなたの手はチョキです");
		}else if(p_hand==3) {
			System.out.println("あなたの手はグーです");
		}
	}
}
