/*A rule used to carry out a law (FIBO)

Business Dictionary: a rule (with or without the coercive power of law) employed in controlling, directing, or managing an activity, organization, or system. 

The set of rules and legislation governing certain actions. 
https://financial-dictionary.thefreedictionary.com/Regulatory*/
package org.museframework.bian.classes;

public class Regulation {
    /**/
    private String regulationDefinition;

    public void setRegulationDefinition(String regulationDefinition) {
        this.regulationDefinition = regulationDefinition;
    }

    public String getRegulationDefinition() {
        return regulationDefinition;
    }
}