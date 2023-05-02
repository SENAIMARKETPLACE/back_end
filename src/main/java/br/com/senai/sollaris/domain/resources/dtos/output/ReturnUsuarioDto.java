package br.com.senai.sollaris.domain.resources.dtos.output;

import java.time.LocalDateTime;
import java.util.List;

import br.com.senai.sollaris.domain.Usuario;
import br.com.senai.sollaris.domain.enums.Generos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor

public class ReturnUsuarioDto {
	private Integer id;
	private LocalDateTime data_requisicao = LocalDateTime.now();
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private Generos genero;
	private String img;
	private List<ReturnEnderecoDto> enderecos;
	
	public ReturnUsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.genero = usuario.getGenero();
		this.img = usuario.getImg();
		this.cpf = usuario.getCpf();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		this.enderecos = usuario.getEnderecos().stream().map(endereco -> new ReturnEnderecoDto(endereco)).toList();
	}
}
	

