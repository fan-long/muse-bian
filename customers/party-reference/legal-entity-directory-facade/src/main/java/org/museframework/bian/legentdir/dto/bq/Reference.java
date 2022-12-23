/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.legentdir.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Reference {
    /*The registered name of the entity*/
    @MetaField
    private String legalEntityOfficialName;

    /*The type of legal entity (e.g. individual, Inc, Plc)*/
    @MetaField
    private String legalEntityType;

    /*The sectors of operation (e.g. finance, Asia)*/
    @MetaField
    private String sectorsofOperation;

    /*The registered address for the legal entity*/
    @MetaField
    private String registeredAddress;

    /*The location of the head office (and regional offices if appropriate)*/
    @MetaField
    private String headquartersLocation;

    /*The date of incorporation (or dates when subsidiaries involved)*/
    @MetaField
    private String dateofIncorporation;

    /*The jurisdiction governing the company*/
    @MetaField
    private String jurisdictionofIncorporation;

    /*The associated legal or registration authority*/
    @MetaField
    private String registrationAuthority;

    /*The primary, and additional regulators as appropriate*/
    @MetaField
    private String primaryRegulator;

    /*Reference identifier linking the entity to appropriate tax authority*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxReference;

    /*The bank's contact role or roles established to maintain the relationship with the bank (e.g. CEO)*/
    @MetaField
    private String contactRole;

    /*The address of the bank's contact's within the entity*/
    @MetaField
    private String contactAddressDetails;

    public void setLegalEntityOfficialName(String legalEntityOfficialName) {
        this.legalEntityOfficialName = legalEntityOfficialName;
    }

    public String getLegalEntityOfficialName() {
        return legalEntityOfficialName;
    }

    public void setLegalEntityType(String legalEntityType) {
        this.legalEntityType = legalEntityType;
    }

    public String getLegalEntityType() {
        return legalEntityType;
    }

    public void setSectorsofOperation(String sectorsofOperation) {
        this.sectorsofOperation = sectorsofOperation;
    }

    public String getSectorsofOperation() {
        return sectorsofOperation;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    public String getHeadquartersLocation() {
        return headquartersLocation;
    }

    public void setDateofIncorporation(String dateofIncorporation) {
        this.dateofIncorporation = dateofIncorporation;
    }

    public String getDateofIncorporation() {
        return dateofIncorporation;
    }

    public void setJurisdictionofIncorporation(String jurisdictionofIncorporation) {
        this.jurisdictionofIncorporation = jurisdictionofIncorporation;
    }

    public String getJurisdictionofIncorporation() {
        return jurisdictionofIncorporation;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public void setPrimaryRegulator(String primaryRegulator) {
        this.primaryRegulator = primaryRegulator;
    }

    public String getPrimaryRegulator() {
        return primaryRegulator;
    }

    public void setTaxReference(org.museframework.bian.classes.Object taxReference) {
        this.taxReference = taxReference;
    }

    public org.museframework.bian.classes.Object getTaxReference() {
        return taxReference;
    }

    public void setContactRole(String contactRole) {
        this.contactRole = contactRole;
    }

    public String getContactRole() {
        return contactRole;
    }

    public void setContactAddressDetails(String contactAddressDetails) {
        this.contactAddressDetails = contactAddressDetails;
    }

    public String getContactAddressDetails() {
        return contactAddressDetails;
    }
}