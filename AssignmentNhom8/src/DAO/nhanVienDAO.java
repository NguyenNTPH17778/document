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
import model.nhanVien;


public class nhanVienDAO {
    
    
    public nhanVien readFromResultSet(ResultSet rs) throws SQLException{
        nhanVien model=new nhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setHoTen(rs.getString("HoTen"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        return model;
    }
    
 
    public List<nhanVien> select(String sql,Object...args){
        List<nhanVien> list=new ArrayList<>();
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
    
 
    public void insert(nhanVien entity) {
        String sql="INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
        jdbcHelper.executeUpdate(sql,
                entity.getMaNV(),
                entity.getMatKhau(),
                entity.getHoTen(),
                entity.isVaiTro());
    }

  
    public void update(nhanVien entity) {
        String sql="UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
        jdbcHelper.executeUpdate(sql,
                entity.getMatKhau(),
                entity.getHoTen(),
                entity.isVaiTro(),
                entity.getMaNV());
    }


    public void delete(String maNV) {
        String sql="DELETE FROM NhanVien WHERE MaNV=?";
        jdbcHelper.executeUpdate(sql, maNV);
    }

 
    public List<nhanVien> select() {
        String sql="SELECT * FROM NhanVien";
        return select(sql);            
    }

  
    public nhanVien findById(String id) {
        String sql="SELECT * FROM NhanVien WHERE MaNV=?";
        List<nhanVien> list=select(sql, id);
        return list.size()>0?list.get(0):null;           
    }
}
