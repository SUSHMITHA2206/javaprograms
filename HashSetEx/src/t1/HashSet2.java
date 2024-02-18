package t1;

import java.util.*;  
class HashSet2{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  HashSet<String> set=new HashSet<String>();  
  set.add("Ravi");  
  set.add("Vijay");  
  set.add("Ravi");  
  set.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  } 
  System.out.println(" LinkedHashSet ");
  LinkedHashSet<String> lset=new LinkedHashSet<String>();  
  lset.add("Ravi");  
  lset.add("Vijay");  
  lset.add("Ravi");  
  lset.add("Ajay");  
  
  //Traversing elements  
  Iterator<String> litr=lset.iterator();  
  while(litr.hasNext()){  
   System.out.println(litr.next());  
  } 
  System.out.println(" Treeset ");
  TreeSet<String> tset=new TreeSet<String>();  
  tset.add("Ravi");  
  tset.add("Vijay");  
  tset.add("Ravi");  
  tset.add("Ajay");  
  //Traversing elements  
  Iterator<String> titr=tset.iterator();  
  while(titr.hasNext()){  
   System.out.println(titr.next());  
  } 
 }  
}