import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//declaration of class Secretary

class Secretary implements Staff {
    //declare and initialize variables
    private int staffId;
    private int workHour;
    private String staff_name;
    private String task;
    private String gender;
    private double salary;
    private String secretaryEmail;
    private String secretaryCellNum;
    Scanner scan = new Scanner(System.in);
    private int totalUndergraduateStudentValue = -1;
    private int totalGraduateStudentValue = -1;
    private int totalGraduateCourseValue = -1;
    private int totalUndergraduateCourseValue = -1;
    private int totalLecturersValue = -1;
    private int undergraduateStudentListValue = -1;
    private int graduateStudentListValue = -1;
    Undergraduate [][]undergraduateStudentList = new Undergraduate[5][2];
    Graduate [][]graduateStudentList = new Graduate[5][2];
    Undergraduate []totalUndergraduateStudent = new Undergraduate[2];
    Graduate []totalGraduateStudent = new Graduate[2];
    Courses []totalGraduateCourse = new Courses[5];
    Courses []totalUndergraduateCourse = new Courses[5];
    Lecturers []totalLecturers = new Lecturers[5];
    HeadOfTheDepartment []headOfTheDepartment = new HeadOfTheDepartment[1];
    Integer[] workingDays = new Integer[]{1,2,3,4,5};
    //creating an empty constructor to use in testing and some objects
    public Secretary() {

    }
    //creating a constructor with parameters for this class
    public Secretary(int staffId, int workHour, String staff_name, String task, String gender, double salary, String secretaryEmail, String secretaryCellNum) {
        this.staffId = staffId;
        this.workHour = workHour;
        this.staff_name = staff_name;
        this.task = task;
        this.gender = gender;
        this.salary = salary;
        this.secretaryEmail = secretaryEmail;
        this.secretaryCellNum = secretaryCellNum;

    }
    //getter-setters methods for encapsulation and access and update the value of a private variable

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSecretaryEmail() {
        return secretaryEmail;
    }

    public void setSecretaryEmail(String secretaryEmail) {
        this.secretaryEmail = secretaryEmail;
    }

    public String getSecretaryCellNum() {
        return secretaryCellNum;
    }

    public void setSecretaryCellNum(String secretaryCellNum) {
        this.secretaryCellNum = secretaryCellNum;
    }

