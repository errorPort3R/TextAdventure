package com.theironyard.jhporter;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner input = new Scanner(System.in);
    static Player player;
    static final String SAVE_FILE = "game.json";

    public static void main(String[] args) throws Exception {

        //play
        player = loadGame(SAVE_FILE);
        if (player == null)
        {
            player = new Player();
            System.out.println("Starting new game!");
        }
        else
        {
            System.out.println("Saved Player found!  Start new game instead? [y/n]");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("y"))
            {
                player = new Player();
            }
        }
        System.out.println("Welcome traveller!");
        if (player.name==null) player.chooseName();
        if(player.weapon == null) player.chooseWeapon();
        if(player.location==null) player.chooseLocation();
        if(player.items.isEmpty())
        {
            player.findItem("armor");
            player.findItem("potion");
        }
        Enemy ogre =  new Enemy("Ogre", 10, 10);
        player.battle(ogre);

        System.out.println(player);
        System.out.println(ogre);

        saveGame(player, SAVE_FILE);
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
                    saveGame(player, SAVE_FILE);
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

    public static void saveGame(Player player, String fileName)
    {
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("*").serialize(player);
        File f = new File(SAVE_FILE);
        try
        {
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Player loadGame(String fileName)
    {
        File f = new File(SAVE_FILE);
        try
        {
            Scanner scanner = new Scanner(f);
            scanner.useDelimiter("\\Z");
            String contents = scanner.next();
            JsonParser parser = new JsonParser();
            return parser.parse(contents, Player.class);
        }
        catch (FileNotFoundException e)
        {

        }
        return null;
    }


}
