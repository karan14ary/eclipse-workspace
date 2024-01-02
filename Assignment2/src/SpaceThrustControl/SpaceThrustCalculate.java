package SpaceThrustControl;

public class SpaceThrustCalculate {
	public static long calculateThrust(int throttleSetting) {
		long p=1;
		for(int i=1;i<=5;i++) {
			p=p* throttleSetting;
		}
		return p;
	}
}
