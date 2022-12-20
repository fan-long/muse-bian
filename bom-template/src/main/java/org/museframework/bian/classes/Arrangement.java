/*An agreed commitment to perform actions that meet obligations under an agreement*/
package org.museframework.bian.classes;

public class Arrangement {
    /**/
    private Action arrangementAction;

    /**/
    private String arrangementStartDate;

    /**/
    private String arrangementEndDate;

    /*A characteristic of arrangement which refers to the LifecycleStatus of arrangement (e.g., requested, proposed, offered, accepted, cancelled, terminated, fulfilled, etc.)*/
    private String arrangementStatus;

    /**/
    private Subject arrangementSubjectMatter;

    /**/
    private org.museframework.bian.enumerations.Arrangementtypevalues arrangementtype;

    public void setArrangementAction(Action arrangementAction) {
        this.arrangementAction = arrangementAction;
    }

    public Action getArrangementAction() {
        return arrangementAction;
    }

    public void setArrangementStartDate(String arrangementStartDate) {
        this.arrangementStartDate = arrangementStartDate;
    }

    public String getArrangementStartDate() {
        return arrangementStartDate;
    }

    public void setArrangementEndDate(String arrangementEndDate) {
        this.arrangementEndDate = arrangementEndDate;
    }

    public String getArrangementEndDate() {
        return arrangementEndDate;
    }

    public void setArrangementStatus(String arrangementStatus) {
        this.arrangementStatus = arrangementStatus;
    }

    public String getArrangementStatus() {
        return arrangementStatus;
    }

    public void setArrangementSubjectMatter(Subject arrangementSubjectMatter) {
        this.arrangementSubjectMatter = arrangementSubjectMatter;
    }

    public Subject getArrangementSubjectMatter() {
        return arrangementSubjectMatter;
    }

    public void setArrangementtype(org.museframework.bian.enumerations.Arrangementtypevalues arrangementtype) {
        this.arrangementtype = arrangementtype;
    }

    public org.museframework.bian.enumerations.Arrangementtypevalues getArrangementtype() {
        return arrangementtype;
    }
}