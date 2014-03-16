package com.exhui.chat.client;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.exhui.chat.client.net.ClientConnection;
import com.exhui.chat.client.panels.ClientPanel;
import com.exhui.chat.client.panels.MainPanel;
import com.exhui.chat.client.panels.listener.UserListener;
import com.exhui.chat.client.panels.util.Utils;

public class ClientApplet extends JFrame {

	private static final long serialVersionUID = -6235147930430795318L;

	public void init() {
		try {
			new ClientConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				@Override
				public void run() {
					Client.getInstance().setUserListener(new UserListener());
					Client.getInstance().setClientPanel(new ClientPanel());
					Client.getInstance().setMainPanel(new MainPanel());
					add(Client.getInstance().getMainPanel());
					Utils.connectMessage();
				}
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ClientApplet() {
		init();
		start();
	}
	
	public static void main(String args[]) {
		JFrame frame = new ClientApplet();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 430);
		frame.setVisible(true);
	}

}
