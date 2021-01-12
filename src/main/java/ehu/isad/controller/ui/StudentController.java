package ehu.isad.controller.ui;

import ehu.isad.model.StudentsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<StudentsModel> tbData;

    @FXML
    private TableColumn<StudentsModel, Integer> studentId;

    @FXML
    private TableColumn<StudentsModel, String> firstName;

    @FXML
    private TableColumn<StudentsModel,String> lastName;

    //add your data here from any source
    private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList(
            new StudentsModel(1,"Jon","Guridi"),
            new StudentsModel(2,"Ane","Bengoa")
    );

    @FXML
    void initialize() {
        studentId.setCellValueFactory(new PropertyValueFactory<>("url"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("md5"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("version"));
        tbData.setItems(studentsModels);
    }

}
