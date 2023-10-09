interface Animals {
    void run();

}

class Cow implements Animals {
    public void run() {
        System.out.println("Cow runs two legs");
    }
}

class Dog implements Animals {
    public void run() {
        System.out.println("Dog Runs Very fast");
    }
}

class Buffelo implements Animals {
    public void run() {
        System.out.println("Buffelo ");
    }
}

class Animal {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.run();

        Dog d1 = new Dog();
        d1.run();

    }
}