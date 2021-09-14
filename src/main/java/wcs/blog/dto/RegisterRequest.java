package wcs.blog.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class RegisterRequest {

	@NotBlank
	@Size(max = 50)
	private String username;
	
	@NotBlank
	@Size(max = 100)
	private  String email;
	
	@NotBlank
	@Size(max = 20)
	private  String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}