import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
			
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			this.students[i]=students[i];
			
			
		}
		}
	

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
			{
				return students[i];
			}
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
			{
				students[i]=student;
			}
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<students.length-1;i++)
		{
			for(int j=i+1;j<students.length;j++)
			{
				if(students[i].getId()==students[j].getId())
				{
					Student t=students[i];
					students[i]=students[j];
					students[j]=t;
				}
			}
		}
		}
	

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		Student s1[]=null;
		boolean f=false;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getBirthDate()==date)
			{
				s1[i]=new Student(students[i].getId(),students[i].getFullName(),students[i].getBirthDate(),students[i].getAvgMark());
				f=true;
			}						
		}
		if(f)
		return s1;
		else
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		return null;
	
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		
		return null;
		
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
