interface Salary {

    // compute salary provided by a 'normal' interface method declaration
    double salaryToPay(int hours, double rate);

    //default method that provides a default implementation
    default double salaryForOvertime(int hours, double rate) {
        if (hours > 40) {
            return (40 * rate) + ((hours - 40) * rate * 1.5);
        } else {
            return hours * rate;
        }
    }

    // static interface method
    static boolean ReceiveBonus(int yearsOfExperience) {
        return yearsOfExperience > 2;
    }
}
//add own implementation of ......
