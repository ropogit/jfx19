package com.robert;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class JfxLauncher extends Application {
	
	public static void main(String[] args) {
		JfxLauncher.launch(args);
	}

	@Override
	public void start(Stage ps) throws Exception {
		Label l = new Label();
		l.setText("TEST");
		AnchorPane ap = new AnchorPane(l);
		Scene s = new Scene(ap);
		ps.setWidth(300);
		ps.setHeight(300);
		ps.setScene(s);
		
		ps.show();
		ps.toFront();
	}
}
