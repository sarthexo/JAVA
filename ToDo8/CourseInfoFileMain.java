package ToDo8;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CourseInfoFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Source File is creating by me");
		File f= new File(args[0]);
				try(FileOutputStream fout=new FileOutputStream(f))
				{
				 String name_Of_File="myIndea";
				 
					byte[] file=name_Of_File.getBytes();
					System.out.println("file is succesfully created");
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
					
				System.out.println("Destination file is created ");
				File dest=new File(args[1]);
				
				try
				{
				 copyFileData(f,dest);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				finally
				{
					
				}

	}

	private static void copyFileData(File f, File dest) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream orginalFile=new FileInputStream(f);
		FileOutputStream newFile=new FileOutputStream(dest);
		int n=0;
		try {
			while((n=orginalFile.read())!=-1)
			{
				try {
					newFile.write(n);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
