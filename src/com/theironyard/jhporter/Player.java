package com.theironyard.jhporter;

import java.util.Scanner;

/**
 * Created by jeffryporter on 5/18/16.
 */
public class Player
{
    //define variabes
    String name;
    String weapon;
    String location;

    public void chooseName()
    {
        System.out.println("What is your name? ");
        name = Main.input.nextLine();
        System.out.println("Welcome, " + name);
    }

    public void chooseWeapon() throws Exception
    {
        System.out.println("Choose you're weapon [sword/mace]: ");
        weapon = Main.input.nextLine();
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
    }

    public void chooseLocation() throws Exception
    {
        System.out.println("Choose your location [forest/tunnel]: ");
        location = Main.input.nextLine();
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
