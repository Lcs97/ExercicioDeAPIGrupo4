package br.org.serratec.biblioteca.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "perfil_id")
	private Integer perfilId;
	
	@Column (name = "nome")
	private String nome;
	
	@Column (name = "descricao")
	private String descricao;
	
	@OneToMany(mappedBy = "perfil") // 1 Perfil / N Usuarios
    private List<Usuario> usuario;

	public Perfil() {
		
	}
	
	public Perfil(Integer perfilId, String nome, String descricao) {
		super();
		this.perfilId = perfilId;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Integer getPerfilId() {
		return perfilId;
	}

	public void setPerfilId(Integer perfilId) {
		this.perfilId = perfilId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
