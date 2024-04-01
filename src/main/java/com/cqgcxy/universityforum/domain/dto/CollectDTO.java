package com.cqgcxy.universityforum.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CollectDTO {

    private Long colId;
    private Long userId;
    private Long articleId;

    // 根据前端需要，可能还要包括文章和用户的部分信息
    // 文章信息
    private String articleTitle;
    private String articleSummary; // 文章摘要或者是前几句内容

    // 用户信息
    private String username; // 收藏者的用户名
    // 可以根据需要添加更多用户信息，比如头像等
}
