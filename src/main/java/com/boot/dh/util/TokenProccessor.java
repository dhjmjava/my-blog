package com.boot.dh.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import sun.misc.BASE64Encoder;
/**
 * 用于生成唯一的Token
 * @author Administrator
 *
 */
public class TokenProccessor {
	
	private TokenProccessor(){}
    
    public static TokenProccessor getInstance(){
        return SingletonInstance.instance;
    }
    
    private static class SingletonInstance{
        static TokenProccessor instance = new TokenProccessor();
    }

    /**
     * 生成Token
     * Token：Nv6RRuGEVvmGjB+jimI/gw==
     * @return
     */
    public String makeToken(){ 
       
        String token = (System.currentTimeMillis() + new Random().nextInt(999999999)) + "";
        //数据指纹   128位长   16个字节  md5
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte md5[] =  md.digest(token.getBytes());
            //base64编码--任意二进制编码明文字符   adfsdfsdfsf
 			BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(md5);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
