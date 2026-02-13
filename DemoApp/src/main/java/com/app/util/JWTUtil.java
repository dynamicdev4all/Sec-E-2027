package com.app.util;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JWTUtil {
	
	static final String SECRET = "thisistopsecretcode";
	//this is data encryption using SHA 256 (Secure Hash Algorithm)
	static Algorithm algo = Algorithm.HMAC256(SECRET);
	
	
	//this variable has current date and current time
	static Date currentDateTime = new Date();
	//this variable has current time
	static long currentTime = currentDateTime.getTime();
	//this is OTP expiration time in mili secs
	static long expireTime = 10 * 60 * 1000;
	//this is OTP expire time in Date Object
	static Date expireDateTime = new Date (currentTime + expireTime);
	
	public static String createJWT(String email, int OTP) {
		String token = JWT.create()
				          .withIssuer("SEC-E")
						  .withSubject(email)
						  .withClaim("otp", OTP)
//						  .withClaim("phoneNum", phone)
//						  .withClaim("userName", name)
//						  .withClaim("adhar", adhar)
						  .withIssuedAt(currentDateTime)
						  .withExpiresAt(expireDateTime)
						  .sign(algo);
		return token;
	}
	
	public static String verifyJWT(String token) {
		try {
			DecodedJWT decode =  JWT.require(algo)
					.build().verify(token);
			return decode.getSubject();
//			System.out.println("THE TOKEN IS VALID");
//			System.out.println("The issuer name is " + decode.getIssuer());
//			System.out.println("The email add is " + decode.getSubject());
//			System.out.println("The OTP is " + decode.getClaim("otp"));
//			System.out.println("The user name is " + decode.getClaim("userName"));
//			System.out.println("The phone num is " + decode.getClaim("phoneNum"));
//			System.out.println("The adhar is " + decode.getClaim("adhar"));
//			System.out.println("The token issue date is " + decode.getIssuedAt());
//			System.out.println("The token expire date is " + decode.getExpiresAt());
		} catch (Exception e) {
			System.out.println("TOKEN IS EXPIRED, PLEASE RETRY");
			return "";
		}
		
	}
	
	
	public static void main(String a[]) {
//		createJWT("admin@rdec.in", 123456, "Ayush Singh", 123123, "xxxx-xxxx-xxxx");
		
		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJTRUMtRSIsInN1YiI6ImFkbWluQHJkZWMuaW4iLCJvdHAiOjEyMzQ1NiwicGhvbmVOdW0iOjEyMzEyMywidXNlck5hbWUiOiJBeXVzaCBTaW5naCIsImFkaGFyIjoieHh4eC14eHh4LXh4eHgiLCJpYXQiOjE3NjQwNTcyMzIsImV4cCI6MTc2NDA1NzQxMn0.6MAChObFDwlzrg9wh6i-l_U4EiHHI-APppT6nZVxqq8-";
		verifyJWT(token);
	}
	
	
}
