package todo9;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationCourseMain {

	public static void main(String[] args) {

		String filePath="./src/todo9/courses.txt";
		try(FileInputStream fis=new FileInputStream(filePath);
			ObjectInputStream ois=new ObjectInputStream(fis))
		{

            Courses[] courses = (Courses[]) ois.readObject();  // Read the array of Course objects from the file

            // Display course details
            System.out.println("Course details:");
            for (Courses course : courses) {
                System.out.println(course);
            }

//			Object currentObject=ois.readObject();
//			
//			System.out.println(currentObject);
//			Courses curentCourse=(Courses)currentObject;
//			String cC=curentCourse.getName();
//			System.out.println(cC);
//			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
