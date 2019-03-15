package atmmachine;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BankTranactions {

	Stage stage;
	Scene scene;
	AllBankTranactions abt;

	public void setAbt(AllBankTranactions abt) {
		this.abt = abt;
	}

	public BankTranactions(Stage stage) {
		this.stage = stage;
	}

	/*
	 * BankTranactions() { throw new
	 * UnsupportedOperationException("Not supported yet."); //To change body of
	 * generated methods, choose Tools | Templates. }
	 */

	public void prepareScene(int m, Methods atm) {

		TextField cardnumber = new TextField("Enter the amount");
		Button ok = new Button("ok");
		Button zero = new Button("0");
		Button one = new Button("1");
		Button two = new Button("2");
		Button three = new Button("3");
		Button four = new Button("4");
		Button five = new Button("5");
		Button six = new Button("6");
		Button seven = new Button("7");
		Button eight = new Button("8");
		Button night = new Button("9");

		GridPane grid = new GridPane();
		grid.add(cardnumber, 0, 0);
		grid.add(ok, 0, 4);
		grid.add(zero, 0, 1);
		grid.add(one, 1, 1);
		grid.add(two, 2, 1);
		grid.add(three, 3, 1);
		grid.add(four, 0, 2);
		grid.add(five, 1, 2);
		grid.add(six, 2, 2);
		grid.add(seven, 0, 3);
		grid.add(eight, 1, 3);
		grid.add(night, 2, 3);
		scene = new Scene(grid, 600, 400);
       
		ok.setOnAction(e -> {
			String money = cardnumber.getText();
			if (m == 1) {
				atm.deposit(Double.parseDouble(money));
				stage.setScene(abt.getScene());
			} else if (m == 2) {
				atm.withdraw(Double.parseDouble(money));
				stage.setScene(abt.getScene());
			}

		});
		
		one.setOnAction(e -> {
			
			cardnumber.setText(cardnumber.getText()+"1");
		});
		two.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"2");
		});
		three.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"3");

		});
		four.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"4");

		});
		five.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"5");

		});
		six.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"6");

		});
		seven.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"7");

		});
		eight.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"8");

		});
		night.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"9");

		});
		zero.setOnAction(e -> {
			cardnumber.setText(cardnumber.getText()+"0");

		});

	}

	public Scene getScene() {
		return scene;

	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

}
