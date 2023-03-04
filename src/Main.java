import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Secretary secretary=new Secretary(1, 40, "Ahmet", "Secretary", "Male", 8500, "ahmet@gmail.com", "05351001010");
        secretary.totalGraduateStudent[0]=new Graduate(1, 2, "Ahmet", "Male", 1, 1000, "Doctora", "aaa", 2025);
        secretary.totalUndergraduateStudent[0]=new Undergraduate(1, 2, "Ahmet", "Male", 1, 1000, 2020);
        secretary.undergraduateStudentList[0][0]=new Undergraduate(1, 2, "Ahmet", "Male", 1, 1000, 2020);
        secretary.graduateStudentList[0][0]=new Graduate(1, 2, "Ahmet", "Male", 1, 1000, "Doctora", "aaa", 2025);
        secretary.totalGraduateCourse[0]=new Courses("bm101", "Bilgisayar Programlama", 5, "401", "Ahmet", "Graduate");
        secretary.totalUndergraduateCourse[0]=new Courses("bm101", "Bilgisayar Programlama", 5, "401", "Ahmet", "Undergraduate");
        secretary.headOfTheDepartment[0]=new HeadOfTheDepartment(1, "Ahmet", "Professor", 20000);
        secretary.totalLecturers[0]=new Lecturers(1, "Ahmet", "Professor", 20000);
        secretary.totalLecturers[0].courseList[0]=new Courses("bm101", "Bilgisayar Programlama", 5, "401", "Ahmet", "Graduate");
        secretary.headOfTheDepartment[0].courseList[0]=new Courses("bm101", "Bilgisayar Programlama", 5, "401", "Ahmet", "Graduate");
        //secretary.totalLecturers[0].Action();
        //secretary.Action();
        //secretary.totalGraduateStudent[0].Action();
        //secretary.totalUndergraduateStudent[0].Action();



        HeadOfTheDepartment headOfTheDepartment=new HeadOfTheDepartment(1,"XXX","Prof.",20000);
        //System.out.println(secretary.headOfTheDepartment[0].checkSuitabilityForMaster(secretary.totalUndergraduateStudent[0].getTotalCourseNumber(), secretary.totalUndergraduateStudent[0].getGPA()));
/*
        CleaningStaff cleaningStaff = new CleaningStaff(1,"Mehmet","Cleaning Staff",42,12000,"Male","mehmet@gmail.com","343432334");
        System.out.println(cleaningStaff.staffDetails());
        cleaningStaff.Action();
        cleaningStaff.overtimePay(cleaningStaff.getSalary(),cleaningStaff.getStaff_name(), cleaningStaff.getWorkHour());
        TechnicalStaff technicalStaff = new TechnicalStaff(1,"Ela","Technical Staff",0,13500,"Female","ela@gmail.com","353267868");
        System.out.println(technicalStaff.staffDetails());
        technicalStaff.Action();
        technicalStaff.overtimePay(technicalStaff.getSalary(),technicalStaff.getStaff_name(), technicalStaff.getWorkHour());

*/
        /*
        Canteen canteen = new Canteen(new boolean[]{true,false,true,false,true},new double[]{2,3,4,5,6},24,50,10);
        canteen.showItems();
        System.out.println("\n");
        canteen.buy(secretary.totalGraduateStudent[0]);
        Garden garden =new Garden(5);
        garden.calculateArea();
        System.out.println("\n");
        int[] section=new int[]{1,2,3};
        Classrooms classrooms=new Classrooms(3,5,1,section,100,"Gazi Univ. Eng. Fac.");
        System.out.println(classrooms.isSmokingArea());
        StaffOffices staffOffices=new StaffOffices();
        staffOffices.isClear(false);
        LecturerOffices lecturerOffices=new LecturerOffices();
        lecturerOffices.lecturerIsAvailable();*/
    }
}