package com.marshall.guy;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        final double GRAVITATIONAL_CONSTANT = 0.000000000066743;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mass for first black hole (kg): ");
        double mass1 = scanner.nextDouble();
        System.out.print("Enter mass for second black hole (kg): ");
        double mass2 = scanner.nextDouble();
        System.out.print("Enter distance between black holes (m): ");
        double distance = scanner.nextDouble();

        scanner.close();

        BlackHole blackHole1 = new BlackHole(mass1);
        BlackHole blackHole2 = new BlackHole(mass2);

        int deltaT = 1;
        int time = 0;
        blackHole1.setVelocity(0.0);
        blackHole2.setVelocity(0.0);

        while (true)
        {
            blackHole1.setAcceleration((GRAVITATIONAL_CONSTANT * blackHole1.getMass()) / (distance * distance) * -1);
            blackHole2.setAcceleration((GRAVITATIONAL_CONSTANT * blackHole2.getMass()) / (distance * distance) * -1);
            blackHole1.setDeltaV(blackHole1.getAcceleration() * deltaT);
            blackHole2.setDeltaV(blackHole2.getAcceleration() * deltaT);
            blackHole1.setVelocity(blackHole1.getVelocity() + blackHole1.getDeltaV());
            blackHole2.setVelocity(blackHole2.getVelocity() + blackHole2.getDeltaV());
            blackHole1.setDeltaS(blackHole1.getVelocity() * deltaT);
            blackHole2.setDeltaS(blackHole2.getVelocity() * deltaT);

            distance += (blackHole1.getDeltaS() + blackHole2.getDeltaS());

            if (distance <= 0.0)
            {
                break;
            }

            System.out.printf("T: %ds, A1: %fms^-2, A2: %fms^-2, V1: %fms^-1, 2: %fms^-1, D: %fm%n", time, blackHole1.getAcceleration(), blackHole2.getAcceleration(), blackHole1.getVelocity(), blackHole2.getVelocity(), distance);

            time += deltaT;
        }
    }
}
