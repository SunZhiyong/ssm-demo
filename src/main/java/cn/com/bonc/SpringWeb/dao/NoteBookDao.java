/*
 * 文件名：NoteBookDao.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月11日
 */

package cn.com.bonc.SpringWeb.dao;

import java.util.List;
import java.util.Map;

public interface NoteBookDao
{
    List<Map<String, Object>> findNotebooksByUserId(String userId);
    int countNotebookById(String notebookId);
}
