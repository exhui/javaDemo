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
	 * ��������ʱ�䣬ˢ��ʱ��
	 */
	@Override
	protected long getSleepTime() {
		return 10000;
	}

	/**
     * �����¼�
     * 
     * ҵ�񲿷�д��pullEvent()�����У���������ᱻ��ʱ���á�
     */
	@Override
	protected Event pullEvent() {
		Event event = Event.createDataEvent("/source/event");// �¼���ʶ  
        String s = "���";  
        s = toISO88591(s);  
        event.setField("msg", s);// ��װ����  
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
