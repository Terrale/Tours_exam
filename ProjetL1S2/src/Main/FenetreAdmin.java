package Main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FenetreAdmin extends FenetreConnexion {
	private Scene scene;
	private GridPane pane;
	private Button btnDeco;
	private Stage Admin;

	FenetreAdmin() {
		pane = new GridPane();
		scene = new Scene(pane, 200, 140);
		btnDeco = new Button("D�connexion");
		pane.add(btnDeco,0,2);

	}
	public void setVersPrincipale(EventHandler<ActionEvent> press) {
		btnDeco.setOnAction(press);
	}
	public Scene getScene() {
		return scene;
	}
	public Stage getAdmin() {
		return Admin;
	}
}
