package com.exhui.chat.client.panels;

import javax.swing.JPanel;

import com.exhui.chat.client.Client;

public class MainPanel extends JPanel {
	
	private static final long serialVersionUID = -5804995220571906215L;

	public MainPanel() {
		super(null);
		add(Client.getInstance().getClientPanel());
	}

}
