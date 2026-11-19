package hu.unideb.inf.springdatafx_cs10.frontend;

import hu.unideb.inf.springdatafx_cs10.SpringDataFxCs10Application;
import javafx.event.ActionEvent;
import org.springframework.boot.SpringApplication;

public class MainPageController {
    public void startBackend(ActionEvent actionEvent) {
        SpringApplication.run(SpringDataFxCs10Application.class);
    }

    public void printData(ActionEvent actionEvent) {
    }

    public void stopBackend(ActionEvent actionEvent) {
    }
}
