package com.mynobroker.service.impl;
import com.mynobroker.entity.OwnerPlan;
import com.mynobroker.payload.OwnerPlanDto;
import com.mynobroker.repository.OwnerPlanRepo;
import com.mynobroker.service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class OwnerPlanServiceImpl implements OwnerPlanService {
    private OwnerPlanRepo ownerPlanRepository;
    private ModelMapper modelMapper;
    public OwnerPlanServiceImpl(OwnerPlanRepo ownerPlanRepository, ModelMapper modelMapper){
        this.ownerPlanRepository=ownerPlanRepository;
        this.modelMapper = modelMapper;
    }
    OwnerPlan mapToEntity(OwnerPlanDto ownerPlanDto){
        OwnerPlan ownerPlan =modelMapper.map(ownerPlanDto,OwnerPlan.class);
        return ownerPlan;
    }
    OwnerPlanDto mapToDto(OwnerPlan ownerPlan){
        OwnerPlanDto ownerPlanDto=modelMapper.map(ownerPlan, OwnerPlanDto.class);
        return ownerPlanDto;
    }

    @Override
    public OwnerPlanDto createOwnerPlan(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = mapToEntity(ownerPlanDto);
        OwnerPlan saveOwnerPlan = ownerPlanRepository.save(ownerPlan);
        return mapToDto(saveOwnerPlan);
    }

    @Override
    public List<OwnerPlanDto> getOwnerPlan() {

        List<OwnerPlan> ownerPlans=ownerPlanRepository.findAll();
        List<OwnerPlanDto> plans=ownerPlans.stream().map(plan->mapToDto(plan)).collect(Collectors.toList());
        return plans;
    }
}
