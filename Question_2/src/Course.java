import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFees;



    void displayCourseDetails(){
        System.out.println("Course Id: "+courseId);
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Fees: "+courseFees);
    }

    static void authenticate(String username, String password){
        if(username.equals("Admin") && password.equals("1234")){

            Scanner sc = new Scanner(System.in);
            Course course = new Course();

            System.out.print("Enter Course Id: ");
            course.courseId=sc.nextInt();

            System.out.print("Enter Course Name: ");
            course.courseName=sc.next();

            System.out.print("Enter Course Fees: ");
            course.courseFees=sc.nextInt();

            course.displayCourseDetails();
        }
        else {
            System.out.println("Invalid Username or password");
        }
    }

    public static void main(String[] args){
        authenticate("Admin","1234");
        authenticate("admin","1324");
    }

}
