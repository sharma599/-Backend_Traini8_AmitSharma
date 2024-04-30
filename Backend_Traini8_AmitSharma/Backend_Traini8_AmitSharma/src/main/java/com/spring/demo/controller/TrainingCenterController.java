package com.spring.demo.controller;


import com.spring.demo.enities.TrainingCenter;
import com.spring.demo.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@RequestBody TrainingCenter center) {
        center.setCreatedOn(System.currentTimeMillis());
        TrainingCenter savedCenter = service.saveTrainingCenter(center);
        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = service.getAllTrainingCenters();
        return new ResponseEntity<>(centers.isEmpty() ? Collections.emptyList() : centers, HttpStatus.OK);
    }
}

