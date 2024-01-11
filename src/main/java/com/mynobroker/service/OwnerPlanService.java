package com.mynobroker.service;

import com.mynobroker.payload.OwnerPlanDto;

import java.util.List;

public interface OwnerPlanService {

    /**
     * Creates an owner plan.
     *
     * @param ownerPlanDto The DTO representing the owner plan to be created.
     * @return The created owner plan DTO.
     */
    OwnerPlanDto createOwnerPlan(OwnerPlanDto ownerPlanDto);

    List<OwnerPlanDto> getOwnerPlan();
}
