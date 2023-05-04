package com.smart.accounting;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "invoice_product")
public class InvoiceProduct extends BaseEntity{

    private BigDecimal profit;
    private Integer quantity;


    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice; // it gives error now since invoice entity does not have @Entity (looks commented)

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
