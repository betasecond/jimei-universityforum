package com.cqgcxy.universityforum.domain.converter;

import com.cqgcxy.universityforum.constant.UserDetailKey;
import com.cqgcxy.universityforum.util.JsonUtil;
import jakarta.persistence.AttributeConverter;

import java.util.Map;

public class UserDetailAttributeConverter implements AttributeConverter<Map<UserDetailKey, String>,String> {

    @Override
    public String convertToDatabaseColumn(Map<UserDetailKey, String> userDetailKeyStringMap) {
        return JsonUtil.toJson(userDetailKeyStringMap);
    }

    @Override
    public Map<UserDetailKey, String> convertToEntityAttribute(String s) {
        return JsonUtil.fromJsonToUserDetailKeyMap(s);
    }
}
