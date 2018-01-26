/**
 * Created by Brett Patterson on 1/26/2018.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Graphics extends Application{


    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage theStage){
        theStage.setTitle("Tic Tac Toe!"); //setting the name of the window

        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );


        


        theStage.show();
    }
}