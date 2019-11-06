
/**
 * Cyberdemon is a type of Demon that has a min helth of 25 and max of 100
 * an has a min strength of 20 and max of 40
 *
 * @author Steve Cate
 * @version 11/06/19
 */
public class Cyberdemon extends Demon
{
    /**
     * Constructor for objects of class Cyberdemon
     * Will create a Demon and will tell it what its 
     * min and max values are for health and strength
     */
    public Cyberdemon()
    {
        // This will make the Demon that has a health range from 25 to 100
        // and a strength range from 20 to 40
        super(25, 100, 20, 40);
    }
}
