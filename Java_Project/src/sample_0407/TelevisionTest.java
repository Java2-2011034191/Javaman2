package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;

		Television testtv = new Television();
		testtv = tv;
		testtv.channel = 536;

		tv.pr();

		Television tv2 = new Television();
		tv.channel = 9;
		tv.volume = 11;
		tv.onOff = true;

		System.out.println("current channel : " +tv2.changeChannel(24));
		
		tv2.pr();

	}

}
