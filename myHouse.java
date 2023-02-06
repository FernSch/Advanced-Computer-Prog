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
        //main part of house
    	Rectangle base = new Rectangle(400, 400, 700, 700);
    	base.setFill(Color.GAINSBORO);
    	base.setStroke(Color.BLACK);
    	base.setStrokeWidth(2);
        
    	
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
        windowOne.setFill(Color.YELLOW);
        windowOne.setStroke(Color.BLACK);
        windowOne.setStrokeWidth(2);
        //split for window
        Line windowSplitOne = new Line(550, 700, 550, 500);
        Line windowSplitTwo = new Line(450, 600, 650, 600);
        
        //second window
        Rectangle windowTwo = new Rectangle(850 ,500, 200, 200);
        windowTwo.setFill(Color.YELLOW);
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
        
        
        //750x
        //door
        Rectangle door = new Rectangle(675, 500, 150, 250);
        door.setFill(Color.SADDLEBROWN);
        Ellipse knob = new Ellipse(800, 650, 10, 10);
        knob.setFill(Color.GOLD);
        Rectangle doorInlay = new Rectangle(700, 510, 100, 100);
        doorInlay.setFill(Color.SADDLEBROWN);
        doorInlay.setStroke(Color.BLACK);
        doorInlay.setStrokeWidth(3);
        
    	Group root = new Group(base, roof, windowOne, windowSplitOne, windowSplitTwo, 
    			windowTwo, windowSplitOne_,
    			windowSplitTwo_, trunk,
    			leaves, door, knob, doorInlay
    			

    			
    			);
    	Scene scene = new Scene(root, 1366, 768);
    
    	
        primaryStage.setTitle("I have depression");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
