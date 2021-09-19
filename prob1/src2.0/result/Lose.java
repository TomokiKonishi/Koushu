package result;

import janken.Man;

/**
 * 負けクラス
 * @author mscom
 *
 */
public class Lose extends Result {
	public void result(Man man) {
		System.out.println("あなたの負け・・・");
		return;
	}
}