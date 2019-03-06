package com.zzf.sell.repository;

import com.zzf.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    /**查找Id为1的数据*/
    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = repository.findById(1);
        System.out.println(productCategory.toString());
    }
    /**新增一条记录*/
    /*@Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }
    *//**修改方法1（全部数据）*//*
    @Test
    public void saveTest2(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }*/
    /**修改方法2（部分数据）*/
    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(10);
        repository.save(productCategory);
    }
    /**构造方法*/
    @Test
    @Transactional
    public void saveTest3(){
        ProductCategory productCategory = new ProductCategory("男生",3);
        ProductCategory result =  repository.save(productCategory);
        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());

    }
}