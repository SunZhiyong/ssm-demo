/*
 * 文件名：NoteBookServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月11日
 */

package cn.com.bonc.SpringWeb.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.bonc.SpringWeb.dao.NoteBookDao;
import cn.com.bonc.SpringWeb.dao.UserDao;
import cn.com.bonc.SpringWeb.service.NoteBookService;
import cn.com.bonc.SpringWeb.service.UserNotFoundException;

@Service("noteBookService")
public class NoteBookServiceImpl implements NoteBookService
{
    @Resource
    private NoteBookDao notebookDao;
    
    @Resource 
    private UserDao userDao;
    
    public List<Map<String, Object>> listNotebooks(String userId) throws UserNotFoundException {
        
        if(userId==null || userId.trim().isEmpty()){
            throw new UserNotFoundException("ID不能空");
        }
        
        int n = userDao.countUserById(userId);
        if(n!=1){
            throw new UserNotFoundException("用户不存在");
        }
        
        return notebookDao.findNotebooksByUserId(userId);
        
    }

}
