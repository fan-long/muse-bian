package org.museframework.bian.carfinset;

import org.museframework.bian.carfinset.dto.RetrieveInstructionRequest;
import org.museframework.bian.carfinset.dto.RetrieveInstructionResponse;
import org.museframework.bian.carfinset.dto.UpdateInstructionRequest;
import org.museframework.bian.carfinset.dto.UpdateInstructionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardFinancialSettlement", group="Instruction")
public interface BqInstruction {
    @GenericDtxEndpoint
    @Description("UpBQ Update payment instruction details for a settlement procedure")
    UpdateInstructionResponse updateInstruction(UpdateInstructionRequest req);

    @Description("ReBQ Retrieve payment instruction details for a settlement procedure")
    RetrieveInstructionResponse retrieveInstruction(RetrieveInstructionRequest req);
}