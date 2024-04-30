package com.spring.demo.service;

import com.spring.demo.enities.TrainingCenter;
import com.spring.demo.repo.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {
    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter saveTrainingCenter(TrainingCenter center) {
        return repository.save(center);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
