/*
 * 文件名：NotebookDaoTest.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月11日
 */

package cn.com.bonc.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.com.bonc.SpringWeb.dao.NoteBookDao;

public class NotebookDaoTest extends BaseTest
{
    NoteBookDao dao;
    
    @Before
    public void initDao(){
        dao = ctx.getBean("noteBookDao",
                NoteBookDao.class);
    }
    
    @Test
    //select cn_user_id from cn_notebook;
    public void testFindNotebooksByUserId(){
        String userId="03590914-a934-4da9-ba4d-b41799f917d1";
        List<Map<String, Object>> list=
            dao.findNotebooksByUserId(userId);
        for (Map<String, Object> map : list) {
            System.out.println(map); 
        }
    }
}
