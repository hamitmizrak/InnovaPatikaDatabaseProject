package com.innova.controller;

import com.innova.dao.AdminDao;
import com.innova.dao.IDaoConnection;
import com.innova.dto.AdminDto;

import java.util.ArrayList;
import java.util.List;

//S.O.L.I.D
//Single Responsibility
public class AdminController implements IDaoConnection<AdminDto> {

    private AdminDao adminDao;
    private AdminDto adminDto;
    private List<AdminDto> adminList;

    @Override
    public void create(AdminDto adminDto) {
     adminDao=new AdminDao();
     adminDao.create(adminDto);
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
