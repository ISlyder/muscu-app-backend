package com.cduvivier.muscu.security;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

import java.util.ArrayList;

public class RequestHeaderAuthenticationProvider implements AuthenticationProvider {
	@Value("${api.auth.secret}")
	private String apiAuthSecret;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String authSecretKey = String.valueOf(authentication.getPrincipal());

		if (StringUtils.isBlank(authSecretKey) || !authSecretKey.equals(apiAuthSecret)) {
			throw new BadCredentialsException("Bad Request Header Credentials");
		}

		return new PreAuthenticatedAuthenticationToken(authentication.getPrincipal(), null, new ArrayList<>());
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(PreAuthenticatedAuthenticationToken.class);
	}
}
