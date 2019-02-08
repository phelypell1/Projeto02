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
public class tbl_AtendimentoBeans {
    
    private int id_atend;
    private SolicitacaoBeans sol_id;
    private String data_Alteracao;
    private UsuariosBeans user_id;
    private tblStatus_serviceBeans sts_id;
    /**
     * @return the id_atend
     */
    public int getId_atend() {
        return id_atend;
    }

    /**
     * @param id_atend the id_atend to set
     */
    public void setId_atend(int id_atend) {
        this.id_atend = id_atend;
    }

    /**
     * @return the sol_id
     */
    public SolicitacaoBeans getSol_id() {
        return sol_id;
    }

    /**
     * @param sol_id the sol_id to set
     */
    public void setSol_id(SolicitacaoBeans sol_id) {
        this.sol_id = sol_id;
    }

    /**
     * @return the data_Alteracao
     */
    public String getData_Alteracao() {
        return data_Alteracao;
    }

    /**
     * @param data_Alteracao the data_Alteracao to set
     */
    public void setData_Alteracao(String data_Alteracao) {
        this.data_Alteracao = data_Alteracao;
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
