package com.maxvendas.maxvendas.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxvendas.maxvendas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> 
{

	
}
