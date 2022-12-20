package org.museframework.bian.fininsrefdatman;

import org.museframework.bian.fininsrefdatman.dto.ExecuteOptionInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.ExecuteOptionInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.NotifyOptionInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.NotifyOptionInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RegisterOptionInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RegisterOptionInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RequestOptionInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RequestOptionInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RetrieveOptionInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RetrieveOptionInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.UpdateOptionInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.UpdateOptionInstrumentpropertyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Option Instrument property properties that represent a discrete aspect of the Option Instrument property")
@GenericDomain(name="FinancialInstrumentReferenceDataManagement", group="OptionInstrumentproperty")
public interface BqOptionInstrumentproperty {
    @GenericDtxEndpoint
    @Description("Execute Option Instrument property")
    ExecuteOptionInstrumentpropertyResponse executeOptionInstrumentproperty(ExecuteOptionInstrumentpropertyRequest req);

    @Description("Notify Option Instrument property")
    NotifyOptionInstrumentpropertyResponse notifyOptionInstrumentproperty(NotifyOptionInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Register Option Instrument property")
    RegisterOptionInstrumentpropertyResponse registerOptionInstrumentproperty(RegisterOptionInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Request Option Instrument property")
    RequestOptionInstrumentpropertyResponse requestOptionInstrumentproperty(RequestOptionInstrumentpropertyRequest req);

    @Description("Retrieve Option Instrument property")
    RetrieveOptionInstrumentpropertyResponse retrieveOptionInstrumentproperty(RetrieveOptionInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Update Option Instrument property")
    UpdateOptionInstrumentpropertyResponse updateOptionInstrumentproperty(UpdateOptionInstrumentpropertyRequest req);
}