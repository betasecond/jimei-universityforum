package com.cqgcxy.universityforum.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userPassword;
    private String userName;
    private String userEmail;
    private String userSex;
    private String userPhone;
    private Byte userStatus;//用户状态1：激活 0：未激活

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date userTime;//注册时间
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Map<String, String> userDetails; // 存储个性签名、主页、头像等
//    private String userShow;//用户个性签名
//    private String userBlog;//用户主页
//    private String userImg;//用户头像
//    private Integer userFans;//用户粉丝数
//    private Integer userConcern;//用户关注数



}
