package org.museframework.bian.servicingmandate;

import org.museframework.bian.servicingmandate.dto.EvaluateServicingMandateAgreementRequest;
import org.museframework.bian.servicingmandate.dto.EvaluateServicingMandateAgreementResponse;
import org.museframework.bian.servicingmandate.dto.RetrieveServicingMandateAgreementRequest;
import org.museframework.bian.servicingmandate.dto.RetrieveServicingMandateAgreementResponse;
import org.museframework.bian.servicingmandate.dto.UpdateServicingMandateAgreementRequest;
import org.museframework.bian.servicingmandate.dto.UpdateServicingMandateAgreementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain the terms and conditions that apply to a commercial relationship within Servicing Mandate.   ")
@GenericDomain(name="ServicingMandate", group="ServicingMandateAgreement")
public interface CrServicingMandateAgreement {
    @GenericDtxEndpoint
    @Description("EvCR Agree terms for a third party servicing mandate")
    EvaluateServicingMandateAgreementResponse evaluateServicingMandateAgreement(EvaluateServicingMandateAgreementRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update terms for a third part mandate")
    UpdateServicingMandateAgreementResponse updateServicingMandateAgreement(UpdateServicingMandateAgreementRequest req);

    @Description("ReCR Retrieve details about a third party mandate")
    RetrieveServicingMandateAgreementResponse retrieveServicingMandateAgreement(RetrieveServicingMandateAgreementRequest req);
}