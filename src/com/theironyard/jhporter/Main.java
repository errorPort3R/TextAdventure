package com.theironyard.jhporter;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //declare variables


        Player player = new Player();

        //play
        System.out.println("Welcome traveller!");
        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
        player.findItem("armor");
        player.findItem("potion");



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
}
