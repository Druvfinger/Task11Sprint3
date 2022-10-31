module com.example.task11sprint3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task11sprint3 to javafx.fxml;
    exports com.example.task11sprint3;
}