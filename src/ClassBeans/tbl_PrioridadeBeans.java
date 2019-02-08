/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassBeans;

/**
 *
 * @author phelype
 */
public class tbl_PrioridadeBeans {
    private int id_prioridade;
    private String nome_prioridade;

    /**
     * @return the id_prioridade
     */
    public int getId_prioridade() {
        return id_prioridade;
    }

    /**
     * @param id_prioridade the id_prioridade to set
     */
    public void setId_prioridade(int id_prioridade) {
        this.id_prioridade = id_prioridade;
    }

    /**
     * @return the nome_prioridade
     */
    public String getNome_prioridade() {
        return nome_prioridade;
    }

    /**
     * @param nome_prioridade the nome_prioridade to set
     */
    public void setNome_prioridade(String nome_prioridade) {
        this.nome_prioridade = nome_prioridade;
    }

    @Override
    public String toString() {
        return getNome_prioridade();
    }
}