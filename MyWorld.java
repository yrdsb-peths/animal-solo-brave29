import greenfoot.*;
/**
 * The World our hero lives in
 * 
 * @author Nereyal
 * @version April 2025
 */

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        createApple();
    }
    
    /**
     * Create a new apple at a random location at top of screen
     */
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
