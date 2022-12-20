package org.museframework.bian.cusbehmod.dto;

public class RequestCustomerBehaviorModelSpecificationRequest {
    private String customerbehaviormodelsid;

    private org.museframework.bian.cusbehmod.dto.cr.CustomerBehaviorModelSpecification customerBehaviorModelSpecification;

    public void setCustomerbehaviormodelsid(String customerbehaviormodelsid) {
        this.customerbehaviormodelsid = customerbehaviormodelsid;
    }

    public String getCustomerbehaviormodelsid() {
        return customerbehaviormodelsid;
    }

    public void setCustomerBehaviorModelSpecification(org.museframework.bian.cusbehmod.dto.cr.CustomerBehaviorModelSpecification customerBehaviorModelSpecification) {
        this.customerBehaviorModelSpecification = customerBehaviorModelSpecification;
    }

    public org.museframework.bian.cusbehmod.dto.cr.CustomerBehaviorModelSpecification getCustomerBehaviorModelSpecification() {
        return customerBehaviorModelSpecification;
    }
}