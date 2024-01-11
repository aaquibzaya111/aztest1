package com.mynobroker.repository;

import com.mynobroker.entity.OwnerPlan;
import com.mynobroker.payload.OwnerPlanDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerPlanRepo extends JpaRepository<OwnerPlan,Long> {

}
