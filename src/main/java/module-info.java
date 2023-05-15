module com.example.tp1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp1javafx to javafx.fxml;
    exports com.example.tp1javafx;
    exports com.example.partie1;
    exports Exercice1 ;
    exports Exercice5 ;
    opens Partie3 to javafx.fxml;
    exports Partie3;

}