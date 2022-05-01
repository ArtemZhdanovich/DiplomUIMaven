module zhdanboro.diplomuimaven {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens zhdanboro.diplomuimaven to javafx.fxml;
    exports zhdanboro.diplomuimaven;
}