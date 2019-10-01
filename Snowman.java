import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Snowman extends Application {

   public void start(Stage stage){
       final double STAGE_WIDTH = 250;
       final double STAGE_HEIGHT = 200;
       final double TOP_RADIUS = 20;
       final double X_VALUE = STAGE_WIDTH / 2;
       final double HEAD_CENTER = STAGE_HEIGHT - 160;

       Circle head = new Circle(X_VALUE, HEAD_CENTER, TOP_RADIUS);
       Circle middle = new Circle(X_VALUE, HEAD_CENTER + 40, TOP_RADIUS * 1.3);
       Circle bottom = new Circle(X_VALUE, HEAD_CENTER + 90, TOP_RADIUS * 1.6);

       Line arms = new Line(X_VALUE - 50, STAGE_HEIGHT - 120, X_VALUE + 50, STAGE_HEIGHT-118);

       Circle eye1 = new Circle(X_VALUE + 7, HEAD_CENTER-5, 2);
       Circle eye2 = new Circle(X_VALUE - 7, HEAD_CENTER-5, 2);

       Rectangle topHat = new Rectangle(X_VALUE - 12, HEAD_CENTER - 35,23,23);
       Ellipse topHatBottom = new Ellipse(X_VALUE, HEAD_CENTER - 15,16,5);

       Polygon ground = new Polygon();
       ground.getPoints().addAll(new Double[] {
               0.0, STAGE_HEIGHT,
               0.0, STAGE_HEIGHT - 50,
               STAGE_WIDTH, STAGE_HEIGHT - 50,
               STAGE_WIDTH, STAGE_HEIGHT
       });

       Polygon nose = new Polygon();
       nose.getPoints().addAll(new Double[] {
               X_VALUE, HEAD_CENTER+2,
               X_VALUE + 20, HEAD_CENTER + 12,
               X_VALUE, HEAD_CENTER+6
       });

       head.setStroke(Color.web("rgb(120,120,120)"));
       head.setFill(Color.web("rgb(255,255,255)"));
       middle.setStroke(Color.web("rgb(120,120,120)"));
       middle.setFill(Color.web("rgb(255,255,255)"));
       bottom.setStroke(Color.web("rgb(120,120,120)"));
       bottom.setFill(Color.web("rgb(255,255,255)"));
       ground.setStroke(Color.web("rgb(120,120,120)"));
       ground.setFill(Color.web("rgb(255,255,255)"));
       arms.setStroke(Color.web("rgb(74, 28, 0)"));
       nose.setFill(Color.web("rgb(255,125,46)"));
       nose.setStroke(Color.web("rgb(181,82,22)"));
       eye1.setFill(Color.web("rgb(0,0,0)"));
       eye2.setFill(Color.web("rgb(0,0,0)"));
       topHat.setFill(Color.web("rgb(0,0,0)"));
       topHatBottom.setFill(Color.web("rgb(0,0,0)"));

       Group root = new Group(arms, ground, head, middle, bottom, nose, eye1, eye2, topHat, topHatBottom);
       Scene scene = new Scene(root, STAGE_WIDTH, STAGE_HEIGHT, Color.web("rgb(120,200,255)"));

       stage.setTitle("Snowman");
       stage.setScene(scene);
       stage.show();
   }

   public static void main(String[] args){
       launch(args);
   }
}
