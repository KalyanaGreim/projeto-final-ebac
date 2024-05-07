package br.com.ebac.memelandia.vo;

import java.io.Serializable;
import java.sql.Date;

public class NovoUsuarioVO implements Serializable {

    private final String id;
    private final String nome;
    private final String email;

    private final Date dataCadastro;

    public NovoUsuarioVO(String id, String nome, String email, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    public String getId() {
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
