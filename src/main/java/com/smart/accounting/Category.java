package com.smart.accounting;

import javax.persistence.Entity;

@Entity
public class Category extends BaseEntity{

    String categoryName;
    Double tax;


}
