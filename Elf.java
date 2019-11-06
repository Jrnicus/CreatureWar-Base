import java.util.Random;

/**
 * Elf is a subclass of creature with a min health of 8 and max of 25
 * and a min strength of 5 and max of 18
 * Elf's also have a 10% chance to do magical damage which doubles the ammount of
 * damge they deal.
 *
 * @author Steve Cate
 * @version 11/06/19
 */
public class Elf extends Creature
{
        private Random rand;
        private int magicChance;
    /**
     * Constructor for objects of class Elf
     * Will create a creature and set its health and strngeth randomly
     * within the min and max range for Elf
     */
    public Elf()
    {
        // This will make the creatue that has a health range from 8 to 25
        // and a strength range from 5 to 18
        super(8, 25, 5, 18);
        
        rand = new Random();
    }
    
    /**
     * A method that will give a elf a 10% chance to do double the damage 
     * each time they attack
     */
    public int damage()
    {
        int magicChance = rand.nextInt(10);
        
        if (magicChance == 7)
        {
            return (super.damage() * 2);
        }
        return super.damage();
    }
}
