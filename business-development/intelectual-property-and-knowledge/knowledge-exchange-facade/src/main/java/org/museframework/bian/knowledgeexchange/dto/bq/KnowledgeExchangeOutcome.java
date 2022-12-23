/*Operate equipment and/or a largely automated facility  within Knowledge Exchange. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.knowledgeexchange.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class KnowledgeExchangeOutcome {
    /**/
    @MetaField
    private String knowledgeExchangeIncident;

    /**/
    @MetaField
    private String knowledgeExchangeProvision;

    public void setKnowledgeExchangeIncident(String knowledgeExchangeIncident) {
        this.knowledgeExchangeIncident = knowledgeExchangeIncident;
    }

    public String getKnowledgeExchangeIncident() {
        return knowledgeExchangeIncident;
    }

    public void setKnowledgeExchangeProvision(String knowledgeExchangeProvision) {
        this.knowledgeExchangeProvision = knowledgeExchangeProvision;
    }

    public String getKnowledgeExchangeProvision() {
        return knowledgeExchangeProvision;
    }
}