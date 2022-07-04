package com.github.majidshoorabi.graphqlspringboot.resolver.bank;

import com.github.majidshoorabi.graphqlspringboot.domain.banck.BankAccount;
import com.github.majidshoorabi.graphqlspringboot.domain.banck.Client;
import graphql.GraphQLException;
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

    public Client client(BankAccount bankAccount) {
        log.info("Requesting client data for bank account id {}", bankAccount.getId());

//        throw new GraphQLException("Client unavailable");

        throw new RuntimeException("Spring Application cant connect to database.");

//        return Client.builder()
//                .id(UUID.randomUUID())
//                .firstname("Majid")
//                .lastname("Shoorabi")
//                .build();

    }
}
