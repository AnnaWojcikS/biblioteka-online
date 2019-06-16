package pl.sda.bibliotekaonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"application.properties", "application-ext.properties"}, ignoreResourceNotFound = true)
public class BibliotekaOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliotekaOnlineApplication.class, args);
    }

}
