
/**
 * Balrog is a type of Demon that has a min helth of 80 and max of 200
 * an has a min strength of 50 and max of 100
 *
 * @author Steve Cate
 * @version 11/06/19
 */
public class Balrog extends Demon
{
    /**
     * Constructor for objects of class Balrog
     * Will create a Demon and will tell it what its 
     * min and max values are for health and strength
     */
    public Balrog()
    {
        // This will make the Demon that has a health range from 80 to 200
        // and a strength range from 50 to 100
        super(80, 200, 50, 100);
    }
}
