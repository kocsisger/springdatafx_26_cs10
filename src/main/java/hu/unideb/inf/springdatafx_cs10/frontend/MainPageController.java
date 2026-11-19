package hu.unideb.inf.springdatafx_cs10.frontend;

import hu.unideb.inf.springdatafx_cs10.SpringDataFxCs10Application;
import javafx.event.ActionEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {
    private ConfigurableApplicationContext ctx;

    public void startBackend(ActionEvent actionEvent) {
        ctx = SpringApplication.run(SpringDataFxCs10Application.class);
    }

    public void printData(ActionEvent actionEvent) {
        SpringDataFxCs10Application app =
                ctx.getBean(SpringDataFxCs10Application.class);
        app.printData();
    }

    public void stopBackend(ActionEvent actionEvent) {
        ctx.close();
    }
}
