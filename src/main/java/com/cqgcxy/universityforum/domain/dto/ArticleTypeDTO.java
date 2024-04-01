package com.cqgcxy.universityforum.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleTypeDTO {

    private Long typeId;
    private String typeName;
    private String typeDesc;  // 如果前端需要类型描述

}
