package com.smart.accounting;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class InvoiceProduct extends BaseEntity{

    private Double profit;
    private Integer quantity;
    /*
    private Invoice invoice;
    private Product product;

     */
}
