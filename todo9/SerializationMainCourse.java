package todo9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationMainCourse {

	public static void main(String[] args) {
		String filePath="./src/todo9/courses.txt";

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of course you want");
		int n=scan.nextInt();
		Courses[]course=new Courses[n];
	     for(int i=0;i<n;i++)
	     {
		System.out.println("Enter the Name of course:");
		String courseName=scan.next();
		
		System.out.println("Enter the provider name:");
		String courseProvider=scan.next();
		System.out.println("Enter duration of course:");
		int courseDuration=scan.nextInt();
		System.out.println("Enter fees of these course");
		int courseFees=scan.nextInt();
		course[i]=new Courses( courseName,  courseProvider,  courseDuration,  courseFees);}
	     try(FileOutputStream fos=new FileOutputStream(filePath);
	  			ObjectOutputStream obj=new ObjectOutputStream(fos))
	      {
	     	//for(Courses code :course)
	 		obj.writeObject(course);
	 		System.out.println("Succesfully serialized");

	      }
	      catch(Exception ex)
	      {
	     	 ex.printStackTrace();
	      }
	     
		 
	}

}
