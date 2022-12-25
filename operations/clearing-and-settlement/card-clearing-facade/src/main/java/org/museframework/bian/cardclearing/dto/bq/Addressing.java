/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Addressing {
    /*Details of the transaction addressing*/
    @MetaField(0)
    private String addressingTaskResult;

    public void setAddressingTaskResult(String addressingTaskResult) {
        this.addressingTaskResult = addressingTaskResult;
    }

    public String getAddressingTaskResult() {
        return addressingTaskResult;
    }
}