module MusicUI {

    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    opens sample.model to javafx.base;

    opens sample;
}