package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.ExchangeLienRequest;
import org.museframework.bian.mortgageloan.dto.ExchangeLienResponse;
import org.museframework.bian.mortgageloan.dto.InitiateLienRequest;
import org.museframework.bian.mortgageloan.dto.InitiateLienResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveLienRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveLienResponse;
import org.museframework.bian.mortgageloan.dto.UpdateLienRequest;
import org.museframework.bian.mortgageloan.dto.UpdateLienResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Lien")
public interface BqLien {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Lien processing")
    ExchangeLienResponse exchangeLien(ExchangeLienRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Lien")
    InitiateLienResponse initiateLien(InitiateLienRequest req);

    @Description("ReBQ Retrieve details about any aspect of Lien")
    RetrieveLienResponse retrieveLien(RetrieveLienRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Lien")
    UpdateLienResponse updateLien(UpdateLienRequest req);
}