package atmmachine;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author gcs
 */
public class AtMmachine extends Application {
	Scene scene;
	CardNumberTest cnt;
	AllBankTranactions abt;

	public Scene getScene() {
		return scene;
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("ATM Machine");
		CardNumberTest cnt = new CardNumberTest(primaryStage);
		AllBankTranactions abt = new AllBankTranactions(primaryStage);

		// BankTranactions bt=new BankTranactions(primaryStage);

		cnt.prepareScene();
		abt.prepareScene();

		// bt.prepareScene();
		cnt.setAbt(abt);
		abt.setCnt(cnt);

		primaryStage.setScene(cnt.getScene());
		primaryStage.show();
	}
}

/**
 * @param args the command line arguments
 */
