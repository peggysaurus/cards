import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GameGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Beth's Game");
        BorderPane bp = new BorderPane();
        bp.setCenter(getCenter());
        Scene scene = new Scene(bp,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane getCenter(){
        GridPane gp = new GridPane();

        return gp;
    }
    //testing making a change
}
