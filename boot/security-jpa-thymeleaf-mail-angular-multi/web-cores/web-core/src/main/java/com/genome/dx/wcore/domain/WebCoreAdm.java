package com.genome.dx.wcore.domain;

import com.genome.dx.core.domain.base.AdmBase;
import com.genome.dx.core.domain.base.BrdBase;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
//@DynamicUpdate
//@DynamicInsert
@Table(name = "T_ADM")
public class WebCoreAdm extends AdmBase {
}
