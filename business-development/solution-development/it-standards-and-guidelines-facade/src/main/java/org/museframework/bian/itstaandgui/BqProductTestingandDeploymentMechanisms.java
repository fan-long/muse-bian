package org.museframework.bian.itstaandgui;

import org.museframework.bian.itstaandgui.dto.CaptureProductTestingandDeploymentMechanismsRequest;
import org.museframework.bian.itstaandgui.dto.CaptureProductTestingandDeploymentMechanismsResponse;
import org.museframework.bian.itstaandgui.dto.ExchangeProductTestingandDeploymentMechanismsRequest;
import org.museframework.bian.itstaandgui.dto.ExchangeProductTestingandDeploymentMechanismsResponse;
import org.museframework.bian.itstaandgui.dto.InitiateProductTestingandDeploymentMechanismsRequest;
import org.museframework.bian.itstaandgui.dto.InitiateProductTestingandDeploymentMechanismsResponse;
import org.museframework.bian.itstaandgui.dto.RequestProductTestingandDeploymentMechanismsRequest;
import org.museframework.bian.itstaandgui.dto.RequestProductTestingandDeploymentMechanismsResponse;
import org.museframework.bian.itstaandgui.dto.RetrieveProductTestingandDeploymentMechanismsRequest;
import org.museframework.bian.itstaandgui.dto.RetrieveProductTestingandDeploymentMechanismsResponse;
import org.museframework.bian.itstaandgui.dto.UpdateProductTestingandDeploymentMechanismsRequest;
import org.museframework.bian.itstaandgui.dto.UpdateProductTestingandDeploymentMechanismsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="ITStandardsAndGuidelines", group="ProductTestingandDeploymentMechanisms")
public interface BqProductTestingandDeploymentMechanisms {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Product Testing and Deployment Mechanisms activity or event related information")
    CaptureProductTestingandDeploymentMechanismsResponse captureProductTestingandDeploymentMechanisms(CaptureProductTestingandDeploymentMechanismsRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Product Testing and Deployment Mechanisms processing")
    ExchangeProductTestingandDeploymentMechanismsResponse exchangeProductTestingandDeploymentMechanisms(ExchangeProductTestingandDeploymentMechanismsRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Product Testing and Deployment Mechanisms")
    InitiateProductTestingandDeploymentMechanismsResponse initiateProductTestingandDeploymentMechanisms(InitiateProductTestingandDeploymentMechanismsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Product Testing and Deployment Mechanisms")
    RetrieveProductTestingandDeploymentMechanismsResponse retrieveProductTestingandDeploymentMechanisms(RetrieveProductTestingandDeploymentMechanismsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Product Testing and Deployment Mechanisms")
    RequestProductTestingandDeploymentMechanismsResponse requestProductTestingandDeploymentMechanisms(RequestProductTestingandDeploymentMechanismsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Product Testing and Deployment Mechanisms")
    UpdateProductTestingandDeploymentMechanismsResponse updateProductTestingandDeploymentMechanisms(UpdateProductTestingandDeploymentMechanismsRequest req);
}