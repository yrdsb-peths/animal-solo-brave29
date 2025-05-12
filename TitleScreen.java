import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Nereyal
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Elephant Eats", 55);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 200, getHeight()/2);
        prepare();
    }

    /**
     * The main world act loop
     */

    public void act()
    {
        //start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,403,143);
        Label label = new Label("Use \u2190  and → to move", 40);
        addObject(label,210,271);
        label.setLocation(221,264);
        Label label2 = new Label("Press <space> to start", 40);
        addObject(label2,199,324);
        elephant.setLocation(48,115);
        label.setLocation(216,212);
        label2.setLocation(223,261);
        label2.setLocation(208,262);
        Elephant elephant2 = new Elephant();
        addObject(elephant2,431,132);
        elephant2.setLocation(426,114);
        label.setLocation(280,204);
        label2.setLocation(270,260);
        elephant2.setLocation(460,120);
        elephant.setLocation(92,110);
        elephant.setLocation(75,123);
        elephant2.setLocation(466,120);
        elephant2.setLocation(464,115);
        label2.setLocation(220,282);
        label.setLocation(256,236);
        elephant2.setLocation(428,156);
        elephant.setLocation(13,196);
        label.setLocation(120,114);
        elephant2.setLocation(386,200);
        elephant2.setLocation(416,186);
        label2.setLocation(300,296);
    }
}
