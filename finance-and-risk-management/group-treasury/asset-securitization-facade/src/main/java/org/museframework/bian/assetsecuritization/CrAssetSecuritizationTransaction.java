package org.museframework.bian.assetsecuritization;

import org.museframework.bian.assetsecuritization.dto.ControlAssetSecuritizationTransactionRequest;
import org.museframework.bian.assetsecuritization.dto.ControlAssetSecuritizationTransactionResponse;
import org.museframework.bian.assetsecuritization.dto.ExchangeAssetSecuritizationTransactionRequest;
import org.museframework.bian.assetsecuritization.dto.ExchangeAssetSecuritizationTransactionResponse;
import org.museframework.bian.assetsecuritization.dto.ExecuteAssetSecuritizationTransactionRequest;
import org.museframework.bian.assetsecuritization.dto.ExecuteAssetSecuritizationTransactionResponse;
import org.museframework.bian.assetsecuritization.dto.InitiateAssetSecuritizationTransactionRequest;
import org.museframework.bian.assetsecuritization.dto.InitiateAssetSecuritizationTransactionResponse;
import org.museframework.bian.assetsecuritization.dto.RequestAssetSecuritizationTransactionRequest;
import org.museframework.bian.assetsecuritization.dto.RequestAssetSecuritizationTransactionResponse;
import org.museframework.bian.assetsecuritization.dto.RetrieveAssetSecuritizationTransactionRequest;
import org.museframework.bian.assetsecuritization.dto.RetrieveAssetSecuritizationTransactionResponse;
import org.museframework.bian.assetsecuritization.dto.UpdateAssetSecuritizationTransactionRequest;
import org.museframework.bian.assetsecuritization.dto.UpdateAssetSecuritizationTransactionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization.  Example: Execute a payment transaction.")
@GenericDomain(name="AssetSecuritization", group="AssetSecuritizationTransaction")
public interface CrAssetSecuritizationTransaction {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Asset Securitization Transaction")
    ControlAssetSecuritizationTransactionResponse controlAssetSecuritizationTransaction(ControlAssetSecuritizationTransactionRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Asset Securitization Transaction processing")
    ExchangeAssetSecuritizationTransactionResponse exchangeAssetSecuritizationTransaction(ExchangeAssetSecuritizationTransactionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Asset Securitization Transaction")
    ExecuteAssetSecuritizationTransactionResponse executeAssetSecuritizationTransaction(ExecuteAssetSecuritizationTransactionRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Asset Securitization Transaction")
    InitiateAssetSecuritizationTransactionResponse initiateAssetSecuritizationTransaction(InitiateAssetSecuritizationTransactionRequest req);

    @Description("ReCR Retrieve details about any aspect of Asset Securitization Transaction")
    RetrieveAssetSecuritizationTransactionResponse retrieveAssetSecuritizationTransaction(RetrieveAssetSecuritizationTransactionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Asset Securitization Transaction")
    RequestAssetSecuritizationTransactionResponse requestAssetSecuritizationTransaction(RequestAssetSecuritizationTransactionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Asset Securitization Transaction")
    UpdateAssetSecuritizationTransactionResponse updateAssetSecuritizationTransaction(UpdateAssetSecuritizationTransactionRequest req);
}