package hrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@StyleSheet("styles.css")
public class IrixHrsApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(IrixHrsApplication.class, args);
    }
}
