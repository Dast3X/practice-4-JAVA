package lv.tsi.students;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {


    @Id
    @JsonProperty
    Long id;

    @JsonProperty
    String name;

    @JsonProperty
    String surname;

    @JsonProperty
    String shortdescription;

}
