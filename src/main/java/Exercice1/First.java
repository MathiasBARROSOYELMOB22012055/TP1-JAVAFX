package Exercice1;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class First extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Création du conteneur principal
        BorderPane borderPane1 = new BorderPane();

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Options");
        Menu menu3 = new Menu("Help");

        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        borderPane1.setTop(menuBar);
        

        Scene scene = new Scene(borderPane1, 420, 100);
        stage.setTitle("Ma fenetre!");
        stage.setScene(scene);
        stage.show();

    }
}