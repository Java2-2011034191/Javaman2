package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;

	// public을 통하여 private에 접근한다!!!!!!!!!!!!!!!!!!!!! <-가장 중요!!!
	public void setMan(int man) {
		this.man = man;
	} // man값을 받아주는 것 -> this.man은 field의 man. 뒤의 man은 객체에 포함된 man(지역변수) -> 두
		// 레벨의 차원이 다르다

	public int getMan() {
		System.out.println(man);
		return man;
	} // man값을 빼내주는 것. 출력문에 쑤셔넣어버림.

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getTire() {
		System.out.println(tire);
		return tire;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		System.out.println(color);
		return color;
	}

	/*
	 * public all_setting(int tire, String color) { this.tire = tire; this.color
	 * = color; }
	 */

	public void xx(int man, int tire, String color) {
		this.man = man;
		this.tire = tire;
		this.color = color;
	}

	void pr() {
		System.out.println("man :" + man + " /  tire : " + tire + " /  color : " + color);
	}
}
