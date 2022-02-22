module com.design {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.design to javafx.fxml;
    exports com.design;
}
