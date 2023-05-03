package com.smart.accounting;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;
@Setter
@Getter
//@Entity
public class Invoice extends BaseEntity{

    private Integer invoice_number;


}
