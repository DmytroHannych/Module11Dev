package org.example.Flyway;


import org.flywaydb.core.Flyway;

public class FlywayDatabaseInitService {
    public void initData() {

        Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:h2:~/flyways1", null, null)
                .load();
        flyway.migrate();
    }

}
