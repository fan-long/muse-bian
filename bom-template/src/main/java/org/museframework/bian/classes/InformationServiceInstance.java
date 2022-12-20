/*Execution of an InformationService*/
package org.museframework.bian.classes;

public class InformationServiceInstance {
    /**/
    private String informationServiceInstanceAttribute;

    /*Content delivered by the information service instance*/
    private String informationServiceInstanceContent;

    public void setInformationServiceInstanceAttribute(String informationServiceInstanceAttribute) {
        this.informationServiceInstanceAttribute = informationServiceInstanceAttribute;
    }

    public String getInformationServiceInstanceAttribute() {
        return informationServiceInstanceAttribute;
    }

    public void setInformationServiceInstanceContent(String informationServiceInstanceContent) {
        this.informationServiceInstanceContent = informationServiceInstanceContent;
    }

    public String getInformationServiceInstanceContent() {
        return informationServiceInstanceContent;
    }
}