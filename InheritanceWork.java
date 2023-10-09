public class InheritanceWork {
    public static void main(String[] args) {
        Dil d1 = new Dil();
        d1.name = "Dil Mahamad Ansari";
        System.out.println(d1.name);
        d1.study = "BIT";
        d1.info();
    }
}

class Person {
    String name;
    int age;
    double height;
}

class Dil extends Person {
    String study;

    public void info() {
        System.out.println("Study Is  ");
    }

}