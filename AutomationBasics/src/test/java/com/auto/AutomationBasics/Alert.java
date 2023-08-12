package com.auto.AutomationBasics;

public interface Alert{
	
	void Dismiss();
	void accept();
	String getText();
	void sendkeys(String keyToSend);

}
