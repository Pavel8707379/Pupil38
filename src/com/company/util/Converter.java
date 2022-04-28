package com.company.util;
@FunctionalInterface
public interface Converter<T,N> {
    T convert(N el);

    static boolean isElement (String str){
        return str.equals("");
    }
    default void printStr(String str){
        System.out.println(str);
    }

}
