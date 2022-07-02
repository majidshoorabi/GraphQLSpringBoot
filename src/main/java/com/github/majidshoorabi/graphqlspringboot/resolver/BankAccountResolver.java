package com.github.majidshoorabi.graphqlspringboot.resolver;

import com.github.majidshoorabi.graphqlspringboot.domain.banck.BankAccount;
import com.github.majidshoorabi.graphqlspringboot.domain.banck.Client;
import com.github.majidshoorabi.graphqlspringboot.domain.banck.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author majid.shoorabi
 * @created 2022-02-July
 * @project IntelliJ IDEA
 */

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id){
      log.info("Retrieving bank account id: {}", id);

      var clientA = Client.builder()
              .id(UUID.randomUUID())
              .firstname("Majid")
              .lastname("Shoorabi")
              .build();


        var clientB = Client.builder()
                .id(UUID.randomUUID())
                .firstname("Majid")
                .lastname("Shoorabi")
                .build();

        clientA.setClient(clientB);
        clientB.setClient(clientA);

      return BankAccount.builder()
              .id(id)
              .currency(Currency.USD)
              .name("Majid")
              .client(clientA)
              .build();
    }

}
