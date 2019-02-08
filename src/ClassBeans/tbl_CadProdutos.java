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
public class tbl_CadProdutos {
    private int id_prod;
    private int cod_produto;
    private String nome_prod;
    private String data_compra;
    private String data_baixa;
    private int qtn_itens;
    private int num_fFiscal;

    /**
     * @return the id_prod
     */
    public int getId_prod() {
        return id_prod;
    }

    /**
     * @param id_prod the id_prod to set
     */
    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    /**
     * @return the cod_produto
     */
    public int getCod_produto() {
        return cod_produto;
    }

    /**
     * @param cod_produto the cod_produto to set
     */
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    /**
     * @return the nome_prod
     */
    public String getNome_prod() {
        return nome_prod;
    }

    /**
     * @param nome_prod the nome_prod to set
     */
    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    /**
     * @return the data_compra
     */
    public String getData_compra() {
        return data_compra;
    }

    /**
     * @param data_compra the data_compra to set
     */
    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    /**
     * @return the data_baixa
     */
    public String getData_baixa() {
        return data_baixa;
    }

    /**
     * @param data_baixa the data_baixa to set
     */
    public void setData_baixa(String data_baixa) {
        this.data_baixa = data_baixa;
    }

    /**
     * @return the qtn_itens
     */
    public int getQtn_itens() {
        return qtn_itens;
    }

    /**
     * @param qtn_itens the qtn_itens to set
     */
    public void setQtn_itens(int qtn_itens) {
        this.qtn_itens = qtn_itens;
    }

    /**
     * @return the num_fFiscal
     */
    public int getNum_fFiscal() {
        return num_fFiscal;
    }

    /**
     * @param num_fFiscal the num_fFiscal to set
     */
    public void setNum_fFiscal(int num_fFiscal) {
        this.num_fFiscal = num_fFiscal;
    }
}