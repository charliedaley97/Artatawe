package Artatawe.GUI;

import Artatawe.Data.Profile;
import com.jfoenix.controls.JFXMasonryPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *  @author Aleksandr Slobodov
 *
 * ProfileScene.java
 *
 *  Scene made to display profile information.
 *  Inherits all of the elements from ScenePattern.java
 *
 */

public class ProfileScene extends ScenePattern{

    //Profile to be displayed
    private Profile p;

    /**
     * Constructor for ProfileScene
     * @param p profile to be displayed
     */
    public ProfileScene(Profile p){
         this.p = p;
         setNameLabel("Aleksandr Slobodov");
         setContentPane();

    }


    //For now all of the paths are hard cored, but further all of the images gonna be fetched from Profile p.

    /**
     * Generates central content pane for profile.
     * @return profile page.
     */
    @Override
    //TODO Once Profile.java is finished, remove all of that hard-coded shit that is in this method and make everything automatic
    public JFXMasonryPane constructContentPane(){
        JFXMasonryPane contentPane = new JFXMasonryPane();
        ImageView imgView = new ImageView(new Image(getClass().getResource("/img1.png").toExternalForm()));
        ImageView imgView2 = new ImageView(new Image(getClass().getResource("/img2.png").toExternalForm()));
        ImageView imgView3 = new ImageView(new Image(getClass().getResource("/img1.png").toExternalForm()));
        ImageView imgView4 = new ImageView(new Image(getClass().getResource("/img2.png").toExternalForm()));
        ImageView imgView5 = new ImageView(new Image(getClass().getResource("/img1.png").toExternalForm()));
        imgView.setFitWidth(200);
        imgView.setFitHeight(200);
        imgView2.setFitWidth(50);
        imgView2.setFitHeight(50);
        imgView3.setFitWidth(50);
        imgView3.setFitHeight(50);
        imgView4.setFitWidth(50);
        imgView4.setFitHeight(50);
        imgView5.setFitWidth(50);
        imgView5.setFitHeight(50);
        AnchorPane pane = new AnchorPane();
        pane.getChildren().add(imgView);
        JFXMasonryPane pane2 = new JFXMasonryPane();
        pane2.getChildren().addAll(new Pane(imgView2),new Pane(imgView3),new Pane(imgView4),new Pane(imgView5));
        pane2.setPrefSize(120,150);
        pane2.setHSpacing(-1);
        VBox pane1 = new VBox(new Label("About"), new Label("Name: Aleksandr Slobodov\nAge:20y.o."));
        pane1.setStyle("-fx-effect: dropshadow(gaussian, silver, 10, 0, 0, 0); -fx-background-color: #E8EAF6;");
        pane2.setStyle("-fx-effect: dropshadow(gaussian, silver, 10, 0, 0, 0);-fx-background-color: #E8EAF6;");
        contentPane.getChildren().addAll(pane,pane1,pane2);

        return contentPane;
    }

}
