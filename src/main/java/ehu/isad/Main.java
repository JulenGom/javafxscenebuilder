package ehu.isad;

import ehu.isad.controller.ui.NagusiaKud;
import ehu.isad.controller.ui.EzarpenakKud;
import ehu.isad.controller.ui.StudentController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  private Parent nagusiaUI;
  private Parent ezarpenakUI;

  private Parent tableUI;
  private StudentController tableKud;

  private Stage stage;

  private NagusiaKud nagusiaKud;
  private EzarpenakKud ezarpenakKud;


  @Override
  public void start(Stage primaryStage) throws Exception {

    stage = primaryStage;
    pantailakKargatu();

    stage.setTitle("Taula");
    stage.setScene(new Scene(tableUI, 450, 275));
    stage.show();
  }

  private void pantailakKargatu() throws IOException {

    //FXMLLoader loaderKautotu = new FXMLLoader(getClass().getResource("/NagusiaUI.fxml"));
    //nagusiaUI = (Parent) loaderKautotu.load();
    //nagusiaKud = loaderKautotu.getController();
    //nagusiaKud.setMainApp(this);

    //FXMLLoader loaderMain = new FXMLLoader(getClass().getResource("/EzarpenakUI.fxml"));
    //ezarpenakUI = (Parent) loaderMain.load();
    //ezarpenakKud = loaderMain.getController();
    //ezarpenakKud.setMainApp(this);

    FXMLLoader loaderTaula = new FXMLLoader(getClass().getResource("/tableview.fxml"));
    tableUI = (Parent) loaderTaula.load();
    tableKud = loaderTaula.getController();
  }


  public static void main(String[] args) {
    launch(args);
  }
}
