/**/
package org.museframework.bian.enumerations;

public enum Exchangeratetypevalues {
    
/*Exchange rate applied is the spot rate. (ISO20022)*/
	Spot,
    
/*Exchange rate applied is the market rate at the time of the sale (ISO20022)*/
	Sale,
    
/*Exchange rate applied is the rate agreed between the parties. (ISO20022)*/
	Agreed;
}