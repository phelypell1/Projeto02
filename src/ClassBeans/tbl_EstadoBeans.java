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
public class tbl_EstadoBeans {
    
    private int id_est;
    private String nome_est;
    private String sigla_est;

    /**
     * @return the id_est
     */
    public int getId_est() {
        return id_est;
    }

    /**
     * @param id_est the id_est to set
     */
    public void setId_est(int id_est) {
        this.id_est = id_est;
    }

    /**
     * @return the nome_est
     */
    public String getNome_est() {
        return nome_est;
    }

    /**
     * @param nome_est the nome_est to set
     */
    public void setNome_est(String nome_est) {
        this.nome_est = nome_est;
    }

    /**
     * @return the sigla_est
     */
    public String getSigla_est() {
        return sigla_est;
    }

    /**
     * @param sigla_est the sigla_est to set
     */
    public void setSigla_est(String sigla_est) {
        this.sigla_est = sigla_est;
    }

    @Override
    public String toString() {
        return getSigla_est();
    }
}