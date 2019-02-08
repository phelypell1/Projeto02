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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class tbl_EmpresaCad {
    
    public void CadastatroEmp(tbl_EmpresaBeans emp){
        
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        String sql;
        
       
        try {
             sql = "insert into tbl_Empresas (nome_emp, end_emp, cid_emp, estado_emp, cep, ativa, num_tel)"
                + "values(?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
            
            pst.setString(1, emp.getNome_emp());
            pst.setString(2, emp.getEnd_emp());
            pst.setInt(3, emp.getCid_emp().getId_cid());
            pst.setInt(4, emp.getEst_emp().getId_est());
            pst.setString(5, emp.getCep());
            pst.setString(6, emp.getAtiva());
            pst.setString(7, emp.getNum_tel());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados Cadastrados com sucesso !");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error ao Inserir dados. "+ex);
        }
    }
    
    public List<tbl_EmpresaBeans> TableEmpresas(){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        
        List<tbl_EmpresaBeans> listEmp = new ArrayList<>();
        
        
        try {
            sql = "select id_emp, nome_emp, end_emp, nome_cid, sigla_est, cep, ativa, num_tel from tbl_Empresas "
                + "inner join tbl_Cidades on id_cid = cid_emp "
                + "inner join tbl_Estados on id_est = estado_emp ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                tbl_EmpresaBeans emp = new tbl_EmpresaBeans();
                
                emp.setId_emp(rs.getInt("id_emp"));
                emp.setNome_emp(rs.getString("nome_emp"));
                emp.setEnd_emp(rs.getString("end_emp"));
                
                tbl_CidadesBeans cid = new tbl_CidadesBeans();
                cid.setNome_cid(rs.getString("nome_cid"));
                emp.setCid_emp(cid);
                
                tbl_EstadoBeans est = new tbl_EstadoBeans();
                est.setSigla_est(rs.getString("sigla_est"));
                emp.setEst_emp(est);
                
                emp.setCep(rs.getString("cep"));
                emp.setAtiva(rs.getString("ativa"));
                emp.setNum_tel(rs.getString("num_tel"));
                
                listEmp.add(emp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR "+ex);
        }
        return listEmp;
    }
}