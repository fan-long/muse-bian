package org.museframework.bian.invporman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTrackResponse {
    @MetaField(ref=true)
    private org.museframework.bian.invporman.dto.bq.Track track;

    public void setTrack(org.museframework.bian.invporman.dto.bq.Track track) {
        this.track = track;
    }

    public org.museframework.bian.invporman.dto.bq.Track getTrack() {
        return track;
    }
}