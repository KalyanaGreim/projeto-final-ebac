package br.com.ebac.memelandia.vo;

import java.io.Serializable;
import java.sql.Date;

public class NovoMemeVO implements Serializable {

    private final String id;

    private final String nome;

    private final String descricao;

    private final Date dataCadastro;

    public NovoMemeVO(String id, String nome, String descricao, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
}
