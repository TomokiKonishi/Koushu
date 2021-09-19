package shaps;

import result.Even;
import result.Lose;
import result.Result;
import result.Win;

/**
 * グークラス
 * @author mscom
 *
 */
public class Stone implements Shape {
	public Result judge(Shape shape) {
		if (shape instanceof Scissors) {
			return new Win();
		} else if (shape instanceof Paper) {
			return new Lose();
		}
		return new Even();
	}
}