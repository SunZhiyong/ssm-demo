/*
 * 文件名：NoteServiceTest.java
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

import cn.com.bonc.SpringWeb.service.NoteService;
import cn.com.bonc.SpringWeb.service.NotebookNoteFoundExcepotion;

public class NoteServiceTest extends BaseTest
{
    NoteService service;
    
    @Before
    public void initService(){
        service = ctx.getBean("noteService",
                NoteService.class);
    }
    
    @Test
    public void testListNotes() throws NotebookNoteFoundExcepotion{
        String id="0037215c-09fe-4eaa-aeb5-25a340c6b39b";
        List<Map<String, Object>> list=service.listNotes(id);
        for (Map<String, Object> map : list) {
            System.out.println(map); 
        }
    }

}
