package com.example.unidad8_ejerciciolayouts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    ChoiceBox localizaciones = new ChoiceBox();
    private ChoiceBox<String> cb;

    @FXML
    ListView<String> lvQualif = new ListView<String>();
    private ObservableList listaQualif = FXCollections.observableArrayList("Indeterminate (pick a choice", "Objects", "Classes", "Functions", "Variables", "Compiler", "Debugger", "Projects", "Beans", "Libraries", "Modules");
    private ObservableList data = FXCollections.observableArrayList();

    @FXML
    private ComboBox cbLanguage = new ComboBox();

    @FXML
    private TreeView treeView = new TreeView<>();

    @FXML
    public void buttonPressed(KeyEvent e) {
        if (e.getCode().toString().equals("ENTER")) {
//            ok();
        }
    }

    @FXML
    private void ok() {
        System.out.println("OK");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        localizaciones.setItems(FXCollections.observableArrayList("New York", "Orlando", new Separator(), "London", "Manchester"));
        localizaciones.getSelectionModel().selectFirst();

        for (int i = 0; i < 18; i++) {
            data.add("Select a value...");
        }

        lvQualif.setItems(data);
        lvQualif.setCellFactory(ComboBoxListCell.forListView(listaQualif));

        cbLanguage.setItems(FXCollections.observableArrayList("English", "Japanese", "Spanish"));

        TreeItem<String> rootItem = new TreeItem<>("Inbox", new ImageView(new Image(new File("img/carpetaWindows.png").toURI().toString())));
        TreeItem<String> branch1 = new TreeItem<>("Sales");
        TreeItem<String> branch2 = new TreeItem<>("Marketing");
        TreeItem<String> branch3 = new TreeItem<>("Distribution ");
        TreeItem<String> branch4 = new TreeItem<>("Costs");
        rootItem.getChildren().addAll(branch1, branch2, branch3, branch4);
        treeView.setRoot(rootItem);
    }

    public void selectItem() {

    }
}