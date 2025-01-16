package Day01.Level01;

public class MobilePhone {
    
    //create attributes 
    String brand;
    String model;
    int price;

    //create a constructor
    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Display Details
    void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        
        //Create an object of the MobilePhone class
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 70000);
        phone.displayDetails();

    }
}
