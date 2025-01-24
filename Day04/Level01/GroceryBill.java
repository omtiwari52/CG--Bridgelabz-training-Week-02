import java.util.ArrayList;

class Customer{
    private int customerId;
    private String customerName;
    private String customerAddress;
    private ArrayList<Product> totalProduct;

    public Customer(int customerId, String customerName, String customerAddress){
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.customerName = customerName;
        this.totalProduct = new ArrayList<>();
    }

    public void addProduct(Product product){
        totalProduct.add(product);
    }

    public void viewBill(){
        
    }                                                                                                                                                                                                                                                                                                                                                                                                                                             
}
class Product{}
class BillGeneration{}

public class GroceryBill {
    
}
