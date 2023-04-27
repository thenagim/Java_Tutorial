public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.initialize();
        staff.print();

        int hours = 58;
        double rate = 10.0;
        double salary = staff.salaryToPay(hours, rate);
        double overtimeSalary = staff.salaryForOvertime(hours, rate);
        boolean shouldReceiveBonus = Salary.ReceiveBonus(3);

        System.out.println("Salary: " + salary);
        System.out.println("Overtime salary: " + overtimeSalary);
        System.out.println("Should receive bonus? " + shouldReceiveBonus);
    }
}