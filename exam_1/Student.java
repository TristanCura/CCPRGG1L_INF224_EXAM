
public class Student {

	String surname;
	String firstName;
	char middleInitial;
	String dateOfBirth;
	int studentNumber;
	String studentEmailAddress;
	boolean iAmAwesome;
	
	public void sayIntroduction() {
		System.out.println("Hi! I'm '" + surname + ", " + firstName + " " + middleInitial +".'");
	}
	
	public void sayMyStudentNumber() {
		System.out.println("Student#: " + studentNumber);
	}
	
	public void sayMyEmailAddress() {
		System.out.println("Email: " + studentEmailAddress);
	}
	
	public void sayIAmAwesome() {
		System.out.println("Am I awesome?: " + iAmAwesome);
	}
}
