import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
//declaration of class Lecturers
public class Lecturers {
    //declare and initialize variables
    private int lecturerIdentificationNumber;
    private String lecturerName;
    private String titleName; // extra attributes use it sub class
    private int[] lecturerWorkingDays;
    private double salary; // extra attributes use it sub class
    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);
    private int courseListValue = -1;
    Courses []courseList = new Courses[2];
    //Creating a Secretary object to use in Action method
    Secretary secretary=new Secretary();
    public Lecturers(int lecturerIdentificationNumber, String lecturerName, String titleName, double salary) {
        this.lecturerIdentificationNumber = lecturerIdentificationNumber;
        this.lecturerName = lecturerName;
        this.titleName = titleName;
        //this.lecturerWorkingDays=lecturerWorkingDays;
        this.salary = salary;
    }
    //creating an empty constructor to use in testing and some objects
    public Lecturers() {

    }
    //Creating a toString method to show details of this class
    public String lecturerDetails() { // extra method
        return "Lecturers: \nLecturer Identification Number = " + lecturerIdentificationNumber + " \nLecturer Name = "
                + lecturerName + " \nTitle Name = " + titleName + " \nSalary = " + salary + " \nCourseList = "
                + Arrays.toString(courseList);
    }
    //creating an Action method using switch statement to easily access other methods. Works like a menu.
    public void Action() { // extra method use sub class
        System.out.println("1-) Set Course Grade");
        System.out.println("2-) Set Discontinuity Days");
        System.out.println("3-) Search Student");
        System.out.println("4-) Lecturer Details");
        System.out.println("5-) Exit the program.");
        System.out.print("Select the action you want to do: ");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                secretary.undergraduateStudentList[0][0]=new Undergraduate(1, 2, "Ahmet", "Male", 1, 1000, 2020);
                courseList[0]=new Courses("bm101", "Bilgisayar Programlama", 5, "401", "Ahmet", "Graduate");
                secretary.setUndergraduateStudentListValue(0);
                courseListValue=0;
                setCourseGrade();
                Action();
                break;
            case 2:
                setDiscontinuityDays();
                Action();
                break;
            case 3:
                System.out.print("Student ID: ");
                int tempStudentID = scan.nextInt();
                secretary.undergraduateStudentList[0][0].searchStudent(tempStudentID);
                Action();
                break;
            case 4:
                System.out.println(lecturerDetails());
                Action();
                break;
            case 5:
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
                Action();
                break;
        }
    }
    //Creating a setCourseGrade method to set student's grades for a course
    public void setCourseGrade() {
        int tempCourse, tempStudentID;
        System.out.println("1-) Undergraduate Students");
        System.out.println("2-) Graduate Students");
        System.out.print("Please make your selection: ");
        int process = scan.nextInt();
        System.out.println("Course List: ");
        for (int i = 0; i <= courseListValue; i++) {
            System.out.println((i + 1) + "-) Name: " + courseList[i]);
        }
        System.out.print("Choose Course: ");
        tempCourse = scan.nextInt() - 1;
        while (tempCourse > courseListValue || tempCourse < 0) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Choose Course: ");
            tempCourse = scan.nextInt() - 1;
        }
        if (process == 1) {
            System.out.println("Student List: ");
            for (int i = 0; i <= secretary.getUndergraduateStudentListValue(); i++) {
                System.out.println((i + 1) + "-) Student ID: " + secretary.undergraduateStudentList[tempCourse][i].getStudentID());
            }
            System.out.print("Choose Student: ");
            tempStudentID = scan.nextInt() - 1;
            while (tempStudentID > secretary.getUndergraduateStudentListValue() || tempStudentID < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Student: ");
                tempStudentID = scan.nextInt() - 1;
            }
            System.out.print("Enter the grade of the selected student: ");
            double tempGrade = scan.nextDouble();
            secretary.undergraduateStudentList[tempCourse][tempStudentID].setCourseGrade(tempGrade);
            System.out.println("Student grade set");
        }
        else if(process == 2) {
            System.out.println("Student List: ");
            for (int i = 0; i <= secretary.getGraduateStudentListValue(); i++) {
                System.out.println((i + 1) + "-) Student ID: " + secretary.graduateStudentList[tempCourse][i].getStudentID());
            }
            System.out.print("Choose Student: ");
            tempStudentID = scan.nextInt() - 1;
            while (tempStudentID > secretary.getGraduateStudentListValue() || tempStudentID < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Student: ");
                tempStudentID = scan.nextInt() - 1;
            }
            System.out.print("Enter the grade of the selected student: ");
            double tempGrade = scan.nextDouble();
            secretary.graduateStudentList[tempCourse][tempStudentID].setCourseGrade(tempGrade);
            System.out.println("Student grade set.");
        }
        else {
            System.out.println("Wrong choice. Please try again.");
            setCourseGrade();
        }
    }
    //Creating a setDiscontinuityDays method to set Discontinuity Days for a student
    public void setDiscontinuityDays() {
        int tempCourse, tempStudentID;
        System.out.println("Course List: ");
        for (int i = 0; i <= courseListValue; i++) {
            System.out.println((i + 1) + "-) Name: " + courseList[i]);
        }
        System.out.print("Choose Course: ");
        tempCourse = scan.nextInt() - 1;
        while (tempCourse > courseListValue || tempCourse < 0) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Choose Course: ");
            tempCourse = scan.nextInt() - 1;
        }
        System.out.println("Student List: ");
        for (int i = 0; i <= secretary.getUndergraduateStudentListValue(); i++) {
            System.out.println((i + 1) + "-) Student ID: " + secretary.undergraduateStudentList[tempCourse][i].getStudentID());
        }
        System.out.print("Choose Student: ");
        tempStudentID = scan.nextInt() - 1;
        while (tempStudentID > secretary.getUndergraduateStudentListValue() || tempStudentID < 0) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Choose Student: ");
            tempStudentID = scan.nextInt() - 1;
        }
        System.out.print("Enter the discontinuity days of the selected student: ");
        int tempDiscontinuityDays = scan.nextInt();
        secretary.undergraduateStudentList[tempCourse][tempStudentID].setDiscontinuityDays(tempDiscontinuityDays);
        System.out.println("Student discontinuity days set.");
    }
    //Creating a seeCourseForStudent method to list courses that the student by using studentID
    public void seeCourseForStudent(int studentID) { // extra method use student class
        System.out.println("This student is taking the following courses: ");
        for (int i = 0; i <= courseListValue; i++) {
            for (int j = 0; j <= secretary.getUndergraduateStudentListValue(); j++) {
                if (studentID == secretary.undergraduateStudentList[i][j].getStudentID()) {
                    System.out.println(courseList[i]);
                }
            }
        }
        for (int i = 0; i <= courseListValue; i++) {
            for (int j = 0; j <= secretary.getGraduateStudentListValue(); j++) {
                if (studentID == secretary.graduateStudentList[i][j].getStudentID()) {
                    System.out.println(courseList[i]);
                }
            }
        }
    }
    /*Creating an isAvailable method to check the lecturer working today or not while doing that
    we are creating a Date object to use getDay() method for get day of the week in int format
    and converting our Array to a List to use ".contains" method to check is the date we get from getDay() method in
    the lecturerWorkingDays Array or not.
*/
    public boolean isAvailable(){
        Date d = new Date();
        return Arrays.asList(lecturerWorkingDays).contains(d.getDay());
    }
    //getter-setters methods for encapsulation and access and update the value of a private variable
    public int getLecturerIdentificationNumber() {
        return lecturerIdentificationNumber;
    }
    public String getLecturerName() {
        return lecturerName;
    }
    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
    public String getTitleName() {
        return titleName;
    }
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }
    public int[] getWorkingDays() {
        return lecturerWorkingDays;
    }
    public void setWorkingDays(int[] workingDays) {
        this.lecturerWorkingDays = workingDays;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getCourseListValue() {
        return courseListValue;
    }
    public void setCourseListValue(int courseListValue) {
        this.courseListValue = courseListValue;
    }
}