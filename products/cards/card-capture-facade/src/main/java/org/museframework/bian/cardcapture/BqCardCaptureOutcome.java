package org.museframework.bian.cardcapture;

import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Card Capture.  Example: Execute a payment transaction.")
@GenericDomain(name="CardCapture", group="CardCaptureOutcome")
public interface BqCardCaptureOutcome {
}