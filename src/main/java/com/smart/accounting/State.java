package com.smart.accounting;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class State extends BaseEntity{

    private String stateCode;
    private String stateName;
}
