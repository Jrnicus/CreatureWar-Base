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
    
    // to count wins or each army in tests
    public int army1Wins;
    public int army2Wins;
    public int draws;

    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        army1 = new Creature[100];
        army2 = new Creature[100];
        rand = new Random();
        generateNewArmys();
        army1Wins = 0;
        army2Wins = 0;
        draws = 0;
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
    
    /**
     * This will test if any one in a army is still alive or if the army is completly dead
     * @param int armyPostion, Creature[] army
     * @return boolean true if army is alive false if army is dead
     */
    private boolean isArmyAlive(int pos, Creature[] army)
    {
        
        while(pos >= 0)
        {
            if(army[pos].isAlive())
            {
                pos = -1;
            }
            else
            {
                pos -= 1;
            }
            if(pos == 1 && !army[pos-1].isAlive())
            {
                return false;
            }
        }
        return true;
    }
    
    public void battle()
    {
        int army1Postion = 0;
        int army2Postion = 0;
        boolean battleOver = false;
        
        while(!battleOver)
        {
            
            //if army1 postion is at the end of the array test and see if any
            //creatures in the army are still alive
            if(army1Postion == army1.length)
            {
                //test to see if army 1 is alive
                if(isArmyAlive(army1Postion-1, army1))
                {
                    army1Postion = 0;
                }
                //if army1 is dead
                else
                {
                    //if army 2 is still alive then they win
                    if(isArmyAlive(army2.length-1, army2))
                    {
                        System.out.println("The battle is over, army 1 is dead.");
                        System.out.println("Army 2 Wins!!");
                        army2Wins++;
                        battleOver = true;
                        break;
                    }
                    //if army 2 is also dead its a draw
                    else
                    {
                        System.out.println("The battle is over both armys are dead.");
                        System.out.println("Its a Draw.");
                        draws++;
                        battleOver = true;
                        break;
                    }
                }
            }
            
            if(army2Postion == army2.length)
            {
                //test to see if army 2 is alive
                if(isArmyAlive(army2Postion-1, army2))
                {
                    army2Postion = 0;
                }
                //if army2 is dead
                else
                {
                    //if army 1 is still alive then they win
                    if(isArmyAlive(army1.length-1, army1))
                    {
                        System.out.println("The battle is over, army 2 is dead.");
                        System.out.println("Army 1 Wins!!");
                        army1Wins++;
                        battleOver = true;
                        break;
                    }
                    //if army 1 is also dead its a draw
                    else
                    {
                        System.out.println("The battle is over both armys are dead.");
                        System.out.println("Its a Draw.");
                        draws++;
                        battleOver = true;
                        break;
                    }
                }
            }
            
            //if both units in the army are alive have them deal damage to each other
            if(army1[army1Postion].isAlive() && army2[army2Postion].isAlive())
            {
                army1[army1Postion].takeWound(army2[army2Postion].damage());
                army2[army2Postion].takeWound(army1[army1Postion].damage());
                
                //change units so a diffrent unit is fighting each turn
                army1Postion++;
                army2Postion++;
            }
            //if atleast one of the units is dead check both of them and for dead units advance the postion by 1
            else
            {
                if(!army1[army1Postion].isAlive())
                {
                    army1Postion++;
                }
                if(!army2[army2Postion].isAlive())
                {
                    army2Postion++;
                }
            }
        }
    }
}
