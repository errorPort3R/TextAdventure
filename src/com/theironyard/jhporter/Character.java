package com.theironyard.jhporter;

/**
 * Created by jeffryporter on 5/24/16.
 */
public class Character
{
    String name;
    int health;
    int damage;

    public void battle(Character enemy)
    {
        System.out.printf("A wild %s appeared!\n", enemy.name);
        while (enemy.health>0 && this.health>0)
        {
            this.health -=  enemy.damage;
            enemy.health -= this.damage;
            System.out.printf("%s's health: %d\n", this.name, this.health);
            System.out.printf("%s's health: %d\n", enemy.name, enemy.health);
        }
        if (this.health<=0)
        {
            System.out.printf("You have died.\n");
        }
        if (enemy.health<=0)
        {
            System.out.printf("%s has died.", enemy.name);
        }
    }
}
