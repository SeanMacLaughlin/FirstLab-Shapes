
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
   
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle treeTop;
    private Circle treeTop2;
    private Circle treeTop3;
    private Square trunk;
    private Square trunk2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
    

        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
       
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(10);
        sun.moveVertical(-50);
        sun.changeSize(60);
        sun.makeVisible();
        
        treeTop = new Circle();
        treeTop.changeColor("green");
        treeTop.moveHorizontal(175);
        treeTop.moveVertical(1);
        treeTop.changeSize(50);
        treeTop.makeVisible();
        
        treeTop2 = new Circle();
        treeTop2.changeColor("green");
        treeTop2.moveHorizontal(200);
        treeTop2.moveVertical(25);
        treeTop2.changeSize(50);
        treeTop2.makeVisible();
        
        treeTop3 = new Circle();
        treeTop3.changeColor("green");
        treeTop3.moveHorizontal(150);
        treeTop3.moveVertical(25);
        treeTop3.changeSize(50);
        treeTop3.makeVisible();
        
        trunk = new Square();
        trunk.changeColor("black");
        trunk.changeSize(50);
        trunk.moveHorizontal(135);
        trunk.moveVertical(75);
        trunk.makeVisible();
        
        trunk2 = new Square();
        trunk2.changeColor("black");
        trunk2.changeSize(50);
        trunk2.moveHorizontal(135);
        trunk2.moveVertical(100);
        trunk2.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
