public class Mobile {
    public String name;
    private int id;
    public String color;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        this.price = price;
    }

}

class mo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.setName("Redmi");
        m1.setColor("Blue");
        m1.setPrice(30000);
        m1.setId(102);

        System.out.println("Mobile name is " + m1.getName());
        System.out.println("Color is " + m1.getColor());
        System.out.println("Price is " + m1.getPrice());
        System.out.println("Id is " + m1.getId());

    }
}