package todo1_todo6;

import java.util.Objects;

public class Course {
		
	private int CourseId;
	private String Title;
	private int Duration;
	private String Provider;
	private int Fees;
	//private static int CountStudents;
	
	public Course(int courseId, String title, int duration, String provider, int fees) {
		super();
		CourseId = courseId;
		Title = title;
		Duration = duration;
		Provider = provider;
		Fees = fees;
		//CountStudents++;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(Duration, Provider);
	}



	@Override  //here equals method is already coming from object so there is override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Duration == other.Duration && Objects.equals(Provider, other.Provider);
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
}
