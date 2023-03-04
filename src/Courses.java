
//declaration of class Courses
public class Courses {
    //declare and initialize variables
    private String courseCode;
    private String courseName;
    private int courseCredit;
    private String courseLocation;
    private String courseLecturer;
    private String courseCategory;
    private int courseNumber;

    //getter-setters methods for encapsulation and access and update the value of a private variable
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }

    public String getCourseLecturer() {
        return courseLecturer;
    }

    public void setCourseLecturer(String courseLecturer) {
        this.courseLecturer = courseLecturer;
    }


    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    //creating an empty constructor to use in testing and some objects
    public Courses(){


    }
    //creating a constructor with parameters for this class
    public Courses(String courseCode, String courseName, int courseCredit, String courseLocation, String courseLecturer,
                   String courseCategory) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.courseLocation = courseLocation;
        this.courseLecturer = courseLecturer;
        this.courseCategory = courseCategory;
    }

    public void listCourses(Secretary secretary){

    }


}
