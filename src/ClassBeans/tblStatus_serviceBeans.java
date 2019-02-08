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
public class tblStatus_serviceBeans {
    
    private int id_status;
    private String nome_sts;

    /**
     * @return the id_status
     */
    public int getId_status() {
        return id_status;
    }

    /**
     * @param id_status the id_status to set
     */
    public void setId_status(int id_status) {
        this.id_status = id_status;
    }

    /**
     * @return the nome_sts
     */
    public String getNome_sts() {
        return nome_sts;
    }

    /**
     * @param nome_sts the nome_sts to set
     */
    public void setNome_sts(String nome_sts) {
        this.nome_sts = nome_sts;
    }

    @Override
    public String toString() {
        return getNome_sts();
    }
    
    
    
}
