package ma.enset.tp_cassandra_bddc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;


@Table("utilisateurs")

@Data @AllArgsConstructor @NoArgsConstructor
public class User {
        @PrimaryKey
        private UUID id;
        private String name;
        private Integer age;
        private String email;

}