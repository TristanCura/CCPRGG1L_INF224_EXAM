
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student Tristan = new Student();
		Tristan.firstName = "Tristan Kelly";
		Tristan.middleInitial = 'P';
		Tristan.surname = "Cura";
		Tristan.dateOfBirth = "8/24/2004";
		Tristan.studentNumber = 2022104956;
		Tristan.studentEmailAddress = "curatp@students.national-u.edu.ph";
		Tristan.iAmAwesome = true;
		
		Tristan.sayIntroduction();
		Tristan.sayMyStudentNumber();
		Tristan.sayMyEmailAddress();
		Tristan.sayIAmAwesome();
		
	}

}
