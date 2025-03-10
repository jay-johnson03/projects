module com.example.identification {
    requires javafx.controls;
    requires javafx.fxml;
    requires jbcrypt;
    requires java.desktop;


    opens com.example.identification to javafx.fxml;
    exports com.example.identification;
}