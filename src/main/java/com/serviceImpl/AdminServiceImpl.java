package com.serviceImpl;

import com.dao.AdminDao;
import com.po.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin queryAdminByName(Admin admin) {
        if(admin == null){
            return null;
        }
        return adminDao.queryAdminByName(admin);
    }
}
