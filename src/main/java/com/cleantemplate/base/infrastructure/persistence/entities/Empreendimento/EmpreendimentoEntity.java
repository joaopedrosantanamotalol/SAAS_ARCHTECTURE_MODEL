package com.cleantemplate.base.infrastructure.persistence.entities.Empreendimento;

import com.cleantemplate.base.domain.entities.enums.empreendimento.EmpreendimentoENUM;
import com.cleantemplate.base.domain.entities.enums.empreendimento.PorteEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "empreendimento")
public class EmpreendimentoEntity {
    /* fiquei com preguiça de aplicar tudo certo fodasekkkkkk */

    private Long id;

    private String nome;

    private String CNPJ;

    private String desc;

    private String emailContato;

    private EmpreendimentoENUM empreendimento;

    private PorteEnum porte;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public EmpreendimentoENUM getEmpreendimento() {
        return empreendimento;
    }

    public void setEmpreendimento(EmpreendimentoENUM empreendimento) {
        this.empreendimento = empreendimento;
    }

    public PorteEnum getPorte() {
        return porte;
    }

    public void setPorte(PorteEnum porte) {
        this.porte = porte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
