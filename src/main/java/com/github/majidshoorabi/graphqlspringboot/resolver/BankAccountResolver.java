package com.github.majidshoorabi.graphqlspringboot.resolver;

import com.github.majidshoorabi.graphqlspringboot.domain.banck.BankAccount;
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
      return BankAccount.builder().id(id).currency(Currency.USD).name("Majid").build();
    }

}
