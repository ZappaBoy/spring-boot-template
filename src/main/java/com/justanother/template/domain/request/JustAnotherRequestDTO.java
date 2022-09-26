package com.justanother.template.domain.request;

import com.justanother.template.domain.dto.AbstractDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class JustAnotherRequestDTO extends AbstractDTO implements Serializable {

    public String aProperty;
    public String anotherProperty;
    public String justAnotherProperty;

}
