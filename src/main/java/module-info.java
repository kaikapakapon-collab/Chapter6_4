module se233.chapter6_4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens se233.chapter6_4 to javafx.fxml;
    opens se233.chapter6_4.view to javafx.fxml;
    exports se233.chapter6_4;
    exports se233.chapter6_4.model;
    exports se233.chapter6_4.view;
    exports se233.chapter6_4.controller;
}