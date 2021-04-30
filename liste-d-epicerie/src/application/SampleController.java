package application;

import java.io.File;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController implements Initializable{

    @FXML
    private TextField txtPrix;

    @FXML
    private Button btnEffacer;

    @FXML
    private TableColumn<Liste, Double> prixColumn;

    @FXML
    private TextField txtQuantite;

    @FXML
    private ComboBox<String> cboDept;

    @FXML
    private Button btnRecommencer;

    @FXML
    private Button btnModifier;

    @FXML
    private TableColumn<Liste, String> nomColumn;

    @FXML
    private TableColumn<Liste, Double> quantiteColumn;

    @FXML
    private TableColumn<Liste, String> deptColumn;

    @FXML
    private Button btnAjouter;

    @FXML
    private TextField txtNom;
   
    @FXML
	private TableView<Liste> ListeTable;

  //liste pour les départements  - cette liste permettrra de donner les valeurs du comboBox

  	private ObservableList<String> list=(ObservableList<String>) FXCollections.observableArrayList("Produit agricole","Viande", "Fruits de mer", "Bière et vin", "Santé et Beauté", "Deli / Aliments préparés");                                            
  			
  			
  	//Placer les étudiants dans une observable list

  	public ObservableList<Liste> listeData=FXCollections.observableArrayList();

  	//Créer une méthode pour accéder à la liste des étudiants

  	public  ObservableList<Liste> getlisteData()
  	{
  		return listeData;
  	}
    
    
    
   	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
   		cboDept.setItems(list);
		//attribuer les valeurs aux colonnes du TableView
		deptColumn.setCellValueFactory(new PropertyValueFactory<>("departement"));
		nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
		quantiteColumn.setCellValueFactory(new PropertyValueFactory<>("quantite"));
		prixColumn.setCellValueFactory(new PropertyValueFactory<>("prix"));
		ListeTable.setItems(listeData);
		btnModifier.setDisable(true);
		btnEffacer.setDisable(true);
		btnRecommencer.setDisable(true);
		
		showliste(null);
		
		//Mettre à jour l'affichage d'un epicerie sélectionné
				ListeTable.getSelectionModel().selectedItemProperty().addListener((
						observable, oldValue, newValue)-> showliste(newValue));
    }
   	
  //Ajouter 
  	@FXML
  	void ajouter()
  	{
  		// vérifier si un champ n'est pas vide
  		
  	
  		Liste tmp=new Liste();
  		tmp=new Liste();
  		tmp.setNom(txtNom.getText());
  		tmp.setQuantite(Double.parseDouble(txtQuantite.getText()));
  		tmp.setPrix(Double.parseDouble(txtPrix.getText()));
  		tmp.setDepartement(cboDept.getValue());
  		listeData.add(tmp);
  		clearFields();
    }
  	
  	
  	//Effacer le contenu des champs
	@FXML
	void clearFields()
	{
		cboDept.setValue(null);
		txtNom.setText("");
		txtQuantite.setText("");
		txtPrix.setText("");
	}
	
	
	//Afficher les 
	
		public void showliste(Liste liste)
		{
			if(liste !=null)
			{
				cboDept.setValue(liste.getDepartement());
				txtNom.setText(liste.getNom());
				txtQuantite.setText(Double.toString(liste.getQuantite()));
				txtPrix.setText(Double.toString(liste.getPrix()));
				btnAjouter.setDisable(true);
				btnModifier.setDisable(false);
				btnEffacer.setDisable(false);
				btnRecommencer.setDisable(false);

			}
			else
			{
				clearFields();
			}
		}
		//Mise à jour 
		
		@FXML
		public void updateListe()
		{
		// vérifier si un champ n'est pas vide
		
		{
			Liste liste=ListeTable.getSelectionModel().getSelectedItem();
			liste.setNom(txtNom.getText());
			liste.setQuantite(Double.parseDouble(txtQuantite.getText()));
			liste.setPrix(Double.parseDouble(txtPrix.getText()));
			liste.setDepartement(cboDept.getValue());
			ListeTable.refresh();
		 }
		}
		
		//Effacer un étudiant
		
		@FXML
		
		public void deleteListe()
		{
			int selectedIndex = ListeTable.getSelectionModel().getSelectedIndex();
			if (selectedIndex >=0)
			{
				Alert alert=new Alert(AlertType.CONFIRMATION);
				alert.setTitle("Erreur");
				alert.setContentText("confirmer la suppression!");
				Optional<ButtonType> result= alert.showAndWait();
				if(result.get()==ButtonType.OK)
			    ListeTable.getItems().remove(selectedIndex);
			}
		}
		
		
		
		
		
		
		
		
		}

