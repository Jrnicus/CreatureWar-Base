
/**
 * Human is a basic creature with a min health of 10 and max of 30
 * and a min strength of 5 and max of 18
 * Human as no other addtional ablities
 *
 * @author Steve Cate
 * @version 11/06/19
 */
public class Human extends Creature
{
    /**
     * Constructor for objects of class Human
     * Will create a creature and set its health and strngeth randomly
     * within the min and max range for Human
     */
    public Human()
    {
        // This will make the creatue that has a health range from 10 to 30
        // and a strength range from 5 to 18
        super(10, 30, 5, 18);
    }
}
