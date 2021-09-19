package result;

import janken.Man;

/**
 * 勝敗クラス
 * @author mscom
 *
 */
public abstract class Result {
	public void cueWord() {
		System.out.println("ぽん！");
		return;
	}

	/**
	 * 勝敗結果
	 * @param man
	 */
	public abstract void result(Man man);
}