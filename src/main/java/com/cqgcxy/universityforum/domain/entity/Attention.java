package com.cqgcxy.universityforum.domain.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
// 唯一性约束，确保不会出现重复的关注关系
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"follower_id", "following_id"})})
public class Attention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attId;

    @Column(name = "follower_id", insertable = false, updatable = false)
    private Long followerId;  // 关注人 ID 不直接插入或更新


    @Column(name = "following_id", insertable = false, updatable = false)
    private Long followingId;  // 被关注人 ID 不直接插入或更新





    // User 实体类，使用 @ManyToOne 进行关联
     @ManyToOne
     @JoinColumn(name = "follower_id", referencedColumnName = "userId")
     private User follower;

     @ManyToOne
     @JoinColumn(name = "following_id", referencedColumnName = "userId")
     private User following;
}
