package controller.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class EncryptionMd5 {

    /**
     * MD5
     * 加密工具类
     */
    public static String getMD5(String content) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(content.getBytes());
            return getHashString(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getHashString(MessageDigest digest) {
        StringBuilder builder = new StringBuilder();
        for (byte b : digest.digest()) {
            builder.append(Integer.toHexString((b >> 4) & 0xf));
            builder.append(Integer.toHexString(b & 0xf));
        }
        return builder.toString();
    }


    /**
     * 加密工具类的百次循环
     */

    public static String getMD5x100(String content){
        String s1 = content;
        for(int i = 0;i < 100;i++){
            s1 = getMD5(s1);
        }
        return s1;
    }


    /**
     * 加密工具类的测试
     * */

//    public static void main(String srgs[]) throws UnsupportedEncodingException {
//        String s = new String("123456");
//        System.out.println(s);
//        System.out.println(getMD5(s));
//        System.out.println(getMD5x100(s));
//    }

}