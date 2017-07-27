/*
 * 文件名：NoteService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月12日
 */

package cn.com.bonc.SpringWeb.service;

import java.util.List;
import java.util.Map;

import cn.com.bonc.SpringWeb.entity.Note;

public interface NoteService
{
    List<Map<String, Object>> listNotes( String notebookId)
        throws NotebookNoteFoundExcepotion;
    Note getNote(String noteId)
        throws NoteNotFoundException;
}
