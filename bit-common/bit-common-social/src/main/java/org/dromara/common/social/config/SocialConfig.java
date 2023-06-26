package com.bit.common.social.config;

import me.zhyd.oauth.cache.AuthStateCache;
import com.bit.common.social.config.properties.SocialProperties;
import com.bit.common.social.utils.AuthRedisStateCache;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Social 配置属性
 * @author thiszhc
 */
@AutoConfiguration
@EnableConfigurationProperties(SocialProperties.class)
public class SocialConfig {

    @Bean
    public AuthStateCache authStateCache(SocialProperties socialProperties) {
        return new AuthRedisStateCache(socialProperties);
    }

}
