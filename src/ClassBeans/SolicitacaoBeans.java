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
public class SolicitacaoBeans {

    private int id_sol;
    private String nome_sol;
    private String numero_cont;
    private String email;
    private String info_atend;
    private String data_sol;
    private tblStatus_serviceBeans sts_id;

    /**
     * @return the id_sol
     */
    public int getId_sol() {
        return id_sol;
    }

    /**
     * @param id_sol the id_sol to set
     */
    public void setId_sol(int id_sol) {
        this.id_sol = id_sol;
    }

    /**
     * @return the nome_sol
     */
    public String getNome_sol() {
        return nome_sol;
    }

    /**
     * @param nome_sol the nome_sol to set
     */
    public void setNome_sol(String nome_sol) {
        this.nome_sol = nome_sol;
    }

    /**
     * @return the numero_cont
     */
    public String getNumero_cont() {
        return numero_cont;
    }

    /**
     * @param numero_cont the numero_cont to set
     */
    public void setNumero_cont(String numero_cont) {
        this.numero_cont = numero_cont;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the info_atend
     */
    public String getInfo_atend() {
        return info_atend;
    }

    /**
     * @param info_atend the info_atend to set
     */
    public void setInfo_atend(String info_atend) {
        this.info_atend = info_atend;
    }

    /**
     * @return the data_sol
     */
    public String getData_sol() {
        return data_sol;
    }

    /**
     * @param data_sol the data_sol to set
     */
    public void setData_sol(String data_sol) {
        this.data_sol = data_sol;
    }

    /**
     * @return the sts_id
     */
    public tblStatus_serviceBeans getSts_id() {
        return sts_id;
    }

    /**
     * @param sts_id the sts_id to set
     */
    public void setSts_id(tblStatus_serviceBeans sts_id) {
        this.sts_id = sts_id;
    }
}