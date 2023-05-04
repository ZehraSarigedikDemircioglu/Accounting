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

    private String invoiceNumber;

    private LocalDate invoiceDate;

    private String invoiceType;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
