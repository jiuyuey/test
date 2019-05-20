package util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: task4
 * @description: JJwt token生成+解密
 * @author: LZP
 * @create: 2019-04-19 23:05
 **/
public class JJwtUtils {
    //生成秘钥
    private static final Key signkey=new SecretKeySpec("hello".getBytes(),SignatureAlgorithm.HS512.getJcaName());
    //生成一个token
    public static  String createToken(Integer id, String logintime, long ttlMillis)throws Exception{
        //签名算法
        SignatureAlgorithm signatureAlgorithm=SignatureAlgorithm.HS512;//签名算法，HS512为共享签名算法
        //获取当前时间
        long nowMillis=System.currentTimeMillis();
        Date now=new Date(nowMillis);

        Map<String,Object> claims =new HashMap<String, Object>();//只允许新建一个哈希，多余的会被覆盖，允许多条值为空
        claims.put("id",id);
        claims.put("createat",logintime);

        JwtBuilder builder= Jwts.builder()
                .setClaims(claims)
                .setId(UUID.randomUUID().toString())//jwt唯一标识
                .setIssuedAt(now)    //发布时间
                .signWith(signatureAlgorithm,signkey); //签名
        if(ttlMillis>=0){
            long expMillis= nowMillis + ttlMillis;//传入的时间加上当前的时间
            Date exp=new Date(expMillis);//转换时间格式
            builder.setExpiration(exp);//过期时间
        }
        return builder.compact();//生成jwt
    }
    //解密jwt
    public static Claims parseJWT(String jwt)throws Exception{//接收传入的jwt
        Claims claims= Jwts.parser()//
                .setSigningKey(signkey)//传入签名
                .parseClaimsJws(jwt)//解析jwt
                .getBody();
        return  claims;

    }
}
