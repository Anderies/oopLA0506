package learningS5;

public class TV {
//	Data Fields
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	public TV() {
		
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if(newChannel <= 120) {
			if (on && newChannel >= 1) {
				channel = newChannel;
			}
		}


	}
	
	public void setVolume(int newVolumeLevel) {
		if(newVolumeLevel <= 7) {
			System.out.println("Volume Max adalah 7");
			if(on && newVolumeLevel >= 1) {
				volumeLevel = newVolumeLevel;
			}
		}
		
		
	}
	
	public void channelUp() {
		if (on && channel < 120) {
			channel++;
		}
	}
	
	public void channelDown() {
		if (on && channel > 1) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if (on && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}
	}

}
