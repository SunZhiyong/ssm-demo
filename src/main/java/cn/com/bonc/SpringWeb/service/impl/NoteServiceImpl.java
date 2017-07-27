/*
 * 文件名：NoteServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月12日
 */

package cn.com.bonc.SpringWeb.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.bonc.SpringWeb.dao.NoteBookDao;
import cn.com.bonc.SpringWeb.dao.NoteDao;
import cn.com.bonc.SpringWeb.entity.Note;
import cn.com.bonc.SpringWeb.service.NoteNotFoundException;
import cn.com.bonc.SpringWeb.service.NoteService;
import cn.com.bonc.SpringWeb.service.NotebookNoteFoundExcepotion;

@Service("noteService")
public class NoteServiceImpl implements NoteService
{
    @Resource
    private NoteDao noteDao;
    
    @Resource
    private NoteBookDao noteBookDao;
    
    @Transactional
    public List<Map<String, Object>> listNotes( String notebookId) 
            throws NotebookNoteFoundExcepotion {
        if(notebookId==null || notebookId.trim().isEmpty()){
            throw new NotebookNoteFoundExcepotion("ID为空!");
        }
        int n = noteBookDao.countNotebookById(
                notebookId);
        if(n!=1){
            throw new NotebookNoteFoundExcepotion("没有该笔记本!");
        }
        
        return noteDao.findNotesByNotebookId(notebookId);
    }
    
    @Transactional
    public Note getNote(String noteId)
            throws NoteNotFoundException {
        if(noteId==null||noteId.trim().isEmpty()){
            throw new NoteNotFoundException("ID空");
        }
        Note note = noteDao.findNoteById(noteId);
        if(note==null){
            throw new NoteNotFoundException("id错误");
        }
        return note;
    }
}
