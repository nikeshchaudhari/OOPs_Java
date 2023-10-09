public class GammingLaptop {
    private String name;
    private String brand;
    private String color;
    private int Displayhzh;
    private int processor;
    private double price;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;

    }

    public int getDisplayhzh() {
        return Displayhzh;

    }

    public int getProcessor() {
        return processor;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDisplayhzh(int Displayhzh) {
        this.Displayhzh = Displayhzh;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public void setPrize(double price) {
        this.price = price;
    }
}

class Being {
    public static void main(String[] args) {
        GammingLaptop g1 = new GammingLaptop();
        g1.setName("Acer");
        g1.setColor("Red");
        g1.setBrand("Nitro");
        g1.setDisplayhzh(144);
        g1.setProcessor(5);
        g1.setPrize(1350000);
        System.out.println("Laptop name is " + g1.getName());
    }
}
