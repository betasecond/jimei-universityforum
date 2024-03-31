package com.cqgcxy.universityforum.domain;


import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long artId;

    private Long artUserId;
    private String artTitle;//标题
    private Long artTypeId;//类型id
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private String artContent;//正文

    private Long artCommentId;//评论id
    private Date artCreTime;//创建时间
    private Integer artView;//浏览量
    private Integer artComNum;//评论数
    private Integer artHotNum;//热度
    private Integer artLikeNum;//点赞数


}
