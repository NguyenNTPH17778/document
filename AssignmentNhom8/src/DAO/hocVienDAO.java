/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.jdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.hocVien;

public class hocVienDAO {
    
    public hocVien readFromResultSet(ResultSet rs) throws SQLException{
        hocVien model=new hocVien();
        model.setMaHV(rs.getInt("MaHV"));
         model.setMaKH(rs.getInt("KH"));
         model.setMaNH(rs.getString("MaNH"));
         model.setDiem(rs.getDouble("Diem"));
         return model;
    }
    
    public List<hocVien> select(String sql,Object...args){
        List<hocVien> list=new ArrayList<>();
        try {
            ResultSet rs=null;
            try{
                rs=jdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    list.add(readFromResultSet(rs));
                }
            }finally{
                rs.getStatement().getConnection().close();     
            }
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return list;
    }
    

    public void insert(hocVien model) {
        String sql="INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?)";
        jdbcHelper.executeUpdate(sql,
                model.getMaKH(),
                 model.getMaNH(),
                 model.getDiem());
    }


    public void update(hocVien model) {
        String sql="UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=?";
        jdbcHelper.executeUpdate(sql,
                model.getMaKH(),
                 model.getMaNH(),
                 model.getDiem(),
                 model.getMaHV());
    }


     public void delete(Integer MaHV){
     String sql="DELETE FROM HocVien WHERE MaHV=?";
     jdbcHelper.executeUpdate(sql, MaHV);
     }



    public List<hocVien> select() {
        String sql="SELECT * FROM HocVien";
        return select(sql);             
    }


    public hocVien findById(String id) {
        String sql="SELECT * FROM HocVien WHERE MaHV=?";
        List<hocVien> list=select(sql, id);
        return list.size()>0?list.get(0):null;              
    }   
}
