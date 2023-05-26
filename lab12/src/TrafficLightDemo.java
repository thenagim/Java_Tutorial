public class TrafficLightDemo {
    private TrafficLight currentLight;

    public TrafficLightDemo () {
        currentLight = TrafficLight.RED; // Start with red light
    }

    public void changeColor() {
        switch (currentLight) {
            case RED:
                currentLight = TrafficLight.GREEN;
                break;
            case YELLOW:
                currentLight = TrafficLight.RED;
                break;
            case GREEN:
                currentLight = TrafficLight.YELLOW;
                break;
        }
    }

    @Override
    public String toString() {
        return "Current Light: " + currentLight;
    }

    public static void main(String[] args) {
        TrafficLightDemo simulator = new TrafficLightDemo();

        int numIterations = 10; // Number of iterations to simulate

        for (int i = 0; i < numIterations; i++) {
            System.out.println(simulator); // Print current light
            simulator.changeColor(); // Change the light
        }
    }
}
