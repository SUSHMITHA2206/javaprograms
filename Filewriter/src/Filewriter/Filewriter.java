package Filewriter;
import java.io.*;
public class Filewriter {

	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("E:\\test3.txt");
		String s="Welcome to java programming";
		file.write(s);
		file.close();
		System.out.print("success");
		

	}

}
