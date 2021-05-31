package chintu;

public class Student implements Comparable<Student> {
	private String fName;
	private String lName;
	private int age;
	private String id;
	private int marks;
		
	public Student(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	
	public Student(String fName, String lName, int age, String id, int marks) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.id = id;
		this.marks = marks;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + marks;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (marks != other.marks)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", age=" + age + ", id=" + id + ", marks=" + marks
				+ "]";
	}
	
	void studetails() {
		String msg = String.format("fName : %s ; lName : %s ;"
				+ "age : %d ; id :%s ; marks : %d " ,fName,lName,age,id,marks);
		System.out.println(msg);	
	}

	public int compareTo(Student s) {
		int lName = this.lName.compareTo(s.getlName());
//		if (last == 0 ) {
//			return this.fName.compareTo(s.getfName());
//		} else {
			return lName;
		}
	}	

