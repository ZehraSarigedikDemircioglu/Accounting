package com.smart.accounting;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product extends BaseEntity {

    private String name;
    private int price;
    //private Categoty categotyId;

}
