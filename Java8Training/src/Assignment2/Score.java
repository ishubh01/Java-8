package Assignment2;

public class Score {
	
	
	int maths;
	int physics;
	int chemistry;
	int english ;
	int hindi; // 
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Score(int maths, int physics, int chemistry, int english, int hindi) {
		super();
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.english = english;
		this.hindi = hindi;
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

	@Override
	public String toString() {
		return "Score [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", english=" + english
				+ ", hindi=" + hindi + "]";
	}

	
}
