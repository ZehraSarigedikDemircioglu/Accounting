package com.smart.accounting;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "category")
@NoArgsConstructor
@Data
public class Category extends BaseEntity{

    String categoryName;
    Double tax;



}
