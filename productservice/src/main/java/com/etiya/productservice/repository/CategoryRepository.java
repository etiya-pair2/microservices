package com.etiya.productservice.repository;

import com.etiya.productservice.entity.Attribute;
import com.etiya.productservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
