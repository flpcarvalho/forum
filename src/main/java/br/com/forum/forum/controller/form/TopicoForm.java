package br.com.forum.forum.controller.form;

import br.com.forum.forum.modelo.Curso;
import br.com.forum.forum.modelo.Topico;
import br.com.forum.forum.repository.CursoRepository;

import javax.validation.constraints.NotBlank;


public class TopicoForm {

    @NotBlank
    private String titulo;
    @NotBlank
    private String mensagem;
    @NotBlank
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return  new Topico(titulo, mensagem, curso);
    }
}
