package org.museframework.bian.correspondence.dto;

public class RetrieveBlockMailingResponse {
    private org.museframework.bian.correspondence.dto.bq.BlockMailing blockMailing;

    public void setBlockMailing(org.museframework.bian.correspondence.dto.bq.BlockMailing blockMailing) {
        this.blockMailing = blockMailing;
    }

    public org.museframework.bian.correspondence.dto.bq.BlockMailing getBlockMailing() {
        return blockMailing;
    }
}