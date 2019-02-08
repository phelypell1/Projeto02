/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDal;

import ClassBeans.UsuariosBeans;
import DbConnection.MySqlConnection;
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
public class UsuarioDal {
    
    public List<UsuariosBeans> UserRead(){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        List<UsuariosBeans> ReadList = new ArrayList<>();
        
        try {
            pst = conn.prepareStatement("select * from Usuario");
            rs = pst.executeQuery();
            
            while(rs.next()){
                UsuariosBeans user = new UsuariosBeans();
                user.setId_user(rs.getInt("id_user"));
                user.setNome_user(rs.getString("nome_user"));
                ReadList.add(user);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ReadList;
    }
}
