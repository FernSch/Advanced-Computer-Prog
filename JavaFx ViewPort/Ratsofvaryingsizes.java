import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * create a flow pane that displays 3 pictures with clickable zoom actions
 * @author 
 *
 */
public class Ratsofvaryingsizes extends Application 
{
	
	ImageView smallrat_imgView = new ImageView("smallrat.jpg");
	ImageView pizzarat_imgView = new ImageView("pizza_rat.jpg");
    ImageView bigrat_imgView = new ImageView("bigrat_.png");
    FlowPane pane = new FlowPane();
    
	/**
	 * start the flow pane
	 */
	public void start(Stage primaryStage)
	{

        
        bigrat_imgView.setFitHeight(300);
        bigrat_imgView.setFitWidth(400);
        smallrat_imgView.setFitHeight(300);
        smallrat_imgView.setFitWidth(400);
        pizzarat_imgView.setFitHeight(300);
        pizzarat_imgView.setFitWidth(400);
        
        
        /**
         * make images clickable
         */
        bigrat_imgView.setOnMouseClicked((MouseEvent e) -> 
        {
           bigrat_imgView.setViewport(new Rectangle2D(725, 225, 150, 150));
        });
        
        smallrat_imgView.setOnMouseClicked((MouseEvent e) -> 
        {
            smallrat_imgView.setViewport(new Rectangle2D(200, 80, 90, 80));
         });
        
        pizzarat_imgView.setOnMouseClicked((MouseEvent e) -> 
        {
            pizzarat_imgView.setViewport(new Rectangle2D(450, 100, 300, 300));
         });
        
        
        pane.setHgap(20);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().add(smallrat_imgView);
        pane.getChildren().add(pizzarat_imgView);
        pane.getChildren().add(bigrat_imgView);
        
        
        /**
         * set up scene
         */
        Scene scene = new Scene(pane, 1300, 700);
        primaryStage.setTitle("Rats of varying sizes");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	
	/**
	 * launches flow pane
	 * @param args
	 */
	public static void main(String[] args) {
		
		launch(args);

	}

}
