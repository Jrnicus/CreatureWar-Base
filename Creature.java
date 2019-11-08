import java.util.Random;

/**
 * Creature is a general class that has a certain HP and Strength
 * based on its Strength it can do a random ammount of damage from 1 to its strngth
 * Cretatures health or strength can never start out less then 5
 * Creature are considered to be alive until there health 0 or less
 * 
 * @author Steve Cate
 * @version 11/06/19
 */
public class Creature
{
    
    private int hp;
    private int strength;
    private int fullHealth;
    private Random rand = new Random();
   
    public Creature(){
        hp = 10;
        fullHealth = 10;
        strength = 10;
    }
    
    /**
     * a constructor that accepts health and str to set the values
     * @param int health, int str
     */
    public Creature(int health, int str)
    {
        hp = health;
        fullHealth = health;
        strength = str;
        validateStats();
    }
    
    /**
     * a constructor that accpts the max and min for helath and strgeth 
     * and gives it a random health and strenth in that range
     * @param int min health, int max health, int min strength, int max strength
     */
    public Creature (int minHp, int maxHp, int minStr, int maxStr)
    {
        hp = (rand.nextInt((maxHp-minHp+1))+minHp);
        fullHealth = hp;
        strength = (rand.nextInt((maxStr-minStr+1))+minStr);
        validateStats();
    }
    
    /**
     * To make sure when the stats are intialized
     * hp or strength is not less then 5
     */
    public void validateStats()
    {
        if(strength < 5)
        {
            strength = 5;
        }
        if(hp < 5)
        {
            hp = 5;
        }
    }
    
    /**
     * Will generate a random number from 1 to strength and deal that much damage that turn
     */
    public int damage(){
        return (rand.nextInt(strength)+1);
    }
    
    /**
     * This will set the new hp for the creature after it takes damage from another creature
     * @param int damage delt
     */
    public void takeWound(int dmg)
    {
        hp = (hp - dmg);
    }
    
    /**
     * Getter to test if the creatur is still alive by check if its hp is more then 0
     * @return true if hp is grater then 0 or false if hp is 0 or less
     */
    public boolean isAlive()
    {
        if(hp > 0)
        {
            return true;
        }
        return false;
    }
    
    /**
     * Getter to get the hp of a creature
     * @return int hp
     */
    public int getHp()
    {
        return hp;
    }
    
    /**
     * Getter to get the strength of a creature
     * @return int strength
     */
    public int getStrength()
    {
        return strength;
    }
    
    /**
     * Lets you reset the creatures health back to its orginal health
     */
    public void resetHealth()
    {
        int resetHealth = fullHealth;
        hp = resetHealth;
    }
    
}
