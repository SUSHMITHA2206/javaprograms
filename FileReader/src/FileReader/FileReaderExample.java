package FileReader;
import java.io.FileReader;


public class FileReaderExample {  
     public static void main(String args[])throws Exception {    
            
            FileReader fr=new FileReader("E:\\test3.txt");    
            int i=0;    
            while((i=fr.read())!=-1){    
             System.out.print((char)i);    
           
            fr.close();    
          
         }    
        }  
}