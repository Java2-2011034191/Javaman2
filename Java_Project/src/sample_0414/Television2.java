package sample_0414;

public class Television2 {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television2(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	public Television2(int channel, int volume) {
		this(channel, volume, true);
	}
	
	void print() {
		System.out.println("채널은" + channel + "이고 볼륨은 " + volume + "");
	}

}
