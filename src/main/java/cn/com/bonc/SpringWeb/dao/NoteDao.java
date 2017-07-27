/*
 * 文件名：NoteDao.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月12日
 */

package cn.com.bonc.SpringWeb.dao;

import java.util.List;
import java.util.Map;

import cn.com.bonc.SpringWeb.entity.Note;

public interface NoteDao
{
    List<Map<String,Object>> findNotesByNotebookId(String notebookId);
    Note findNoteById(String noteId);
}
