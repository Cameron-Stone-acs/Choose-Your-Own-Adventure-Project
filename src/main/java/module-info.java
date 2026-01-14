module b.b {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens b.b to javafx.fxml;
    exports b.b;
}