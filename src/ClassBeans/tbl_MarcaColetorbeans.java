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
public class tbl_MarcaColetorbeans {
    private int id_mmc;
    private String nome_mmc;

    /**
     * @return the id_mmc
     */
    public int getId_mmc() {
        return id_mmc;
    }

    /**
     * @param id_mmc the id_mmc to set
     */
    public void setId_mmc(int id_mmc) {
        this.id_mmc = id_mmc;
    }

    /**
     * @return the nome_mmc
     */
    public String getNome_mmc() {
        return nome_mmc;
    }

    /**
     * @param nome_mmc the nome_mmc to set
     */
    public void setNome_mmc(String nome_mmc) {
        this.nome_mmc = nome_mmc;
    }

    @Override
    public String toString() {
        return getNome_mmc();
    }
}