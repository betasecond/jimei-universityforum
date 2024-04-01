package com.cqgcxy.universityforum.domain.dto;

import com.cqgcxy.universityforum.constant.UserDetailKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long userId;
    private String userName;
    private String userEmail;
    private String userSex;
    private String userPhone;
    private Byte userStatus;
    private LocalDateTime userTime;
    private Map<UserDetailKey, String> userDetails;

    // 根据需要添加额外的字段或方法
}
