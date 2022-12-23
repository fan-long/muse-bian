/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.interactivehelp.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class HelpServiceSelection {
    /*The type of session provides context for filtering content (e.g. employee, self-service customer)*/
    @MetaField
    private String helpSelectionInteractionType;

    /*The type of product or service that is in context for the help request*/
    @MetaField
    private String helpSelectionProductandServiceType;

    /*The specific product feature being accessed at the time of the help request*/
    @MetaField
    private String helpSelectionProductFeatureType;

    /*The session dialogue log of actions during the contact to this point can be mined for key words that might improve the help selection*/
    @MetaField
    private String sessionDialogueRecord;

    /*An interactive exchange can be supported where the service presents a menu of selection options or key words to narrow the search*/
    @MetaField
    private String helpSelectionKeyWordMenu;

    /*The selected keyword or menu option*/
    @MetaField
    private String helpSelectionKeyWordSelection;

    /*The returned interactive help in any suitable form*/
    @MetaField
    private String interactiveHelp;

    /*The user provided result of the interactive help service, including interaction statistics such as exchange frequency and duration*/
    @MetaField
    private String helpSelectionTaskResult;

    /*User provided commentary on the service provided*/
    @MetaField
    private String helpSelectionFeedback;

    /*Reference to the employee, business unit providing service feedback*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The date, time (and duration) of the service usage*/
    @MetaField
    private String dateTime;

    public void setHelpSelectionInteractionType(String helpSelectionInteractionType) {
        this.helpSelectionInteractionType = helpSelectionInteractionType;
    }

    public String getHelpSelectionInteractionType() {
        return helpSelectionInteractionType;
    }

    public void setHelpSelectionProductandServiceType(String helpSelectionProductandServiceType) {
        this.helpSelectionProductandServiceType = helpSelectionProductandServiceType;
    }

    public String getHelpSelectionProductandServiceType() {
        return helpSelectionProductandServiceType;
    }

    public void setHelpSelectionProductFeatureType(String helpSelectionProductFeatureType) {
        this.helpSelectionProductFeatureType = helpSelectionProductFeatureType;
    }

    public String getHelpSelectionProductFeatureType() {
        return helpSelectionProductFeatureType;
    }

    public void setSessionDialogueRecord(String sessionDialogueRecord) {
        this.sessionDialogueRecord = sessionDialogueRecord;
    }

    public String getSessionDialogueRecord() {
        return sessionDialogueRecord;
    }

    public void setHelpSelectionKeyWordMenu(String helpSelectionKeyWordMenu) {
        this.helpSelectionKeyWordMenu = helpSelectionKeyWordMenu;
    }

    public String getHelpSelectionKeyWordMenu() {
        return helpSelectionKeyWordMenu;
    }

    public void setHelpSelectionKeyWordSelection(String helpSelectionKeyWordSelection) {
        this.helpSelectionKeyWordSelection = helpSelectionKeyWordSelection;
    }

    public String getHelpSelectionKeyWordSelection() {
        return helpSelectionKeyWordSelection;
    }

    public void setInteractiveHelp(String interactiveHelp) {
        this.interactiveHelp = interactiveHelp;
    }

    public String getInteractiveHelp() {
        return interactiveHelp;
    }

    public void setHelpSelectionTaskResult(String helpSelectionTaskResult) {
        this.helpSelectionTaskResult = helpSelectionTaskResult;
    }

    public String getHelpSelectionTaskResult() {
        return helpSelectionTaskResult;
    }

    public void setHelpSelectionFeedback(String helpSelectionFeedback) {
        this.helpSelectionFeedback = helpSelectionFeedback;
    }

    public String getHelpSelectionFeedback() {
        return helpSelectionFeedback;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }
}