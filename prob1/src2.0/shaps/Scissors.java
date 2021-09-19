package shaps;

import result.Even;
import result.Lose;
import result.Result;
import result.Win;

/**
 * チョキクラス
 * @author mscom
 *
 */
public class Scissors implements Shape {
	public Result judge(Shape shape) {
		if (shape instanceof Paper)
			return new Win();
		if (shape instanceof Stone)
			return new Lose();
		return new Even();
	}
}