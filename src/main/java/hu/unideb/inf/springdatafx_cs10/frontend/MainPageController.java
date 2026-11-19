package hu.unideb.inf.springdatafx_cs10.frontend;

import hu.unideb.inf.springdatafx_cs10.SpringDataFxCs10Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {
    public Label nameLabel;
    private ConfigurableApplicationContext ctx;

    public void startBackend(ActionEvent actionEvent) {
        ctx = SpringApplication.run(SpringDataFxCs10Application.class);
    }

    public void printData(ActionEvent actionEvent) {
        SpringDataFxCs10Application app =
                ctx.getBean(SpringDataFxCs10Application.class);
        app.printData();
        System.out.println("Printing on the frontend: " + app.getPerson());
        nameLabel.setText(app.getPerson().getName());
    }

    public void stopBackend(ActionEvent actionEvent) {
        ctx.close();
    }
}
