package Assignment2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.time.format.DateTimeFormatter;

public class StudentTest {

	static String dob = "1995-01-17";
	static String date_of_addmission = "2020-06-18";
	static LocalDate d1 = LocalDate.parse(dob);
	static LocalDate d2 = LocalDate.parse(date_of_addmission);

	// LocalDateTime now = LocalDateTime.now(); static DateTimeFormatter formatter =
	// DateTimeFormatter.ofPattern("d-MMM-yyyy");

	// static LocalDateTime formatDateTime = LocalDateTime.parse(dob, formatter);
	// static LocalDateTime formatDateTime1 =
	// LocalDateTime.parse(date_of_addmission, formatter);
	//static LocalDateTime date = LocalDateTime.of(2017,Month.FEBRUARY,3,6,30,40,50000);

        public static void main(String[] args) {
          //passing mark 35
		Student student = new Student(101, d2, d1, 35, 38, 39, 40, 40, "8thStandared");
		Student student1 = new Student(102, d2, d1, 75, 80, 74, 76, 79, "9thStandared");
		Student student2 = new Student(103, d2, d1, 80, 75, 74, 76, 79, "10thStandared");
		Student student3 = new Student(104, d2, d1, 30, 35, 35, 35, 35, "11thStandared");
		Student student4 = new Student(105, d2, d1, 75, 35, 34, 75, 75, "12thStandared");
		Student student5 = new Student(106, d2, d1, 50, 35, 60, 55, 58, "12thStandared");

		ArrayList<Student> al = new ArrayList<>();
		al.add(student);
		al.add(student1);
		al.add(student2);
		al.add(student3);
		al.add(student4);
		al.add(student5);
	
		// students who’s total marks are less than 40%

		System.out.println("students who’s total marks are less than 40%");
		al.stream().filter(p -> p.getChemistry() + p.getEnglish() + p.getMaths() + p.getPhysics() + p.getHindi() < 200)
				.forEach(System.out::println);
		System.out.println("---------------------------------------------------------");

		// students who’s total marks are more than 75% in any 3 subject

		System.out.println("students who’s total marks are more than 75% in any 3 subject");
		// al.stream().filter(p->p.getChemistry()+p.getEnglish()+p.getMaths()+p.getPhysics()+p.getHindi()>225).forEach(System.out::println);

		al.stream().filter(p -> p.getChemistry() > 75 || p.getEnglish() > 75 || p.getMaths() > 75 || p.getPhysics() > 75
				|| p.getHindi() > 75).forEach(System.out::println);
		// students who’s total marks are More than 75%

		System.out.println("-------------------------------------------------------");

		System.out.println("students who’s total marks are More than 75%");
		al.stream().filter(p -> p.getChemistry() + p.getEnglish() + p.getMaths() + p.getPhysics() + p.getHindi() > 375)
				.forEach(System.out::println);

		System.out.println("---------------------------------------------------------");
		// al.stream().filter(p->p.getChemistry()>75 || p.getEnglish()>75 ||
		// p.getMaths()>75 || p.getPhysics()>75 ||
		// p.getHindi()>75).forEach(System.out::println);

		// no of students who are promoted to another class.

		long count2 = al.stream().filter(p -> p.getChemistry() >= 35 && p.getEnglish() >= 35 && p.getMaths() >= 35
				&& p.getPhysics() >= 35 && p.getHindi() >= 35).count();

		System.out.println("no of students who are promoted to another class");
		System.out.println(count2);

		System.out.println("---------------------------------------------------------");

		// students who are failed in at least one subject.
		System.out.println("students who are failed in at least one subject");
		// al.stream().filter(p->p.getChemistry()>35 && p.getEnglish()>35 &&
		// p.getMaths()>35 && p.getPhysics( )>35 &&
		// p.getHindi()>35).forEach(System.out::println);

		al.stream().filter(p -> p.getChemistry() < 35 || p.getEnglish() < 35 || p.getMaths() < 35 || p.getPhysics() < 35|| p.getHindi() < 35).forEach(System.out::println);
		//al.stream().filter(p -> p.getChemistry() < 35 || p.getEnglish() < 35 || p.getMaths() < 35 || p.getPhysics() < 35|| p.getHindi() < 35).forEach(System.out::println);
	
}}
