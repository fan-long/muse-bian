/*A balance of recorded assets and/or liabilities of an organization. 

Financial position is the current balances of the recorded assets, liabilities, and equity of an organization. 
https://www.accountingtools.com/articles/2017/5/10/financial-position

The status of the assets, liabilities, and owners' equity (and their interrelationships) of an organization, as reflected in its financial statements.
Read more: http://www.businessdictionary.com/definition/financial-position.html

*/
package org.museframework.bian.classes;

public class FinancialPosition {
    /*The type of position being monitored (e.g. consolidated customer exposure, geographic/sector exposure)*/
    private String positionType;

    /*The customer or customer type associated with the position if applicable.*/
    private String positionCustomerReference;

    /*The sector or segment associated with the position if applicable.*/
    private String positionSector;

    /*The product type or specific product associated with the position if applicable.*/
    private String positionProductType;

    /**/
    private String positionDefinition;

    /*Thresholds limits associated with the position.*/
    private String positionThresholds;

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionCustomerReference(String positionCustomerReference) {
        this.positionCustomerReference = positionCustomerReference;
    }

    public String getPositionCustomerReference() {
        return positionCustomerReference;
    }

    public void setPositionSector(String positionSector) {
        this.positionSector = positionSector;
    }

    public String getPositionSector() {
        return positionSector;
    }

    public void setPositionProductType(String positionProductType) {
        this.positionProductType = positionProductType;
    }

    public String getPositionProductType() {
        return positionProductType;
    }

    public void setPositionDefinition(String positionDefinition) {
        this.positionDefinition = positionDefinition;
    }

    public String getPositionDefinition() {
        return positionDefinition;
    }

    public void setPositionThresholds(String positionThresholds) {
        this.positionThresholds = positionThresholds;
    }

    public String getPositionThresholds() {
        return positionThresholds;
    }
}