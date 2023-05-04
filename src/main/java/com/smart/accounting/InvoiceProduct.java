package com.smart.accounting;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "invoice_products")
public class InvoiceProduct extends BaseEntity{

    private BigDecimal profit;
    private Integer quantity;
  /*  @ManyToOne(fetch = FetchType.LAZY)
    private Invoice invoice; // it gives error now since invoice entity does not have @Entity (looks commented)
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;*/
}
