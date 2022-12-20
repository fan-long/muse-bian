/**/
package org.museframework.bian.enumerations;

public enum Quotestatusvalue {
    
/*Indicates that the quote is accepted for further negotiation.*/
	Accepted,
    
/*Indicates that all quotes are cancelled for a financial instrument's symbol.*/
	Cancelsymbol,
    
/*Indicates that all quotes are cancelled for a specific security.*/
	Cancelsecurity,
    
/*Indicates that all quotes are cancelled for an underlying financial instrument.*/
	Cancelunderlying,
    
/*Indicates that all quotes are cancelled.*/
	Cancelall,
    
/*Indicates that the quote is not accepted.*/
	Rejected,
    
/*Indicates that all quotes are removed from the market.*/
	Removedfrommarket,
    
/*Indicates that the quote is not valid anymore.*/
	Expired,
    
/*Indicates that the quote is being requested.*/
	Query,
    
/*Indicates that no quote can be computed or communicated.*/
	Quotenotfound,
    
/*Indicates that the quote is being processed.*/
	Pending,
    
/*Indicates that the counterparty is not interested in the transaction.*/
	Pass,
    
/*Warning due to a situation of locked market.*/
	Lockedmarketwarning,
    
/*Warning due to a situation of cross market.*/
	Crossmarketwarning,
    
/*Indicates that the quote is canceled due to a situation of locked market.*/
	Canceledduetolockmarket,
    
/*Indicates that the quote is canceled due to a situation of cross market.*/
	Canceledduetocrossmarket;
}