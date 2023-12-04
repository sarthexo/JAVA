package todo1_todo6;

import java.nio.file.ProviderNotFoundException;

public class CourseCollection {
	private static Course[] availablecourses = new Course[4];	 
	static {
		availablecourses[0]=new Course(1,"JAVA",22,"Udemy",56000);   //we can only initialize values in static block
		availablecourses[1]=new Course(2,"c++",34,"coursera",65000);   //we can only initialize values in static block
		availablecourses[2]=new Course(3,"python",22,"blackbox",42000);   //we can only initialize values in static block
		availablecourses[3]=new Course(4,"dotnet",22,"Udemy",72000);   //we can only initialize values in static block
	}
	
	public static void getCourse(String providerName) throws ProviderNotFoundException {
		int flag=0;
		for(int i=0; i<availablecourses.length; i++) {
			//System.out.println(i);
			String provider=availablecourses[i].getProvider();
			//System.out.println(provider);
		
			if (providerName.equals(provider)) {
				flag=1;
				System.out.println(availablecourses[i].getCourseId());
				System.out.println(availablecourses[i].getDuration());
				System.out.println(availablecourses[i].getFees());
				System.out.println(availablecourses[i].getProvider());
				System.out.println(availablecourses[i].getTitle());
			}
		}
		if (flag==0){
			String error ="the entered provider is invalid";
			
		}
	}
}
