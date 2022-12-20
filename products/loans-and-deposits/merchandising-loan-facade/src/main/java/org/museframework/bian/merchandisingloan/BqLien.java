package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.ExchangeLienRequest;
import org.museframework.bian.merchandisingloan.dto.ExchangeLienResponse;
import org.museframework.bian.merchandisingloan.dto.InitiateLienRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateLienResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveLienRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveLienResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateLienRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateLienResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="Lien")
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