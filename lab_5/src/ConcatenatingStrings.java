import java. util. Scanner;
public class ConcatenatingStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the 2nd string: ");
        String s2 = sc.nextLine();

        System.out.println(s1 + "+"+ s2+"="+ s1.concat(s2));
        System.out.println(s2 + "+"+ s1+"="+ s2.concat(s1));

       // String s3 = s1.concat(s2);
       // tring s4 = s2.concat(s1);

        if (s1.equals(s2)) {
            System.out.println("The con of two different String is alternate");
        }
        else {
            System.out.println(" The can of two different String is not alternate");
        }

    }

}
