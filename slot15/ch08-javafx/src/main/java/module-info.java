module fe.de200221.ch08javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;      // T5: WebView
    requires javafx.media;    // T5: MediaPlayer

    // 1. Package mặc định khi tạo project
    opens fe.de200221.ch08javafx to javafx.fxml;
    exports fe.de200221.ch08javafx;

    // 2. Tiện ích dùng chung
    exports com.fu.ch08.common;

    // 3. FXML Controllers (cần reflection)
    opens com.fu.ch08.b4 to javafx.fxml;
    opens com.fu.ch08.b5 to javafx.fxml;
    opens com.fu.ch08.b6 to javafx.fxml;
    opens com.fu.ch08.t1 to javafx.fxml, javafx.base; // javafx.base: cho TableView PropertyValueFactory
    opens com.fu.ch08.t4 to javafx.fxml, javafx.base;

    // 4. Các Application class cần export để JavaFX khởi tạo được
    exports com.fu.ch08.b1;
    exports com.fu.ch08.b2;
    exports com.fu.ch08.b3;
    exports com.fu.ch08.b4;
    exports com.fu.ch08.b5;
    exports com.fu.ch08.b6;
    exports com.fu.ch08.t1;
    exports com.fu.ch08.t2;
    exports com.fu.ch08.t3;
    exports com.fu.ch08.t4;
    exports com.fu.ch08.t5;
    exports com.fu.ch08.t6;
}
