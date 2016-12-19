package org.InfrastrcutureUtils;

import java.security.Key;
import io.jsonwebtoken.impl.crypto.MacProvider;

public class TokenUtility {

	private static Key key = MacProvider.generateKey();
	private static String issuer;
	private static long expiration=36000;;
	
	public static Key getKey() {
		return key;
	}

	public static String getIssuer() {
		return issuer;
	}

	public static long getExpiration() {
		return expiration;
	}
	
}
