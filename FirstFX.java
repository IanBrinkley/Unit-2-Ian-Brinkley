import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.transform.Rotate;

public class FirstFX extends Application {

  public void start(Stage stage){

    Ellipse cloudLeft = new Ellipse(50, 50, 20, 10);
    Ellipse cloudMiddle = new Ellipse(70, 53, 23, 17);
    Ellipse cloudMiddle2 = new Ellipse(90, 45, 23, 19);
    Ellipse cloudRight = new Ellipse(110, 50, 17, 10);

    Polygon mountain1 = new Polygon();
    mountain1.getPoints().addAll(new Double[]{
    70.0, 250.0,
    270.0, 250.0,
    170.0, 160.0
    });
    Polygon mountainSnow = new Polygon();
    mountainSnow.getPoints().addAll(new Double[] {
    148.0, 180.0,
    192.0, 180.0,
    170.0, 160.0
    });

    Circle sun = new Circle(350, 30, 30);

    Line sunRay1 = new Line(310, 20, 250, 20);
    Line sunRay2 = new Line(315, 40, 255, 50);
    Line sunRay3 = new Line(320, 50, 270, 90);
    Line sunRay4 = new Line(335, 70, 310, 120);

    cloudLeft.setStroke(Color.web("rgb(255,255,255)"));
    cloudMiddle.setStroke(Color.web("rgb(255,255,255)"));
    cloudMiddle2.setStroke(Color.web("rgb(255,255,255)"));
    cloudRight.setStroke(Color.web("rgb(255,255,255)"));

    cloudLeft.setFill(Color.web("rgb(255,255,255)"));
    cloudMiddle.setFill(Color.web("rgb(255,255,255)"));
    cloudMiddle2.setFill(Color.web("rgb(255,255,255)"));
    cloudRight.setFill(Color.web("rgb(255,255,255)"));

    mountain1.setStroke(Color.web("rgb(100,40,8)"));
    mountain1.setFill(Color.web("rgb(100,40,8)"));
    mountainSnow.setStroke(Color.web("rgb(250,250,250)"));
    mountainSnow.setFill(Color.web("rgb(250,250,250)"));

    sun.setStroke(Color.web("rgb(255,252,87)"));
    sun.setFill(Color.web("rgb(255,252,87)"));

    sunRay1.setStroke(Color.web("rgb(255,252,87)"));
    sunRay1.setFill(Color.web("rgb(255,252,87)"));
    sunRay2.setStroke(Color.web("rgb(255,252,87)"));
    sunRay2.setFill(Color.web("rgb(255,252,87)"));
    sunRay3.setStroke(Color.web("rgb(255,252,87)"));
    sunRay3.setFill(Color.web("rgb(255,252,87)"));
    sunRay4.setStroke(Color.web("rgb(255,252,87)"));
    sunRay4.setFill(Color.web("rgb(255,252,87)"));

    Text complaints = new Text(30, 130, "why did i need this many lines to do this");
    complaints.setFont(new Font(15));
    Text scream = new Text(40, 150, "aaaaaaaaaaaaaaaaaaaaa");
    scream.setFont(new Font(12));

    Group root = new Group(cloudLeft, cloudMiddle, cloudMiddle2, cloudRight, mountain1, mountainSnow, sun, sunRay1, sunRay2, sunRay3, sunRay4, complaints, scream);
    Scene scene = new Scene(root, 400, 250, Color.web("rgb(80, 204, 203)"));

    stage.setTitle("FirstFX");
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String[] args){
    launch(args);
  }
}
