package Main;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		FenetreConnexion fenetrePrincipale = new FenetreConnexion();
		FenetreAdmin fenetreAdmin = new FenetreAdmin();
		

		fenetreAdmin.setVersPrincipale(event -> {
			fenetrePrincipale.reinit();
			primaryStage.setScene(fenetrePrincipale.getScene());
		});
		fenetrePrincipale.setVersAdmin(event -> {
			primaryStage.setScene(fenetreAdmin.getScene());
			primaryStage.setTitle("Admin");
		});

		primaryStage.setScene(fenetrePrincipale.getScene());
		primaryStage.setTitle("Page de connexion");
		primaryStage.show();

			 }
			 
		}


