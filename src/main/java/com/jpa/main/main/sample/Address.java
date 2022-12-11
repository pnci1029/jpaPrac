package com.jpa.main.main.sample;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

        private String city;
        private String street;
        private String zipcode;
}
