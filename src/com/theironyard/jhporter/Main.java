package com.theironyard.jhporter;

import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner input = new Scanner(System.in);
    static Player player = new Player();

    public static void main(String[] args) throws Exception {




        //play
        System.out.println("Welcome traveller!");
        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
        player.findItem("armor");
        player.findItem("potion");

        Enemy ogre =  new Enemy("Ogre", 10, 10);
        player.battle(ogre);

        System.out.println(player);
        System.out.println(ogre);

        saveGame();
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
                case "/save":
                {
                    saveGame();
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



    public static void saveGame()
    {
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("*").serialize(player);
        File f = new File("game.json");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
