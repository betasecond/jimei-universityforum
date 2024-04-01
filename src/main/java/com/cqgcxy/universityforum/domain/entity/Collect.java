package com.cqgcxy.universityforum.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"colUserId", "colArtId"})})
public class Collect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long colId;

    @Column(name = "colArtId")
    private Long articleId;  // 收藏文章 ID

    @Column(name = "colUserId")
    private Long userId;  // 收藏用户 ID

    // 建立与 Article 实体的多对一关系
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "colArtId", insertable = false, updatable = false)
    private Article article;

    // 建立与 User 实体的多对一关系
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "colUserId", insertable = false, updatable = false)
    private User user;
}
