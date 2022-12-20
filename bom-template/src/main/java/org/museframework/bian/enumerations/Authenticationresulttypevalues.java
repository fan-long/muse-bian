/*Specifies the result of authentication done. 

Reference:
https://www.iso20022.org/standardsrepository/type/AuthenticationResultCode*/
package org.museframework.bian.enumerations;

public enum Authenticationresulttypevalues {
    
/*The authentication didn’t succeed.*/
	Denial,
    
/*The card does not participate in the authentication programme.*/
	Nonparticipation,
    
/*The authentication couldn’t be carried out.*/
	Unabletoauthenticate,
    
/*Merchant not enrolled in the authentication programme.*/
	Merchantnotenroled,
    
/*Authentication succeeded with a cryptogram.*/
	Withcryptogram,
    
/*Authentication succeeded without a cryptogram.*/
	Withoutcryptogram;
}