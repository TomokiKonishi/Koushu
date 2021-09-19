package janken;

import java.io.FileNotFoundException;
import java.util.Scanner;

import result.Result;

/**
  * メイン処理クラス
 * @author mscom
 */
public class Main {

	/**
	* メイン処理
	* @param args　外部ファイル　判定結果.txt
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//プレイヤー生成
		Man player = new Man();
		Man cpu = new Man();

		try {
			//処理生成
			Util util = new Util(args[0]);
			util.startAnnouncement();

			for (int siaisuu = 1; siaisuu <= 10; siaisuu++) {
				int inputCharacter = util.read(sc);
				player.setHand(util.createShape(inputCharacter));
				cpu.setHand(util.createRandomShape());
				Result result = player.getHand().judge(cpu.getHand());
				result.cueWord();
				result.result(player);
			}

			util.endAnnouncement(player.getWinCount());

		} catch (FileNotFoundException e) {
			System.out.println("外部ファイル読み込みエラー");
		} catch (Exception e) {
			System.out.println("システムエラーが発生しました。");
		} finally {
			sc.close();
		}
	}
}