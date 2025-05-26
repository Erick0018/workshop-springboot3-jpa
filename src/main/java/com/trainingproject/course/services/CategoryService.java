package com.trainingproject.course.services;

import com.trainingproject.course.entities.Category;
import com.trainingproject.course.entities.User;
import com.trainingproject.course.repositories.CategoryRepository;
import com.trainingproject.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
