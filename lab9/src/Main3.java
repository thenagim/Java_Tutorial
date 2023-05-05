public class Main3 {
    public static void main(String[] args) {
        Account account = new Account("John Doe", 1000, "123456");

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println(  e.getMessage() );
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        } finally {
            System.out.println("Current account balance: " + account.getBalance());
        }
    }
}