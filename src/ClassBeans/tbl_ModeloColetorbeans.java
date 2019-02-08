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
public class tbl_ModeloColetorbeans {
    
    private int id_mdc;
    private String nome_mdc;

    /**
     * @return the id_mdc
     */
    public int getId_mdc() {
        return id_mdc;
    }

    /**
     * @param id_mdc the id_mdc to set
     */
    public void setId_mdc(int id_mdc) {
        this.id_mdc = id_mdc;
    }

    /**
     * @return the nome_mdc
     */
    public String getNome_mdc() {
        return nome_mdc;
    }

    /**
     * @param nome_mdc the nome_mdc to set
     */
    public void setNome_mdc(String nome_mdc) {
        this.nome_mdc = nome_mdc;
    }

    @Override
    public String toString() {
       return getNome_mdc();
    }
}