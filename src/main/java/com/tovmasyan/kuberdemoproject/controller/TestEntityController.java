package com.tovmasyan.kuberdemoproject.controller;

import com.tovmasyan.kuberdemoproject.entity.TestEntity;
import com.tovmasyan.kuberdemoproject.service.TestEntityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/testEntity")
@AllArgsConstructor
public class TestEntityController {

    private TestEntityService testEntityService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public TestEntity createTestEntity(@RequestBody TestEntity testEntity){
        return testEntityService.create(testEntity);
    }

    @GetMapping("/all")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Collection<TestEntity> getAll(){
        return testEntityService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public TestEntity findById(@PathVariable Integer id){
        return testEntityService.getById(id);
    }
}
