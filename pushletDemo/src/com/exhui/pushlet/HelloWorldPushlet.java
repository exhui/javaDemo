package com.exhui.pushlet;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;

public class HelloWorldPushlet extends EventPullSource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 616221323366410508L;

	/**
	 * 设置休眠时间，刷新时间
	 */
	@Override
	protected long getSleepTime() {
		return 10000;
	}

	/**
     * 创建事件
     * 
     * 业务部分写在pullEvent()方法中，这个方法会被定时调用。
     */
	@Override
	protected Event pullEvent() {
		Event event = Event.createDataEvent("/source/event");// 事件标识  
        String s = "你好";  
        s = toISO88591(s);  
        event.setField("msg", s);// 封装参数  
        return event;
	}
	
	public static String toISO88591(String str) {  
        try {  
            str = new String(str.getBytes("UTF-8"), "ISO-8859-1");  
        } catch (UnsupportedEncodingException ex) {  
            ex.printStackTrace();  
        }  
        return str;  
    }
}
