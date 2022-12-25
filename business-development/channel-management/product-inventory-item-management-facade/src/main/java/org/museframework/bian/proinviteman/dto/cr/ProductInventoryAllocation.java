/*Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Product Inventory Item Management. 
Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.*/
package org.museframework.bian.proinviteman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ProductInventoryAllocation
@MetaDto
public class ProductInventoryAllocation {
    /*Maintains the distribution schedule for all managed product inventory items. This includes all past distribution records and future scheduled deliveries*/
    @MetaField(0)
    private String productInventoryAllocationServiceSchedule;

    /*The collection of product inventory items*/
    @MetaField(0)
    private String productInventoryHoldings;

    /*The type or category of product or service for which inventory items are held (e.g. specialized consumer loan, relocation services)*/
    @MetaField(0)
    private String productandServiceType;

    /*Reference to a specific type of product inventory item*/
    @MetaField(0)
    private String productInventoryItemType;

    /*Details about a product inventory type holding*/
    @MetaField(0)
    private String productInventoryItemRecord;

    /*Description of the inventory item used for selection/reference purposes*/
    @MetaField(0)
    private String productInventoryItemDescription;

    /*Details as to the supplier details for obtaining additional items when required (includes ordering details, volumes and frequency, pricing, delivery timelines etc.)*/
    @MetaField(0)
    private String productInventoryItemSupplierDetails;

    /*Details the locations where the inventory item is distributed to and the minimum and maximum holding amounts and inventory renewal cycles (used to trigger/schedule renewal deliveries)*/
    @MetaField(0)
    private String productInventoryUsedLocations;

    /*The current and projected holding and holding targets/limits by location - taking into account scheduled distribution plans*/
    @MetaField(0)
    private String productInventoryHolding;

    public void setProductInventoryAllocationServiceSchedule(String productInventoryAllocationServiceSchedule) {
        this.productInventoryAllocationServiceSchedule = productInventoryAllocationServiceSchedule;
    }

    public String getProductInventoryAllocationServiceSchedule() {
        return productInventoryAllocationServiceSchedule;
    }

    public void setProductInventoryHoldings(String productInventoryHoldings) {
        this.productInventoryHoldings = productInventoryHoldings;
    }

    public String getProductInventoryHoldings() {
        return productInventoryHoldings;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setProductInventoryItemType(String productInventoryItemType) {
        this.productInventoryItemType = productInventoryItemType;
    }

    public String getProductInventoryItemType() {
        return productInventoryItemType;
    }

    public void setProductInventoryItemRecord(String productInventoryItemRecord) {
        this.productInventoryItemRecord = productInventoryItemRecord;
    }

    public String getProductInventoryItemRecord() {
        return productInventoryItemRecord;
    }

    public void setProductInventoryItemDescription(String productInventoryItemDescription) {
        this.productInventoryItemDescription = productInventoryItemDescription;
    }

    public String getProductInventoryItemDescription() {
        return productInventoryItemDescription;
    }

    public void setProductInventoryItemSupplierDetails(String productInventoryItemSupplierDetails) {
        this.productInventoryItemSupplierDetails = productInventoryItemSupplierDetails;
    }

    public String getProductInventoryItemSupplierDetails() {
        return productInventoryItemSupplierDetails;
    }

    public void setProductInventoryUsedLocations(String productInventoryUsedLocations) {
        this.productInventoryUsedLocations = productInventoryUsedLocations;
    }

    public String getProductInventoryUsedLocations() {
        return productInventoryUsedLocations;
    }

    public void setProductInventoryHolding(String productInventoryHolding) {
        this.productInventoryHolding = productInventoryHolding;
    }

    public String getProductInventoryHolding() {
        return productInventoryHolding;
    }
}