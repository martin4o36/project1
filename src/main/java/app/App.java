package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        String url, username, password;

        url = System.getenv("DB_URL");
        username = System.getenv("DB_USERNAME");
        password = System.getenv("DB_PASSWORD");

        if (url == null || username == null || password == null) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter database URL: ");
            url = scanner.nextLine();

            System.out.print("Enter database username: ");
            username = scanner.nextLine();

            System.out.print("Enter database password: ");
            password = scanner.nextLine();

            scanner.close();
        }

        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }
}
