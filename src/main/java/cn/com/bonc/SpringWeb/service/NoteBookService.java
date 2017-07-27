/*
 * 文件名：NoteBookService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月11日
 */

package cn.com.bonc.SpringWeb.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service("notebookService")
public interface NoteBookService
{
    List<Map<String, Object>> listNotebooks(String userId) throws UserNotFoundException;
}
