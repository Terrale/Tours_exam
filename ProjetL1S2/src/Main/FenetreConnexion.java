package Main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/** 
 * La classe qui contient la page de connexion,
 * on peut s'identifier avec un identifiant et
 * un mot de passe. On peut retrouver ces informations
 * avec les getters et les setters. On peut ensuite
 * basculer vers les autres fenetres en fonction
 * des identifiants entr�s.
 * @author Moussa
 *
 */
public class FenetreConnexion {

	private Scene scene;
    TextField id;
    TextField mdp;
    private String idChaine;
	private String mdpChaine;
	Button btnConnexion;
	
	
	FenetreConnexion() {
		Label idLabel = new Label("Identifiant");
		Label mdpLabel = new Label("Mot de passe");

		id = new TextField();
		mdp = new TextField();
		idChaine = id.getText();
		mdpChaine = mdp.getText();
		btnConnexion = new Button("Connexion");


		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5,5,5,5));
		pane.setHgap(5);
		pane.setVgap(15);
		pane.add(id, 1, 0);
		pane.add(idLabel, 0, 0);
		pane.add(mdp, 1, 1);
		pane.add(mdpLabel, 0, 1);
		pane.add(btnConnexion, 0, 2);
		
		scene = new Scene(pane, 300,120);
		
	}
	
	public String getIdchaine() {
		return idChaine;
	}
	
	public String getMdpchaine() {
		return mdpChaine;
	}
	
	/**
	 * Permet de modifier le mot de passe entr�
	 * @param mdpChaine
	 */
	public void setMdpchaine(String mdpChaine) {
		this.mdpChaine = mdpChaine;
	}
	
	/**
	 * Permet de se placer vers la fen�tre d'admin � l'aide des identifiants et en appuyant sur le bouton de connexion
	 * @param press1
	 */
	public void setVersAdmin(EventHandler<ActionEvent> press1) {
		if(getIdchaine() == "admin" && getMdpchaine() == "adminpass")
		btnConnexion.setOnAction(press1);
	}
	
	/**
	 * Permet de se placer vers la fen�tre de la scolarit� 
	 * @param press2
	 */
	public void setVersScolarite(EventHandler<ActionEvent> press2) {
		if(getIdchaine() == "scolarite" && getMdpchaine() == "scolaritepass")
		btnConnexion.setOnAction(press2);
	}
	
	/**
	 * Permet de se placer vers la fen�tre du secr�tariat
	 * @param press3
	 */
	public void setVersSecretariat(EventHandler<ActionEvent> press3) {
		if(getIdchaine() == "secretariat" && getMdpchaine() == "secretariatpass")
		btnConnexion.setOnAction(press3);
	}
	
	/**
	 * Permet de se placer vers la fen�tre de l'�tudiant
	 * @param press4
	 */
	public void setVersEtudiant(EventHandler<ActionEvent> press4) {
		if(getIdchaine() == "etudiant" && getMdpchaine() == "etudiantpass")
		btnConnexion.setOnAction(press4);
	}
    

	public Scene getScene() {
		return scene;
	}
	
	public void reinit() {
		id.clear();
		mdp.clear();
	};
}
