package todo1_todo6;

public class CourseProject {
	private int CourseId;
	private String Title;
	private int Duration;
	private String Provider;
	private int Fees;
	private static int CountStudents;
	
	public CourseProject(int courseId, String title, int duration, String provider, int fees) {
		super();
		CourseId = courseId;
		Title = title;
		Duration = duration;
		Provider = provider;
		Fees = fees;
		CountStudents++;
	}
	
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public String getProvider() {
		return Provider;
	}
	public void setProvider(String provider) {
		Provider = provider;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	
	public void DisplayDetails() {
		
		System.out.println("Course Id: "+getCourseId());
		System.out.println("Title: "+getTitle());
		System.out.println("Duration: "+getDuration());
		System.out.println("Provider: "+getProvider());
		System.out.println("Fees: "+getFees());
		System.out.println("---------------------------------------------");
	}
	
	//ToDo2
	public static void counter() {
		System.out.println("Count is: "+CountStudents);
	}
	
	
}
