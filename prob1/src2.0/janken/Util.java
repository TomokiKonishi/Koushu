package janken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import shaps.Paper;
import shaps.Scissors;
import shaps.Shape;
import shaps.Stone;

public class Util {

	public final String[] jankenShapes = { "グー", "チョキ", "パー" };

	public final int procesGu = 0;
	public final int procesChoki = 1;
	public final int procesPa = 2;
	public final int procesError = 9;

	private ArrayList<String> comment;

	@SuppressWarnings("resource")
	public Util(String path) throws FileNotFoundException {
		comment = new ArrayList<String>();

		try {
			File file = new File(path);
			FileReader filereader = new FileReader(file);
			BufferedReader br = new BufferedReader(filereader);
			String[] strs = br.readLine().split(",");

			if (strs.length != 5)
				throw new Exception();

			for (String str : strs) {
				comment.add(str);
			}

			br.close();
		} catch (Exception e) {
			throw new FileNotFoundException();
		}
	}

	/**
	 * 始まりのアナウンス
	 */
	public void startAnnouncement() {
		System.out.println("じゃんけんを始めます。");
		System.out.println(procesGu + ":" + jankenShapes[procesGu] + "，"
				+ procesChoki + ":" + jankenShapes[procesChoki] + "，"
				+ procesPa + ":" + jankenShapes[procesPa]);
		System.out.println(procesGu + "/" + procesChoki + "/" + procesPa + "のどれかを選んでEnterキーを押すと，じゃんけんが始まります。");
		System.out.println("10回勝負です！！！それじゃーいくよぉー♪ じゃんけん！！！！");
	}

	/**
	 * コンソール入力処理
	 * @return　入力内容
	 */
	public int read(Scanner sc) {
		int line = procesError;
		//グー、チョキ、パー以外の場合は、永遠に繰り返す
		while (line > 2) {
			try {
				line = sc.nextInt();
				switch (line) {
				case procesGu:
				case procesChoki:
				case procesPa:
					break;
				default:
					throw new Exception();
				}
			} catch (InputMismatchException ex) {
				line = errorAnnouncement();
				sc.next();
			} catch (Exception ex) {
				line = errorAnnouncement();
			}
		}
		return line;
	}

	/**
	 * 入力エラーアナウンス
	 * @return
	 */
	public int errorAnnouncement() {
		System.out.println(procesGu + ":" + jankenShapes[procesGu] + "，"
				+ procesChoki + ":" + jankenShapes[procesChoki] + "，"
				+ procesPa + ":" + jankenShapes[procesPa]);
		System.out.println(procesGu + "/" + procesChoki + "/" + procesPa + "のどれかを選んでEnterキーを押してください。");

		return procesError;
	}

	/**
	 * 手形生成
	 * @param index
	 * @return
	 */
	public Shape createShape(int index) throws Exception {
		Shape shape = null;
		switch (index) {
		case procesGu:
			shape = new Stone();
			break;
		case procesChoki:
			shape = new Scissors();
			break;
		case procesPa:
			shape = new Paper();
			break;
		default:
			throw new Exception();
		}
		return shape;
	}

	/**
	 * cpuの手形生成
	 * @return
	 */
	public Shape createRandomShape() throws Exception {
		Random random = new Random();
		int index = random.nextInt(3);
		return createShape(index);
	}

	/**
	 * 終わりのアナウンス
	 */
	public void endAnnouncement(int winCount) {
		System.out.println("10戦中" + winCount + "回勝利！");
		System.out.println(comment.get(judgeComment(winCount)));
	}

	/**
	 * 勝利数コメント判定
	 * @param winCount
	 * @return
	 */
	public int judgeComment(int winCount) {
		int commentIndex = 0;
		switch (winCount) {
		case 0:
			commentIndex = 0;
			break;
		case 1:
		case 2:
		case 3:
			commentIndex = 1;
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			commentIndex = 2;
			break;
		case 8:
		case 9:
			commentIndex = 3;
			break;
		case 10:
			commentIndex = 4;
		}
		return commentIndex;
	}
}