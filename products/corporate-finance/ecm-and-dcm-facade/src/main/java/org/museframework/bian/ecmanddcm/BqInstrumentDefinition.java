package org.museframework.bian.ecmanddcm;

import org.museframework.bian.ecmanddcm.dto.RequestInstrumentDefinitionRequest;
import org.museframework.bian.ecmanddcm.dto.RequestInstrumentDefinitionResponse;
import org.museframework.bian.ecmanddcm.dto.RetrieveInstrumentDefinitionRequest;
import org.museframework.bian.ecmanddcm.dto.RetrieveInstrumentDefinitionResponse;
import org.museframework.bian.ecmanddcm.dto.UpdateInstrumentDefinitionRequest;
import org.museframework.bian.ecmanddcm.dto.UpdateInstrumentDefinitionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="ECMAndDCM", group="InstrumentDefinition")
public interface BqInstrumentDefinition {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the ECM And DCM instrument specification")
    UpdateInstrumentDefinitionResponse updateInstrumentDefinition(UpdateInstrumentDefinitionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the instrument definition")
    RequestInstrumentDefinitionResponse requestInstrumentDefinition(RequestInstrumentDefinitionRequest req);

    @Description("ReBQ Retrieve details about the ECM And DCM instrument definition")
    RetrieveInstrumentDefinitionResponse retrieveInstrumentDefinition(RetrieveInstrumentDefinitionRequest req);
}