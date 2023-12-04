package todo1_todo6;

public class CourseAvgFeesMatch implements CourseInfoProcessor {

	int coursefees;
	int count;
	@Override
	public float processCourseInfo(CourseProject[] CourseProjLocal,CourseInfo cinfo) {
		for(CourseProject coursearr:CourseProjLocal) {
			CourseInfo obj1=new CourseInfo(coursearr.getProvider(), coursearr.getDuration());
			if(cinfo.equals(obj1)) {
				coursefees=coursearr.getFees();
				count++;
			}
		}
	return coursefees/count;	
	}

}
