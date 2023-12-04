package todo9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationCourseMain {

	public static void main(String[] args) {
     String filePath="./src/todo9/courses.txt";
     	
     Courses[]course=new Courses[5];
 	course[0]=new Courses("pgdac","cdac",50,100000);
 	course[1]=new Courses("java","udemy",10,2000);
 	course[2]=new Courses("python","linkden",50,10000);
 	course[3]=new Courses("C++","Startbug",70,20000);
 	course[4]=new Courses(".net","cdac",+60,20000);

     try(FileOutputStream fos=new FileOutputStream(filePath);
 			ObjectOutputStream obj=new ObjectOutputStream(fos))
     {
    	for(Courses code :course)
		obj.writeObject(code);
		System.out.println("Succesfully serialized");

     }
     catch(Exception ex)
     {
    	 ex.printStackTrace();
     }

	}

}
