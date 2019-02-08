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
public class tbl_CidadesBeans {
     private int id_cid;
     private String nome_cid;

    /**
     * @return the id_cid
     */
    public int getId_cid() {
        return id_cid;
    }

    /**
     * @param id_cid the id_cid to set
     */
    public void setId_cid(int id_cid) {
        this.id_cid = id_cid;
    }

    /**
     * @return the nome_cid
     */
    public String getNome_cid() {
        return nome_cid;
    }

    /**
     * @param nome_cid the nome_cid to set
     */
    public void setNome_cid(String nome_cid) {
        this.nome_cid = nome_cid;
    }

    @Override
    public String toString() {
        return getNome_cid();
    }
}