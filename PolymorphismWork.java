public class PolymorphismWork {
    public static void main(String[] args) {
        // Mobile objm1 = new Mobile();
        // objm1.mobileinfo();

        Redmi r1 = new Redmi();
        r1.mobileinfo();

        Samsung s1 = new Samsung();
        s1.mobileinfo();

        Iphone i1 = new Iphone();
        i1.mobileinfo();
    }
}

class Mobile {
    void mobileinfo() {
        System.out.println("All Brands Of Mobiles");
    }
}

class Redmi extends Mobile {
    void mobileinfo() {
        System.out.println("Redmi");
    }
}

class Samsung extends Mobile {
    void mobileinfo() {
        System.out.println("Samsung J2");
    }
}

class Iphone extends Mobile {
    void mobileinfo() {
        System.out.println("Iphone 14 Pro");
    }
}
