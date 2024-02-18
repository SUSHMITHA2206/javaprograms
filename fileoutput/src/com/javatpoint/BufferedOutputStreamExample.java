//package fileoutput;
//
//
//import java.io.FileInputStream;  
//public class DataStreamExample {  
//     public static void main(String args[]){    
//          try{    
//            FileInputStream fin=new FileInputStream("E:\\testout2.txt");    
//            int i=0;    
//            while((i=fin.read())!=-1){    
//             System.out.print((char)i);    
//            }    
//            fin.close();    
//          }catch(Exception e){System.out.println(e);}    
//         }    
//        }  
package com.javatpoint;  
import java.io.*;  
public class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("E:\\testout2.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to javaTpoint.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  


























