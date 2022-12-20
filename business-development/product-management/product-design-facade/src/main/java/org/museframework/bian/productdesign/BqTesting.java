package org.museframework.bian.productdesign;

import org.museframework.bian.productdesign.dto.RetrieveTestingRequest;
import org.museframework.bian.productdesign.dto.RetrieveTestingResponse;
import org.museframework.bian.productdesign.dto.UpdateTestingRequest;
import org.museframework.bian.productdesign.dto.UpdateTestingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="ProductDesign", group="Testing")
public interface BqTesting {
    @GenericDtxEndpoint
    @Description("UpBQ Update user specification testing content")
    UpdateTestingResponse updateTesting(UpdateTestingRequest req);

    @Description("ReBQ Retrieve details of the specification testing results")
    RetrieveTestingResponse retrieveTesting(RetrieveTestingRequest req);
}