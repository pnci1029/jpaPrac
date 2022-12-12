package com.jpa.main.main.sample;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Users")
public class User  {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
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

    @ElementCollection
    @CollectionTable(name = "favorite_food",joinColumns = @JoinColumn(name = "user_id"))
    private Set<String> favoriteFoods = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "address_history",joinColumns = @JoinColumn(name = "user_id"))
    private List<Address> addressHistory = new ArrayList<>();

}
