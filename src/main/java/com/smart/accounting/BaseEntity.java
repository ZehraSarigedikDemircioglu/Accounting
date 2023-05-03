package com.smart.accounting;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    private Long id;
}
