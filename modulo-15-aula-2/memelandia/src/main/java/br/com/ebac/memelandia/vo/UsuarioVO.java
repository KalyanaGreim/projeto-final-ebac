package br.com.ebac.memelandia.vo;

import java.io.Serializable;
import java.sql.Date;

public class UsuarioVO implements Serializable {
    private final Long id;
    private final String nome;
    private final String email;
    private final Date dataCadastro;

    private String idNovoUsuario;

    public String getIdNovoUsuario() {
        return idNovoUsuario;
    }

    public void setIdNovoUsuario(String idNovoUsuario) {
        this.idNovoUsuario = idNovoUsuario;
    }

    public UsuarioVO(Long id, String nome, String email, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }

}
