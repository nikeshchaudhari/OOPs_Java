public class Water{
    //Properties
    private String name;
    private double quantity;
    private double price;

    //Functions
    // void printinfo()

    // Getter & Setter 
public String getName(){
    return name;
}
public void setName(String name){

    this.name =name;
}
public double getQuantity(){
    return quantity;
}
public void setQuantity(double quantity){
    this.quantity = quantity;

}public double getPrice(){
    return price;
}
public void setPrice(double price){
    this.price = price;
}

void info(){
    System.out.println("Name "+this.name);
}
}

// Main

 class WaterMain{
    public static void main(String[] args) {
        Water w1 = new Water();
        w1.setName("Sudha Pani");
        w1.setQuantity(1);
        w1.setPrice(25);

        System.out.println("Water name is "+w1.getName());
        System.out.println("Quantity is "+w1.getQuantity());
        System.out.println("Price is "+w1.getPrice());
        // w1.info();


        
    }
 }