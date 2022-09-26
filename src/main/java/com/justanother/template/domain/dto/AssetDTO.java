package com.justanother.template.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class AssetDTO extends AbstractDTO implements Serializable {

    private String uuid;
    private String description;
}
