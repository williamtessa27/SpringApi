package com.tessa.springweb.repos;

import com.tessa.springweb.entities.Production;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Production, Integer> {
}
