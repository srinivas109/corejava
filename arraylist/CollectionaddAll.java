package srinivas.arraylist;
import java.util.*;

public class CollectionaddAll {
	
	public static void main(String args[]){
		
	ArrayList<String>list=new ArrayList<String>();
	
	list.add("prashanth");
	list.add("sanjay");
	list.add("sudhir");
	list.add("srinivas");
	
	ArrayList<String>list2=new ArrayList<String>();
	
	list2.add("ravi");
	list2.add("vasu");
	
	list.addAll(list2);
	
	Iterator itr=list.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	
	}
	}
}
