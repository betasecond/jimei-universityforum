package com.cqgcxy.universityforum.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttentionDTO {

    private Long attId;
    private Long followerId;
    private Long followingId;

    // 根据需要，也可以包括更多关于用户的信息，比如用户名等
    private String followerUsername;
    private String followingUsername;
}
