/*
 * 文件名：NoteBookController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月11日
 */

package cn.com.bonc.SpringWeb.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.bonc.SpringWeb.service.NoteBookService;
import cn.com.bonc.SpringWeb.util.JsonResult;

@Controller
@RequestMapping("/notebook")
public class NoteBookController extends AbstractController
{   
    @Resource
    private NoteBookService noteBookService;
    
    @RequestMapping("/list.do")
    @ResponseBody
    public JsonResult list(String userId){
        List<Map<String, Object>> list=
            noteBookService.listNotebooks(userId);
        return new JsonResult(list);
    }
}
