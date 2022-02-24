import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lab1 {

	public static void main(String[] args) {
		
		try {
			PrintStream newIO = new PrintStream(Lab1Constants.LOGFILENAME);
			System.setOut(newIO);
			System.setErr(newIO);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(Lab1Constants.REDIRECTFAILURE);
		}
	//Question 2	
	//Creates and initializes Student array with student objects
	Student students[] = new Student[]{
			new Student(100,18,"John"), 
			new Student(101,19,"Jane"),
			new Student(102,20,"Larry"),
			new Student(103,20,"Karen"),
			new Student(104,21,"Karl")};
	//Question 3
	System.out.println("The number of elements in the students array: " + students.length);
	//Question 4
	//Loop to print student objects in the students array
	for(Student student: students) {
		System.out.println(student.toString());
	}
	//Question 5
	for(Student student: students) {
		//Finds the youngest student in the students array
		if(student.getAge() <= Lab1Constants.YOUNGESTVALUE) {
			Lab1Constants.YOUNGESTVALUE = student.getAge();
			Lab1Constants.YOUNGESTNAME = student.getName();
		}
		//Finds the oldest student in the array
		if(student.getAge() >= Lab1Constants.OLDESTVALUE) {
			Lab1Constants.OLDESTVALUE = student.getAge();
			Lab1Constants.OLDESTNAME = student.getName();
		}	
	}
	//Prints the names of the Youngest and Oldest students in students array
	System.out.println("The youngest student is: " + Lab1Constants.YOUNGESTNAME);
	System.out.println("The oldest student is: " + Lab1Constants.OLDESTNAME);
	
	//Question 6
	students[2].setAge(21);
	
	//Question 7
	//Prints the names of student objects under the age of 20 in student array
	System.out.println("Students under the age of 20: ");
	for(Student student: students){
		if(student.getAge() < 20) {
			System.out.println(student.getName());
		}
	}
	//Question 8
	//Creates newStudents array
	Student newStudents[] = new Student[Lab1Constants.NEWSTUDENTSARRAY];
	
	//Question 9 
	//Copies last 3 student objects from Students array to newStudents arry
	System.arraycopy(students, 2, newStudents, 0, Lab1Constants.NEWSTUDENTSARRAY);
	
	//Question 10
	//Prints student objects in newStudents array
	for(Student student: newStudents) {
		System.out.println(student.toString());
	}
	}

}
