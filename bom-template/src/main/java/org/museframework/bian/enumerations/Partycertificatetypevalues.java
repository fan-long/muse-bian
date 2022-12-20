/*Identifies the type of certificate. ISO20022*/
package org.museframework.bian.enumerations;

public enum Partycertificatetypevalues {
    
/*Anti-money laundering certification form. (ISO20022)*/
	Antimoneylaunderingcertificate,
    
/**/
	Goodstandingcertificate,
    
/*Proof of the address, such as a utility bill.*/
	Proofofaddress,
    
/*Certification of due formation and organisation.*/
	Dueformationandorganisation,
    
/*Certificate of good standing.*/
	Goodstanding,
    
/*Letter of reference.*/
	Letterofreference,
    
/*Anti-money laundering certification form.*/
	Antimoneylaundering,
    
/*Certification of incumbency.*/
	Incumbency,
    
/*Government issued form of picture identification - passport.*/
	Passport,
    
/*Government issued form of picture identification - driving license.*/
	Drivinglicense,
    
/*Government issued form of picture identification - identity card.*/
	Identitycard,
    
/*Public key infrastructure certificate.*/
	Publickeyinfrastructurecertificate;
}