package com.tovmasyan.kuberdemoproject.repository;

import com.tovmasyan.kuberdemoproject.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity,Integer> {
}
