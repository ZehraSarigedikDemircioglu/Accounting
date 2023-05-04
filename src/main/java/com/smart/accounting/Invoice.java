package com.smart.accounting;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "invoice")
public class Invoice extends BaseEntity{

    private Integer invoice_number;
@Column(name = "DATE")
    private LocalDate invoice_date;

    private String invoice_type;
   /* @OneToMany
    List<Client> client;*/
}
