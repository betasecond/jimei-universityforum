package com.cqgcxy.universityforum.util;
import com.cqgcxy.universityforum.constant.UserDetailKey;
import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public class JsonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            logger.error("JSON serialization error: {}", e.getMessage());
            return null; // 或考虑抛出一个自定义异常
        }
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            logger.error("JSON deserialization error: {}", e.getMessage());
            return null; // 或考虑抛出一个自定义异常
        }
    }


    public static Map<UserDetailKey, String> fromJsonToUserDetailKeyMap(String json) {
        try {
            TypeReference<Map<UserDetailKey, String>> typeRef =
                    new TypeReference<Map<UserDetailKey, String>>() {};
            return objectMapper.readValue(json, typeRef);
        } catch (Exception e) {
            logger.error("JSON deserialization error: {}", e.getMessage());
            return null; // 或考虑抛出一个自定义异常
        }
    }

    public static Map<Integer, String> fromJsonToIntegerStringMap(String json) {
        try {
            TypeReference<Map<Integer, String>> typeRef =
                    new TypeReference<Map<Integer, String>>() {};
            return objectMapper.readValue(json, typeRef);
        } catch (Exception e) {
            logger.error("JSON deserialization error: {}", e.getMessage());
            return null; // 或考虑抛出一个自定义异常
        }
    }

    public static List<String> fromJsonToStringList(String json) {
        try {
            TypeReference<List<String>> typeRef =
                    new TypeReference<List<String>>() {};
            return objectMapper.readValue(json, typeRef);
        } catch (Exception e) {
            logger.error("JSON deserialization error: {}", e.getMessage());
            return null; // 或考虑抛出一个自定义异常
        }
    }
}
