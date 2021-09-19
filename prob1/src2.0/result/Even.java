package result;

import janken.Man;

/**
 * 引き分けクラス
 * @author mscom
 *
 */
public class Even extends Result {
	public void result(Man man) {
		System.out.println("あいこです");
		return;
	}
}