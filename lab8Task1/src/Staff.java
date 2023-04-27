import java.util.Scanner;
class Staff extends Person implements Salary {
    String zholdoshbekovaEducation;
    String zholdoshbekovaPosition;

    @Override
    public void initialize() {
        super.initialize();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter education: ");
        zholdoshbekovaEducation = input.nextLine();

        System.out.print("Enter position: ");
        zholdoshbekovaPosition = input.nextLine();

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Education: " + zholdoshbekovaEducation);
        System.out.println("Position: " + zholdoshbekovaPosition);
    }

    @Override
    public double salaryToPay(int hours, double rate) {
        return hours * rate;
    }
}