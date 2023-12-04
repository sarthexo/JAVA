package todo9;

import java.io.Serializable;

public class Courses implements Serializable {
	private String name;
	private String provider;
	private int duration;
	private int fees;
	

	public Courses() {
		// TODO Auto-generated constructor stub
	}
	public Courses(String name, String provider, int duration, int fees) {
		
		this.name = name;
		this.provider = provider;
		this.duration = duration;
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "CourceDetails [name=" + name + ", provider=" + provider + ", duration=" + duration + ", fees=" + fees
				+ "]";
	}
	

}

