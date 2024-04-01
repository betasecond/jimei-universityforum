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
public class CommentDTO {

    private Long comId;
    private String comContent;  // 评论内容
    private LocalDateTime comTime;  // 评论时间

    // 评论者信息，根据需要可能还包括用户名、头像等
    private Long comUserId;
    private String comUsername;
    private String comUserAvatar;

    // 如果需要关联文章的信息
    private Long comArtId;
    private String comArtTitle;
}
