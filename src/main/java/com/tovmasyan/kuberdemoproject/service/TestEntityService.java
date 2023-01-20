package com.tovmasyan.kuberdemoproject.service;

import com.tovmasyan.kuberdemoproject.entity.TestEntity;

import java.util.Collection;

public interface TestEntityService {

    TestEntity create(TestEntity testEntity);

    Collection<TestEntity> getAll();

    TestEntity getById(Integer id);
}
