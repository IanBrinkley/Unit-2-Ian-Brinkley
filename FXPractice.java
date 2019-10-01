import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXPractice extends Application {

  public void start(Stage stage){
    Text hello = new Text(50, 50, "Hello World!");
    Text question = new Text(120, 80, "How's it going?");
    Ellipse box = new Ellipse(80, 50, 50, 20);

    box.setStroke(Color.web("rgb(0,255,255)"));
    box.setFill(null);

    Group root = new Group(hello, question, box);
    Scene scene = new Scene(root, 300, 120, Color.web("rgb(0,120,120)"));

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
