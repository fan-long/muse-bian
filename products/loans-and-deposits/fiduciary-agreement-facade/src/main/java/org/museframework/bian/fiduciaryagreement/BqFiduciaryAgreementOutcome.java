package org.museframework.bian.fiduciaryagreement;

import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="FiduciaryAgreement", group="FiduciaryAgreementOutcome")
public interface BqFiduciaryAgreementOutcome {
}