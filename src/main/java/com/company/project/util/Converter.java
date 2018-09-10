package com.company.project.util;

/**
 * Created by jacky on 2018/7/26.
 */
public interface Converter<S, T> {
    T convert(S var1);
}