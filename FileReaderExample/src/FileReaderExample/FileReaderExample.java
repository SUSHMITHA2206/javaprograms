package FileReaderExample;
import java.io.*;
public class FileReaderExample {

	public static void main(String[] args) {
		try {
		FileReader fread = new FileReader("E:\\test3.txt");
		int i=0;
		while((i=fread.read())!=-1) {
			System.out.print((char)i);
		}
		fread.close();
	  }catch(Exception e) {System.out.println(e);}
	}

}
