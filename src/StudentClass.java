
public class StudentClass implements Comparable, Cloneable{

    private int studentAverage;
	private String firstName;
	private String lastName;
	private String sex;

    //copy constructor
    public StudentClass(StudentClass studentToBeCopied){
    	this.firstName = studentToBeCopied.firstName;
    	this.lastName = studentToBeCopied.lastName;
    	this.sex = studentToBeCopied.sex; 
        // this.sex = new StudentClass(studentToBeCopied.sex); // for object
    }

    // constructor
    public StudentClass(String firstName, String lastName, String sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex ;
    }

    public int getStudentAverage() {
		return studentAverage;
	}

    public void setStudentAverage(int studentAverage) {
		this.studentAverage = studentAverage;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

    public String toString(){
		return "Student object contains following data: " + "\n" +
				"First name:" + firstName + "\n" +
				"Name:"  + lastName + "\n" +
				"Sex:" + sex + "\n"+
				"Student Average:" + studentAverage;
    }

    

    @Override
    public int compareTo(Object obj) {
        // create other object
        StudentClass name = (StudentClass) obj;

        // compare this object to other object's last name
        if (this.lastName.equals(name.lastName)) {
            // if last name is the same, return comparison result
            return this.lastName.compareToIgnoreCase(name.lastName);
        }
        else {
            // else, return comparison results of first name
            return this.firstName.compareToIgnoreCase(name.firstName);
        }
    }

    @Override
    public int hashCode() {
        // generate hash code with formula
        final int prime = 31;
        int result = 17;
        result = prime * result + firstName.hashCode();
        result = prime * result + lastName.hashCode();
        result = prime * result + studentAverage;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // check if the object is compared with itself
        if (this == obj) return true;

        // check if the object is an instance of ScoreClass or not
        if (obj instanceof StudentClass) {
            StudentClass score = (StudentClass) obj;

            // check if they are the same score && same first name and last name
            return this.studentAverage == score.studentAverage && firstName.equals(score.firstName) && lastName.equals(score.lastName);
            //return studentAverage == score.studentAverage;
        }
        else{
            return super.equals(obj);
        }
    }
}


