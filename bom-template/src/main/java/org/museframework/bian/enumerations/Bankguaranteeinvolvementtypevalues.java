/**/
package org.museframework.bian.enumerations;

public enum Bankguaranteeinvolvementtypevalues {
    
/*The party that requests a bank guarantee from the bank and borrows from a creditor
*/
	Applicant,
    
/*The party that receives a partial guarantee*/
	Beneficiary,
    
/*The party that agrees to sign and assures payment in case the applicant fails to repay the loan

*/
	Bank,
    
/*Legal entity, other than the issuer, who gives a guarantee. The guarantor becomes liable in case of default.(ISO20022)*/
	Guarantor;
}