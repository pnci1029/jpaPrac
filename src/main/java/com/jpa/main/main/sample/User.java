package com.jpa.main.main.sample;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
public class User  {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int age;
    @Embedded
    private Period period;
    @Embedded @AttributeOverrides({
            @AttributeOverride(name = "city", column = @Column(name = "home_city")),
            @AttributeOverride(name = "street", column = @Column(name = "home_street")),
            @AttributeOverride(name = "zipcode", column = @Column(name = "zipcode_city")),
    })
    private Address homeAddress;
    @Embedded
    private Address workAddress;


}
