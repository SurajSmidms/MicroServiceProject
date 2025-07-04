package com.smidms.gateway_service.filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Predicate;

@Component
public class RoleValidator {

    public static final List<String> openApiEndpoints = List.of(
            "/auth/register",
            "/auth/authenticate",
            "/eureka"
    );

    public Predicate<ServerHttpRequest> isSecured = request->openApiEndpoints.stream().
            noneMatch(uri->request.getURI().getPath().contains(uri));

}
