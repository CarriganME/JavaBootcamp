
public class TimeTrackDriver {

	public static void main(String[] args) {
		TimeTrack tt = new TimeTrack("homework");
		tt.addSeconds(200);
		tt.addDays(3);
		tt.addMinutes(2000);
		tt.addSeconds(2);
		System.out.println(tt.getTotalSeconds());
		System.out.println(tt);
	}

}
