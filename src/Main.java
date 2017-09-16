import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of students");
		int n=sc.nextInt();
		StudentGroup sg=new StudentGroup(n);
		Student[] s=new Student[n];
		for(int i=0;i<n;i++)
		{	System.out.println("Enter Student data:");
			int id=sc.nextInt();
			String name=sc.next();
			Date d=new Date(sc.next());
			double avg=sc.nextDouble();
			s[i]=new Student(id,name,d,avg);
		}
		sg.setStudents(s);
		Student res[]=sg.getStudents();
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i].getId()+" "+res[i].getFullName()+" "+res[i].getBirthDate()+" "+res[i].getAvgMark());
		}
		int k=sc.nextInt();
		
		Student s2=sg.getStudent(k);
		System.out.println(s2.getId()+" "+s2.getFullName()+" "+s2.getBirthDate()+" "+s2.getAvgMark());
		Student s3=new Student(1,"roshini",new Date(1997-07-25),93);
		sg.setStudent(s3,1);
		
		Student res1[]=sg.getStudents();
		
		for(int i=0;i<res1.length;i++)
		{
			System.out.println(res1[i].getId()+" "+res1[i].getFullName()+" "+res1[i].getBirthDate()+" "+res1[i].getAvgMark());
		}
		/*Date d1=new Date(10-01-1997);
		Date d2=new Date(10-05-1789);
		Student res2[]=sg.getBetweenBirthDates(d1,d2);
		
		for(int i=0;i<res2.length;i++)
		{
			System.out.println(res2[i].getId()+" "+res2[i].getFullName()+" "+res2[i].getBirthDate()+" "+res2[i].getAvgMark());
		}*/
		
		
	}
	

}
