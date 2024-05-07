package br.com.ebac.memelandia.vo;

import java.io.Serializable;
import java.sql.Date;

public class MemeVO implements Serializable {

    private final Long id;

    private final String nome;

    private final String descricao;

    private final Date dataCadastro;

    private String idNovoMeme;

    public String getIdNovoMeme() {
        return idNovoMeme;
    }

    public void setIdNovoMeme(String idNovoMeme) {
        this.idNovoMeme = idNovoMeme;
    }


    public MemeVO(Long id, String nome, String descricao, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
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
