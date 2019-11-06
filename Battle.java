import java.util.Random;
/**
 * This will randomly generate 2 armys with diffrent types of creatures
 * The two armys can then battle each other and you will see which army won.
 *
 * @author Steve Cate
 * @version 11/06/19
 */
public class Battle
{
    private Creature[] army1;
    private Creature[] army2;
    private Random rand;

    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        army1 = new Creature[100];
        army2 = new Creature[100];
        rand = new Random();
        generateNewArmys();
    }
    
    /**
     * This will take a army array list and randomize it so it
     * has all new creatures of diffrent type in it
     * @param Creature[] army
     */
    private void generateNewArmy(Creature[] army)
    {
        int type;
        for(int i = 0; i < 100; i++)
        {
            type = rand.nextInt(11);
            if(type < 5)
            {
                army[i] = new Human();
            }
            else if(type < 8)
            {
                army[i] = new Elf();
            }
            else if(type < 10)
            {
                army[i] = new Cyberdemon();
            }
            else
            {
                army[i] = new Balrog();
            }
        }
    }
    
    /**
     * This allows you to regenerate the army lists randomly again 
     * so that you might get diffrent armys with diffrent numbers of each type of creature.
     */
    public void generateNewArmys()
    {
        generateNewArmy(army1);
        generateNewArmy(army2);
    }
    
    /**
     * This will reset the health back to full for all creatrues in both armys
     */
    private void resetArmy(Creature[] army)
    {
        for(Creature creature: army)
        {
            creature.resetHealth();
        }
    }
    
    /**
     * This will reset both armys back to full health
     */
    public void resetArmys()
    {
        resetArmy(army1);
        resetArmy(army2);
    }
    
    public void battle()
    {
        
    }
}
