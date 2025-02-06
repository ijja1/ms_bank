package fr.estia.mbds.account;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Customer {
    private Long id;
    private String fristName;
    private String lastName;
    private String email;
}
