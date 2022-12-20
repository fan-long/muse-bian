/*Specifies the clearing channel for the routing of the transaction, as part of the payment type identification. ISO20022*/
package org.museframework.bian.enumerations;

public enum Clearingchanneltypevalues {
    
/*Clearing channel is a real-time gross settlement system.*/
	Realtimegrosssettlementsystem,
    
/*Clearing channel is a real-time net settlement system.*/
	Realtimenetsettlementsystem,
    
/*Clearing channel is a mass payment net settlement system.*/
	Masspaymentnetsystem,
    
/*Payment through internal book transfer.*/
	Booktransfer;
}