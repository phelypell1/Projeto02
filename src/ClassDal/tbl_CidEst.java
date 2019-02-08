/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDal;

import ClassBeans.tbl_CidadesBeans;
import ClassBeans.tbl_EmpresaBeans;
import ClassBeans.tbl_EstadoBeans;
import DbConnection.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class tbl_CidEst {
   
    public List<tbl_EstadoBeans> Estados() {
        Connection con = MySqlConnection.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<tbl_EstadoBeans> listEstados = new ArrayList<>();

        try {
            pst = con.prepareStatement("select id_est,sigla_est from tbl_Estados");
            rs = pst.executeQuery();

            while (rs.next()) {
                tbl_EstadoBeans user = new tbl_EstadoBeans();
                user.setId_est(rs.getInt("id_est"));
                //user.setNome_est(rs.getString("nome_est"));
                user.setSigla_est(rs.getString("sigla_est"));
                listEstados.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Estados'\n" +e.getMessage());
        }
        return listEstados;

    }
    
    
    public List<tbl_CidadesBeans> Cidades() {
        Connection con = MySqlConnection.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<tbl_CidadesBeans> listCidades = new ArrayList<>();

        try {
            pst = con.prepareStatement("select * from tbl_Cidades");
            rs = pst.executeQuery();

            while (rs.next()) {
                tbl_CidadesBeans user = new tbl_CidadesBeans();
                user.setId_cid(rs.getInt("id_cid"));
                user.setNome_cid(rs.getString("nome_cid"));
                listCidades.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar dados para o jcombox 'table.Cidades'");
        }
        return listCidades;

    }
    public List<tbl_EmpresaBeans> ListEmpresas(){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        
        List<tbl_EmpresaBeans> listaEmp = new ArrayList<>();
        
        try {
            pst =  conn.prepareStatement("select id_emp, nome_emp from tbl_Empresas order by nome_emp");
            rs = pst.executeQuery();
            
            while(rs.next()){
                tbl_EmpresaBeans tbl = new tbl_EmpresaBeans();
                tbl.setId_emp(rs.getInt("id_emp"));
                tbl.setNome_emp(rs.getString("nome_emp"));
                listaEmp.add(tbl);
            }
        } catch (Exception e) {
        }
        return listaEmp;
    }
}