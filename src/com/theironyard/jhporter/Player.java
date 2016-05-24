package com.theironyard.jhporter;

import java.util.ArrayList;

/**
 * Created by jeffryporter on 5/18/16.
 */
public class Player extends Character
{
    //define variabes
    String weapon;
    String location;
    String answer;
    ArrayList<String> items = new ArrayList<String>();

    public Player()
    {
        this.health = 20;
        this.damage = 20;
    }

    public void chooseName()
    {
        System.out.println("What is your name? ");
        name = Main.nextLine();
        System.out.printf("Welcome, %s!\n", name);
    }

    public void chooseWeapon() throws Exception
    {
        System.out.println("Choose you're weapon [sword/mace]: ");
        weapon = Main.nextLine();
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
        location = Main.nextLine();
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

    public void findItem(String item)
    {
        System.out.printf("\nYou found %s! Pick it up? [Y/N]", item);
        answer = Main.nextLine();
        if (answer.equalsIgnoreCase("y"))
        {
            items.add(item);
            System.out.printf("You now have %d item(s).\n", items.size());
        }
    }

}
