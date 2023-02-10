package com.appsdeveloperblog.app.ws.ui.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsRequestModel {
    @NotNull(message="First name cannot be null")
    @Size(min = 2,message = "First name must not be less than 2 characters")
    private String firstName;
    @NotNull(message="Last name cannot be null")
    @Size(min = 2,message = "Last name must not be less than 2 characters")
    private String lastName;
    @NotNull(message="Email name cannot be null")
    @Email
    private String email;
    @NotNull(message="Password name cannot be null")
    @Size(min = 8,max = 16,message = "Password must be equal or greater 8 characters and less than 16 characters")
    private String password;
}
