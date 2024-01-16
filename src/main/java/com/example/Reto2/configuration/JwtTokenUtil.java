package com.example.Reto2.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
	// asignamos tiempo de validez del token. A partir de ahi no podra utilizarlo.
	private static final long EXPIRE_DURATION = 24 * 60 * 60 * 1000; // 24h. ojo esto no deberia ser tan largo
	
}
