import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double GRAVITATIONAL_CONSTANT = 0.000000000066743;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mass for first black hole (kg): ");
        double mass1 = scanner.nextDouble();
        System.out.print("Enter mass for second black hole (kg): ");
        double mass2 = scanner.nextDouble();
        System.out.print("Enter distance between black holes (m): ");
        double distance = scanner.nextDouble();

        BlackHole blackHole1 = new BlackHole(mass1);
        BlackHole blackHole2 = new BlackHole(mass2);


//        int deltaT = 1;
//        int time = 0;
//        double distanceFromSun = radius;
//        double acceleration;
//        double velocity = 0.0;
//        double deltaV;
//        double deltaS;
//
////        ArrayList<String> results = new ArrayList<>();
//
//        while (true) {
//            acceleration = -1 * (GRAVITATIONAL_CONSTANT * MASS_OF_SUN_KG) / (distanceFromSun * distanceFromSun);
//            deltaV = acceleration * deltaT;
//            velocity += deltaV;
//            deltaS = velocity * deltaT;
//            distanceFromSun += deltaS;
//
//            if (distanceFromSun <= 0.0) {
//                break;
//            }
//
////            results.add(String.format("Time: %ds, acceleration: %fms^-2, velocity: %fms^-1, distance: %fm", time, acceleration, velocity, distanceFromSun));
//
//            System.out.printf("Time: %ds, acceleration: %fms^-2, velocity: %fms^-1, distance: %fm%n", time, acceleration, velocity, distanceFromSun);
//
//            time += deltaT;
//        }
    }
}