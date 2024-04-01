package com.cqgcxy.universityforum.domain.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CommentMulti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comMultiId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comId", referencedColumnName = "comId")
    private Comment parentComment;  // 与一级评论建立关系

    private String comMultiContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comMultiUserId", referencedColumnName = "userId")
    private User user;  // 多级评论用户

    @Column(nullable = false)
    private LocalDateTime comMultiTime;
}
