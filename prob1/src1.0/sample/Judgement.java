package sample;

public class Judgement {
	public static void Judge(int p_hand, int c_hand, Ini1 i1) {
		
		if (c_hand != p_hand) {
			if (p_hand == 1) {

				if (c_hand == 3) {
					i1.w = i1.w + 1;
					i1.flag = 1;
				} else {
					i1.flag = 2;
				}
			} else if (p_hand == 2) {
				if (c_hand == 1) {
					i1.w = i1.w + 1;
					i1.flag = 1;
				} else {
					i1.flag = 2;
				}
			} else if (p_hand == 3) {
				if (c_hand == 2) {
					i1.w = i1.w + 1;
					i1.flag = 1;
				} else {
					i1.flag = 2;
				}
			}
		} else {
			i1.flag = 0;
		}
	}
}
