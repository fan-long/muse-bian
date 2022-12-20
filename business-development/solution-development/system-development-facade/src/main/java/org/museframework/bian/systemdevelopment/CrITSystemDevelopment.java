package org.museframework.bian.systemdevelopment;

import org.museframework.bian.systemdevelopment.dto.CreateITSystemDevelopmentRequest;
import org.museframework.bian.systemdevelopment.dto.CreateITSystemDevelopmentResponse;
import org.museframework.bian.systemdevelopment.dto.RequestITSystemDevelopmentRequest;
import org.museframework.bian.systemdevelopment.dto.RequestITSystemDevelopmentResponse;
import org.museframework.bian.systemdevelopment.dto.RetrieveITSystemDevelopmentRequest;
import org.museframework.bian.systemdevelopment.dto.RetrieveITSystemDevelopmentResponse;
import org.museframework.bian.systemdevelopment.dto.UpdateITSystemDevelopmentRequest;
import org.museframework.bian.systemdevelopment.dto.UpdateITSystemDevelopmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To build or enhance something, typically an IT production systems  within System Development. Includes development, Assessment and deployment activities. Example: Build, enhance, test and deploy a major enhancement to a production product processing system.")
@GenericDomain(name="SystemDevelopment", group="ITSystemDevelopment")
public interface CrITSystemDevelopment {
    @GenericDtxEndpoint
    @Description("CrCR Create/initiate a system development project")
    CreateITSystemDevelopmentResponse createITSystemDevelopment(CreateITSystemDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active system development project")
    UpdateITSystemDevelopmentResponse updateITSystemDevelopment(UpdateITSystemDevelopmentRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in a project")
    RequestITSystemDevelopmentResponse requestITSystemDevelopment(RequestITSystemDevelopmentRequest req);

    @Description("ReCR Retrieve details/reports about a system development project")
    RetrieveITSystemDevelopmentResponse retrieveITSystemDevelopment(RetrieveITSystemDevelopmentRequest req);
}