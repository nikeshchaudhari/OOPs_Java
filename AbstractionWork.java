public class AbstractionWork {
    public static void main(String[] args) {
        OOP o1 = new OOP();
        o1.pageno();
        Database d1 = new Database();
        d1.pageno();
    }

}

abstract class Book {
    public abstract void pageno();

    public void bookinfo() {
        System.out.println("Details of Books ");
    }

}

class OOP extends Book {
    public void pageno() {
        System.out.println("120");
    }
}

class Database extends Book {
    public void pageno() {
        System.out.println("300");
    }
}
