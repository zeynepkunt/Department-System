//declaration of class HeadOfTheDepartment
public class HeadOfTheDepartment extends Lecturers {
    //declare and initialize variables
    private int maxUndergraduateStudent = 100; // extra attributes use it student class
    private int maxMasterStudent = 50; // extra attributes use it student class
    private int maxDoctoraStudent = 50; // extra attributes use it student class
    //creating an empty constructor to use in testing and some objects
    public HeadOfTheDepartment() {

    }
    //creating a constructor with parameters for this class
    public HeadOfTheDepartment(int lecturerIdentificationNumber, String lecturerName, String titleName, double salary) {
        super(lecturerIdentificationNumber, lecturerName, titleName, salary);
    }
    //creating an Action method using switch statement to easily access other methods. Works like a menu.
    public void Action() { // extra method
        System.out.println("1-) Assign Graduate Certificate");
        System.out.println("2-) Lecturers' Works");
        System.out.println("3-) Exit the program.");
        System.out.print("Select the action you want to do: ");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                assignGraduateCertificate();
                Action();
                break;
            case 2:
                super.Action();
                break;
            case 3:
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
                Action();
                break;
        }
    }
    /*Creating a assignGraduateCertificate to assign Graduate Certificate for Undergraduate , Master and Doctora studens.
    While we're doing that we are checking the student's Suitability for Graduate using checkSuitabilityForMaster ,
    checkSuitabilityForDoctora and checkSuitabilityForGraduate methods and with a for loop we assign every suitable student's
    setCertificate value to "true".
    */
    public void assignGraduateCertificate() {
        for (int i = 0; i < secretary.getTotalUndergraduateStudentValue(); i++) {
            if (checkSuitabilityForMaster(secretary.totalUndergraduateStudent[i].getTotalCourseNumber(), secretary.totalUndergraduateStudent[i].getGPA()) == true) {
                secretary.totalUndergraduateStudent[i].setCertificate(true);
            }
        }
        for (int i = 0; i < secretary.getUndergraduateStudentListValue(); i++) {
            if (secretary.totalGraduateStudent[i].getLicenceDegree() == "Master") {
                if (checkSuitabilityForDoctora(secretary.totalGraduateStudent[i].getTotalCourseNumber(), secretary.totalGraduateStudent[i].getGPA()) == true) {
                    secretary.totalGraduateStudent[i].setCertificate(true);
                }
            }
            else if (secretary.totalGraduateStudent[i].getLicenceDegree() == "Doctora") {
                if (checkSuitabilityForGraduate(secretary.totalGraduateStudent[i].getTotalCourseNumber(), secretary.totalGraduateStudent[i].getGPA()) == true) {
                    secretary.totalGraduateStudent[i].setCertificate(true);
                }
            }
        }
    }
    //Creating three checkSuitability method for checking the student is suitable or not for Graduate , Master or Doctora.
    public boolean checkSuitabilityForGraduate(int totalCourseNumber, double GPA) {
        if (totalCourseNumber >= 8 && GPA >= 3.0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkSuitabilityForMaster(int totalCourseNumber, double GPA) {
        if (totalCourseNumber >= 40 && GPA >= 2.0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkSuitabilityForDoctora(int totalCourseNumber, double GPA) {
        if (totalCourseNumber >= 7 && GPA >= 2.5) {
            return true;
        }
        else {
            return false;
        }
    }
    //getter-setters methods for encapsulation and access and update the value of a private variable
    public int getMaxUndergraduateStudent() {
        return maxUndergraduateStudent;
    }
    public void setMaxUndergraduateStudent(int maxUndergraduateStudent) {
        this.maxUndergraduateStudent = maxUndergraduateStudent;
    }
    public int getMaxMasterStudent() {
        return maxMasterStudent;
    }
    public void setMaxMasterStudent(int maxMasterStudent) {
        this.maxMasterStudent = maxMasterStudent;
    }
    public int getMaxDoctoraStudent() {
        return maxDoctoraStudent;
    }
    public void setMaxDoctoraStudent(int maxDoctoraStudent) {
        this.maxDoctoraStudent = maxDoctoraStudent;
    }
}