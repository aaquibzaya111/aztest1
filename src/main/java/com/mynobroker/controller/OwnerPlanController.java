package com.mynobroker.controller;

import com.mynobroker.payload.OwnerPlanDto;
import com.mynobroker.service.OwnerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownerPlan")
public class OwnerPlanController {
    @Autowired
    private OwnerPlanService ownerPlanService;
@PostMapping
    public ResponseEntity<OwnerPlanDto> createOwnerPlan(@RequestBody OwnerPlanDto ownerPlanDto){
        OwnerPlanDto dto=ownerPlanService.createOwnerPlan(ownerPlanDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<OwnerPlanDto>> getOwnerPlans(){

        List<OwnerPlanDto> ownerPlan = ownerPlanService.getOwnerPlan();
        return new ResponseEntity<>(ownerPlan,HttpStatus.OK);
    }

}
