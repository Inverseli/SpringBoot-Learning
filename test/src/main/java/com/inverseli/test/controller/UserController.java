package com.inverseli.test.controller;

import com.github.pagehelper.PageHelper;
import com.inverseli.test.dao.AdminRolesMapper;
import com.inverseli.test.dao.AdminUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private AdminUsersMapper adminUsersMapper;

    @Autowired
    private AdminRolesMapper adminRolesMapper;

    @GetMapping("/selectAllUserInfo")
    public List<Object> selectAllUserInfo() {
        PageHelper.startPage(1,3);
        return adminUsersMapper.selectAll();
    }
        
    /**
     * @Author liyuhao
     * @Description
     * @Date 15:38 2018/10/26
     * @Param [pageSize]
     * @Return [pageSize]
     **/
    @GetMapping("/selectAllRoleInfo")
    public List<Object> selectAllRoleInfo(@RequestParam int page) {
        int offset; // 起始位置
        // 每页的显示数目
        int pageSize = 5;
        // 总数量
        int allSize = adminRolesMapper.selectCount();
        // 总共的页数
        int pageNum = allSize / pageSize;
        // PageHelper.startPage(pageNum,pageSize);
        if (page==1) {
            offset = 0;
        } else {
            offset = (page - 1) * pageSize;
        }
        PageHelper.offsetPage(offset,pageSize);
        return adminRolesMapper.selectAllRoles();
    }
}
