package wcs.blog.model;

import javax.persistence.*;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// On précise que la propriété name de rôle est la valeur de l'énumération ERole
	@Enumerated(EnumType.STRING)
	@Column(length = 15)
	private ERole name;

	public Role() {}

	public Role(ERole name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}
}