package com.justanother.template.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
@Entity()
public class Asset extends AbstractEntity implements Serializable {

    @Id
    private String symbol;
    private String description;

}
