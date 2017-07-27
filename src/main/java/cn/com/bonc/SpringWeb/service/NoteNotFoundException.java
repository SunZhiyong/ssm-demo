/*
 * 文件名：NoteNotFoundException.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月12日
 */

package cn.com.bonc.SpringWeb.service;

public class NoteNotFoundException extends RuntimeException
{

    public NoteNotFoundException()
    {
    }

    public NoteNotFoundException(String arg0)
    {
        super(arg0);
    }

    public NoteNotFoundException(Throwable arg0)
    {
        super(arg0);
    }

    public NoteNotFoundException(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }

    public NoteNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3)
    {
        super(arg0, arg1, arg2, arg3);
    }

}
