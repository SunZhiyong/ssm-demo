/*
 * 文件名：NoteDaoTest.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月12日
 */

package cn.com.bonc.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.com.bonc.SpringWeb.dao.NoteDao;

public class NoteDaoTest extends BaseTest
{
    NoteDao dao;
    
    @Before
    public void initDao(){
        dao = ctx.getBean("noteDao",
                NoteDao.class);
    }
    
    @Test
    //select cn_notebook_id from cn_note;
    public void testFindNotesByNotebookId(){
        String id="0037215c-09fe-4eaa-aeb5-25a340c6b39b";
        List<Map<String, Object>> list=
            dao.findNotesByNotebookId(id);
        for (Map<String, Object> map : list) {
            System.out.println(map); 
        }
    }
}