    public int getTotalUndergraduateStudentValue() {
        return totalUndergraduateStudentValue;
    }
    public void setTotalUndergraduateStudentValue(int totalUndergraduateStudentValue) {
        this.totalUndergraduateStudentValue = totalUndergraduateStudentValue;
    }
    public int getTotalGraduateStudentValue() {
        return totalGraduateStudentValue;
    }
    public void setTotalGraduateStudentValue(int totalGraduateStudentValue) {
        this.totalGraduateStudentValue = totalGraduateStudentValue;
    }
    public int getTotalGraduateCourseValue() {
        return totalGraduateCourseValue;
    }
    public void setTotalGraduateCourseValue(int totalGraduateCourseValue) {
        this.totalGraduateCourseValue = totalGraduateCourseValue;
    }
    public int getTotalUndergraduateCourseValue() {
        return totalUndergraduateCourseValue;
    }
    public void setTotalUndergraduateCourseValue(int totalUndergraduateCourseValue) {
        this.totalUndergraduateCourseValue = totalUndergraduateCourseValue;
    }
    public int getTotalLecturersValue() {
        return totalLecturersValue;
    }
    public void setTotalLecturersValue(int totalLecturersValue) {
        this.totalLecturersValue = totalLecturersValue;
    }
    public int getUndergraduateStudentListValue() {
        return undergraduateStudentListValue;
    }
    public void setUndergraduateStudentListValue(int undergraduateStudentListValue) {
        this.undergraduateStudentListValue = undergraduateStudentListValue;
    }
    public int getGraduateStudentListValue() {
        return graduateStudentListValue;
    }
    public void setGraduateStudentListValue(int graduateStudentListValue) {
        this.graduateStudentListValue = graduateStudentListValue;
    }
    //creating an Action method using switch statement to easily access other methods. Works like a menu.
    public void Action () { // extra method use it sub class
        headOfTheDepartment[0] = new HeadOfTheDepartment(1000, "Ahmet", "Professor" , 30000);
        System.out.println("1-) Create Lecturer");
        System.out.println("2-) Create Student");
        System.out.println("3-) Create Course");
        System.out.println("4-) Edit Head of the Department");
        System.out.println("5-) Add Student for Course");
        System.out.println("6-) Add Course for Lecturers");
        System.out.println("7-) Remove Course for Lecturers");
        System.out.println("8-) Replace Lecturers");
        System.out.println("9-) Check the Secretary working today or not");
        System.out.println("10-) Show the Details of the Secretary");
        System.out.println("11-) Exit the program.");
        System.out.print("Select the action you want to do: ");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                createLecturer();
                Action();
                break;
            case 2:
                createStudent();
                Action();
                break;
            case 3:
                createCourse();
                Action();
                break;
            case 4:
                createHeadOfTheDepartment();
                Action();
                break;
            case 5:
                addStudentForCourse();
                Action();
                break;
            case 6:
                addCourse();
                Action();
                break;
            case 7:
                removeCourse();
                Action();
                break;
            case 8:
                replaceLecturer();
                Action();
                break;
            case 9:
                if (isAvailable(workingDays))
                    System.out.println("Yes this secretary is working today.");
                else
                    System.out.println("No this secretary is not working today");
                Action();
                break;
            case 10:
                System.out.println(staffDetails());
                Action();
                break;
            case 12:
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
                Action();
                break;
        }
    }
    //Overriding and using a overtimePay method to calculate and print staff member's new salary and overtime pay price
    @Override
    public void overtimePay(double salary , String name , int workHour) {
        if(workHour!=0){


            double rateOfPay = salary/workHour;
            double overtime = 0;

            if (workHour > 40)
                overtime = (workHour - 40) * 1.5;


            double newSalary = ((overtime == 0) ? (workHour * rateOfPay) : ((overtime + 8) * rateOfPay * 4));
            System.out.printf("%s's salary updated from %f to %f (Overtime Pay Price:%f)",name,salary,newSalary,(newSalary-salary));
            setSalary(newSalary);
        }else System.out.println("This staff has 0 work hour.");
    }
    //Creating a createLecturer method to create Lecturer and add it to totalLecturers array
    public void createLecturer() {
        System.out.print("Lecturer Identification Number: ");
        int lecturerIdentificationNumber = scan.nextInt();
        System.out.print("Lecturer Name: ");
        String lecturerName = scan.next();
        System.out.print("Lecturer Title Name: ");
        String titleName = scan.next();
        System.out.print("Lecturer Salary: ");
        double salary = scan.nextDouble();
        for (int i = 0; i <= totalLecturersValue; i++) {
            if (totalLecturers[i].getLecturerIdentificationNumber() == lecturerIdentificationNumber) {
                System.out.println("This teacher is already added.");
                Action();
                break;
            }
        }
        try {
            totalLecturers[++totalLecturersValue] = new Lecturers(lecturerIdentificationNumber, lecturerName, titleName , salary);
            System.out.println("Lecturer added.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This array access to max number");
        }
    }
    //Creating a createStudent method to create Student and add it to totalGraduateStudent or totalUndergraduateStudent depends on what user choose
    public void createStudent() { // extra method use student class
        System.out.println("1-) Graduate Students: ");
        System.out.println("2-) Undergraduate Students: ");
        System.out.print("Please make your selection: ");
        int process = scan.nextInt();
        while (process != 1 && process != 2) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Please make your selection: ");
            process = scan.nextInt();
        }
        System.out.print("Student Identification Number: ");
        int studentIdentificationNumber = scan.nextInt();
        System.out.print("Student Year: ");
        int year = scan.nextInt();
        System.out.print("Student Name: ");
        String studentName = scan.next();
        System.out.print("Student Gender (Write 'Male' or 'Female') : ");
        String gender = scan.next();
        while (gender.charAt(0) != 'M' && gender.charAt(0) !='F') {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Student Gender (Write 'Male' or 'Female') : ");
            gender = scan.next();
        }
        System.out.print("Student ID: ");
        int studentID = scan.nextInt();
        System.out.print("Student Balance for Canteen: ");
        double studentBalance = scan.nextDouble();
        if (process == 1) {
            System.out.print("Student Licence Degree (Write 'Master' or 'Doctora') : ");
            String licenceDegree = scan.next();
            while (licenceDegree.charAt(0) != 'M' && licenceDegree.charAt(0) != 'D') {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Student Licence Degree (Write 'Master' or 'Doctora') : ");
                licenceDegree = scan.next();
            }
            System.out.print("Student Thesis Name: ");
            String thesisName = scan.next();
            System.out.print("Student Graduation Year: ");
            int graduationYear = scan.nextInt();
            for (int i = 0; i <= totalGraduateStudentValue; i++) {
                if (totalGraduateStudent[i].getStudentID() == studentID) {
                    System.out.println("This student is already added.");
                    Action();
                    break;
                }
            }
            try {
                totalGraduateStudent[++totalGraduateStudentValue] = new Graduate(studentIdentificationNumber, year, studentName, gender, studentID, studentBalance, licenceDegree, thesisName, graduationYear);
                System.out.println("Student added.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max number");
            }
        }
        else if (process == 2) {
            System.out.print("Student Begin Year: ");
            int beginYear = scan.nextInt();
            for (int i = 0; i <= totalUndergraduateStudentValue; i++) {
                if (totalUndergraduateStudent[i].getStudentID() == studentID) {
                    System.out.println("This student is already added.");
                    Action();
                    break;
                }
            }
            try {
                totalUndergraduateStudent[++totalUndergraduateStudentValue] = new Undergraduate(studentIdentificationNumber, year, studentName, gender, studentID, studentBalance, beginYear);
                System.out.println("Student added.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max number");
            }
        }
    }
    //Creating a createCourse method to create Course and add it to totalGraduateCourse or totalUndergraduateCourse depends on what user choose
    public void createCourse() { // extra method use course class
        System.out.println("1-) Graduate Course: ");
        System.out.println("2-) Undergraduate Course: ");
        System.out.print("Please make your selection: ");
        int process = scan.nextInt();
        while (process != 1 && process != 2) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Please make your selection: ");
            process = scan.nextInt();
        }
        System.out.print("Course Code: ");
        String courseCode = scan.next();
        System.out.print("Course Name: ");
        String courseName = scan.next();
        System.out.print("Course Credit: ");
        int courseCredit = scan.nextInt();
        System.out.print("Course Location: ");
        String courseLocation = scan.next();
        String courseLecturer = "";
        if (process == 1) {
            String courseCategory = "Graduate";
            for (int i = 0; i <= totalGraduateCourseValue; i++) {
                if (totalGraduateCourse[i].getCourseCode() == courseCode) {
                    System.out.println("This Course is already added.");
                    Action();
                    break;
                }
            }
            try {
                totalGraduateCourse[++totalGraduateCourseValue] = new Courses(courseCode, courseName, courseCredit, courseLocation, courseLecturer, courseCategory);
                System.out.println("Course added.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max number");
            }
        }
        if (process == 2) {
            String courseCategory = "Undergraduate";
            for (int i = 0; i <= totalUndergraduateCourseValue; i++) {
                if (totalUndergraduateCourse[i].getCourseCode() == courseCode) {
                    System.out.println("This Course is already added.");
                    Action();
                    break;
                }
            }
            try {
                totalUndergraduateCourse[++totalUndergraduateCourseValue] = new Courses(courseCode, courseName, courseCredit, courseLocation, courseLecturer, courseCategory);
                System.out.println("Course added.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max number");
            }
        }
    }
    //Creating a createHeadOfTheDepartment method to set a lecturer as a HeadOfTheDepartment
    public void createHeadOfTheDepartment() {
        System.out.print("Lecturer Identification Number: ");
        int lecturerIdentificationNumber = scan.nextInt();
        System.out.print("Lecturer Name: ");
        String lecturerName = scan.next();
        System.out.print("Lecturer Title Name: ");
        String titleName = scan.next();
        System.out.print("Lecturer Salary: ");
        double salary = scan.nextDouble();
        headOfTheDepartment[0] = new HeadOfTheDepartment(lecturerIdentificationNumber, lecturerName, titleName , salary);
        System.out.println("Head of the Department editted.");
    }
    //Creating a addStudentForCourse to add an Undergraduate or Graduate student to a specific Course
    public void addStudentForCourse() {
        int tempStudentID, tempCourse;
        System.out.println("1-) Undergraduate Students");
        System.out.println("2-) Graduate Students");
        System.out.print("Please make your selection: ");
        int process = scan.nextInt();
        while (process != 1 && process != 2) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Please make your selection: ");
            process = scan.nextInt();
        }
        if (process == 1) {
            if(totalUndergraduateCourseValue==-1){
                System.out.println("There is no course");
                System.out.println("\n");
                Action();
            }
            System.out.println("Undergraduate Course List: ");
            for (int i = 0; i <= totalUndergraduateCourseValue; i++) {
                System.out.println((i + 1) + "-) Name: " + totalUndergraduateCourse[i].getCourseName());
            }
            System.out.print("Choose Course: ");
            tempCourse = scan.nextInt() - 1;
            while (tempCourse > totalUndergraduateCourseValue || tempCourse < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Course: ");
                tempCourse = scan.nextInt() - 1;
            }
            if(totalUndergraduateStudentValue==-1){
                System.out.println("There is no student");
                System.out.println("\n");
                Action();
            }
            System.out.println("Undergraduate Student List: ");
            for (int i = 0; i <= totalUndergraduateStudentValue; i++) {
                System.out.println((i + 1) + "-) Name: " + totalUndergraduateStudent[i].getStudentName() + " Number: " + totalUndergraduateStudent[i].getStudentID());
            }
            System.out.print("Choose Student: ");
            tempStudentID = scan.nextInt() - 1;
            while (tempStudentID > totalUndergraduateStudentValue || tempStudentID < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Student: ");
                tempStudentID = scan.nextInt() - 1;
            }
            try {
                undergraduateStudentList[tempCourse][++undergraduateStudentListValue] = totalUndergraduateStudent[tempStudentID];
                System.out.println("Selected student added for course.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max number");
            }
        }
        else if(process == 2) {
            if(totalGraduateCourseValue==-1){
                System.out.println("There is no course");
                System.out.println("\n");
                Action();
            }
            System.out.println("Graduate Course List: ");
            for (int i = 0; i <= totalGraduateCourseValue; i++) {
                System.out.println((i + 1) + "-) Name: " + totalGraduateCourse[i].getCourseName());
            }
            System.out.print("Choose Course: ");
            tempCourse = scan.nextInt() - 1;
            while (tempCourse > totalGraduateCourseValue || tempCourse < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Course: ");
                tempCourse = scan.nextInt() - 1;
            }
            if(totalGraduateStudentValue==-1){
                System.out.println("There is no student");
                System.out.println("\n");
                Action();
            }
            System.out.println("Graduate Student List: ");
            for (int i = 0; i <= totalGraduateStudentValue; i++) {
                System.out.println((i + 1) + "-) Name: " + totalGraduateStudent[i].getStudentName() + " Number: " + totalGraduateStudent[i].getStudentID());
            }
            System.out.print("Choose Student: ");
            tempStudentID = scan.nextInt() - 1;
            while (tempStudentID > totalGraduateStudentValue || tempStudentID < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Student: ");
                tempStudentID = scan.nextInt() - 1;
            }
            try {
                graduateStudentList[tempCourse][++graduateStudentListValue] = totalGraduateStudent[tempStudentID];
                System.out.println("Selected student added for course.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max number");
            }
        }

    }

    //Creating an addCourse method to add a specific Undergraduate or Graduate course to a lecturer
    public void addCourse() {
        int tempLecturerID, tempCourse;
        if(totalLecturersValue==-1){
            System.out.println("There is no lecturers.");
            System.out.println("\n");
            Action();
        }
        System.out.println("Total Lecturer List: ");
        for (int i = 0; i <= totalLecturersValue; i++) {
            System.out.println((i + 1) + "-) Name: " + totalLecturers[i].getLecturerName());
        }
        System.out.print("Choose Lecturer: ");
        tempLecturerID = scan.nextInt() - 1;
        while (tempLecturerID > totalLecturersValue || tempLecturerID < 0) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Choose Lecturer: ");
            tempLecturerID = scan.nextInt() - 1;
        }
        System.out.println("1-) Undergraduate Course");
        System.out.println("2-) Graduate Course");
        System.out.print("Please make your selection: ");
        int process = scan.nextInt();
        while (process != 1 && process != 2) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Please make your selection: ");
            process = scan.nextInt();
        }
        if (process == 1) {
            if(totalUndergraduateCourseValue==-1){
                System.out.println("There is no course");
                System.out.println("\n");
                Action();
            }
            System.out.println("Total Undergraduate Course List: ");
            for (int i = 0; i <= totalUndergraduateCourseValue; i++) {
                System.out.println((i + 1) + "-) Course Name: " + totalUndergraduateCourse[i]);
            }
            System.out.print("Choose Course: ");
            tempCourse = scan.nextInt() - 1;
            while (tempCourse > totalUndergraduateCourseValue || tempCourse < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Course: ");
                tempCourse = scan.nextInt() - 1;
            }
            try {
                totalUndergraduateCourse[tempCourse].setCourseLecturer(totalLecturers[tempLecturerID].getLecturerName());
                totalLecturers[tempLecturerID].setCourseListValue(totalLecturers[tempLecturerID].getCourseListValue() + 1);
                totalLecturers[tempLecturerID].courseList[totalLecturers[tempLecturerID].getCourseListValue()] = totalUndergraduateCourse[tempCourse];
                System.out.println("Selected course added.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max course number");
            }
        }
        else if (process == 2) {
            if(totalGraduateCourseValue==-1){
                System.out.println("There is no course");
                System.out.println("\n");
                Action();
            }
            System.out.println("Total Graduate Course List: ");
            for (int i = 0; i <= totalGraduateCourseValue; i++) {
                System.out.println((i + 1) + "-) Course Name: " + totalGraduateCourse[i]);
            }
            System.out.print("Choose Course: ");
            tempCourse = scan.nextInt() - 1;
            while (tempCourse > totalGraduateCourseValue || tempCourse < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Course: ");
                tempCourse = scan.nextInt() - 1;
            }
            try {
                totalGraduateCourse[tempCourse].setCourseLecturer(totalLecturers[tempLecturerID].getLecturerName());
                totalLecturers[tempLecturerID].setCourseListValue(totalLecturers[tempLecturerID].getCourseListValue() + 1);
                totalLecturers[tempLecturerID].courseList[totalLecturers[tempLecturerID].getCourseListValue()] = totalGraduateCourse[tempCourse];
                System.out.println("Selected course added.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max course number");
            }
        }
    }
    //Creating an removeCourse method to remove a specific Undergraduate or Graduate course from a lecturer
    public void removeCourse() {
        int tempLecturerID, tempCourse;
        if(totalLecturersValue==-1){
            System.out.println("There is no lecturers");
            System.out.println("\n");
            Action();
        }
        System.out.println("Total Lecturer List: ");
        for (int i = 0; i <= totalLecturersValue; i++) {
            System.out.println((i + 1) + "-) Name: " + totalLecturers[i].getLecturerName());
        }
        System.out.print("Choose Lecturer: ");
        tempLecturerID = scan.nextInt() - 1;
        while (tempLecturerID > totalLecturersValue || tempLecturerID < 0) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Choose Lecturer: ");
            tempLecturerID = scan.nextInt() - 1;
        }
        if(totalLecturers[tempLecturerID].getCourseListValue()==-1){
            System.out.println("There is no course");
            System.out.println("\n");
            Action();
        }
        System.out.println("Total Course List: ");
        for (int i = 0; i <= totalLecturers[tempLecturerID].getCourseListValue(); i++) {
            System.out.println((i + 1) + "-) Course Name: " + totalLecturers[tempLecturerID].courseList[i]);
        }
        System.out.print("Select the course you want to delete: ");
        tempCourse = scan.nextInt() - 1;
        while (tempCourse > totalLecturers[tempLecturerID].getCourseListValue() || tempCourse < 0) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Select the course you want to delete: ");
            tempCourse = scan.nextInt() - 1;
        }
        totalLecturers[tempLecturerID].courseList[tempCourse].setCourseLecturer("");
        totalLecturers[tempLecturerID].courseList[tempCourse] = totalLecturers[tempLecturerID].courseList[totalLecturers[tempLecturerID].getCourseListValue()];
        totalLecturers[tempLecturerID].setCourseListValue(totalLecturers[tempLecturerID].getCourseListValue() - 1);
        System.out.println("Selected course removed.");
    }
    //Creating a replaceLecturer method to replace lecturer for a course
    public void replaceLecturer() {
        int tempLecturerID, tempCourse;
        if(totalLecturersValue==-1){
            System.out.println("There is no lecturers.");
            System.out.println("\n");
            Action();
        }
        System.out.println("Total Lecturer List: ");
        for (int i = 0; i <= totalLecturersValue; i++) {
            System.out.println((i + 1) + "-) Name: " + totalLecturers[i].getLecturerName());
        }
        System.out.print("Choose Lecturer for Delete Course: ");
        tempLecturerID = scan.nextInt() - 1;
        while (tempLecturerID > totalLecturersValue || tempLecturerID < 0) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Choose Lecturer for Delete Course: ");
            tempLecturerID = scan.nextInt() - 1;
        }
        if(totalLecturers[tempLecturerID].getCourseListValue()==-1){
            System.out.println("There is no course.");
            System.out.println("\n");
            Action();
        }
        System.out.println("Total Course List: ");
        for (int i = 0; i <= totalLecturers[tempLecturerID].getCourseListValue(); i++) {
            System.out.println((i + 1) + "-) Course Name: " + totalLecturers[tempLecturerID].courseList[i]);
        }
        System.out.print("Select the course you want to Replace: ");
        tempCourse = scan.nextInt() - 1;
        while (tempCourse > totalLecturers[tempLecturerID].getCourseListValue() || tempCourse < 0) {
            System.out.println("Wrong choice. Please try again.");
            System.out.print("Select the course you want to Replace: ");
            tempCourse = scan.nextInt() - 1;
        }
        totalLecturers[tempLecturerID].courseList[tempCourse] = totalLecturers[tempLecturerID].courseList[totalLecturers[tempLecturerID].getCourseListValue()];
        totalLecturers[tempLecturerID].setCourseListValue(totalLecturers[tempLecturerID].getCourseListValue() - 1);
        if (totalLecturers[tempLecturerID].courseList[tempCourse].getCourseCategory().charAt(0) == 'G') {
            for (int i = 0; i <= totalGraduateCourseValue; i++) {
                if (totalLecturers[tempLecturerID].courseList[tempCourse].getCourseCode() == totalGraduateCourse[i].getCourseCode()) {
                    tempCourse = i;
                    break;
                }
            }
            if(totalLecturersValue==-1){
                System.out.println("There is no lecturers.");
                System.out.println("\n");
                Action();
            }
            System.out.println("Total Lecturer List: ");
            for (int i = 0; i <= totalLecturersValue; i++) {
                System.out.println((i + 1) + "-) Name: " + totalLecturers[i].getLecturerName());
            }
            System.out.print("Choose Lecturer for Add Course: ");
            tempLecturerID = scan.nextInt() - 1;
            while (tempLecturerID > totalLecturersValue || tempLecturerID < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Lecturer for Add Course: ");
                tempLecturerID = scan.nextInt() - 1;
            }
            try {
                totalGraduateCourse[tempCourse].setCourseLecturer(totalLecturers[tempLecturerID].getLecturerName());
                totalLecturers[tempLecturerID].setCourseListValue(totalLecturers[tempLecturerID].getCourseListValue() + 1);
                totalLecturers[tempLecturerID].courseList[totalLecturers[tempLecturerID].getCourseListValue()] = totalGraduateCourse[tempCourse];
                System.out.println("Selected course removed.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max number");
            }
        }
        else if (totalLecturers[tempLecturerID].courseList[tempCourse].getCourseCategory().charAt(0) == 'U') {
            for (int i = 0; i <= totalUndergraduateCourseValue; i++) {
                if (totalLecturers[tempLecturerID].courseList[tempCourse].getCourseCode() == totalUndergraduateCourse[i].getCourseCode()) {
                    tempCourse = i;
                    break;
                }
            }
            if(totalLecturersValue==-1){
                System.out.println("There is no lecturers.");
                System.out.println("\n");
                Action();
            }
            System.out.println("Total Lecturer List: ");
            for (int i = 0; i <= totalLecturersValue; i++) {
                System.out.println((i + 1) + "-) Name: " + totalLecturers[i].getLecturerName());
            }
            System.out.print("Choose Lecturer for Add Course: ");
            tempLecturerID = scan.nextInt() - 1;
            while (tempLecturerID > totalLecturersValue || tempLecturerID < 0) {
                System.out.println("Wrong choice. Please try again.");
                System.out.print("Choose Lecturer for Add Course: ");
                tempLecturerID = scan.nextInt() - 1;
            }
            try {
                totalUndergraduateCourse[tempCourse].setCourseLecturer(totalLecturers[tempLecturerID].getLecturerName());
                totalLecturers[tempLecturerID].setCourseListValue(totalLecturers[tempLecturerID].getCourseListValue() + 1);
                totalLecturers[tempLecturerID].courseList[totalLecturers[tempLecturerID].getCourseListValue()] = totalUndergraduateCourse[tempCourse];
                System.out.println("Selected course removed.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This array access to max number");
            }
        }
    }
    /*Overriding and using isAvailable method to check the Cleaning Staff working today or not
    while doing that we are creating a Date object to use getDay() method for get day of the week in int format
    and converting our Array to a List to use ".contains" method to check is the date we get from getDay() method in
    the workingDays Array or not.
    */
    @Override
    public boolean isAvailable(Integer[] workingDays) {
        Date d = new Date();
        return Arrays.asList(workingDays).contains(d.getDay());
    }
    //Creating a toString method to show details of this class
    @Override
    public String staffDetails() {
        return "Secretary: \nStaff Id = " + staffId + " \nWork Hour = " + workHour + " \nStaff Name = " + staff_name + " \nTask = "
                + task + " \n Gender = " + gender + " \nSalary = " + salary +  " \nSecretary Email = "
                + secretaryEmail + " \nSecretary Cell Num = " + secretaryCellNum;
    }
}