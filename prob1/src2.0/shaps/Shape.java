package shaps;

import result.Result;

/**
 * 手形　抽象クラス
 * @author mscom
 *
 */
public interface Shape {
	/**
	 *　勝負判定
	 */
	public abstract Result judge(Shape shape);
}