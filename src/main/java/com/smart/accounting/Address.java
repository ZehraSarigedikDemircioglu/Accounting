package com.smart.accounting;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Getter
@Setter
@Entity
@Table(name = "address")
public class Address extends BaseEntity{

    private String description;
    private String zip_code;

    /*
    private State state;

     */

}
