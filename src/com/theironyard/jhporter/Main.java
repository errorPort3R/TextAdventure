package com.theironyard.jhporter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //declare variables
        Scanner input = new Scanner(System.in);
        String name;
        String weapon;
        String location;

        //play
        System.out.printf("Welcome traveller!");
        System.out.printf("\nWhat is your name? ");
        name = input.nextLine();
        System.out.printf("\nWelcome, " + name);

        System.out.println("\nChoose you're weapon [sword/mace]: ");
        weapon = input.nextLine();

        if (weapon.equalsIgnoreCase("sword"))
        {
            System.out.println("Sword is a fine choice!");
        }
        else if (weapon.equalsIgnoreCase("mace"))
        {
            System.out.println("Mace is a fine choice!");
        }
        else
        {
            throw new Exception("Not a valid weapon! You are unarmed! Bwahahahaha! The Black Knight finds you and kills you!");
        }

        System.out.println("Choose your location [forest/tunnel]: ");
        location = input.nextLine();

        if (location.equalsIgnoreCase("forest"))
        {
            System.out.println("Entering forest...");
        }
        else if (location.equalsIgnoreCase("tunnel"))
        {
            System.out.println("Entering tunnel...");
        }
        else
        {
            throw new Exception("You are lost. The Black Knight finds you and kills you!");
        }

    }
}
