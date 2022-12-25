/*Maintain the terms and conditions that apply to a commercial relationship within Investment Portfolio Planning.


*/
package org.museframework.bian.invporpla.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ManagedInvestmentPortfolioAgreement {
    /*Reference to the associated customer for the investment portfolio*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the legal entity that is the subject of the agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object legalEntityReference;

    /*Reference to the investment portfolio record of all holdings governed by this agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object investmentPortfolioInstanceReference;

    /*The type of investment portfolio agreement (e.g. discretionary, trust )*/
    @MetaField(0)
    private String investmentPortfolioAgreementType;

    /*The contractual jurisdiction or coverage of the investment portfolio agreement (e.g. "governed by State")*/
    @MetaField(0)
    private String investmentPortfolioAgreementJurisdiction;

    /*The term of the agreement*/
    @MetaField(0)
    private String investmentPortfolioAgreementValidFromToDate;

    /*Reference to signatories*/
    @MetaField(0)
    private String investmentPortfolioAgreementSignatoriesResponsibleParties;

    /*Reference to any associated documents, (e.g. signed agreement document, disclosures)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Reference to the customer master agreement that governs the product agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerAgreementInstanceReference;

    /*Reference to KYC/Regulatory assessments maintained by the Party Life-Cycle Management Service Domain*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object partyRelationshipProcedureInstanceReference;

    /*The consolidated view of all of the constituent investment policy terms and conditions in any suitable format*/
    @MetaField(0)
    private String managedInvestmentPortfolioAgreement;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setLegalEntityReference(org.museframework.bian.classes.Object legalEntityReference) {
        this.legalEntityReference = legalEntityReference;
    }

    public org.museframework.bian.classes.Object getLegalEntityReference() {
        return legalEntityReference;
    }

    public void setInvestmentPortfolioInstanceReference(org.museframework.bian.classes.Object investmentPortfolioInstanceReference) {
        this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
    }

    public org.museframework.bian.classes.Object getInvestmentPortfolioInstanceReference() {
        return investmentPortfolioInstanceReference;
    }

    public void setInvestmentPortfolioAgreementType(String investmentPortfolioAgreementType) {
        this.investmentPortfolioAgreementType = investmentPortfolioAgreementType;
    }

    public String getInvestmentPortfolioAgreementType() {
        return investmentPortfolioAgreementType;
    }

    public void setInvestmentPortfolioAgreementJurisdiction(String investmentPortfolioAgreementJurisdiction) {
        this.investmentPortfolioAgreementJurisdiction = investmentPortfolioAgreementJurisdiction;
    }

    public String getInvestmentPortfolioAgreementJurisdiction() {
        return investmentPortfolioAgreementJurisdiction;
    }

    public void setInvestmentPortfolioAgreementValidFromToDate(String investmentPortfolioAgreementValidFromToDate) {
        this.investmentPortfolioAgreementValidFromToDate = investmentPortfolioAgreementValidFromToDate;
    }

    public String getInvestmentPortfolioAgreementValidFromToDate() {
        return investmentPortfolioAgreementValidFromToDate;
    }

    public void setInvestmentPortfolioAgreementSignatoriesResponsibleParties(String investmentPortfolioAgreementSignatoriesResponsibleParties) {
        this.investmentPortfolioAgreementSignatoriesResponsibleParties = investmentPortfolioAgreementSignatoriesResponsibleParties;
    }

    public String getInvestmentPortfolioAgreementSignatoriesResponsibleParties() {
        return investmentPortfolioAgreementSignatoriesResponsibleParties;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCustomerAgreementInstanceReference(org.museframework.bian.classes.Object customerAgreementInstanceReference) {
        this.customerAgreementInstanceReference = customerAgreementInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerAgreementInstanceReference() {
        return customerAgreementInstanceReference;
    }

    public void setPartyRelationshipProcedureInstanceReference(org.museframework.bian.classes.Object partyRelationshipProcedureInstanceReference) {
        this.partyRelationshipProcedureInstanceReference = partyRelationshipProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getPartyRelationshipProcedureInstanceReference() {
        return partyRelationshipProcedureInstanceReference;
    }

    public void setManagedInvestmentPortfolioAgreement(String managedInvestmentPortfolioAgreement) {
        this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
    }

    public String getManagedInvestmentPortfolioAgreement() {
        return managedInvestmentPortfolioAgreement;
    }
}