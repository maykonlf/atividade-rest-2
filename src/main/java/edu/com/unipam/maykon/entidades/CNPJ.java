package edu.com.unipam.maykon.entidades;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CNPJ {
    @SerializedName("atividade_principal")
    private Atividade atividadePrincipal;
    @SerializedName("data_situacao")
    private String dataSituacao;
    private String nome;
    private String uf;
    private String telefone;
    @SerializedName("atividades_secundarias")
    private List<Atividade> atividadesSecundarias;
    @SerializedName("qsa")
    private List<Socio> quadroSocioAdministradores;
    private String situacao;
    private String bairro;
    private String logradouro;
    private String numero;
    private String cep;
    private String municipio;
    private String abertura;
    @SerializedName("natureza_juridica")
    private String naturezaJuridica;
    private String fantasia;
    private String cnpj;
    @SerializedName("ultima_atualizacao")
    private String ultimaAtualizacao;
    private String status;
    private String tipo;
    private String complemento;
    private String email;
    @SerializedName("efr")
    private String enteFederativoResponsavel;
    @SerializedName("motivo_situacao")
    private String motivoSituacao;
    @SerializedName("situacao_especial")
    private String situacaoEspecial;
    @SerializedName("data_situacao_especial")
    private String dataSituacaoEspecial;
    @SerializedName("capital_social")
    private String capitalSocial;
    private Object extra;

    public Atividade getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public void setAtividadePrincipal(Atividade atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }

    public String getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(String dataSituacao) {
        this.dataSituacao = dataSituacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Atividade> getAtividadesSecundarias() {
        return atividadesSecundarias;
    }

    public void setAtividadesSecundarias(List<Atividade> atividadesSecundarias) {
        this.atividadesSecundarias = atividadesSecundarias;
    }

    public List<Socio> getQuadroSocioAdministradores() {
        return quadroSocioAdministradores;
    }

    public void setQuadroSocioAdministradores(List<Socio> quadroSocioAdministradores) {
        this.quadroSocioAdministradores = quadroSocioAdministradores;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getNaturezaJuridica() {
        return naturezaJuridica;
    }

    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnteFederativoResponsavel() {
        return enteFederativoResponsavel;
    }

    public void setEnteFederativoResponsavel(String enteFederativoResponsavel) {
        this.enteFederativoResponsavel = enteFederativoResponsavel;
    }

    public String getMotivoSituacao() {
        return motivoSituacao;
    }

    public void setMotivoSituacao(String motivoSituacao) {
        this.motivoSituacao = motivoSituacao;
    }

    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public String getDataSituacaoEspecial() {
        return dataSituacaoEspecial;
    }

    public void setDataSituacaoEspecial(String dataSituacaoEspecial) {
        this.dataSituacaoEspecial = dataSituacaoEspecial;
    }

    public String getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }
}
