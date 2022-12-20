/*Service that consists of providing information */
package org.museframework.bian.classes;

public class InformationService {
    /*The way the Information Service is provided

This has several dimensions that are not elaborated furthere.g. push, pull, request/replye.g. instance, file*/
    private String informationServiceMode;

    /*The type of information that is provided by the information service*/
    private String informationServiceContent;

    /*The type of information service (e.g. a regular feed, periodic report)*/
    private String informationServiceType;

    /**/
    private String informationServiceDescription;

    /**/
    private String informationServiceDateTime;

    public void setInformationServiceMode(String informationServiceMode) {
        this.informationServiceMode = informationServiceMode;
    }

    public String getInformationServiceMode() {
        return informationServiceMode;
    }

    public void setInformationServiceContent(String informationServiceContent) {
        this.informationServiceContent = informationServiceContent;
    }

    public String getInformationServiceContent() {
        return informationServiceContent;
    }

    public void setInformationServiceType(String informationServiceType) {
        this.informationServiceType = informationServiceType;
    }

    public String getInformationServiceType() {
        return informationServiceType;
    }

    public void setInformationServiceDescription(String informationServiceDescription) {
        this.informationServiceDescription = informationServiceDescription;
    }

    public String getInformationServiceDescription() {
        return informationServiceDescription;
    }

    public void setInformationServiceDateTime(String informationServiceDateTime) {
        this.informationServiceDateTime = informationServiceDateTime;
    }

    public String getInformationServiceDateTime() {
        return informationServiceDateTime;
    }
}