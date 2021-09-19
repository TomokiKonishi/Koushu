package sample;



public class Hand_show {
	public  Hand_change Hand(int p_hand) {
		Hand_change h4 =new Hand_change();
		
		if(p_hand==1) {//パー
			Paper h3 =new Paper();
			 h4 =h3;
		}else if(p_hand ==2) {//チョキ
			Scissors h3= new Scissors();
			 h4 =h3;
		}else if(p_hand==3) {//グー
			Stone h3= new Stone();
			 h4 =h3;
		}
		return h4;
	}
}
