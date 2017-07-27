/*
 * 文件名：oteController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月12日
 */

package cn.com.bonc.SpringWeb.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.bonc.SpringWeb.entity.Note;
import cn.com.bonc.SpringWeb.service.NoteService;
import cn.com.bonc.SpringWeb.service.NotebookNoteFoundExcepotion;
import cn.com.bonc.SpringWeb.util.JsonResult;

@Controller
@RequestMapping("/note")
public class NoteController extends AbstractController
{
    @Resource 
    private NoteService noteService;

    @RequestMapping("/list.do")
    @ResponseBody
    public JsonResult list(String notebookId) throws NotebookNoteFoundExcepotion{
        List<Map<String, Object>> list= 
           noteService.listNotes(notebookId);
        return new JsonResult(list);
    }
    
    @RequestMapping("/load.do")
    @ResponseBody
    public JsonResult load(String noteId) {
        Note note = noteService.getNote(noteId);
        return new JsonResult(note);
    }
}
