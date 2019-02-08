/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDal;

import ClassBeans.tbl_MarcaColetorbeans;
import DbConnection.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phelype
 */
public class tbl_MacaModeloDal {
    public List<tbl_MarcaColetorbeans> ReadListMarcaColetor(){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<tbl_MarcaColetorbeans> ListMarcas = new ArrayList<>();
        try {
            sql = "select * from tbl_MarcaColetor";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                tbl_MarcaColetorbeans marca = new tbl_MarcaColetorbeans();
                marca.setId_mmc(rs.getInt("id_mmc"));
                marca.setNome_mmc(rs.getString("nome_mmc"));
                ListMarcas.add(marca);
            }
        } catch (Exception e) {
        }
        return ListMarcas;
    }
    public List<tbl_MarcaColetorbeans> ReadListModeloColetor(){
        Connection conn = MySqlConnection.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<tbl_MarcaColetorbeans> ListModelos = new ArrayList<>();
        try {
            sql = "select * from tbl_ModeloColetor";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                tbl_MarcaColetorbeans marca = new tbl_MarcaColetorbeans();
                marca.setId_mmc(rs.getInt("id_mdc"));
                marca.setNome_mmc(rs.getString("nome_mdc"));
                ListModelos.add(marca);
            }
        } catch (Exception e) {
        }
        return ListModelos;
    }
}