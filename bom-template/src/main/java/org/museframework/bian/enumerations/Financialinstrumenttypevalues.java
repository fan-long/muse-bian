/**/
package org.museframework.bian.enumerations;

public enum Financialinstrumenttypevalues {
    
/**/
	Loan,
    
/**/
	Bond,
    
/**/
	Deposit,
    
/**/
	Stock,
    
/**/
	Option,
    
/**/
	Share,
    
/*Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified. (ISO20022)

Any type of instrument primarily classified as debt can be considered a debt instrument. Debt instruments are tools an individual, government entity, or business entity can utilize for the purpose of obtaining capital. Debt instruments provide capital to an entity that promises to repay the capital over time. Credit cards, credit lines, loans, and bonds can all be types of debt instruments. (Investopedia)*/
	Debt,
    
/*Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking. (ISO20022)*/
	Letterofcredit,
    
/*Financial instruments representing a sum of rights of the investor vis-a-vis the issuer. (ISO20022)*/
	Security,
    
/**/
	Derivative;
}