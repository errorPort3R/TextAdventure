package com.theironyard.jhporter;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Player player = new Player();

    public static void main(String[] args) throws Exception {
        //declare variables



        //play
        System.out.println("Welcome traveller!");
        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
        player.findItem("armor");
        player.findItem("potion");

        Enemy ogre =  new Enemy("Ogre", 10, 10);
        player.battle(ogre);

        /*System.out.println("Type a number.");
        String num = input.nextLine();
        int actualNum = Integer.valueOf(num);

        if (actualNum<0)
        {
            System.out.println("That's a negative number.");
        }
        else
        {
            System.out.println("That's a positive number.");
        }
        */

    }

    public static String nextLine()
    {
        String line = input.nextLine();
        while(line.startsWith("/"))
        {
            switch (line)
            {
                case "/inv":
                    for (String item : player.items)
                    {
                        System.out.println(item);
                    }
                    break;
                default:
                    System.out.println("Command Not Found!");
                    break;
            }
            line = input.nextLine();
        }
        return line;
    }
}
