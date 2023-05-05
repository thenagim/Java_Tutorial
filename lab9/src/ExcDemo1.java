class ExcDemo1 {
    public static void generateNullPointerException() {
        String str = null;
        System.out.println("Before exception is genereted.");
        System.out.println(str.length());
        System.out.println("This will not be displayed");
    }
}

