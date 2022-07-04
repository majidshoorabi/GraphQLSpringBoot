package com.github.majidshoorabi.graphqlspringboot.exception;

import graphql.GraphQLError;
import graphql.kickstart.execution.error.GraphQLErrorHandler;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author majid.shoorabi
 * @created 2022-04-July
 * @project IntelliJ IDEA
 */

@Component
public class CustomGraphqlErrorHandler implements GraphQLErrorHandler {

    @Override
    public List<GraphQLError> processErrors(List<GraphQLError> errors) {
        return errors;
    }
}
