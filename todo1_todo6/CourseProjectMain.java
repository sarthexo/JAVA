package todo1_todo6;

public class CourseProjectMain {

	public static void main(String[] args) {
		//ToDo1
		CourseProject cp = new CourseProject(101,"PGDAC",22,"CDAC",106200);
		cp.DisplayDetails();
		CourseProject cp2 = new CourseProject(102,"PGDMC",22,"CDAC",150000);
		cp2.DisplayDetails();
		CourseProject cp3 = new CourseProject(103,"PGDBDA",60,"CDAC2",116200);
		cp3.DisplayDetails();
		
		//TodDo2
		
		CourseProject.counter();
		
		//ToDo3
		
		CourseProject[] courses =new CourseProject[3];
		courses[0]=cp;
		courses[1]=cp2;
		courses[2]=cp3;
		
		//course [0]=new course(
		System.out.println("---------------------------------------------");
		System.out.println("Courses with Short Duration of less than 40 Hours is: ");
		CourseProcessor.printShortDurationCourseNames(courses);
		
		
		//ToDo4
		System.out.println("---------------------------------------------");
		CourseDataCalculator cocalc = new CourseProjectAvgDuration();
		System.out.println("Avg Duration of Courses: "+cocalc.doCalculation(courses)); 
		
		System.out.println("---------------------------------------------");
		CourseDataCalculator cocalc2 = new CourseProjectAvgFees();
		System.out.println("Avg Fees of Courses: "+cocalc2.doCalculation(courses)); 
		
		System.out.println("-----------------------------------------------");
	
		
		
		//Todo5
		
		//CourseInfo c1 = new CourseInfo("CDAC1",38);
		
		CourseInfoProcessor p1=new CourseCountMatch();
		CourseInfo c1=new CourseInfo("CDAC",22);
			System.out.println("total count =" + p1.processCourseInfo(courses,c1));
			
			CourseInfoProcessor p2=new CourseAvgFeesMatch();
			CourseInfo c2=new CourseInfo("CDAC",22);
				System.out.println("total avg is =" + p2.processCourseInfo(courses,c2));
				
				
		//todo-6
				
				CourseCollection.getCourse("coursera");
				
				
	}

}
