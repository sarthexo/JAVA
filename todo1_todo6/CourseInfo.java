package todo1_todo6;

import java.util.Objects;

public class CourseInfo {
	private String ProviderName;
	private int Duration;
	
	
	public String getProviderName() {
		return ProviderName;
	}
	public void setProviderName(String providerName) {
		ProviderName = providerName;
	}
	public int getDuration() {
		return Duration;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Duration, ProviderName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseInfo other = (CourseInfo) obj;
		return Duration == other.Duration && Objects.equals(ProviderName, other.ProviderName);
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	
	public CourseInfo(String providerName, int duration) {
		super();
		ProviderName = providerName;
		Duration = duration;
	}
	
}
