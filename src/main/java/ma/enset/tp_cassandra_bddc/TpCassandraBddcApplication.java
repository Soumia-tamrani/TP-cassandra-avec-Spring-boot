package ma.enset.tp_cassandra_bddc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = "ma.enset.tp_cassandra_bddc.repositories")
public class TpCassandraBddcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpCassandraBddcApplication.class, args);
    }

}
