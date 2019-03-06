package com.zzf.sell.Service;

import com.zzf.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findById(String productId);

    /**查询上架的商品**/
    List<ProductInfo> findUpAll();

    /**管理端*/
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存



}
