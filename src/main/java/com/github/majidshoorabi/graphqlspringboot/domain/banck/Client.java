package com.github.majidshoorabi.graphqlspringboot.domain.banck;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

/**
 * @author majid.shoorabi
 * @created 2022-02-July
 * @project IntelliJ IDEA
 */

@Getter
@Setter
@Builder
public class Client {

    private UUID id;
    private String firstname;
    private List<String> middleNames;
    private String lastname;
    private Client client;

}
