public class Student {
    private int rollNumber;
    private String studentName;
    private int marks;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    Student(){

    }
    Student(int roll, String name, int marks){
        this.setStudentName(name);
        this.setRollNumber(roll);
        this.setMarks(marks);
    }

}
