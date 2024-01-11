package com.mynobroker.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OwnerPlanDto
{
    private long planId;

    private String planName;

    private double price;

    private int planValidity;

    private boolean relationshipManager;
 boolean rentalAgreement;

    private boolean propertyPromotion;
    private boolean guranteedTenants;

    private boolean showingProperty;
    private boolean  fbMarketingProperty;


}
