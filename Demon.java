import java.util.Random;
/**
 * Demon is a type of creature that has a 5% chance to do magic damage 
 * that will add 50 damage to its attack
 * A Demons max and min health and strength are determined by which type of deamon it is.
 *
 * @author Steve Cate
 * @version 11/06/19
 */
public class Demon extends Creature
{
    private Random rand;
    private int magicChance;
    
    /**
     * Constructor for objects of class Demon
     * Will create a creature and set its health and strngeth randomly
     * within the min and max range of the parameters passed in
     * The min and max health and strength are set be each type of demon subclass
     * @param int min health, int max health, int min strength, int max strength
     */
    public Demon(int minHp, int maxHp, int minStr, int maxStr)
    {
        // This will make the creatue that has a health range from minHp to maxHp
        // and a strength range from minStr to maxStr
        super(minHp, maxHp, minStr, maxStr);
        rand = new Random();
    }
    
    public int damage()
    {
        magicChance = rand.nextInt(20);
        // there is a 5% chance of magic chance being any number from 0 to 19
        if(magicChance == 19)
        {
            return (super.damage()+50);
        }
        return super.damage();
    }
}
