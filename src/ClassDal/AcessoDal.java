/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDal;

import DbConnection.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class AcessoDal {

    public String Acesso;
    public boolean UserAtivo;

    public boolean consultar(String login, String senha) {
        boolean autenticado = false;
        String sql;
        try {
            Connection conn = MySqlConnection.getConnection();
            sql = "SELECT nome_user, senha_user , setor, ativo FROM Usuario WHERE nome_user=? and senha_user=?";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                String user = rs.getString("nome_user");
                String pass = rs.getString("senha_user");
                Acesso = rs.getString("setor");//Aqui armazeno o tipo de acesso ("Administrador" ou "Outros") na variável publica Acesso declarada no inicio do código
                UserAtivo = rs.getBoolean("ativo");
                autenticado = true;
            } else {
                //JOptionPane.showMessageDialog(this, "Acesso Negado \nInforme o setor de Inventário");
                ps.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return autenticado;
    }
}