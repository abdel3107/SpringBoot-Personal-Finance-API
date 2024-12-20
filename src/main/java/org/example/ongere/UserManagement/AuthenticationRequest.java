package org.example.ongere.UserManagement;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {

    private String phoneNumber;

    String password;
}
