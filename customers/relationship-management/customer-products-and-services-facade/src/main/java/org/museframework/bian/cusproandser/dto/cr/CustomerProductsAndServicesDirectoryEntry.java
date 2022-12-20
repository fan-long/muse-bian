/*Capture and maintain reference information about some type of entitity within Customer Products and Services.*/
package org.museframework.bian.cusproandser.dto.cr;

public class CustomerProductsAndServicesDirectoryEntry extends org.museframework.bian.classes.CustomerProductsAndServicesDirectoryEntry {
    /*Documentation of Customer Products And Services Directory Entry*/
    private String customerProductsAndServicesDirectoryEntryDescription;

    /*The timetable to capture and maintain Customer Products And Services Directory Entry*/
    private String customerProductsAndServicesDirectoryEntrySchedule;

    /*The version of Customer Products And Services Directory Entry*/
    private String customerProductsAndServicesDirectoryEntryVersion;

    /*The status of Customer Products And Services Directory Entry*/
    private String customerProductsAndServicesDirectoryEntryStatus;

    /*Reference to the log of (usage) ativities/events  of Customer Products And Services Directory Entry*/
    private org.museframework.bian.classes.Log customerProductsAndServicesDirectoryEntryUsageLog;

    /*Reference to the log of (update) ativities/events of Customer Products And Services Directory Entry*/
    private org.museframework.bian.classes.Log customerProductsAndServicesDirectoryEntryUpdateLog;

    /*The configuration of Customer Products And Services Directory Entry*/
    private String customerProductsAndServicesDirectoryEntryServiceConfiguration;

    /*An unique reference to an item or an occurrence of Customer Products And Services Directory Entry*/
    private org.museframework.bian.classes.DirectoryEntry customerProductsAndServicesDirectoryEntryReference;

    /**/
    private String customerReference;

    /**/
    private org.museframework.bian.classes.BankingProduct productReference;

    /**/
    private org.museframework.bian.classes.ProductSalesAgreement productSalesAgreementReference;

    public void setCustomerProductsAndServicesDirectoryEntryDescription(String customerProductsAndServicesDirectoryEntryDescription) {
        this.customerProductsAndServicesDirectoryEntryDescription = customerProductsAndServicesDirectoryEntryDescription;
    }

    public String getCustomerProductsAndServicesDirectoryEntryDescription() {
        return customerProductsAndServicesDirectoryEntryDescription;
    }

    public void setCustomerProductsAndServicesDirectoryEntrySchedule(String customerProductsAndServicesDirectoryEntrySchedule) {
        this.customerProductsAndServicesDirectoryEntrySchedule = customerProductsAndServicesDirectoryEntrySchedule;
    }

    public String getCustomerProductsAndServicesDirectoryEntrySchedule() {
        return customerProductsAndServicesDirectoryEntrySchedule;
    }

    public void setCustomerProductsAndServicesDirectoryEntryVersion(String customerProductsAndServicesDirectoryEntryVersion) {
        this.customerProductsAndServicesDirectoryEntryVersion = customerProductsAndServicesDirectoryEntryVersion;
    }

    public String getCustomerProductsAndServicesDirectoryEntryVersion() {
        return customerProductsAndServicesDirectoryEntryVersion;
    }

    public void setCustomerProductsAndServicesDirectoryEntryStatus(String customerProductsAndServicesDirectoryEntryStatus) {
        this.customerProductsAndServicesDirectoryEntryStatus = customerProductsAndServicesDirectoryEntryStatus;
    }

    public String getCustomerProductsAndServicesDirectoryEntryStatus() {
        return customerProductsAndServicesDirectoryEntryStatus;
    }

    public void setCustomerProductsAndServicesDirectoryEntryUsageLog(org.museframework.bian.classes.Log customerProductsAndServicesDirectoryEntryUsageLog) {
        this.customerProductsAndServicesDirectoryEntryUsageLog = customerProductsAndServicesDirectoryEntryUsageLog;
    }

    public org.museframework.bian.classes.Log getCustomerProductsAndServicesDirectoryEntryUsageLog() {
        return customerProductsAndServicesDirectoryEntryUsageLog;
    }

    public void setCustomerProductsAndServicesDirectoryEntryUpdateLog(org.museframework.bian.classes.Log customerProductsAndServicesDirectoryEntryUpdateLog) {
        this.customerProductsAndServicesDirectoryEntryUpdateLog = customerProductsAndServicesDirectoryEntryUpdateLog;
    }

    public org.museframework.bian.classes.Log getCustomerProductsAndServicesDirectoryEntryUpdateLog() {
        return customerProductsAndServicesDirectoryEntryUpdateLog;
    }

    public void setCustomerProductsAndServicesDirectoryEntryServiceConfiguration(String customerProductsAndServicesDirectoryEntryServiceConfiguration) {
        this.customerProductsAndServicesDirectoryEntryServiceConfiguration = customerProductsAndServicesDirectoryEntryServiceConfiguration;
    }

    public String getCustomerProductsAndServicesDirectoryEntryServiceConfiguration() {
        return customerProductsAndServicesDirectoryEntryServiceConfiguration;
    }

    public void setCustomerProductsAndServicesDirectoryEntryReference(org.museframework.bian.classes.DirectoryEntry customerProductsAndServicesDirectoryEntryReference) {
        this.customerProductsAndServicesDirectoryEntryReference = customerProductsAndServicesDirectoryEntryReference;
    }

    public org.museframework.bian.classes.DirectoryEntry getCustomerProductsAndServicesDirectoryEntryReference() {
        return customerProductsAndServicesDirectoryEntryReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public String getCustomerReference() {
        return customerReference;
    }

    public void setProductReference(org.museframework.bian.classes.BankingProduct productReference) {
        this.productReference = productReference;
    }

    public org.museframework.bian.classes.BankingProduct getProductReference() {
        return productReference;
    }

    public void setProductSalesAgreementReference(org.museframework.bian.classes.ProductSalesAgreement productSalesAgreementReference) {
        this.productSalesAgreementReference = productSalesAgreementReference;
    }

    public org.museframework.bian.classes.ProductSalesAgreement getProductSalesAgreementReference() {
        return productSalesAgreementReference;
    }
}