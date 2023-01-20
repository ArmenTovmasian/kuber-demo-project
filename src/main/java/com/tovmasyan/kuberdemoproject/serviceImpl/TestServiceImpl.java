package com.tovmasyan.kuberdemoproject.serviceImpl;

import com.tovmasyan.kuberdemoproject.entity.TestEntity;
import com.tovmasyan.kuberdemoproject.repository.TestEntityRepository;
import com.tovmasyan.kuberdemoproject.service.TestEntityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
@AllArgsConstructor
public class TestServiceImpl implements TestEntityService {

    private TestEntityRepository testEntityRepository;

    @Override
    public TestEntity create(TestEntity testEntity) {
        return testEntityRepository.save(testEntity);
    }

    @Override
    public Collection<TestEntity> getAll() {
        return testEntityRepository.findAll();
    }

    @Override
    public TestEntity getById(Integer id) {
        return testEntityRepository.getById(id);
    }
}
