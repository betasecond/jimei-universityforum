package com.cqgcxy.universityforum.domain.converter;

import com.cqgcxy.universityforum.util.JsonUtil;
import jakarta.persistence.AttributeConverter;

import java.util.Map;

public class ArticleArtContentAttributeConverter implements AttributeConverter<Map<Integer, String>,String> {
    @Override
    public String convertToDatabaseColumn(Map<Integer, String> integerStringMap) {
        return JsonUtil.toJson(integerStringMap);
    }

    @Override
    public Map<Integer, String> convertToEntityAttribute(String s) {
        return JsonUtil.fromJsonToIntegerStringMap(s);
    }
}
