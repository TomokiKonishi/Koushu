package janken;

import shaps.Shape;

public class Man {

	private Shape hand;
	private Integer winCount;

	public Man() {
		setWinCount(0);
	}

	public Shape getHand() {
		return hand;
	}

	public void setHand(Shape hand) {
		this.hand = hand;
	}

	public Integer getWinCount() {
		return winCount;
	}

	public void setWinCount(Integer winCount) {
		this.winCount = winCount;
	}

}
