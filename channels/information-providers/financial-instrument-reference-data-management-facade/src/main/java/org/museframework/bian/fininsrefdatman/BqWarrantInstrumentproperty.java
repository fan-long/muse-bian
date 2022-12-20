package org.museframework.bian.fininsrefdatman;

import org.museframework.bian.fininsrefdatman.dto.ExecuteWarrantInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.ExecuteWarrantInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.NotifyWarrantInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.NotifyWarrantInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RegisterWarrantInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RegisterWarrantInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RequestWarrantInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RequestWarrantInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RetrieveWarrantInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RetrieveWarrantInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.UpdateWarrantInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.UpdateWarrantInstrumentpropertyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Option Instrument property properties that represent a discrete aspect of the Option Instrument property")
@GenericDomain(name="FinancialInstrumentReferenceDataManagement", group="WarrantInstrumentproperty")
public interface BqWarrantInstrumentproperty {
    @GenericDtxEndpoint
    @Description("Execute Warrant Instrument property")
    ExecuteWarrantInstrumentpropertyResponse executeWarrantInstrumentproperty(ExecuteWarrantInstrumentpropertyRequest req);

    @Description("Notify Warrant Instrument property")
    NotifyWarrantInstrumentpropertyResponse notifyWarrantInstrumentproperty(NotifyWarrantInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Register Warrant Instrument property")
    RegisterWarrantInstrumentpropertyResponse registerWarrantInstrumentproperty(RegisterWarrantInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Request Warrant Instrument property")
    RequestWarrantInstrumentpropertyResponse requestWarrantInstrumentproperty(RequestWarrantInstrumentpropertyRequest req);

    @Description("Retrieve Warrant Instrument property")
    RetrieveWarrantInstrumentpropertyResponse retrieveWarrantInstrumentproperty(RetrieveWarrantInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Update Warrant Instrument property")
    UpdateWarrantInstrumentpropertyResponse updateWarrantInstrumentproperty(UpdateWarrantInstrumentpropertyRequest req);
}