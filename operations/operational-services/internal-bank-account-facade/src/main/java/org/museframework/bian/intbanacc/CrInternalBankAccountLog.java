package org.museframework.bian.intbanacc;

import org.museframework.bian.intbanacc.dto.CaptureInternalBankAccountLogRequest;
import org.museframework.bian.intbanacc.dto.CaptureInternalBankAccountLogResponse;
import org.museframework.bian.intbanacc.dto.ControlInternalBankAccountLogRequest;
import org.museframework.bian.intbanacc.dto.ControlInternalBankAccountLogResponse;
import org.museframework.bian.intbanacc.dto.NotifyInternalBankAccountLogRequest;
import org.museframework.bian.intbanacc.dto.NotifyInternalBankAccountLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Internal Bank Account. ")
@GenericDomain(name="InternalBankAccount", group="InternalBankAccountLog")
public interface CrInternalBankAccountLog {
    @GenericDtxEndpoint
    @Description("Capture Internal Bank Account Log")
    CaptureInternalBankAccountLogResponse captureInternalBankAccountLog(CaptureInternalBankAccountLogRequest req);

    @GenericDtxEndpoint
    @Description("Control Internal Bank Account Log")
    ControlInternalBankAccountLogResponse controlInternalBankAccountLog(ControlInternalBankAccountLogRequest req);

    @Description("Notify Internal Bank Account Log")
    NotifyInternalBankAccountLogResponse notifyInternalBankAccountLog(NotifyInternalBankAccountLogRequest req);
}