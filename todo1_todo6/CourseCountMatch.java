package todo1_todo6;

public class CourseCountMatch implements CourseInfoProcessor {
	int count=0;
	@Override
	public float processCourseInfo(CourseProject[] CourseProjLocal,CourseInfo cinfo) {
		for(CourseProject coursearr:CourseProjLocal) {
			CourseInfo obj1=new CourseInfo(coursearr.getProvider(), coursearr.getDuration());
			if(cinfo.equals(obj1)) {
				count ++;
			}
		}
	return count;	
	}
}
