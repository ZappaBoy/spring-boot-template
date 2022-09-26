package com.justanother.template.domain.response;

import com.justanother.template.domain.dto.AbstractDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class ResultMessageResponseDTO extends AbstractDTO implements Serializable {

    public String message;

}
