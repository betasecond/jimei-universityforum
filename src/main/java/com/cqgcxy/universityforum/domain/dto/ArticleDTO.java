package com.cqgcxy.universityforum.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO {
    private long artId;
    private Long artUserId;
    private String artTitle;
    private ArticleTypeDTO articleType;
    private Map<Integer, String> artContent;
    private List<String> artImages;

    private LocalDateTime artCreTime;
    private Integer artView;
    private Integer artComNum;
    private Integer artHotNum;
    private Integer artLikeNum;

}
