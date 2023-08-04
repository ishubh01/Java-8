package Assignment2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Function;

public class Student {
	
	int rollno;
	//LocalDateTime date_of_addmission,dob;
	LocalDate date_of_addmission,dob;
	int maths;
	int physics;
	int chemistry;
	int english ;
	int hindi;
	String classname ;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, LocalDate date_of_addmission, LocalDate dob, int maths, int physics,
			int chemistry, int english, int hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.english = english;
		this.hindi = hindi;
		this.classname = classname;
	}
//	public Student(int rollno, LocalDateTime date_of_addmission, LocalDate dob, int maths, int physics,
//			int chemistry, int english, int hindi, String classname) {
//	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public LocalDate getDate_of_addmission() {
		return date_of_addmission;
	}
	public void setDate_of_addmission(LocalDate date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", english=" + english + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}
	
	
	
}