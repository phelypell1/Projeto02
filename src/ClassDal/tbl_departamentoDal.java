/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDal;

import ClassBeans.tbl_departamentoBeans;
import DbConnection.MySqlConnection;
import com.mysql.jdbc.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phelype
 */
public class tbl_departamentoDal {
    public List<tbl_departamentoBeans> ReadDepartamento(){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        List<tbl_departamentoBeans> ReadDep = new ArrayList<>();
        
        try {
            pst = conn.prepareStatement("Select * from tbl_Departamento");
            rs = pst.executeQuery();
            
            while(rs.next()){
                tbl_departamentoBeans user = new tbl_departamentoBeans();
                
                user.setId_dep(rs.getInt("id_dep"));
                user.setNome_dep(rs.getString("nome_dep"));
                ReadDep.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbl_departamentoDal.class.getName()).log(Level.SEVERE, null, ex);
        }
            return ReadDep;
    }
}