package com.server.model;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name is mandatory")
    @Column(nullable = false)
    private String firstname;


    @NotBlank(message = "Name is mandatory")
    @Column(nullable = false)
    private String lastname;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    @Column(nullable = false, unique = true)
    private String email;

	@NotBlank(message = "Password is mandatory")
	@Column(nullable = false)
	private String password;

	private Role role;

	Collection<? extends GrantedAuthority> getAuthorities();

	String getPassword();

	String getUsername();
 
	boolean isAccountNonExpired();
 
	boolean isAccountNonLocked();
 
	boolean isCredentialsNonExpired();
 
	boolean isEnabled();

}
