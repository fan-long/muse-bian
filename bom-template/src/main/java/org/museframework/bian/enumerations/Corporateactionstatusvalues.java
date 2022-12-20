/**/
package org.museframework.bian.enumerations;

public enum Corporateactionstatusvalues {
    
/*The CA event is active. (ISO20022)*/
	Active,
    
/*The CA event is deactivated. The clients cannot send instruction anymore. (ISO20022)*/
	Deactivated,
    
/*The CA event is expired, no more processing, claims, transformations take place. (ISO20022)*/
	Expired,
    
/*The CA event is cancelled. (ISO20022)*/
	Cancelled,
    
/*The CA event is withrawn, ie, cancelled by the market. (ISO20022)*/
	Withdrawn,
    
/*Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option. (ISO20022)*/
	Inactive;
}