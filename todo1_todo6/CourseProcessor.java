package todo1_todo6;
  
//this is of array
public class CourseProcessor {
	
	public static void printShortDurationCourseNames(CourseProject [] courses) {
		
		for(int i=0;i<courses.length;i++) {
			
			if(courses[i].getDuration()<40) {
				System.out.println(courses[i].getTitle());
			}
		}
	}
}
