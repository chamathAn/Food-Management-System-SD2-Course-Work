module com.example.foodiesfavefoodcentersys {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.foodiesfavefoodcentersys to javafx.fxml;
    exports com.example.foodiesfavefoodcentersys;
}