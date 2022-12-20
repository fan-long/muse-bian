package org.museframework.bian.fininsrefdatman;

import org.museframework.bian.fininsrefdatman.dto.ExecuteFuturesInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.ExecuteFuturesInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.NotifyFuturesInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.NotifyFuturesInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RegisterFuturesInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RegisterFuturesInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RequestFuturesInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RequestFuturesInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RetrieveFuturesInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RetrieveFuturesInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.UpdateFuturesInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.UpdateFuturesInstrumentpropertyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Option Instrument property properties that represent a discrete aspect of the Option Instrument property")
@GenericDomain(name="FinancialInstrumentReferenceDataManagement", group="FuturesInstrumentproperty")
public interface BqFuturesInstrumentproperty {
    @GenericDtxEndpoint
    @Description("Execute Futures Instrument property")
    ExecuteFuturesInstrumentpropertyResponse executeFuturesInstrumentproperty(ExecuteFuturesInstrumentpropertyRequest req);

    @Description("Notify Futures Instrument property")
    NotifyFuturesInstrumentpropertyResponse notifyFuturesInstrumentproperty(NotifyFuturesInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Register Futures Instrument property")
    RegisterFuturesInstrumentpropertyResponse registerFuturesInstrumentproperty(RegisterFuturesInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Request Futures Instrument property")
    RequestFuturesInstrumentpropertyResponse requestFuturesInstrumentproperty(RequestFuturesInstrumentpropertyRequest req);

    @Description("Retrieve Futures Instrument property")
    RetrieveFuturesInstrumentpropertyResponse retrieveFuturesInstrumentproperty(RetrieveFuturesInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Update Futures Instrument property")
    UpdateFuturesInstrumentpropertyResponse updateFuturesInstrumentproperty(UpdateFuturesInstrumentpropertyRequest req);
}