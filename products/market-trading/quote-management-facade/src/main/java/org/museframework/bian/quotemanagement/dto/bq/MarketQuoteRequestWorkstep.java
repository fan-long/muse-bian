/*A course of action for doing Market Quote Request Workstep in the context of executing the Market Quote Request Workstep*/
package org.museframework.bian.quotemanagement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketQuoteRequestWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String schedule;

    /*The Market Quote Request Workstep specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Market Quote Request Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure quotationProcedureReference;

    /*Reference to Market Quote Request Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Workstep marketQuoteRequestWorkstepReference;

    /*The type of Market Quote Request Workstep*/
    @MetaField(0)
    private String marketQuoteRequestWorkstepType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setQuotationProcedureReference(org.museframework.bian.classes.Procedure quotationProcedureReference) {
        this.quotationProcedureReference = quotationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getQuotationProcedureReference() {
        return quotationProcedureReference;
    }

    public void setMarketQuoteRequestWorkstepReference(org.museframework.bian.classes.Workstep marketQuoteRequestWorkstepReference) {
        this.marketQuoteRequestWorkstepReference = marketQuoteRequestWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getMarketQuoteRequestWorkstepReference() {
        return marketQuoteRequestWorkstepReference;
    }

    public void setMarketQuoteRequestWorkstepType(String marketQuoteRequestWorkstepType) {
        this.marketQuoteRequestWorkstepType = marketQuoteRequestWorkstepType;
    }

    public String getMarketQuoteRequestWorkstepType() {
        return marketQuoteRequestWorkstepType;
    }
}