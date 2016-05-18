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
    }
}
