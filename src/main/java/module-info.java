module com.example.htmlredactor {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.htmlredactor to javafx.fxml;
    exports com.example.htmlredactor;
}