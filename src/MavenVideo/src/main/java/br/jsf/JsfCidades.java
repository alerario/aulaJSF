/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alexandre
 */
@ManagedBean
@RequestScoped
public class JsfCidades {

    /**
     * Creates a new instance of JsfCidades
     */
    public JsfCidades() {
    }
    
    private int codigo;
    private String nome;

    public void salvar(){
        br.data.entity.Cidades cid;
        cid = new br.data.entity.Cidades();
        cid.setCodigo(codigo);
        cid.setNome(nome);
        new br.data.crud.CrudCidades().persist(cid);
    }
    
    public void remove(br.data.entity.Cidades cid){
        new br.data.crud.CrudCidades().remove(cid);
    }
    
    public void merge(){
        br.data.entity.Cidades cid;
        cid = new br.data.entity.Cidades();
        cid.setCodigo(codigo);
        cid.setNome(nome);
        new br.data.crud.CrudCidades().merge(cid);
    }
    
    public void load_data(br.data.entity.Cidades cid){
        this.codigo = cid.getCodigo();
        this.nome = cid.getNome();
    }
    public java.util.Collection<br.data.entity.Cidades> getAll(){
        return new br.data.crud.CrudCidades().getAll();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
