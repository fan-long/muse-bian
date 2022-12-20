package org.museframework.bian.intpropor;

import org.museframework.bian.intpropor.dto.InitiateIntellectualPropertyAdministrativePlanRequest;
import org.museframework.bian.intpropor.dto.InitiateIntellectualPropertyAdministrativePlanResponse;
import org.museframework.bian.intpropor.dto.RetrieveIntellectualPropertyAdministrativePlanRequest;
import org.museframework.bian.intpropor.dto.RetrieveIntellectualPropertyAdministrativePlanResponse;
import org.museframework.bian.intpropor.dto.UpdateIntellectualPropertyAdministrativePlanRequest;
import org.museframework.bian.intpropor.dto.UpdateIntellectualPropertyAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Intellectual Property Portfolio.  ")
@GenericDomain(name="IntellectualPropertyPortfolio", group="IntellectualPropertyAdministrativePlan")
public interface CrIntellectualPropertyAdministrativePlan {
    @GenericDtxEndpoint
    @Description("InCR Initiate administration for an intellectual property asset")
    InitiateIntellectualPropertyAdministrativePlanResponse initiateIntellectualPropertyAdministrativePlan(InitiateIntellectualPropertyAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an asset administration plan")
    UpdateIntellectualPropertyAdministrativePlanResponse updateIntellectualPropertyAdministrativePlan(UpdateIntellectualPropertyAdministrativePlanRequest req);

    @Description("ReCR Retrieve details about an intellectual property asset administrative plan")
    RetrieveIntellectualPropertyAdministrativePlanResponse retrieveIntellectualPropertyAdministrativePlan(RetrieveIntellectualPropertyAdministrativePlanRequest req);
}