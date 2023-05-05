public class Main {
    public static void main(String[] args) {
        try {
            ExcDemo1.generateNullPointerException();
        } catch (NullPointerException ex) {
            System.out.println("A NullPointerException occurred: " + ex.getMessage());
            ex.printStackTrace();
            System.out.println(ex.toString());
        }
        System.out.println("After catch statement");
    }

}