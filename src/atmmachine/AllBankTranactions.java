package atmmachine;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static sun.swing.SwingUtilities2.submit;

public class AllBankTranactions {

	public AllBankTranactions(Stage stage) {
		this.stage = stage;
	}

	static Scene getScene() {
		return scene;
		// throw new UnsupportedOperationException("Not supported yet."); //To change
		// body of generated methods, choose Tools | Templates.
	}

	CardNumberTest cnt;
	BankTranactions bt;
	Stage stage;
	static Scene scene;
	Methods atm = new Methods();

	/*
	 * AllBankTranactions() { throw new
	 * UnsupportedOperationException("Not supported yet."); //To change body of
	 * generated methods, choose Tools | Templates. }
	 */

	public void setCnt(CardNumberTest cnt) {
		this.cnt = cnt;
	}

	public void setBt(BankTranactions bt) {
		this.bt = bt;
	}

//    AllBankTranactions() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
	public void prepareScene() {

		Label balance_label = new Label();
		Button deposit = new Button("deposit");
		Button withdrawl = new Button("withdrawl");
		Button bankinquiry = new Button("bank inquiry");
		Button next = new Button("next");
		Button previous = new Button("previous");
		GridPane grid = new GridPane();

		grid.add(deposit, 0, 0);
		grid.add(withdrawl, 0, 1);
		grid.add(bankinquiry, 0, 2);
		grid.add(previous, 1, 0);
		grid.add(next, 1, 1);
		grid.add(balance_label, 2, 3);
		
		balance_label.setVisible(false);
		
		scene = new Scene(grid, 600, 400);

		// public Scene getScene(){
		// return scene;
		// }

		withdrawl.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				bt = new BankTranactions(stage);
				bt.prepareScene(2, atm);

				stage.setScene(bt.getScene());
			}
		});
		deposit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				bt = new BankTranactions(stage);
				bt.prepareScene(1, atm);
				stage.setScene(bt.getScene());

			}
		});

		bankinquiry.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				balance_label.setVisible(true);
				balance_label.setText(atm.balanceinquiry());

			}
		});

		next.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				balance_label.setVisible(true);
				balance_label.setText(atm.next());
			}
		});

		previous.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				balance_label.setVisible(true);
				balance_label.setText(atm.pervious());

			}
		});

	}
}
