public class Equal {
    public static void main(String[] args) {
        int i = 42;
        int j = 42;
        String s1 = new String("Jam");
        String s2 = new String("Jam");

        if (i == j) {
            System.out.println("i==j");
        }
        if (s1 == s2) {
            System.out.println("s1==s2");
        }
    }
}