package atmmachine;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static sun.swing.SwingUtilities2.submit;

public class CardNumberTest {
	Stage stage;
	Scene scene;
	AllBankTranactions abt;

	public CardNumberTest(Stage stage) {
		this.stage = stage;
	}

//    CardNumberTest() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

	/*
	 * CardNumberTest() { throw new
	 * UnsupportedOperationException("Not supported yet."); //To change body of
	 * generated methods, choose Tools | Templates. }
	 */

	public void prepareScene() {

		TextField cardnumberfield = new TextField("Enter your card number");
		Button ok = new Button("ok");
		GridPane grid = new GridPane();
		grid.add(cardnumberfield, 0, 0);
		grid.add(ok, 0, 1);
		scene = new Scene(grid, 600, 400);

		ok.setOnAction(new EventHandler<ActionEvent>() {
			private AllBankTranactions abt;

			@Override
			public void handle(ActionEvent event) {
				String cardnummber = cardnumberfield.getText();

				if (cardnummber.equals("1234")) {
					stage.setScene(AllBankTranactions.getScene());
				} else {
					System.out.print("invalid please try again");
					
					
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error Dialog");
					alert.setHeaderText("Invalid CardNumber");
					alert.setContentText("Ooops, there was an error!");

					alert.showAndWait();
					
					
				}
			}
		});

	}

	public Scene getScene() {
		return scene;

	}

	public void setAllBankTranactions(AllBankTranactions abt) {
		this.abt = abt;
	}

	public void setAbt(AllBankTranactions abt) {
		this.abt = abt;
	}
}