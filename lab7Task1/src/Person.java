import java.util.Scanner;

class Person {
    String zholdoshbekovaSurname;
    String zholdoshbekovaFirstName;
    String zholdoshbekovaStreet;
    String zholdoshbekovaZipCode;
    String zholdoshbekovaCity;

    public void initialize() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter surname: ");
        zholdoshbekovaSurname = input.nextLine();
        System.out.print("Enter first name: ");
        zholdoshbekovaFirstName = input.nextLine();
        System.out.print("Enter street: ");
        zholdoshbekovaStreet = input.nextLine();
        System.out.print("Enter zip code: ");
        zholdoshbekovaZipCode = input.nextLine();
        System.out.print("Enter city: ");
        zholdoshbekovaCity = input.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + zholdoshbekovaSurname);
        System.out.println("Name: "+ zholdoshbekovaFirstName);
        System.out.println("City: " + zholdoshbekovaCity);
        System.out.println("Street: "+ zholdoshbekovaStreet);
        System.out.println("ZipCode: "+ zholdoshbekovaZipCode);

    }
}

