/**/
package org.museframework.bian.corcuracc.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountLien {
    /*The type of lien (e.g. final, pending)*/
    @MetaField
    private String lienType;

    /*Definition of the type of lien including processing guidelines*/
    @MetaField
    private String lienDefinition;

    /*The processing option applied to the lien*/
    @MetaField
    private String lienProcessingOption;

    /*The collection of applicable rates*/
    @MetaField
    private String lienRecord;

    /*The party requesting the lien*/
    @MetaField
    private String lienOriginator;

    /*The purpose or associated facility linked to the lien*/
    @MetaField
    private String lienPurpose;

    /*The amount being blocked*/
    @MetaField
    private String lienAmount;

    /*The date the lien is enforced*/
    @MetaField
    private String lienStartDate;

    /*The date the lien is removed*/
    @MetaField
    private String lienExpiryDate;

    /*The status on the lien*/
    @MetaField
    private String lienStatus;

    public void setLienType(String lienType) {
        this.lienType = lienType;
    }

    public String getLienType() {
        return lienType;
    }

    public void setLienDefinition(String lienDefinition) {
        this.lienDefinition = lienDefinition;
    }

    public String getLienDefinition() {
        return lienDefinition;
    }

    public void setLienProcessingOption(String lienProcessingOption) {
        this.lienProcessingOption = lienProcessingOption;
    }

    public String getLienProcessingOption() {
        return lienProcessingOption;
    }

    public void setLienRecord(String lienRecord) {
        this.lienRecord = lienRecord;
    }

    public String getLienRecord() {
        return lienRecord;
    }

    public void setLienOriginator(String lienOriginator) {
        this.lienOriginator = lienOriginator;
    }

    public String getLienOriginator() {
        return lienOriginator;
    }

    public void setLienPurpose(String lienPurpose) {
        this.lienPurpose = lienPurpose;
    }

    public String getLienPurpose() {
        return lienPurpose;
    }

    public void setLienAmount(String lienAmount) {
        this.lienAmount = lienAmount;
    }

    public String getLienAmount() {
        return lienAmount;
    }

    public void setLienStartDate(String lienStartDate) {
        this.lienStartDate = lienStartDate;
    }

    public String getLienStartDate() {
        return lienStartDate;
    }

    public void setLienExpiryDate(String lienExpiryDate) {
        this.lienExpiryDate = lienExpiryDate;
    }

    public String getLienExpiryDate() {
        return lienExpiryDate;
    }

    public void setLienStatus(String lienStatus) {
        this.lienStatus = lienStatus;
    }

    public String getLienStatus() {
        return lienStatus;
    }
}