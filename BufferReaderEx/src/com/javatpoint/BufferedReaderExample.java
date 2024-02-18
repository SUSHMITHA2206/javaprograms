package com.javatpoint;  

import java.io.*;  
public class BufferedReaderExample{    
 public static void main(String args[]){    
  try{    
    FileReader fin=new FileReader("E:\\test4.txt");    
    BufferedReader bin=new BufferedReader(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  