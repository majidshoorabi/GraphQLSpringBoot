package com.github.majidshoorabi.graphqlspringboot.exception;

import graphql.GraphQLException;
import graphql.kickstart.spring.error.ThrowableGraphQLError;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author majid.shoorabi
 * @created 2022-03-July
 * @project IntelliJ IDEA
 */

@Component
public class GraphqlExceptionHandler {

    @ExceptionHandler(GraphQLException.class)
    public ThrowableGraphQLError handle(GraphQLException e){
        return new ThrowableGraphQLError(e);
    }

    @ExceptionHandler(RuntimeException.class)
    public ThrowableGraphQLError handle(RuntimeException e){
        return new ThrowableGraphQLError(e, "Internal server Error.");
    }
}
