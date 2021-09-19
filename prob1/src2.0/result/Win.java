package result;

import janken.Man;

/**
 * 勝ちクラス
 * @author mscom
 *
 */
public class Win extends Result {
	public void result(Man man) {
		System.out.println("あなたの勝ち！");
		int count = man.getWinCount() + 1;
		man.setWinCount(count);
		return;
	}
}