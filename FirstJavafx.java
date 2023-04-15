package firstjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstJavafx extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        btn1.setText("Button 1");
        btn1.setOnAction((ActionEvent event) -> {
            System.out.println("Button 1 clicked!");
        });

        Button btn2 = new Button();
        btn2.setText("Button 2");
        btn2.setOnAction((ActionEvent event) -> {
            System.out.println("Button 2 clicked!");
        });

        StackPane root = new StackPane();
        root.getChildren().addAll(btn1,btn2);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Two Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
