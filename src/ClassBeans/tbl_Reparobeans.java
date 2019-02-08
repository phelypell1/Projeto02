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
public class tbl_Reparobeans {
    private int id_reparo;
    private tbl_MarcaColetorbeans mmc_id;
    private tbl_ModeloColetorbeans mdc_id;
    private String data_solicitacao;
    private UsuariosBeans user_id;
    private String info_sol;
    private tbl_PrioridadeBeans prioridade_id;

    /**
     * @return the id_reparo
     */
    public int getId_reparo() {
        return id_reparo;
    }

    /**
     * @param id_reparo the id_reparo to set
     */
    public void setId_reparo(int id_reparo) {
        this.id_reparo = id_reparo;
    }

    /**
     * @return the mmc_id
     */
    public tbl_MarcaColetorbeans getMmc_id() {
        return mmc_id;
    }

    /**
     * @param mmc_id the mmc_id to set
     */
    public void setMmc_id(tbl_MarcaColetorbeans mmc_id) {
        this.mmc_id = mmc_id;
    }

    /**
     * @return the mdc_id
     */
    public tbl_ModeloColetorbeans getMdc_id() {
        return mdc_id;
    }

    /**
     * @param mdc_id the mdc_id to set
     */
    public void setMdc_id(tbl_ModeloColetorbeans mdc_id) {
        this.mdc_id = mdc_id;
    }

    /**
     * @return the data_solicitacao
     */
    public String getData_solicitacao() {
        return data_solicitacao;
    }

    /**
     * @param data_solicitacao the data_solicitacao to set
     */
    public void setData_solicitacao(String data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }

    /**
     * @return the user_id
     */
    public UsuariosBeans getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(UsuariosBeans user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the info_sol
     */
    public String getInfo_sol() {
        return info_sol;
    }

    /**
     * @param info_sol the info_sol to set
     */
    public void setInfo_sol(String info_sol) {
        this.info_sol = info_sol;
    }

    /**
     * @return the prioridade_id
     */
    public tbl_PrioridadeBeans getPrioridade_id() {
        return prioridade_id;
    }

    /**
     * @param prioridade_id the prioridade_id to set
     */
    public void setPrioridade_id(tbl_PrioridadeBeans prioridade_id) {
        this.prioridade_id = prioridade_id;
    }
}