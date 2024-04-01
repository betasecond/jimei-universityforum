package com.cqgcxy.universityforum.domain.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Comment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ComId;

    private String comContent;//评论正文

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comArtId", referencedColumnName = "artId")
    private Article article;  // 评论的文章


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comUserId", referencedColumnName = "userId")
    private User user;  // 评论的用户

    @JsonFormat(timezone = "GMT+8",pattern = "YYYY-MM-dd HH:mm:ss")
    private Date comTime;//评论时间
}
