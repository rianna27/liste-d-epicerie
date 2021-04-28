package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController implements Initializable{

    @FXML
    private TextField txtPrix;

    @FXML
    private Button btnEffacer;

    @FXML
    private TableColumn<Main, Double> prixColumn;

    @FXML
    private TextField txtQuantite;

    @FXML
    private ComboBox<String> cboDept;

    @FXML
    private Button btnRecommencer;

    @FXML
    private Button btnModifier;

    @FXML
    private TableColumn<Main, String> nomColumn;

    @FXML
    private TableColumn<Main, Double> quantiteColumn;

    @FXML
    private TableColumn<Main, String> deptColumn;

    @FXML
    private Button btnAjouter;

    @FXML
    private TextField txtNom;

  //liste pour les départements  - cette liste permettrra de donner les valeurs du comboBox

  	private ObservableList<String> list=(ObservableList<String>) FXCollections.observableArrayList("Produit agricole","Viande", "Fruits de mer", "Bière et vin", "Santé et Beauté", "Deli / Aliments préparés");                                            
  			
  			
  	//Placer les étudiants dans une observable list

  	public ObservableList<Main> listeData=FXCollections.observableArrayList();

  	//Créer une méthode pour accéder à la liste des étudiants

  	public  ObservableList<Main> getlisteData()
  	{
  		return listeData;
  	}
    
    
    
   	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		
	}

}
