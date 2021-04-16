package comparable_comparator;

public class StudentComparable implements Comparable<StudentComparable> {
	int rollno;
	String name;
	int age;

	StudentComparable(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentComparable st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)              //  for ascending   
			return 1;
		else
			return -1;
	}

}

//        age > st.age        for decending
