package org.museframework.bian.fininsrefdatman;

import org.museframework.bian.fininsrefdatman.dto.ExecuteDebtInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.ExecuteDebtInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.NotifyDebtInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.NotifyDebtInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RegisterDebtInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RegisterDebtInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RequestDebtInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RequestDebtInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.RetrieveDebtInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.RetrieveDebtInstrumentpropertyResponse;
import org.museframework.bian.fininsrefdatman.dto.UpdateDebtInstrumentpropertyRequest;
import org.museframework.bian.fininsrefdatman.dto.UpdateDebtInstrumentpropertyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Option Instrument property properties that represent a discrete aspect of the Option Instrument property")
@GenericDomain(name="FinancialInstrumentReferenceDataManagement", group="DebtInstrumentproperty")
public interface BqDebtInstrumentproperty {
    @GenericDtxEndpoint
    @Description("Execute Debt Instrument property")
    ExecuteDebtInstrumentpropertyResponse executeDebtInstrumentproperty(ExecuteDebtInstrumentpropertyRequest req);

    @Description("Notify Debt Instrument property")
    NotifyDebtInstrumentpropertyResponse notifyDebtInstrumentproperty(NotifyDebtInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Register Debt Instrument property")
    RegisterDebtInstrumentpropertyResponse registerDebtInstrumentproperty(RegisterDebtInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Request Debt Instrument property")
    RequestDebtInstrumentpropertyResponse requestDebtInstrumentproperty(RequestDebtInstrumentpropertyRequest req);

    @Description("Retrieve Debt Instrument property")
    RetrieveDebtInstrumentpropertyResponse retrieveDebtInstrumentproperty(RetrieveDebtInstrumentpropertyRequest req);

    @GenericDtxEndpoint
    @Description("Update Debt Instrument property")
    UpdateDebtInstrumentpropertyResponse updateDebtInstrumentproperty(UpdateDebtInstrumentpropertyRequest req);
}