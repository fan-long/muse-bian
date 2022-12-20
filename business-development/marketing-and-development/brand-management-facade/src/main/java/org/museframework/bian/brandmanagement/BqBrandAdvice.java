package org.museframework.bian.brandmanagement;

import org.museframework.bian.brandmanagement.dto.CreateBrandAdviceRequest;
import org.museframework.bian.brandmanagement.dto.CreateBrandAdviceResponse;
import org.museframework.bian.brandmanagement.dto.RequestBrandAdviceRequest;
import org.museframework.bian.brandmanagement.dto.RequestBrandAdviceResponse;
import org.museframework.bian.brandmanagement.dto.RetrieveBrandAdviceRequest;
import org.museframework.bian.brandmanagement.dto.RetrieveBrandAdviceResponse;
import org.museframework.bian.brandmanagement.dto.UpdateBrandAdviceRequest;
import org.museframework.bian.brandmanagement.dto.UpdateBrandAdviceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="BrandManagement", group="BrandAdvice")
public interface BqBrandAdvice {
    @GenericDtxEndpoint
    @Description("CrBQ Create a brand advice task")
    CreateBrandAdviceResponse createBrandAdvice(CreateBrandAdviceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of provided brand related advice")
    UpdateBrandAdviceResponse updateBrandAdvice(UpdateBrandAdviceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention for brand advice (e.g. request specialist support)")
    RequestBrandAdviceResponse requestBrandAdvice(RequestBrandAdviceRequest req);

    @Description("ReBQ Retrieve details about brand advice activity")
    RetrieveBrandAdviceResponse retrieveBrandAdvice(RetrieveBrandAdviceRequest req);
}