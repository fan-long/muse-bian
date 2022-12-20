/**/
package org.museframework.bian.enumerations;

public enum Paymentservicetypevalues {
    
/*A payment service allowing a payer to transfer fund to a beneficiary. (a proposed definition for BIAN BOM adapted from ECB)*/
	CreditTransferService,
    
/*A credit transfer service to make regular transfers on given dates to a named beneﬁciary. (a proposed definition for BIAN BOM adapted from ISO20022)*/
	StandingOrderService,
    
/*A payment service for debiting a payer's payment account, where a payment transaction is initiated by the payee on the basis of the payer's consent given to the payee, to the payee's payment service provider or to the payer's own payment service provider. (a proposed definition for BIAN BOM adapted from PSD)*/
	DirectDebitService,
    
/*A payment service to execute payment transactions through a payment card, including online payments. (a proposed definition for BIAN BOM adapted from PSD)*/
	CardPaymentService,
    
/*A payment service to take fund out of an account. (a proposed definition for BIAN BOM)*/
	WithdrawService,
    
/*A payment service to place funds into an account for safekeeping. (a proposed definition for BIAN BOM)*/
	DepositService,
    
/*A payment service that allows fund transfer even if there is no provision on the account. (a proposed definition for BIAN BOM)*/
	OverdraftService,
    
/*A payment service where funds are received from a payer, without any payment accounts being created in the name of the payer or the payee, for the sole purpose of transferring a corresponding amount to a payee or to another payment service provider acting on behalf of the payee, and/or where such funds are received on behalf of and made available to the payee. (a proposed definition for BIAN BOM adapted from PSD)*/
	MoneyRemittanceService,
    
/*A reporting service on payment transactions registered on an account. (a proposed definition for BIAN BOM)*/
	StatementService;
}