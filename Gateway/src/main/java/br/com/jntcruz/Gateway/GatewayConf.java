package br.com.jntcruz.Gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConf {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("funcionario", r -> r.path("/funcionario/**")
                        .uri("lb://FUNCIONARIO-MS/"))
                .route("folha", r -> r.path("/folhas/**")
                        .uri("lb://FOLHA-MS/"))
                .build();
    }
}
