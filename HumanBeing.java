public class HumanBeing {
    // Propeties
    String name;
    String color;
    int Citizen_Nbr;
    int age;
    double height;

    HumanBeing(String name, String color, int Citizen_Nbr, int age, double height) {
        this.name = name;
        this.color = color;
        this.Citizen_Nbr = Citizen_Nbr;
        this.age = age;

    }

    HumanBeing(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void human() {
        System.out.println("My name is " + this.name);
        System.out.println("My color is " + this.color);
        System.out.println(" Citizen Number " + this.Citizen_Nbr);
        System.out.println(" Age  " + this.age);
        System.out.println("Height  " + this.height);
    }

}

class Main {
    public static void main(String[] args) {
        HumanBeing h1 = new HumanBeing("Nikesh", "Black", 121, 26, 5.4);
        h1.human();
    }
}
