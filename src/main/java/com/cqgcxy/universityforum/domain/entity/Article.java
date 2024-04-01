package com.cqgcxy.universityforum.domain.entity;


import com.cqgcxy.universityforum.domain.converter.ArticleArtContentAttributeConverter;
import com.cqgcxy.universityforum.domain.converter.ArticleArtImagesAttributeConvert;
import com.cqgcxy.universityforum.domain.converter.UserDetailAttributeConverter;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;





import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity


public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long artId;

    private Long artUserId;
    private String artTitle;//标题

    @ManyToOne
    @JoinColumn(name = "art_type_id")  // 仅在 Java 对象级别引用
    private ArticleType articleType;

    @Convert(converter = ArticleArtContentAttributeConverter.class)
    @Column(columnDefinition = "jsonb")
    private Map<Integer, String> artContent;//正文

    @Convert(converter = ArticleArtImagesAttributeConvert.class)
    @Column(columnDefinition = "jsonb")
    private List<String> artImages;//评论图片

    private Long artCommentId;//评论id
    private LocalDateTime artCreTime;//创建时间
    private Integer artView;//浏览量
    private Integer artComNum;//评论数
    private Integer artHotNum;//热度
    private Integer artLikeNum;//点赞数


}
