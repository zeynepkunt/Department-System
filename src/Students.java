import java.util.Scanner;
//declaration of class Students
public class Students{
    //declare and initialize variables
    private int studentIdentificationNumber;
    private int year;
    private int totalCourseNumber=40;
    private double courseGrade;
    private double GPA=2;
    private boolean isCertificate = false;
    private String studentName;
    private String gender; // extra attribute use headofthedepartment class
    private final int studentID; // extra attribute use headofthedepartment class
    private double studentBalance; // extra attribute for Canteen Class
    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);
    //Creating a HeadOfTheDepartment object to use in Action method
    HeadOfTheDepartment headOfTheDepartment = new HeadOfTheDepartment();

    //creating a constructor with parameters for this class
    public Students(int studentIdentificationNumber, int year, String studentName, String gender, int studentID , double studentBalance) {

        this.studentIdentificationNumber = studentIdentificationNumber;
        this.year = year;
        this.studentName = studentName;
        this.gender = gender;
        this.studentID = studentID;
        this.studentBalance = studentBalance;
    }
    //overloading constructor Students
    public Students(int studentID) {
        this.studentID = studentID;
    }
    //Creating a toString method to show details of this class
    public String studentDetails() { // extra method
        return "Students: \nStudent Identification Number = " + studentIdentificationNumber + " \nYear = " + year
                + " \nTotal Course Number = " + totalCourseNumber + " \nCourse Grade = " + courseGrade + " \nGPA = " + GPA
                + " \nis Certificate = " + isCertificate + " \nStudent Name = " + studentName + " \nGender = " + gender + " \nStudent ID = " + studentID;
    }
    //creating an Action method using switch statement to easily access other methods. Works like a menu.
    public void Action() { // extra method use it sub class
        System.out.println("1-) See Maximum Student Number in School");
        System.out.println("2-) See Students' Course");
        System.out.println("3-) Student Details");
        System.out.println("4-) Exit the program.");
        System.out.print("Select the action you want to do: ");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                System.out.println("Maximum Doctora Student: " + headOfTheDepartment.getMaxDoctoraStudent());
                System.out.println("Maximum Undergraduate Student: " + headOfTheDepartment.getMaxUndergraduateStudent());
                System.out.println("Maximum Graduate Student: " + headOfTheDepartment.getMaxMasterStudent());
                Action();
                break;
            case 2:
                System.out.print("Student ID: ");
                int tempStudentID = scan.nextInt();
                headOfTheDepartment.seeCourseForStudent(tempStudentID);
                Action();
                break;
            case 3:
                System.out.println(studentDetails());
                Action();
                break;
            case 4:
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
                Action();
                break;
        }
    }
    //getter-setters methods for encapsulation and access and update the value of a private variable
    public double getCourseGrade() {
        return courseGrade;
    }
    public void setCourseGrade(double courseGrade) {
        this.courseGrade = courseGrade;
    }
    public int getStudentIdentificationNumber() {
        return studentIdentificationNumber;
    }
    public int getYear() {
        return year;
    }
    public int getTotalCourseNumber() {
        return totalCourseNumber;
    }
    public double getGPA() {
        return GPA;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getGender() {
        return gender;
    }
    public int getStudentID() {
        return studentID;
    }
    public boolean isCertificate() {
        return isCertificate;
    }
    public void setCertificate(boolean isCertificate) {
        this.isCertificate = isCertificate;
    }

    public double getStudentBalance() {
        return studentBalance;
    }

    public void setStudentBalance(double studentBalance) {
        this.studentBalance = studentBalance;
    }
}