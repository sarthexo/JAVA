package ToDo8;

import java.io.BufferedReader;
import java.io.FileReader;

public class CourseMain {

	public static void main(String[] args) {
      String filePath="./src/ToDo8/courseInfo.txt";
      try(FileReader rd=new FileReader(filePath);
    	   BufferedReader bf=new BufferedReader(rd);){
    	  while(true)
			{
				String line=bf.readLine();
				if(line==null)
					break;
				String[]data=line.split(":");
				String courseId=data[0];
				String courseName=data[1];
				String courseProvider=data[2];
				String courseDuration=data[3];
				String courseFees=data[4];
				
				System.out.println("CourseId is:"+courseId  +"   CourseName is: "+ courseName+ "  Provederis:"+courseProvider+"   duration of course is :"+courseDuration+"   Fees is :"+courseFees);
			}

      }
      catch(Exception ex)
      {
    	  ex.printStackTrace();
      }
    		  
	}

}
