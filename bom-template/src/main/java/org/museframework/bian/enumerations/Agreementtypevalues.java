/*A list of values which specifies the category of agreement. Agreement type is very often referred to product. But, the term product does not cover all kinds of agreements. An Agreement can be subtyped from the perspective of various aspects of interest. One can classify the agreement from the perspective of format type (e.g., verbal agreement, written agreement). Other one can classify agreement based on duration like short-term agreement or long-term agreement.

An Agreement can be subtyped from the perspective of various aspects of interest. One can classify the agreement from the perspective of format type (e.g., verbal agreement, written agreement). Another one can classify the same agreement from the perspective of the main subject (e.g., resource agreement, party agreement, product agreement) of agreement and still another one may be interested in a classification according to the type of transaction (e.g., purchase agreement, sale agreement, maintenance agreement), or a combination of these (e.g. resource maintenance agreement). These subtypes are not mutual exclusive. This means that one and the same Agreement can be classified into one or more classifications.*/
package org.museframework.bian.enumerations;

public enum Agreementtypevalues {
    
/**/
	CustomerAgreement,
    
/**/
	SupplierAgreement,
    
/**/
	BrokerAgreement,
    
/**/
	SalesAgreement,
    
/**/
	PurchaseAgreement,
    
/**/
	MaintenanceAgreement,
    
/**/
	ProductAgreement,
    
/**/
	ProductSalesAgreement,
    
/**/
	ResourceAgreement;
}