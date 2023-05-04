package com.smart.accounting;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table (name = "category")
@NoArgsConstructor
@Data
public class Category extends BaseEntity{

    String categoryName;
    Double tax;

    @OneToMany
    List<Product> product;


}
