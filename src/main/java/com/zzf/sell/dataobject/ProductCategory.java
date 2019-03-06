package com.zzf.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "product_category")
@Entity
@DynamicUpdate
public class ProductCategory {

    /*类目id*/
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer categoryId;
    /**类目名字*/
    private  String categoryName;
    /**类目编号*/
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
