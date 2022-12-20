package org.museframework.bian.letofcre.dto;

public class UpdateLetterofCreditDefinitionandPricingTaskRequest {
    private String letterofcreditid;

    private String letterofcreditdefinitionandpricingtaskid;

    private org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask letterofCreditDefinitionandPricingTask;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setLetterofcreditdefinitionandpricingtaskid(String letterofcreditdefinitionandpricingtaskid) {
        this.letterofcreditdefinitionandpricingtaskid = letterofcreditdefinitionandpricingtaskid;
    }

    public String getLetterofcreditdefinitionandpricingtaskid() {
        return letterofcreditdefinitionandpricingtaskid;
    }

    public void setLetterofCreditDefinitionandPricingTask(org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask letterofCreditDefinitionandPricingTask) {
        this.letterofCreditDefinitionandPricingTask = letterofCreditDefinitionandPricingTask;
    }

    public org.museframework.bian.letofcre.dto.bq.LetterofCreditDefinitionandPricingTask getLetterofCreditDefinitionandPricingTask() {
        return letterofCreditDefinitionandPricingTask;
    }
}