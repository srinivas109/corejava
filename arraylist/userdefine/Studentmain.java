package srinivas.arraylist.userdefine;
import java.util.*;

public class Studentmain {

	public static void main(String[] args) {
		
		Student s1=new Student(1201100406,"SANJAY",23);
		Student s2=new Student(1201100497,"SUDHIR",22);
		Student s3=new Student(1201100488,"PRASHANTH",59);
		
		
ArrayList<Student>list=new ArrayList<Student>();

list.add(s1);
list.add(s2);
list.add(s3);

Iterator itr=list.iterator();
while(itr.hasNext()){
	Student ud=(Student)itr.next();
	System.out.println(ud.Rollno+" "+ud.Name+" "+ud.Age);
}
	}

}
