package MovieFile;
import java.util.*;


import java.io.*;
class MovieDetails{

    String moviename;

    String Heroname;

    String Heroine;

    String Singer;

    String MusicDir;

    MovieDetails(String moviename,String Heroname,String Heroine,String Singer,String MusicDir)

    {

          this.moviename=moviename;

          this.Heroname=Heroname;

          this.Heroine=Heroine;

          this.Singer=Singer;

          this.MusicDir=MusicDir;

    }

}
class MovieComparator implements Comparator<MovieDetails>{

    public int compare(MovieDetails m1,MovieDetails m2)

    {

         

                return (m1.moviename.compareTo(m2.moviename));



    }

}
class HeroComparator implements Comparator<MovieDetails>{

    public int compare(MovieDetails m1,MovieDetails m2)

    {

         

                return (m1.Heroname.compareTo(m2.Heroname));



    }

}
class HeroineComparator implements Comparator<MovieDetails>{

    public int compare(MovieDetails m1,MovieDetails m2)

    {

         

                return (m1.Heroine.compareTo(m2.Heroine));



    }

}
class SingerComparator implements Comparator<MovieDetails>{

    public int compare(MovieDetails m1,MovieDetails m2)

    {

         

                return (m1.Singer.compareTo(m2.Singer));



    }

}

class MusicDirComparator implements Comparator<MovieDetails>{

    public int compare(MovieDetails m1,MovieDetails m2)

    {

         

                return (m1.MusicDir.compareTo(m2.MusicDir));



    }

}


public class Movie {
	
	
	public static void main(String[] args) throws IOException {
		ArrayList<MovieDetails> ar=new ArrayList<MovieDetails>();
		BufferedReader reader;
		BufferedWriter writer;
		writer=new BufferedWriter(new FileWriter("E:\\movies.txt"));
		System.out.println("Enter the number of movies:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter movie name");
			String moviename=reader.readLine();
			System.out.println("enter hero name");
			String Heroname=reader.readLine();
			System.out.println("enter heroin name");
			String Heroine=reader.readLine();
			System.out.println("enter singer name");
			String Singer=reader.readLine();
			System.out.println("enter Music Director name");
			String MusicDir=reader.readLine();
			
		    ar.add(new MovieDetails(moviename,Heroname,Heroine,Singer,MusicDir));
		    
		    
		
}
		
		for(int j=0;j<ar.size();j++) {
			MovieDetails mi = ar.get(j);
			
			System.out.println(mi.moviename);
			System.out.println(mi.Heroname);
			System.out.println(mi.Heroine);
			System.out.println(mi.Singer);
			System.out.println(mi.MusicDir);
			System.out.println();
			String str=mi.moviename+" "+mi.Heroname+" "+mi.Heroine+" "+mi.MusicDir;
			writer.write(str);
			writer.newLine();
		}
	    System.out.println();
		System.out.println("After sorting by movie names");
		String mov="After sorting by movie names";
		writer.write(mov);
		writer.newLine();
	
		ar.sort(new MovieComparator());

        for(MovieDetails moviedetails:ar) {

              
        	System.out.println(moviedetails.moviename+" "+moviedetails.Heroname+" "+moviedetails.Heroine+" "+moviedetails.Singer+" "+moviedetails.MusicDir);
        	String Mo=moviedetails.moviename+" "+moviedetails.Heroname+" "+moviedetails.Heroine+" "+moviedetails.Singer+" "+moviedetails.MusicDir;
        	writer.write(Mo);
        	writer.newLine();

        }
        System.out.println();
        System.out.println("After sorting by Hero names");
        String Hna="After sorting by Hero names";
        writer.write(Hna);
        writer.newLine();
        ar.sort(new HeroComparator());

        for(MovieDetails moviedetails:ar) {

              System.out.println(moviedetails.Heroname+" "+moviedetails.moviename+" "+moviedetails.Heroine+" "+moviedetails.Singer+" "+moviedetails.MusicDir);
              String H1=moviedetails.Heroname+" "+moviedetails.moviename+" "+moviedetails.Heroine+" "+moviedetails.Singer+" "+moviedetails.MusicDir;
              writer.write(H1);
        }
        System.out.println();
        System.out.println("After sorting by Heroin names");
        String Ah="After sorting by Heroin names";
        writer.write(Ah);
        writer.newLine();
        ar.sort(new HeroineComparator());

        for(MovieDetails moviedetails:ar) {

              System.out.println(moviedetails.Heroine+" "+moviedetails.moviename+" "+moviedetails.Heroname+" "+moviedetails.Singer+" "+moviedetails.MusicDir);
              String Am=moviedetails.Heroine+" "+moviedetails.moviename+" "+moviedetails.Heroname+" "+moviedetails.Singer+" "+moviedetails.MusicDir;
              writer.write(Am);
              writer.newLine();
        }
        System.out.println();
        System.out.println("After sorting by Singer names");
        String As="After sorting by Singer names";
        writer.write(As);
        writer.newLine();
        ar.sort(new SingerComparator());

        for(MovieDetails moviedetails:ar) {

              System.out.println(moviedetails.Singer+" "+moviedetails.moviename+" "+moviedetails.Heroname+" "+moviedetails.Heroine+" "+moviedetails.MusicDir);
              String Asin=moviedetails.Singer+" "+moviedetails.moviename+" "+moviedetails.Heroname+" "+moviedetails.Heroine+" "+moviedetails.MusicDir;
              writer.write(Asin);
              writer.newLine();

        }
        System.out.println();
        System.out.println("After sorting by Music Director names");
        String Ad="After sorting by Music Director names";
        writer.write(Ad);
        writer.newLine();
        ar.sort(new MusicDirComparator());

        for(MovieDetails moviedetails:ar) {

              System.out.println(moviedetails.MusicDir+" "+moviedetails.moviename+" "+moviedetails.Heroname+" "+moviedetails.Heroine+" "+moviedetails.Singer+" ");
              String Ams=moviedetails.MusicDir+" "+moviedetails.moviename+" "+moviedetails.Heroname+" "+moviedetails.Heroine+" "+moviedetails.Singer+" ";
              writer.write(Ams);
              writer.newLine();
        }
        
      


        
    	writer.close();
        
      
}
}

