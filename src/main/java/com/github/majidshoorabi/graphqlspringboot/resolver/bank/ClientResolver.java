package com.github.majidshoorabi.graphqlspringboot.resolver.bank;

import com.github.majidshoorabi.graphqlspringboot.domain.banck.BankAccount;
import com.github.majidshoorabi.graphqlspringboot.domain.banck.Client;
import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author majid.shoorabi
 * @created 2022-03-July
 * @project IntelliJ IDEA
 */

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    public DataFetcherResult<Client> client(BankAccount bankAccount) {
        log.info("Requesting client data for bank account id {}", bankAccount.getId());

        /**
         * 1: Call multiple service
         * 2: Call another graphql server
         * 3: Call service that returns partial responses
         */

        return DataFetcherResult.<Client>newResult()
                .data(Client.builder()
                        .id(UUID.randomUUID())
                        .firstname("Majid")
                        .lastname("Shoorabi")
                        .build())
                .error(new GenericGraphQLError("Cloud not get seb-client id"))
                .build();
    }
}
