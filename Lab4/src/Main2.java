public class Main2 {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet Camaro", "Chevy", 1982, 25000, "Black", 10);
        System.out.println(car.toString());

        car.sell(4);
        System.out.println("After selling 4 cars:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("Yellow");
        car.setPrice(27000);
        System.out.println("After changing color and price:");
        System.out.println(car.toString());
    }
}




