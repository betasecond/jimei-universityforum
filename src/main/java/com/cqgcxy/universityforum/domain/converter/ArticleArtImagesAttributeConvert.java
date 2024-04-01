package com.cqgcxy.universityforum.domain.converter;

import com.cqgcxy.universityforum.util.JsonUtil;
import jakarta.persistence.AttributeConverter;

import java.util.List;

public class ArticleArtImagesAttributeConvert implements AttributeConverter<List<String>,String> {
    /**
     * @param stringList
     * @return
     */
    @Override
    public String convertToDatabaseColumn(List<String> stringList) {
        return JsonUtil.toJson(stringList);
    }

    /**
     * @param s
     * @return
     */
    @Override
    public List<String> convertToEntityAttribute(String s) {
        return JsonUtil.fromJsonToStringList(s);
    }
}
