package org.museframework.bian.systemsadministration;

import org.museframework.bian.systemsadministration.dto.CaptureConfigurationRequest;
import org.museframework.bian.systemsadministration.dto.CaptureConfigurationResponse;
import org.museframework.bian.systemsadministration.dto.RequestConfigurationRequest;
import org.museframework.bian.systemsadministration.dto.RequestConfigurationResponse;
import org.museframework.bian.systemsadministration.dto.RetrieveConfigurationRequest;
import org.museframework.bian.systemsadministration.dto.RetrieveConfigurationResponse;
import org.museframework.bian.systemsadministration.dto.UpdateConfigurationRequest;
import org.museframework.bian.systemsadministration.dto.UpdateConfigurationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="SystemsAdministration", group="Configuration")
public interface BqConfiguration {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Configuration activity or event related information")
    CaptureConfigurationResponse captureConfiguration(CaptureConfigurationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Configuration")
    RetrieveConfigurationResponse retrieveConfiguration(RetrieveConfigurationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Configuration")
    RequestConfigurationResponse requestConfiguration(RequestConfigurationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Configuration")
    UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest req);
}