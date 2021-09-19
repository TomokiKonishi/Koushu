package sample;

public class Hand_change {
	public static String change(int p_hand) {
		String hand="";
		if(p_hand==1) {
			hand="パー";
		}else if(p_hand==2) {
			hand="チョキ";
		}else if(p_hand ==3) {
			hand="グー";
		}
return hand;	}
