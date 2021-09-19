package shaps;

import result.Even;
import result.Lose;
import result.Result;
import result.Win;

/**
 * パークラス
 * @author mscom
 *
 */
public class Paper implements Shape {
    public Result judge (Shape shape) {
        if (shape instanceof Stone)
            return new Win();
        if (shape instanceof Scissors)
            return new Lose();
        return new Even();
    }
}