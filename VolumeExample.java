class Volume {
	private int theLength;
	private int theWidth;
	private int theHeight;

	public Volume() {
		theLength = 0;
		theWidth = 0;
		theHeight = 0;
	}

	public Volume(int aLength, int aWidth, int aHeight) {
		this.theLength = aLength;
		this.theWidth = aWidth;
		this.theHeight = aHeight;
	}

	public int getVolume() {
		return theLength * theWidth * theHeight;
	}

	public void setVolumeint(int aLength, int aWidth, int aHeight) {
		this.theLength = aLength;
		this.theWidth = aWidth;
		this.theHeight = aHeight;
	}

	public int calcVolume() {
		int volume = theLength * theWidth * theHeight;
		return volume;
	}

	@Override
	public String toString() {
		return "The volume is " + calcVolume() + " m^3";
	}
}

public class VolumeExample {
	public static void main(String[] args) {
		Volume v = new Volume(3,4,5);
		System.out.println(v);
	}
}