package com.cqgcxy.universityforum.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
//TODO:要根据前端来设计
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentMultiDTO {

    private Long comMultiId;
    private String comMultiContent;  // 评论内容
    private LocalDateTime comMultiTime;  // 评论时间

    // 评论者信息
    private Long comMultiUserId;
    private String comMultiUsername;  // 评论者用户名
    private String comMultiUserAvatar;  // 评论者头像，如果有

    // 父评论信息，假设我们至少需要展示父评论的内容和ID
    private Long parentId;
    private String parentContent;
}
