package intro;

public class Student {
    String firstName;
    String lastName;
    int graduationYear;
    double GPA;
    String major;

    public Student(String firstName, String lastName, int graduationYear, double GPA, String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.GPA = GPA;
        this.major = major;
    }

    public int incrementGraduation(){
        return this.graduationYear = this.graduationYear + 1;
    }
    @Override public String toString(){
        return "Student [firstName=" + this.firstName + ", lastName=" + this.lastName + ", major=" + this.major + ", GPA=" + this.GPA + ", graduationYear=" + this.graduationYear + "]";
    }
}
