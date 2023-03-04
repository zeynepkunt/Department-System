import java.util.Arrays;
import java.util.Scanner;
//declaration of class canteen
public class Canteen extends Social{
    //declare and initialize variables
    private String[] itemList;
    private boolean[] availableList;
    private double[]  priceList;
    private int tableNumber;
    private int maxCapacity;
    final double pi = 3.14f;
    private int r;
    //making a constructor for this class
    public Canteen( boolean[] availableList, double[] priceList, int tableNumber, int maxCapacity,int r){
        itemList = new String[]{"Chips","Chocolate","Biscuit","Cracer","Cola"};
        this.availableList = availableList;
        this.priceList = priceList;
        this.tableNumber = tableNumber;
        this.maxCapacity = maxCapacity;
        this.r=r;
    }

    //creating a scanner for get input from user
    Scanner scan = new Scanner(System.in);
    //getter-setters methods for encapsulation and access and update the value of a private variable
    public String[] getItemList() {
        return itemList;
    }

    public void setItemList(String[] itemList) {
        this.itemList = itemList;
    }

    public boolean[] getAvailableList() {
        return availableList;
    }

    public void setAvailableList(boolean[] availableList) {
        this.availableList = availableList;
    }

    public double[] getPriceList() {
        return priceList;
    }

    public void setPriceList(double[] priceList) {
        this.priceList = priceList;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if(r<0)r=0;
        else {
            this.r = r;}
    }

    //Creating a toString method to show details of this class
    public String canteenDetails(){
        return "Canteen Details\n" + "This canteen has" + tableNumber + "tables." + "\nCanteen max capacity:"+maxCapacity+"\nCanteen area:"+calculateArea();

    }
    //Creating a showItems method to see what items canteen have
    public void showItems(){
        System.out.printf("Item Number\t\t\tItem Name\t\t\tIs Item Avaible\t\t\tItem Price");
        for(int i = 0 ; i<itemList.length;i++){
            System.out.format("\n%d-)\t\t\t%s\t\t\t%b\t\t\t%f",i+1,itemList[i],availableList[i],priceList[i]);

        }
    }
    //Creating a buy method to students can buy an item using their balance and this method updates their balance
    public void buy(Students student){
        int index= -1;
        System.out.print("What dou you want to buy:");
        for (int i = 0; i < itemList.length; i++) {
            System.out.print(" "+itemList[i]);
        }
        System.out.println();
        String item = scan.next();
        if (Arrays.asList(item).contains(item)) {
            index = Arrays.asList(itemList).indexOf(item);
            if(availableList[index] && student.getStudentBalance()>=priceList[index]) {
                System.out.printf("You bought 1 %s and your new balance is %f.",item,student.getStudentBalance()-priceList[index]);
            }else {
                System.out.println("Your balance is not enough.");
            }
        }else System.out.printf("Item is not avaible.");


    }
    //Creating a isSmokingArea method to check this area is one of the smokelessAreas or not
    @Override
    public boolean isSmokingArea() {
        System.out.printf("Is smoking area: ");
        String className = this.getClass().getName();
        return Arrays.asList(notSmokelessAreas).contains(className);
    }

    //Creating calculate area method to calculate size of area
    @Override
    public double calculateArea() {
        return pi*r*r;
    }



    /*Creating a isClear method to check the Cleaning Staff cleaning right now or not
    while doing that we are creating a Date object to use getHours() method for get hour of the day in int format
    and converting our Array to a List to use ".contains" method to check is the date we get from getHours() method in
    the cleaningHours Array or not.
    */
    @Override
    public void isClear(boolean isClear) {
        if(isClear){
            System.out.println("This place is pretty clean");
        }
        else{
            Integer[] workingDays={0,1,2,3,4,5};
            Integer[] cleaningHour={1,2,3,4,5,6,7};
            CleaningStaff cleaningStaff=new CleaningStaff(1,"M.O.","cleaning",
                    50,6000.0,"Male","asd@gmail.com","7635200");
            if(cleaningStaff.isAvailable(workingDays) && !cleaningStaff.isCleaning(cleaningHour)){
                System.out.println("This area will be cleared immediately");
            }
            else{
                System.out.println("Sorry, our cleaning staff is not available!");
            }
        }
    }
}


