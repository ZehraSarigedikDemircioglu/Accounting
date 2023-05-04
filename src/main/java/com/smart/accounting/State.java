package com.smart.accounting;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class State extends BaseEntity{

    private String stateCode;
    private String stateName;


}
