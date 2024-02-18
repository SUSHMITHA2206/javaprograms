package DeathReport;

import java.io.*;

import java.util.*;

public class DeathReport {



			String hname;
		    String pname;
     	    String agroup;
		    int age;
     	    String cause;
		    String loc;
		    String dist;

		    public static void main(String[] args) throws IOException {

    	 	

    	 FileInputStream fin1=new FileInputStream("E:\\hospital1.txt");    

    	 FileInputStream fin2=new FileInputStream("E:\\hospital2.txt");    

    	 FileInputStream fin3=new FileInputStream("E:\\hospital3.txt");    

    	 FileInputStream fin4=new FileInputStream("E:\\hospital4.txt");  

    	 FileInputStream fin5=new FileInputStream("E:\\hospital5.txt"); 

    	 FileOutputStream fout1=new FileOutputStream("E:\\output.txt"); 

    	 Vector v=new Vector();    

    	 v.add(fin1);    

    	 v.add(fin2);    

    	 v.add(fin3);    

    	 v.add(fin4); 

    	 v.add(fin5);

    	 Enumeration e=v.elements();  

    	 SequenceInputStream bin=new SequenceInputStream(e);    

    	 int i=0;      

    	 while((i=bin.read())!=-1){    

    	 System.out.print((char)i); 

    	 fout1.write(i);

    	 }     

    	 bin.close();    

    	 fin1.close();    

    	 fin2.close(); 

    	 fin3.close();

    	 fin4.close();

    	 fin5.close();

    	

     

    	 int max=1;



         HashMap<String,ArrayList<String>> hos1 =new HashMap<>();

         HashMap<String,ArrayList<String>> hos2 =new HashMap<>();



         BufferedReader reader;



         BufferedWriter writer;



         try {

         reader=new BufferedReader(new FileReader("E:\\output.txt"));



         writer=new BufferedWriter(new FileWriter("E:\\totaldeath.txt"));



         String line=reader.readLine();



         while(line!=null)



         {



                       String[] sd=line.split(",");
                       String hname=(sd[0]);
                       String pname=(sd[1]);
                       String agroup=(sd[2]);
                       int age=Integer.parseInt(sd[3]);
                       String cause=(sd[4]);
                       String loc=(sd[5]);                       
                       String dist=(sd[6]);
                       ArrayList<String> list=new ArrayList<String>(); 
//                        System.out.println(line);                      


                     ArrayList<String> ps = hos1.get(dist);

                       

      

                       if(ps==null) {



                                     ps=new ArrayList<>();



                                     ps.add(line);



                       }



                       else



                       {
                              ps.add(line);



                                    



                       }

                       hos1.put(dist, ps);



                       if(ps.size()>max) {



                                     max=ps.size();

                       }

                       line=reader.readLine();

                       

         }

         for(int a=1;a<max+1;a++)



         {



                       System.out.println(a+"violation are listed below");

                       writer.write(a+"violation are listed below");

                       writer.newLine();

                       Set<String> keySet= hos1.keySet();

                      

         

                       for(String key:keySet)







                  	{



                       ArrayList<String> hosp =hos1.get(key);

                       

                       

                        if((hosp!=null)&&(hosp.size()==i))



                       {



                    	   for(String s:hosp)

                    	   {

                    		   System.out.println(s);

                    		   writer.write(s);

                    		   writer.newLine();

                    	   }



                       }



       



         }



  }

         

        reader.close();

			writer.close();



}catch(IOException e1) {

e1.printStackTrace();

}

}



      

     

     

     

     

       }    





            