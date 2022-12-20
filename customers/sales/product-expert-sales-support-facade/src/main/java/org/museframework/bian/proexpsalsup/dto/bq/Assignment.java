/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.proexpsalsup.dto.bq;

public class Assignment {
    /*Defines the type of assignment (e.g. in person, phone conference)*/
    private String salesSpecialistSupportAssignmentRequestType;

    /*Contains details of the product specialist support request, in particular the product or service of interest and the specific topics to be covered*/
    private String salesSpecialistSupportAssignmentRequestRecord;

    /*File of any meeting notes, work products and administrative documentation generated during the assignment*/
    private String salesSpecialistSupportAssignmentSessionWorkProducts;

    /*The location of the customer interaction (e.g. branch, phone, customer site)*/
    private String salesSpecialistSupportAssignmentLocation;

    /*Details of time and expenses booked and fees associated with the assignment and if appropriate reference to charges made to the customer*/
    private String salesSpecialistSupportAssignmentFee;

    /*The result of the customer interaction, including any suggested follow-up tasks*/
    private String salesSpecialistSupportAssignmentResult;

    /*Key dates associated with the assignment (e.g. booking date, confirmation date, execution date, follow-up/evaluation date)*/
    private String dateType;

    /*Value of the specific date type*/
    private String date;

    public void setSalesSpecialistSupportAssignmentRequestType(String salesSpecialistSupportAssignmentRequestType) {
        this.salesSpecialistSupportAssignmentRequestType = salesSpecialistSupportAssignmentRequestType;
    }

    public String getSalesSpecialistSupportAssignmentRequestType() {
        return salesSpecialistSupportAssignmentRequestType;
    }

    public void setSalesSpecialistSupportAssignmentRequestRecord(String salesSpecialistSupportAssignmentRequestRecord) {
        this.salesSpecialistSupportAssignmentRequestRecord = salesSpecialistSupportAssignmentRequestRecord;
    }

    public String getSalesSpecialistSupportAssignmentRequestRecord() {
        return salesSpecialistSupportAssignmentRequestRecord;
    }

    public void setSalesSpecialistSupportAssignmentSessionWorkProducts(String salesSpecialistSupportAssignmentSessionWorkProducts) {
        this.salesSpecialistSupportAssignmentSessionWorkProducts = salesSpecialistSupportAssignmentSessionWorkProducts;
    }

    public String getSalesSpecialistSupportAssignmentSessionWorkProducts() {
        return salesSpecialistSupportAssignmentSessionWorkProducts;
    }

    public void setSalesSpecialistSupportAssignmentLocation(String salesSpecialistSupportAssignmentLocation) {
        this.salesSpecialistSupportAssignmentLocation = salesSpecialistSupportAssignmentLocation;
    }

    public String getSalesSpecialistSupportAssignmentLocation() {
        return salesSpecialistSupportAssignmentLocation;
    }

    public void setSalesSpecialistSupportAssignmentFee(String salesSpecialistSupportAssignmentFee) {
        this.salesSpecialistSupportAssignmentFee = salesSpecialistSupportAssignmentFee;
    }

    public String getSalesSpecialistSupportAssignmentFee() {
        return salesSpecialistSupportAssignmentFee;
    }

    public void setSalesSpecialistSupportAssignmentResult(String salesSpecialistSupportAssignmentResult) {
        this.salesSpecialistSupportAssignmentResult = salesSpecialistSupportAssignmentResult;
    }

    public String getSalesSpecialistSupportAssignmentResult() {
        return salesSpecialistSupportAssignmentResult;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}