/**/
package org.museframework.bian.enumerations;

public enum Casestatusvalues {
    
/*Case has been closed. (ISO20022)*/
	Closed,
    
/*Case has been assigned to another party. (ISO20022)*/
	Assigned,
    
/*Case is currently under investigation. (ISO20022)*/
	UnderInvestigation,
    
/*Case has never been assigned before. (ISO20022)*/
	Unknown,
    
/*Investigation is taking too long. (ISO20022)*/
	Overdue;
}