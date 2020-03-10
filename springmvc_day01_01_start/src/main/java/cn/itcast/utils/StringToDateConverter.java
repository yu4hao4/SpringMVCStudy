package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转换日期
 * @author 喻浩
 * @create 2019-08-21-23:11
 */
public class StringToDateConverter implements Converter<String, Date> {

    /**
     * String source     传入进来字符串
     * @param source
     * @return
     */
    @Override
    public Date convert(String source) {
        //判断
        if(source == null){
            throw new RuntimeException("请您传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //把字符串转换日期
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换出现错误");
        }
    }
}
