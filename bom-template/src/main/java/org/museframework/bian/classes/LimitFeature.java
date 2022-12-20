/*A product feature which is a restriction on (the size or amount or value of ) something. */
package org.museframework.bian.classes;

public class LimitFeature {
    /*Nature of the limit.*/
    private String limitType;

    /**/
    private String limitDefinition;

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitDefinition(String limitDefinition) {
        this.limitDefinition = limitDefinition;
    }

    public String getLimitDefinition() {
        return limitDefinition;
    }
}