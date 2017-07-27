/*
 * 文件名：NoteBookServiceTest.java
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

import cn.com.bonc.SpringWeb.service.NoteBookService;

public class NoteBookServiceTest extends BaseTest
{
    NoteBookService service;
    @Before
    public void initService(){
        service = ctx.getBean("noteBookService", NoteBookService.class);
    }
    
    @Test
    public void testListNotebooks(){
        String userId="03590914-a934-4da9-ba4d-b41799f917d1";
        //String userId="03590914-a934-4da9-ba4d-b41799f917d2";
        List<Map<String, Object>> list= service.listNotebooks(userId);
        for (Map<String, Object> map : list) {
            System.out.println(map); 
        }

    }
}
