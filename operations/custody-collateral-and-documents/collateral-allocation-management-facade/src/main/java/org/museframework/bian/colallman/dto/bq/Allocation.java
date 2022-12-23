/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.colallman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Allocation extends org.museframework.bian.classes.Allocation {
    /*Defines  the requested action (e.g. earmark for future allocation, allocate or recall an allocation of a collateral asset)*/
    @MetaField
    private String requestedAllocationRequestType;

    /*Reference to the product to which the collateral is allocated*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to a offer process during which the collateral allocation is defined and agreed*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerOfferReference;

    /*Applies for initial earmarking of collateral during an offer process*/
    @MetaField
    private String collateralEarmarkAmount;

    /*Time for which the earmarking is enforced*/
    @MetaField
    private String collateralEarmarkDuration;

    /*The amount of the overall asset value that is allocated in this instance*/
    @MetaField
    private String collateralAllocationAmount;

    /*The intended duration of the allocation (can be finite or open ended)*/
    @MetaField
    private String collateralAllocationDuration;

    /*Applies when part or all of the allocation is recalled (e.g. due to revaluation of the asset)*/
    @MetaField
    private String collateralAllocationRecallAmount;

    /*The schedule for processing allocation recall*/
    @MetaField
    private String collateralAllocationRecallTimetable;

    /*The result of the allocation recall*/
    @MetaField
    private String collateralAllocationRecallResult;

    /*State of the allocation as there can be different states for the allocation of a single asset to several products*/
    @MetaField
    private String collateralAssetAllocationState;

    /*Record of the workstep and result of the allocation process*/
    @MetaField
    private String collateralAllocationRequestResult;

    public void setRequestedAllocationRequestType(String requestedAllocationRequestType) {
        this.requestedAllocationRequestType = requestedAllocationRequestType;
    }

    public String getRequestedAllocationRequestType() {
        return requestedAllocationRequestType;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerOfferReference(org.museframework.bian.classes.Object customerOfferReference) {
        this.customerOfferReference = customerOfferReference;
    }

    public org.museframework.bian.classes.Object getCustomerOfferReference() {
        return customerOfferReference;
    }

    public void setCollateralEarmarkAmount(String collateralEarmarkAmount) {
        this.collateralEarmarkAmount = collateralEarmarkAmount;
    }

    public String getCollateralEarmarkAmount() {
        return collateralEarmarkAmount;
    }

    public void setCollateralEarmarkDuration(String collateralEarmarkDuration) {
        this.collateralEarmarkDuration = collateralEarmarkDuration;
    }

    public String getCollateralEarmarkDuration() {
        return collateralEarmarkDuration;
    }

    public void setCollateralAllocationAmount(String collateralAllocationAmount) {
        this.collateralAllocationAmount = collateralAllocationAmount;
    }

    public String getCollateralAllocationAmount() {
        return collateralAllocationAmount;
    }

    public void setCollateralAllocationDuration(String collateralAllocationDuration) {
        this.collateralAllocationDuration = collateralAllocationDuration;
    }

    public String getCollateralAllocationDuration() {
        return collateralAllocationDuration;
    }

    public void setCollateralAllocationRecallAmount(String collateralAllocationRecallAmount) {
        this.collateralAllocationRecallAmount = collateralAllocationRecallAmount;
    }

    public String getCollateralAllocationRecallAmount() {
        return collateralAllocationRecallAmount;
    }

    public void setCollateralAllocationRecallTimetable(String collateralAllocationRecallTimetable) {
        this.collateralAllocationRecallTimetable = collateralAllocationRecallTimetable;
    }

    public String getCollateralAllocationRecallTimetable() {
        return collateralAllocationRecallTimetable;
    }

    public void setCollateralAllocationRecallResult(String collateralAllocationRecallResult) {
        this.collateralAllocationRecallResult = collateralAllocationRecallResult;
    }

    public String getCollateralAllocationRecallResult() {
        return collateralAllocationRecallResult;
    }

    public void setCollateralAssetAllocationState(String collateralAssetAllocationState) {
        this.collateralAssetAllocationState = collateralAssetAllocationState;
    }

    public String getCollateralAssetAllocationState() {
        return collateralAssetAllocationState;
    }

    public void setCollateralAllocationRequestResult(String collateralAllocationRequestResult) {
        this.collateralAllocationRequestResult = collateralAllocationRequestResult;
    }

    public String getCollateralAllocationRequestResult() {
        return collateralAllocationRequestResult;
    }
}