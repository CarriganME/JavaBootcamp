
public class NumTrackTest {

	public static void main(String[] args) {
		NumTrack nt = new NumTrack("Numbers");
		nt.add(5); nt.add(15);  nt.add(9);
		System.out.println(nt.getCount());
		System.out.println(nt.getAverage());
		System.out.println(nt);
	}

}
