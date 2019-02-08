/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDal;

import ClassBeans.SolicitacaoBeans;
import ClassBeans.tblStatus_serviceBeans;
import DbConnection.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class SolicitacaoDal {

    public void Cadastro(SolicitacaoBeans sol) {
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        Statement statement = null;
        int id = 0;
        String sql = "insert into tbl_Solicitacao (nome_sol, numero_cont, email_sol, info_atend, data_sol, status_id) "
                + "values(?,?,?,?,Default,Default)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, sol.getNome_sol());
            pst.setString(2, sol.getNumero_cont());
            pst.setString(3, sol.getEmail());
            pst.setString(4, sol.getInfo_atend());
            pst.executeUpdate();
            statement = conn.createStatement();
            if(id == 0){//If serve para verificar, se o id for 0 ira buscar no Rs e executar a query.
                    ResultSet res = statement.executeQuery("select max(id_sol) from tbl_Solicitacao");
                    if(res.next()){
                    id = res.getInt(1);
                    }
                }
            JOptionPane.showMessageDialog(null, "Solicitação enviada com Sucesso !\n"+" Anote o número da sua solicitação: "+id);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public List<SolicitacaoBeans> ReadList(){
        Connection conn = MySqlConnection.getConnection();
        String sql;
        PreparedStatement pst;
        ResultSet rs;
        
        List<SolicitacaoBeans> ListSol = new ArrayList();
        
        
                
        try {
            sql = "select id_sol, nome_sol, numero_cont, email_sol, info_atend, data_sol, nome_sts "
                + "from tbl_Solicitacao "
                + "inner join Status_service on id_sts = status_id "
                + "where nome_sts like '%Aberto%'";
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                SolicitacaoBeans sol = new SolicitacaoBeans();
                
                sol.setId_sol(rs.getInt("id_sol"));
                sol.setNome_sol(rs.getString("nome_sol"));
                sol.setNumero_cont(rs.getString("numero_cont"));
                sol.setEmail(rs.getString("email_sol"));
                sol.setInfo_atend(rs.getString("info_atend"));
                sol.setData_sol(rs.getString("data_sol"));
                
                tblStatus_serviceBeans tbl = new tblStatus_serviceBeans();
                tbl.setNome_sts(rs.getString("nome_sts"));
                sol.setSts_id(tbl);
                
               ListSol.add(sol);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro");
        }
        return ListSol;
    }
}
