package org.apereo.cas.config.support;

import org.apereo.cas.authentication.principal.ServiceFactory;
import org.apereo.cas.authentication.principal.ServiceFactoryConfigurer;
import org.apereo.cas.authentication.principal.WebApplicationService;
import org.apereo.cas.authentication.principal.WebApplicationServiceFactory;
import org.apereo.cas.configuration.CasConfigurationProperties;
import org.apereo.cas.util.CollectionUtils;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is {@link CasWebApplicationServiceFactoryConfiguration}.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
@Configuration("webApplicationServiceFactoryConfiguration")
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class CasWebApplicationServiceFactoryConfiguration {
    @Bean
    @ConditionalOnMissingBean(name = "webApplicationServiceFactory")
    public ServiceFactory<WebApplicationService> webApplicationServiceFactory() {
        return new WebApplicationServiceFactory();
    }

    @Bean
    @ConditionalOnMissingBean(name = "casWebApplicationServiceFactoryConfigurer")
    public ServiceFactoryConfigurer casWebApplicationServiceFactoryConfigurer() {
        return () -> CollectionUtils.wrap(webApplicationServiceFactory());
    }

}
