import java.util.Scanner;

class Staff extends Person {
    String zholdoshbekovaEducation;
    String ZholdoshbekovaPosition;


    public void initialize1() {
        super.initialize();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter education: ");
        zholdoshbekovaEducation = input.nextLine();

        System.out.print("Enter position: ");
        ZholdoshbekovaPosition = input.nextLine();

    }

    @Override

    public  void print () {
        super.print();
        System.out.println("Education: "+ zholdoshbekovaEducation);
        System.out.println("Position: "+ ZholdoshbekovaPosition);
    }
}