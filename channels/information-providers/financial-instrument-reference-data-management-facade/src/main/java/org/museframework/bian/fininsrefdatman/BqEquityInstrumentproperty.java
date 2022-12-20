package org.museframework.bian.fininsrefdatman;

import org.museframework.bian.fininsrefdatman.dto.ExecuteEquityInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.ExecuteEquityInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.NotifyEquityInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.NotifyEquityInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RegisterEquityInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RegisterEquityInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RequestEquityInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RequestEquityInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RetrieveEquityInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RetrieveEquityInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.UpdateEquityInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.UpdateEquityInstrumentpropertyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Option Instrument property properties that represent a discrete aspect of the Option Instrument property")
@GenericDomain(name="FinancialInstrumentReferenceDataManagement", group="EquityInstrumentproperty")
public interface BqEquityInstrumentproperty {
    @GenericDtxEndpoint
    @Description("Execute Equity Instrument property")
    ExecuteEquityInstrumentpropertyResponse executeEquityInstrumentproperty(ExecuteEquityInstrumentpropertyRequest req);

    @Description("Notify Equity Instrument property")
    NotifyEquityInstrumentpropertyResponse notifyEquityInstrumentproperty(NotifyEquityInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Register Equity Instrument property")
    RegisterEquityInstrumentpropertyResponse registerEquityInstrumentproperty(RegisterEquityInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Request Equity Instrument property")
    RequestEquityInstrumentpropertyResponse requestEquityInstrumentproperty(RequestEquityInstrumentpropertyRequest req);

    @Description("Retrieve Equity Instrument property")
    RetrieveEquityInstrumentpropertyResponse retrieveEquityInstrumentproperty(RetrieveEquityInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Update Equity Instrument property")
    UpdateEquityInstrumentpropertyResponse updateEquityInstrumentproperty(UpdateEquityInstrumentpropertyRequest req);
}