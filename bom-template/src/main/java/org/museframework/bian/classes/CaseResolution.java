/*Outcome of the investigation 

Synonym= Dispute Resolution

A process for resolving differences between two or more parties or groups. In business practice the resolution seeks to achieve fairness for all participants, and is often moderated by a third party. There is often a dispute resolution clause in contracts that defines how a disagreement is to be resolved. (Business Dictionary)

dispute resolution. BusinessDictionary.com. Retrieved August 22, 2019, from BusinessDictionary.com website: http://www.businessdictionary.com/definition/dispute-resolution.html


Specifies the actions taken as a result of an investigation. (ISO20022)


*/
package org.museframework.bian.classes;

public class CaseResolution {
    /**/
    private String resolutionSchedule;

    /*The type of resolution (e.g. success, deferred, rejected)*/
    private String resolutionType;

    /*Description of the resolution of the investigation case*/
    private String description;

    public void setResolutionSchedule(String resolutionSchedule) {
        this.resolutionSchedule = resolutionSchedule;
    }

    public String getResolutionSchedule() {
        return resolutionSchedule;
    }

    public void setResolutionType(String resolutionType) {
        this.resolutionType = resolutionType;
    }

    public String getResolutionType() {
        return resolutionType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}