package org.museframework.bian.rewpoiawaandred.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateRewardPointsTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction rewardPointsTransaction;

    public void setRewardPointsTransaction(org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction rewardPointsTransaction) {
        this.rewardPointsTransaction = rewardPointsTransaction;
    }

    public org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction getRewardPointsTransaction() {
        return rewardPointsTransaction;
    }
}