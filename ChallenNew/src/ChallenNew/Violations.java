package ChallenNew;
import java.util.*;
import java.io.*;


public class Violations {
	String vno;
	String vcat;
	String dtime;
	String loc;
	float amt;
	
	
		
	public static void main(String[] args) throws IOException {
		int max=1;
		HashMap<String,ArrayList<String>> viols =new HashMap<>();
		BufferedReader reader;
		BufferedWriter writer;
		reader=new BufferedReader(new FileReader("E:\\Challen.txt"));
		writer=new BufferedWriter(new FileWriter("E:\\totalchallan.txt"));
		String line=reader.readLine();
		while(line!=null) 
		{
			String[] sd=line.split(",");
			String vno=(sd[0]);
			String loc=(sd[1]);
			String dtime=(sd[2]);
			String vcat=(sd[3]);
			float amt=Float.parseFloat(sd[4]);
			ArrayList<String> list=new ArrayList<String>();  
			list.add(vno+" "+loc+" "+dtime+" "+vcat+" "+amt);
		
			ArrayList<String> vs = viols.get(vno);
		
			if(vs==null) {
				vs=new ArrayList<>();
				vs.add(line);
			}
			else
			{
				vs.add(line);
				viols.put(vno, vs);
			}
			if(vs.size()>max) {
				max=vs.size();
				
			}
			for(int i=1;i<max;i++)
			{
				System.out.println(i+"violation are listed below");
				
			
			Set<String> ks= viols.keySet();
			
     		for(String key:ks)
			{
				ArrayList<String> viols1=viols.get(key);
				System.out.println(viols1);
			if((viols1!=null)&&(viols.size()==i))
			{
				System.out.println(viols1);
			}
			System.out.println(list);
			}
			}
	}	
			
	}
}