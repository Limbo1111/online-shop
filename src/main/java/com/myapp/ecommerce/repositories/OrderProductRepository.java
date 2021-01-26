package com.myapp.ecommerce.repositories;

import com.myapp.ecommerce.model.OrderProduct;
import com.myapp.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
