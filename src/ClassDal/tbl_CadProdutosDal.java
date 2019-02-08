/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDal;

import ClassBeans.tbl_CadProdutos;
import DbConnection.MySqlConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class tbl_CadProdutosDal {
    
    public void CadastroProdutos(tbl_CadProdutos cprod){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        String sql;

        try {
            sql ="insert into tbl_CadProdutos(cod_prod, nome_prod, data_compra, data_baixa, qnt_itens, num_fFiscal) "
                    + "values (?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cprod.getCod_produto());
            pst.setString(2, cprod.getNome_prod());
            pst.setString(3, cprod.getData_compra());
            pst.setString(4, cprod.getData_baixa());
            pst.setInt(5, cprod.getQtn_itens());
            pst.setInt(6, cprod.getNum_fFiscal());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public List<tbl_CadProdutos> ListaProdutos(){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<tbl_CadProdutos> listProd = new ArrayList<>();
        try {
            sql = "select id_prod, cod_prod, nome_prod, data_compra, data_baixa, qnt_itens, num_fFiscal from tbl_CadProdutos";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                tbl_CadProdutos prod = new tbl_CadProdutos();
                
                prod.setId_prod(rs.getInt("id_prod"));
                prod.setCod_produto(rs.getInt("cod_prod"));
                prod.setNome_prod(rs.getString("nome_prod"));
                prod.setData_compra(rs.getString("data_compra"));
                prod.setData_baixa(rs.getString("data_baixa"));
                prod.setQtn_itens(rs.getInt("qnt_itens"));
                prod.setNum_fFiscal(rs.getInt("num_fFiscal"));
                listProd.add(prod);
            }
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null,e.getMessage());
        }
        return listProd;
    }
    
    public void Update(tbl_CadProdutos prod){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        String sql;
        
        try {
            sql = "update tbl_CadProdutos set cod_prod = ?, nome_prod = ?, data_compra = ?, data_baixa = ?, qnt_itens = ?, num_fFiscal=? "
                    + "where id_prod = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, prod.getCod_produto());
            pst.setString(2, prod.getNome_prod());
            pst.setString(3, prod.getData_compra());
            pst.setString(4, prod.getData_baixa());
            pst.setInt(5, prod.getQtn_itens());
            pst.setInt(6, prod.getNum_fFiscal());
            pst.setInt(7, prod.getId_prod());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atulizado com sucesso !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
}
