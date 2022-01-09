package com.innova.dao;

import com.innova.dto.AdminDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminDao implements  IDaoConnection<AdminDto>{

    @Override
    public void create(AdminDto adminDto) {
        try(Connection connection=getInterfaceConnection()) {
            String sql="insert into admin (admin_name,admin_surname) values(?,?); ";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getAdminName());
            preparedStatement.setString(2,adminDto.getAdminSurname());
            int rowEfected=preparedStatement.executeUpdate();
            if(rowEfected>0){
                System.out.println(AdminDao.class+" başarılı başarılı");
            }else{
                System.out.println(AdminDao.class+" başarısız başarılı");
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }


    @Override
    public void update(AdminDto adminDto) {

    }

    @Override
    public void delete(AdminDto adminDto) {

    }

    @Override
    public ArrayList<AdminDto> list() {
        return null;
    }
}
