package InputStreamExample;

import java.io.*;  
class InputStreamExample {    
  public static void main(String args[]){    
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