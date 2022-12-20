package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveComplianceRequest;
import org.museframework.bian.customeroffer.dto.RetrieveComplianceResponse;
import org.museframework.bian.customeroffer.dto.UpdateComplianceRequest;
import org.museframework.bian.customeroffer.dto.UpdateComplianceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="Compliance")
public interface BqCompliance {
    @GenericDtxEndpoint
    @Description("UpBQ Update details submitted for compliance checks")
    UpdateComplianceResponse updateCompliance(UpdateComplianceRequest req);

    @Description("ReBQ Retrieve details of the regulatory compliance assessment")
    RetrieveComplianceResponse retrieveCompliance(RetrieveComplianceRequest req);
}