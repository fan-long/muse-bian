/*Method used to authenticate an Entity

Reference:
https://www.iso20022.org/standardsrepository/type/AuthenticationMethodCode*/
package org.museframework.bian.enumerations;

public enum Authenticationmethodtypevalues {
    
/*On-line PIN authentication (Personal Identification Number).*/
	Onlinepin,
    
/*Off-line PIN authentication (Personal Identification Number).*/
	Offlinepin,
    
/*Electronic signature capture (handwritten signature).*/
	Signaturecapture,
    
/*Authentication by a password.*/
	Password,
    
/*Biometric authentication of the cardholder.*/
	Biometry,
    
/*Verification of Card Security Code.*/
	Cscverification,
    
/*Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram).*/
	Cryptogramverification,
    
/*Authentication method is performed unknown.*/
	Unknownmethod,
    
/*Authentication bypassed by the merchant.*/
	Bypass,
    
/*Handwritten paper signature.*/
	Papersignature,
    
/*Manual verification, for example passport or drivers license.*/
	Manualverification,
    
/*Merchant-related authentication.*/
	Merchantauthentication,
    
/*Electronic commerce transaction secured with the X.509 certificate of a customer.*/
	Securecertificate,
    
/*Secure electronic transaction without cardholder certificate.*/
	Securenocertificate,
    
/*Channel-encrypted transaction.*/
	Securedchannel,
    
/*Cardholder billing address verification.*/
	Billingaddressverification,
    
/*Cardholder data provided for verification, for instance social security number, driver license number, passport number.*/
	Cardholderidentificationdata,
    
/*Authentication based on statistical cardholder behaviour.*/
	Passiveauthentication,
    
/*Authentication performed during a secure electronic commerce transaction.*/
	Secureelectroniccommerce,
    
/*Cardholder shipping address verification.*/
	Shippingaddressverification,
    
/*Cryptogram generated by the token requestor or a customer device to validate the authorised use of a token.*/
	Tokenauthentication,
    
/*Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token.*/
	Paymenttoken,
    
/*A token is used to verify an already performed authentication.*/
	Authenticationtoken,
    
/*Customer mobile device.*/
	Mobile,
    
/*Other customer authentication.*/
	Other,
    
/*Digits of the address.*/
	Addressdigits,
    
/*Number assigned by a government agency to identify foreign nationals.*/
	Alienregistrationnumber,
    
/*Verification of a cryptogram generated by a chip card, for instance an ARQC (Authorisation Request Cryptogram).*/
	Arqcverification,
    
/*Date of birth of a person.*/
	Birthdate,
    
/*Name of cardholder*/
	Cardholdername,
    
/*City of birth to authenticate a person.*/
	Cityofbirth,
    
/*Customer number used as a mechanism of authentication.*/
	Customeridentification,
    
/*Identification of a driver in a fleet of vehicles.*/
	Driveridentification,
    
/*Number assigned by a driving license authority to a person driving a car.*/
	Driverlicensenumber,
    
/*Electronic mail address*/
	Email,
    
/*Number assigned to an employee by an employer.*/
	Employeeidentificationnumber,
    
/*Number assigned to an employer by a registration authority.*/
	Employeridentificationnumber,
    
/*Number assigned by a national authority to an identity card.*/
	Identitycardnumber,
    
/*Verification of a one-time password provided by the issuer.*/
	Onetimepassword,
    
/*Other cardholder data provided for identification.*/
	Othercardholderidentification,
    
/*Verification of a cryptogram generated by a non-card form factor.*/
	Othercryptogram,
    
/*Number assigned by a passport authority to a passport.*/
	Passportnumber,
    
/*Verification based on digits of the postal code.*/
	Postalcode,
    
/*Shipping address from verification.*/
	Shippingaddressfrom,
    
/*Shipping address to verification*/
	Shippingaddressto,
    
/*Verification whether the address corresponds to the cardholder's one.*/
	Cardholderaddress,
    
/*Non visible Card Security Code.*/
	Nonvisiblecsc,
    
/*Other type of verification defined at national level.*/
	Othernational,
    
/*Other type of verification defined at private level*/
	Otherprivate,
    
/*Place of birth of a person.*/
	Placeofbirth,
    
/*Number assigned by a social security agency.*/
	Socialsecuritynumber,
    
/*Number assigned by a tax authority to an entity.*/
	Taxidentificationnumber,
    
/*Account-based digital signature authentication.*/
	Accountdigitalsignature,
    
/*Response Card Cryptogram (ARPC)  verification.*/
	Arpcverification,
    
/*Application Transaction Counter*/
	ATC,
    
/*Biographics authentication in an offline mode.*/
	Offlinebiographics,
    
/*Biometrics authentication in an offline mode*/
	Offlinebiometrics,
    
/*Authentication of data in an offline mode*/
	Offlinedataauthentication,
    
/*Analysis of signature transmitted offline*/
	Offlinedigitisedsignatureanalysis,
    
/*PIN generated offline and transmitted encrypted*/
	Offlinepinencrypted,
    
/*PIN generated offline and transmitted in clear*/
	Offlinepininclear,
    
/*Biographics authentication in an online mode.*/
	Onlinebiographics,
    
/*Customer home phone number.*/
	Phonehome,
    
/*Customer work phone number*/
	Phonework,
    
/*PKI (Public Key Infrastructure) based digital signature*/
	Pkisignature,
    
/*QualifiedCertificate*/
	Qualifiedcertificate,
    
/*Authentication performed during a secure electronic commerce transaction.*/
	Threeds,
    
/*Serial number of the cardholder's certificate.*/
	Cardholdercertificateserialnumber,
    
/*Serial number of the acceptor's certificate.*/
	Acceptorcertificateserialnumber,
    
/*Nationally assigned identifier.*/
	Nationalidentifier;
}