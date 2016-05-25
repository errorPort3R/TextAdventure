package com.theironyard.jhporter;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by jeffryporter on 5/25/16.
 */
public class MainTest
{
    static final String TEST_FILE = "test.json";
    @Test
    public void saveAndLoad()
    {
        Player player = new Player();
        player.name = "test Player";
        player.weapon = "test weapon";
        player.location = "test Location";
        Main.saveGame(player, TEST_FILE);
        Player newPlayer = Main.loadGame(TEST_FILE);

        File f = new File(TEST_FILE);
        f.delete();

        assertTrue(newPlayer != null);
        assertTrue(newPlayer.name.equals(player.name));
        assertTrue(newPlayer.weapon.equals(player.weapon));
        assertTrue(newPlayer.location.equals(player.location));
    }
}