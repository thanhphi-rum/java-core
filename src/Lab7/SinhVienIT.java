package Lab7;

public class SinhVienIT extends SinhVien {
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(double scoreJava, double scoreHTML) {
		super();
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	@Override
	public double getDiem() {
		return (scoreJava * 2 + scoreHTML) / 3;
	}

}
