/**/
package org.museframework.bian.enumerations;

public enum Documentinvolvementtypevalues {
    
/*Party that captures a document.*/
	DocumentCapturer,
    
/*Party that issues a document. */
	DocumentIssuer,
    
/*Identification of the party who is responsible for the certificate. ISO20022*/
	DocumentResponsibleParty,
    
/*Person who binds himself or herself, or the entity he or she is authorized to represent, by his or her signature on the document. ISO20022*/
	DocumentSignatory,
    
/*Identifies the party that notifies the content of a document to a third party. ISO20022*/
	DocumentNotifyingParty,
    
/*Identification of the person who checked the document and/or the signature. ISO20022*/
	DocumentCheckingParty,
    
/*Identification of the person who validated the signature. ISO20022*/
	DocumentValidatingParty;
}