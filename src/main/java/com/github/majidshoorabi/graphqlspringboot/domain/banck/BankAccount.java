package com.github.majidshoorabi.graphqlspringboot.domain.banck;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

/**
 * @author majid.shoorabi
 * @created 2022-02-July
 * @project IntelliJ IDEA
 */

@Value
@Builder
public class BankAccount {

    private UUID id;
    private String name;
    private Currency currency;
}
