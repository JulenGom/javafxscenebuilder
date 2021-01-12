package ehu.isad.controller.ui;

import ehu.isad.model.StudentsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;
import org.apache.commons.codec.binary.Hex;
public class UrlController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private TextField textField;
    @FXML
    public void onClick(ActionEvent actionEvent) {
        this.check();
    }
    @FXML
    private URL location;

    @FXML
    private TableView<StudentsModel> tbData;

    @FXML
    private TableColumn<StudentsModel, String> url;

    @FXML
    private TableColumn<StudentsModel, String> md5;

    @FXML
    private TableColumn<StudentsModel,String> version;

    //add your data here from any source
    //private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList(
     //       new StudentsModel(1,"Jon","Guridi"),
       //     new StudentsModel(2,"Ane","Bengoa")
   // );

    @FXML
    void initialize() {
        url.setCellValueFactory(new PropertyValueFactory<>("url"));
        md5.setCellValueFactory(new PropertyValueFactory<>("md5"));
        version.setCellValueFactory(new PropertyValueFactory<>("version"));
    }
    private void check() {
        String web = textField.getText();
        String kateatuta = web + "/README";
        URL url = new URL(kateatuta);
        InputStream is = url.openStream();
        MessageDigest md = MessageDigest.getInstance("MD5");
        String digest = getDigest(is, md, 2048);
    }
    public static String getDigest(InputStream is, MessageDigest md, int byteArraySize)
            throws NoSuchAlgorithmException, IOException {

        md.reset();
        byte[] bytes = new byte[byteArraySize];
        int numBytes;
        while ((numBytes = is.read(bytes)) != -1) {
            md.update(bytes, 0, numBytes);
        }
        byte[] digest = md.digest();
        String result = new String(Hex.encodeHex(digest));
        return result;
    }


    }
}
