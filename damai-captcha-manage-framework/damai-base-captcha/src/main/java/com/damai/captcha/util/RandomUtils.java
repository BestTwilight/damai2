/*
 *Copyright © 2018 anji-plus
 *安吉加加信息技术有限公司
 *http://www.anji-plus.com
 *All rights reserved.
 */
package com.damai.captcha.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @program: 抢票
 * @description: RandomUtils
 * @author: newmax
 **/
public class RandomUtils {

    /**
     * 生成UUID
     *
     */
    public static String getUuid() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        return uuid;
    }

    /**
     * 获取指定文字的随机中文
     *
     * @return
     */
    public static String getRandomHan(String hanZi) {
        return String.valueOf(hanZi.charAt(new Random().nextInt(hanZi.length())));
    }

    public static int getRandomInt(int bound){
        return ThreadLocalRandom.current().nextInt(bound);
    }

    /**
     * 获取随机中文
     *
     * @return
     */
    public static String getRandomHan() {
        String str = "";
        int highCode;
        int lowCode;

        Random random = new Random();
        
        //B0 + 0~39(16~55) 一级汉字所占区
        highCode = (176 + Math.abs(random.nextInt(39)));
        //A1 + 0~93 每区有94个汉字
        lowCode = (161 + Math.abs(random.nextInt(93))); 

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(highCode)).byteValue();
        b[1] = (Integer.valueOf(lowCode)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 随机范围内数字
     */
    public static Integer getRandomInt(int startNum, int endNum) {
        return ThreadLocalRandom.current().nextInt(endNum-startNum) + startNum;
    }

    /**
     * 获取随机字符串
     */
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

}
