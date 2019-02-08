/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDal;

import ClassBeans.tbl_PrioridadeBeans;
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
public class tbl_PrioridadesDal {
    public List<tbl_PrioridadeBeans> ReadPrioridades(){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<tbl_PrioridadeBeans> listPrioridade = new ArrayList<>();
        try {
            sql = "select * from tbl_Prioridade";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                tbl_PrioridadeBeans p = new tbl_PrioridadeBeans();
                p.setId_prioridade(rs.getInt("id_prioridade"));
                p.setNome_prioridade(rs.getString("nome_prioridade"));
                listPrioridade.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listPrioridade;   
    }
}