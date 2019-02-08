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
public class tbl_EmpresaBeans {
    
    private int id_emp;
    private String nome_emp;
    private String end_emp;
    private tbl_CidadesBeans cid_emp;
    private tbl_EstadoBeans est_emp;
    private String cep;
    private String ativa;
    private String num_tel;

    /**
     * @return the id_emp
     */
    public int getId_emp() {
        return id_emp;
    }

    /**
     * @param id_emp the id_emp to set
     */
    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    /**
     * @return the nome_emp
     */
    public String getNome_emp() {
        return nome_emp;
    }

    /**
     * @param nome_emp the nome_emp to set
     */
    public void setNome_emp(String nome_emp) {
        this.nome_emp = nome_emp;
    }

    /**
     * @return the end_emp
     */
    public String getEnd_emp() {
        return end_emp;
    }

    /**
     * @param end_emp the end_emp to set
     */
    public void setEnd_emp(String end_emp) {
        this.end_emp = end_emp;
    }

    /**
     * @return the cid_emp
     */
    public tbl_CidadesBeans getCid_emp() {
        return cid_emp;
    }

    /**
     * @param cid_emp the cid_emp to set
     */
    public void setCid_emp(tbl_CidadesBeans cid_emp) {
        this.cid_emp = cid_emp;
    }

    /**
     * @return the est_emp
     */
    public tbl_EstadoBeans getEst_emp() {
        return est_emp;
    }

    /**
     * @param est_emp the est_emp to set
     */
    public void setEst_emp(tbl_EstadoBeans est_emp) {
        this.est_emp = est_emp;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the ativa
     */
    public String getAtiva() {
        return ativa;
    }

    /**
     * @param ativa the ativa to set
     */
    public void setAtiva(String ativa) {
        this.ativa = ativa;
    }

    /**
     * @return the num_tel
     */
    public String getNum_tel() {
        return num_tel;
    }

    /**
     * @param num_tel the num_tel to set
     */
    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    @Override
    public String toString() {
        return getNome_emp();
    }
    
    
}
