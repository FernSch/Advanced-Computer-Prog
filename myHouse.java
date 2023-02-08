package myHouse;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class myHouse extends Application
{
    //--------------------------------------------------------------------
    //  Creates and display a house using java FX
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
    	//add sky and grass
    	Rectangle sky = new Rectangle(0,0, 1366, 700);
    	sky.setFill(Color.LIGHTSKYBLUE);
    	Rectangle grass = new Rectangle(0, 700, 1366, 68);
    	grass.setFill(Color.LAWNGREEN);
    	grass.setStroke(Color.LIGHTGREEN);
    	grass.setStrokeWidth(2);
    	
        //main part of house
    	Rectangle base = new Rectangle(400, 400, 700, 700);
    	base.setFill(Color.GAINSBORO);
    	base.setStroke(Color.BLACK);
    	base.setStrokeWidth(2);
    	Rectangle chimeny = new Rectangle(900, 100, 100, 200);
    	chimeny.setFill(Color.GAINSBORO);
    	chimeny.setStroke(Color.BLACK);
    	chimeny.setStrokeWidth(2);
        
    	
    	//smoke for chimeny
    	Ellipse firstSmoke = new Ellipse(950, 100, 50,50);
    	firstSmoke.setFill(Color.SLATEGREY);
    	Ellipse secondSmoke = new Ellipse(975, 50, 50,50);
    	secondSmoke.setFill(Color.SLATEGREY);
    	Ellipse thirdSmoke = new Ellipse(1000, 0, 50,50);
    	thirdSmoke.setFill(Color.SLATEGREY);
    	
    	//add a fun little sun
    	Ellipse sun = new Ellipse(100,100, 75,75);
    	sun.setFill(Color.YELLOW);
    	sun.setStroke(Color.LIGHTYELLOW);
    	sun.setStrokeWidth(2);
    	
    	
    	//roof
    	Polygon roof = new Polygon();
    	roof.getPoints().addAll(new Double[]{
    		    300.0, 400.0,	//left corner
    		    1200.0, 400.0, //right corner
    		    750.0, 50.0, //top corner
    	});
    	roof.setFill(Color.DARKGRAY);
    	roof.setStroke(Color.BLACK);
    	roof.setStrokeWidth(2);
    	
    	//first window
        Rectangle windowOne = new Rectangle(450 ,500, 200, 200);
        windowOne.setFill(Color.GHOSTWHITE);
        windowOne.setStroke(Color.BLACK);
        windowOne.setStrokeWidth(2);
        //split for window
        Line windowSplitOne = new Line(550, 700, 550, 500);
        Line windowSplitTwo = new Line(450, 600, 650, 600);
        
        //second window
        Rectangle windowTwo = new Rectangle(850 ,500, 200, 200);
        windowTwo.setFill(Color.GHOSTWHITE);
        windowTwo.setStroke(Color.BLACK);
        windowTwo.setStrokeWidth(2);
        //split for window
        Line windowSplitOne_ = new Line(950, 700, 950, 500);
        Line windowSplitTwo_ = new Line(850, 600, 1050, 600);      
        
        //tree trunk
        Rectangle trunk = new Rectangle(100, 500, 50, 500);
        trunk.setFill(Color.rgb(107, 73, 43));
        trunk.setStroke(Color.rgb(196, 164, 132));
        trunk.setStrokeWidth(2);
        
        //tree leaves
        Ellipse leaves = new Ellipse(125, 350, 100, 200);
        leaves.setFill(Color.FORESTGREEN);
        leaves.setStroke(Color.GREEN);
        leaves.setStrokeWidth(2);
        
        /* examlpe of an arc
        Arc arc = new Arc (200, 200, 100,100, 90, 50);
        arc.setStroke(Color.BLACK);
        arc.setStrokeWidth(2);
        arc.setFill(null);
        */
        
        //door
        Rectangle door = new Rectangle(675, 500, 150, 250);
        door.setFill(Color.SADDLEBROWN);
        Ellipse knob = new Ellipse(800, 650, 10, 10);
        knob.setFill(Color.GOLD);
        Rectangle doorInlay = new Rectangle(700, 510, 100, 100);
        doorInlay.setFill(Color.SADDLEBROWN);
        doorInlay.setStroke(Color.BLACK);
        doorInlay.setStrokeWidth(2);
        
        Group windows = new Group
        (
        windowOne, windowSplitOne, windowSplitTwo, 
        windowTwo, windowSplitOne_, windowSplitTwo_
        );
        
        Group smoke = new Group(firstSmoke, secondSmoke, thirdSmoke);
        Group fullDoor = new Group(door, knob, doorInlay);
        Group background = new Group(sky, grass, sun);
        Group house = new Group(base, smoke, chimeny, roof);
        
    	Group root = new Group(background, house, trunk, leaves, fullDoor, windows);
    	Scene scene = new Scene(root, 1366, 768);
    
    	
        primaryStage.setTitle("James Schoenberg");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
