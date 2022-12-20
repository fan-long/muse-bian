package org.museframework.bian.managementmanual;

import org.museframework.bian.managementmanual.dto.CaptureLegalandRegulatoryObligationsandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.CaptureLegalandRegulatoryObligationsandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.InitiateLegalandRegulatoryObligationsandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.InitiateLegalandRegulatoryObligationsandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.RetrieveLegalandRegulatoryObligationsandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.RetrieveLegalandRegulatoryObligationsandGuidelinesResponse;
import org.museframework.bian.managementmanual.dto.UpdateLegalandRegulatoryObligationsandGuidelinesRequest;
import org.museframework.bian.managementmanual.dto.UpdateLegalandRegulatoryObligationsandGuidelinesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual.  Example: Create and maintain product designs and analytical models.")
@GenericDomain(name="ManagementManual", group="LegalandRegulatoryObligationsandGuidelines")
public interface BqLegalandRegulatoryObligationsandGuidelines {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Legal and Regulatory Obligations and Guidelines activity or event related information")
    CaptureLegalandRegulatoryObligationsandGuidelinesResponse captureLegalandRegulatoryObligationsandGuidelines(CaptureLegalandRegulatoryObligationsandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Legal and Regulatory Obligations and Guidelines")
    InitiateLegalandRegulatoryObligationsandGuidelinesResponse initiateLegalandRegulatoryObligationsandGuidelines(InitiateLegalandRegulatoryObligationsandGuidelinesRequest req);

    @Description("ReBQ Retrieve details about any aspect of Legal and Regulatory Obligations and Guidelines")
    RetrieveLegalandRegulatoryObligationsandGuidelinesResponse retrieveLegalandRegulatoryObligationsandGuidelines(RetrieveLegalandRegulatoryObligationsandGuidelinesRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Legal and Regulatory Obligations and Guidelines")
    UpdateLegalandRegulatoryObligationsandGuidelinesResponse updateLegalandRegulatoryObligationsandGuidelines(UpdateLegalandRegulatoryObligationsandGuidelinesRequest req);
}