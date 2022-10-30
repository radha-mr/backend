package com.netflax.config;

import com.netflax.content.model.ContentCategory;
import org.springframework.core.convert.converter.Converter;

public class CategoryStringToEnumConverter implements Converter<String, ContentCategory> {

    @Override
    public ContentCategory convert(String source) {
        return ContentCategory.valueOf(source.toUpperCase());
    }
}
