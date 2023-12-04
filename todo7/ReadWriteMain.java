package todo7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String SourceOF= String.valueOf(args[0]);
		String DestinationOF= String.valueOf(args[1]);
		
		
		try (FileOutputStream fout1= new FileOutputStream(SourceOF)){
			
			String str="Hello world";
			byte[] strarr=str.getBytes();
			fout1.write(strarr);
			System.out.println("data added successfully");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	try (FileInputStream fin1= new FileInputStream(SourceOF);
			BufferedInputStream bin=new BufferedInputStream (fin1);
			
			FileOutputStream fout2=new FileOutputStream(DestinationOF);
			BufferedOutputStream bif1=new BufferedOutputStream(fout2)
		)
	{
		StringBuilder sb=new StringBuilder();
		while(true) {
			int data=bin.read();
			
			if(data==-1) 
				break;
				char ch=(char)data;
				sb.append(ch);
			
			
			String ch1=sb.toString();
			
			byte[]arr=ch1.getBytes();
			fout2.write(arr);
			System.out.println("file added successfully");
		}
	}
//					
 catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
				
				
		
		
	}

}
