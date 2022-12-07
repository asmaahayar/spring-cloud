package org.sid.billingservice.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class Customer {
    private Long id;
    private String name;
    private String email;

}
