package sample_0407;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr(){
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다." + onOff);
				
	}

	int changeChannel (int ch){
		channel = ch;
		return channel;
	}
}
