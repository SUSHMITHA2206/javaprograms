//package fileoutput;
////package fileoutput;
////
////
////import java.io.FileInputStream;  
////public class fileoutput1 {  
////     public static void main(String args[]){    
////          try{    
////            FileInputStream fin=new FileInputStream("E:\\testout.txt");    
////            int i=fin.read();  
////            System.out.print((char)i);    
////  
////            fin.close();    
////          }catch(Exception e){System.out.println(e);}    
////         }    
////        }  
//import java.io.*;  
//public class BufferedInputStreamExample{    
// public static void main(String args[]){    
//  try{    
//    FileInputStream fin=new FileInputStream("E:\\testout2.txt");    
//    BufferedInputStream bin=new BufferedInputStream(fin);    
//    int i;    
//    while((i=bin.read())!=-1){    
//     System.out.print((char)i);    
//    }    
//    bin.close();    
//    fin.close();    
//  }catch(Exception e){System.out.println(e);}    
// }    
//}  

import java.io.*;  
class InputStreamExample {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("E:\\testout.txt");    
   FileInputStream input2=new FileInputStream("E:\\testout2.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
}    
























