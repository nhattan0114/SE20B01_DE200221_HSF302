module fe.de200221.studentmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens fe.de200221.studentmanagement to javafx.fxml;
    exports fe.de200221.studentmanagement;
}