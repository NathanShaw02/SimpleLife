module com.simplelife {
    requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires java.sql;

    opens com.simplelife to javafx.base, javafx.graphics, javafx.fxml;
}
