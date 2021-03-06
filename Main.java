package com.company;
import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.animation.TranslateTransition;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Rectangle road=new Rectangle();
        road.setX(0);
        road.setY(470);
        road.setWidth(1350);
        road.setHeight(190);
        road.setFill(Color.GRAY);

        Rectangle road_upper=new Rectangle();
        road_upper.setX(0);
        road_upper.setY(380-50);
        road_upper.setWidth(1350);
        road_upper.setHeight(90+50);
        road_upper.setFill(Color.FORESTGREEN);
        Rectangle road_lower=new Rectangle();
        road_lower.setX(0);
        road_lower.setY(660);
        road_lower.setWidth(1350);
        road_lower.setHeight(50);
        road_lower.setFill(Color.FORESTGREEN);
        Rectangle white_upper=new Rectangle();
        white_upper.setX(0);
        white_upper.setY(485);
        white_upper.setWidth(1350);
        white_upper.setHeight(15);
        white_upper.setFill(Color.WHITE);
        Rectangle white_lower=new Rectangle();
        white_lower.setX(0);
        white_lower.setY(630);
        white_lower.setWidth(1350);
        white_lower.setHeight(15);
        white_lower.setFill(Color.WHITE);
        Rectangle white_rect1=new Rectangle();
        white_rect1.setX(20);
        white_rect1.setY(560);
        white_rect1.setWidth(50);
        white_rect1.setHeight(8);
        white_rect1.setFill(Color.WHITE);
        Rectangle white_rect2=new Rectangle();
        white_rect2.setX(120);
        white_rect2.setY(560);
        white_rect2.setWidth(50);
        white_rect2.setHeight(8);
        white_rect2.setFill(Color.WHITE);
        Rectangle white_rect3=new Rectangle();
        white_rect3.setX(220);
        white_rect3.setY(560);
        white_rect3.setWidth(50);
        white_rect3.setHeight(8);
        white_rect3.setFill(Color.WHITE);
        Rectangle white_rect4=new Rectangle();
        white_rect4.setX(320);
        white_rect4.setY(560);
        white_rect4.setWidth(50);
        white_rect4.setHeight(8);
        white_rect4.setFill(Color.WHITE);
        Rectangle white_rect5=new Rectangle();
        white_rect5.setX(420);
        white_rect5.setY(560);
        white_rect5.setWidth(50);
        white_rect5.setHeight(8);
        white_rect5.setFill(Color.WHITE);
        Rectangle white_rect6=new Rectangle();
        white_rect6.setX(520);
        white_rect6.setY(560);
        white_rect6.setWidth(50);
        white_rect6.setHeight(8);
        white_rect6.setFill(Color.WHITE);
        Rectangle white_rect7=new Rectangle();
        white_rect7.setX(620);
        white_rect7.setY(560);
        white_rect7.setWidth(50);
        white_rect7.setHeight(8);
        white_rect7.setFill(Color.WHITE);
        Rectangle white_rect8=new Rectangle();
        white_rect8.setX(720);
        white_rect8.setY(560);
        white_rect8.setWidth(50);
        white_rect8.setHeight(8);
        white_rect8.setFill(Color.WHITE);
        Rectangle white_rect9=new Rectangle();
        white_rect9.setX(820);
        white_rect9.setY(560);
        white_rect9.setWidth(50);
        white_rect9.setHeight(8);
        white_rect9.setFill(Color.WHITE);
        Rectangle white_rect10=new Rectangle();
        white_rect10.setX(920);
        white_rect10.setY(560);
        white_rect10.setWidth(50);
        white_rect10.setHeight(8);
        white_rect10.setFill(Color.WHITE);
        Rectangle white_rect11=new Rectangle();
        white_rect11.setX(1020);
        white_rect11.setY(560);
        white_rect11.setWidth(50);
        white_rect11.setHeight(8);
        white_rect11.setFill(Color.WHITE);
        Rectangle white_rect12=new Rectangle();
        white_rect12.setX(1120);
        white_rect12.setY(560);
        white_rect12.setWidth(50);
        white_rect12.setHeight(8);
        white_rect12.setFill(Color.WHITE);
        Rectangle white_rect13=new Rectangle();
        white_rect13.setX(1220);
        white_rect13.setY(560);
        white_rect13.setWidth(50);
        white_rect13.setHeight(8);
        white_rect13.setFill(Color.WHITE);

        Polyline tree1=new Polyline();
        tree1.getPoints().addAll(new Double[]{
                100.0,435.0,
                120.0,435.0,
                117.0,380.0,
                150.0,360.0,
                117.0,370.0,
                113.0,335.0,
                143.0,315.0,
                113.0,325.0,
                110.0,295.0,
                107.0,325.0,
                80.0,315.0,
                107.0,335.0,
                104.0,370.0,
                70.0,360.0,
                104.0,380.0,
                100.0,435.0,

        });
        tree1.setFill(Color.CHOCOLATE);


        Polyline tree2=new Polyline();
        tree2.getPoints().addAll(new Double[]{
                250+100.0,435.0,
                250+120.0,435.0,
                250+117.0,380.0,
                250+150.0,360.0,
                250+117.0,370.0,
                250+113.0,335.0,
                250+143.0,315.0,
                250+113.0,325.0,
                250+110.0,295.0,
                250+107.0,325.0,
                250+80.0,315.0,
                250+107.0,335.0,
                250+104.0,370.0,
                250+70.0,360.0,
                250+104.0,380.0,
                250+100.0,435.0,

        });

        tree2.setFill(Color.CHOCOLATE);

        Polyline tree3=new Polyline();
        tree3.getPoints().addAll(new Double[]{
                500+100.0,435.0,
                500+120.0,435.0,
                500+117.0,380.0,
                500+150.0,360.0,
                500+117.0,370.0,
                500+113.0,335.0,
                500+143.0,315.0,
                500+113.0,325.0,
                500+110.0,295.0,
                500+107.0,325.0,
                500+80.0,315.0,
                500+107.0,335.0,
                500+104.0,370.0,
                500+70.0,360.0,
                500+104.0,380.0,
                500+100.0,435.0,

        });

        tree3.setFill(Color.CHOCOLATE);

        Polyline tree4=new Polyline();
        tree4.getPoints().addAll(new Double[]{
                750+100.0,435.0,
                750+120.0,435.0,
                750+117.0,380.0,
                750+150.0,360.0,
                750+117.0,370.0,
                750+113.0,335.0,
                750+143.0,315.0,
                750+113.0,325.0,
                750+110.0,295.0,
                750+107.0,325.0,
                750+80.0,315.0,
                750+107.0,335.0,
                750+104.0,370.0,
                750+70.0,360.0,
                750+104.0,380.0,
                750+100.0,435.0,

        });

        tree4.setFill(Color.CHOCOLATE);


        Polyline tree5=new Polyline();
        tree5.getPoints().addAll(new Double[]{
                1000+100.0,435.0,
                1000+120.0,435.0,
                1000+117.0,380.0,
                1000+150.0,360.0,
                1000+117.0,370.0,
                1000+113.0,335.0,
                1000+143.0,315.0,
                1000+113.0,325.0,
                1000+110.0,295.0,
                1000+107.0,325.0,
                1000+80.0,315.0,
                1000+107.0,335.0,
                1000+104.0,370.0,
                1000+70.0,360.0,
                1000+104.0,380.0,
                1000+100.0,435.0,

        });

        tree5.setFill(Color.CHOCOLATE);



        Rectangle SkyColor=new Rectangle();
        SkyColor.setX(0);
        SkyColor.setY(-50);
        SkyColor.setWidth(1350);
        SkyColor.setHeight(380);
        SkyColor.setFill(Color.SKYBLUE);

        Circle sun=new Circle();
        sun.setCenterX(650);
        sun.setCenterY(50);
        sun.setRadius(30);
        sun.setFill(Color.YELLOW);


        Ellipse cloud1=new Ellipse();
        cloud1.setCenterX(100);
        cloud1.setCenterY(100);
        cloud1.setRadiusX(90);
        cloud1.setRadiusY(50);
        cloud1.setFill(Color.WHITE);


        Ellipse cloud2=new Ellipse();
        cloud2.setCenterX(250);
        cloud2.setCenterY(250);
        cloud2.setRadiusX(90);
        cloud2.setRadiusY(50);
        cloud2.setFill(Color.WHITE);

        Ellipse cloud3=new Ellipse();
        cloud3.setCenterX(800);
        cloud3.setCenterY(170);
        cloud3.setRadiusX(90);
        cloud3.setRadiusY(50);
        cloud3.setFill(Color.WHITE);





        Polyline car=new Polyline();
        car.getPoints().addAll(new Double[]{
                142.0,290.0+230.0,
                370.0,290.0+230.0,
                370.0,267.0+230.0,
                320.0,255.0+230.0,
                280.0,220.0+230.0,
                200.0,220.0+230.0,
                170.0,255.0+230.0,
                142.0,260.0+230.0,
                142.0,290.0+230.0,

        });
        car.setFill(Color.RED);

        Polyline car2=new Polyline();
        car2.getPoints().addAll(new Double[]{
                250.0,460.0,
                250.0,485.0,
                300.0,485.0,
                270.0,460.0,
                250.0,460.0,
        });

        car2.setFill(Color.BLACK);

        Polyline car3=new Polyline();
        car3.getPoints().addAll(new Double[]{
                235.0,460.0,
                235.0,485.0,
                185.0,485.0,
                205.0,460.0,
                235.0,460.0,
        });

        car3.setFill(Color.BLACK);

        Arc arc1 = new Arc();

        //Setting the properties of the arc
        arc1.setCenterX(300.0f);
        arc1.setCenterY(520.0f);
        arc1.setRadiusX(30.0f);
        arc1.setRadiusY(30.0f);
        arc1.setStartAngle(0.0f);
        arc1.setLength(180.0f);


        Arc arc2 = new Arc();

        //Setting the properties of the arc
        arc2.setCenterX(195.0f);
        arc2.setCenterY(520.0f);
        arc2.setRadiusX(30.0f);
        arc2.setRadiusY(30.0f);
        arc2.setStartAngle(0.0f);
        arc2.setLength(180.0f);
        arc2.setType(ArcType.ROUND);

        Circle round1=new Circle();
        round1.setCenterX(195);
        round1.setCenterY(520);
        round1.setRadius(25);
        round1.setFill(Color.WHITE);

        Circle round2=new Circle();
        round2.setCenterX(300);
        round2.setCenterY(520);
        round2.setRadius(25);
        round2.setFill(Color.WHITE);

        Rectangle rect1=new Rectangle();
        rect1.setX(275);
        rect1.setY(517);
        rect1.setWidth(50);
        rect1.setHeight(5);
        rect1.setFill(Color.BLACK);


        Rectangle rect2=new Rectangle();
        rect2.setX(298);
        rect2.setY(495);
        rect2.setWidth(5);
        rect2.setHeight(50);
        rect2.setFill(Color.BLACK);


        Circle round3=new Circle();
        round3.setCenterX(301);
        round3.setCenterY(520);
        round3.setRadius(8);
        round3.setFill(Color.BLACK);


        Rectangle rect3=new Rectangle();
        rect3.setX(170);
        rect3.setY(517);
        rect3.setWidth(50);
        rect3.setHeight(5);
        rect3.setFill(Color.BLACK);


        Rectangle rect4=new Rectangle();
        rect4.setX(193);
        rect4.setY(495);
        rect4.setWidth(5);
        rect4.setHeight(50);
        rect4.setFill(Color.BLACK);

        Circle round4=new Circle();
        round4.setCenterX(196);
        round4.setCenterY(520);
        round4.setRadius(8);
        round4.setFill(Color.BLACK);


        TranslateTransition car_translate = new TranslateTransition();
        car_translate.setByX(1000);
        car_translate.setDuration(Duration.millis(10000));
        car_translate.setCycleCount(500);
        car_translate.setAutoReverse(false);
        car_translate.setNode(car);
        car_translate.play();

        TranslateTransition round1_translate = new TranslateTransition();
        round1_translate .setByX(1000);
        round1_translate .setDuration(Duration.millis(10000));
        round1_translate .setCycleCount(500);
        round1_translate .setAutoReverse(false);
        round1_translate .setNode(round1);
        round1_translate .play();

        TranslateTransition round2_translate = new TranslateTransition();
        round2_translate.setByX(1000);
        round2_translate.setDuration(Duration.millis(10000));
        round2_translate.setCycleCount(500);
        round2_translate.setAutoReverse(false);
        round2_translate.setNode(round2);
        round2_translate.play();

        TranslateTransition arc1_translate = new TranslateTransition();
        arc1_translate.setByX(1000);
        arc1_translate.setDuration(Duration.millis(10000));
        arc1_translate.setCycleCount(500);
        arc1_translate.setAutoReverse(false);
        arc1_translate.setNode(arc1);
        arc1_translate.play();

        TranslateTransition arc2_translate = new TranslateTransition();
        arc2_translate.setByX(1000);
        arc2_translate.setDuration(Duration.millis(10000));
        arc2_translate.setCycleCount(500);
        arc2_translate.setAutoReverse(false);
        arc2_translate.setNode(arc2);
        arc2_translate.play();

        TranslateTransition rect1_translate = new TranslateTransition();
        rect1_translate.setByX(1000);
        rect1_translate.setDuration(Duration.millis(10000));
        rect1_translate.setCycleCount(500);
        rect1_translate.setAutoReverse(false);
        rect1_translate.setNode(rect1);
        rect1_translate.play();

        TranslateTransition rect2_translate = new TranslateTransition();
        rect2_translate.setByX(1000);
        rect2_translate.setDuration(Duration.millis(10000));
        rect2_translate.setCycleCount(500);
        rect2_translate.setAutoReverse(false);
        rect2_translate.setNode(rect2);
        rect2_translate.play();

        TranslateTransition rect3_translate = new TranslateTransition();
        rect3_translate.setByX(1000);
        rect3_translate.setDuration(Duration.millis(10000));
        rect3_translate.setCycleCount(500);
        rect3_translate.setAutoReverse(false);
        rect3_translate.setNode(rect3);
        rect3_translate.play();

        TranslateTransition rect4_translate = new TranslateTransition();
        rect4_translate.setByX(1000);
        rect4_translate.setDuration(Duration.millis(10000));
        rect4_translate.setCycleCount(500);
        rect4_translate.setAutoReverse(false);
        rect4_translate.setNode(rect4);
        rect4_translate.play();

        TranslateTransition car2_translate = new TranslateTransition();
        car2_translate.setByX(1000);
        car2_translate.setDuration(Duration.millis(10000));
        car2_translate.setCycleCount(500);
        car2_translate.setAutoReverse(false);
        car2_translate.setNode(car2);
        car2_translate.play();

        TranslateTransition car3_translate = new TranslateTransition();
        car3_translate.setByX(1000);
        car3_translate.setDuration(Duration.millis(10000));
        car3_translate.setCycleCount(500);
        car3_translate.setAutoReverse(false);
        car3_translate.setNode(car3);
        car3_translate.play();

        TranslateTransition cloud1_translate = new TranslateTransition();
        cloud1_translate.setByX(1000);
        cloud1_translate.setDuration(Duration.millis(20000));
        cloud1_translate.setCycleCount(500);
        cloud1_translate.setAutoReverse(false);
        cloud1_translate.setNode(cloud1);
        cloud1_translate.play();

        TranslateTransition cloud2_translate = new TranslateTransition();
        cloud2_translate.setByX(1000);
        cloud2_translate.setDuration(Duration.millis(20000));
        cloud2_translate.setCycleCount(500);
        cloud2_translate.setAutoReverse(false);
        cloud2_translate.setNode(cloud2);
        cloud2_translate.play();

        TranslateTransition cloud3_translate = new TranslateTransition();
        cloud3_translate.setByX(1000);
        cloud3_translate.setDuration(Duration.millis(20000));
        cloud3_translate.setCycleCount(500);
        cloud3_translate.setAutoReverse(false);
        cloud3_translate.setNode(cloud3);
        cloud3_translate.play();

        TranslateTransition round3_translate = new TranslateTransition();
        round3_translate.setByX(1000);
        round3_translate.setDuration(Duration.millis(10000));
        round3_translate.setCycleCount(500);
        round3_translate.setAutoReverse(false);
        round3_translate.setNode(round3);
        round3_translate.play();


        TranslateTransition round4_translate = new TranslateTransition();
        round4_translate.setByX(1000);
        round4_translate.setDuration(Duration.millis(10000));
        round4_translate.setCycleCount(500);
        round4_translate.setAutoReverse(false);
        round4_translate.setNode(round4);
        round4_translate.play();



        RotateTransition rect1_rotate = new RotateTransition();

        //Setting Axis of rotation
        rect1_rotate .setAxis(Rotate.Z_AXIS);

        // setting the angle of rotation
        rect1_rotate .setByAngle(360);

        //setting cycle count of the rotation
        rect1_rotate .setCycleCount(5000);

        //Setting duration of the transition
        rect1_rotate.setDuration(Duration.millis(7000));

        //the transition will be auto reversed by setting this to false
        rect1_rotate .setAutoReverse(false);

        //setting Rectangle as the node onto which the
// transition will be applied
        rect1_rotate .setNode(rect1);

        //playing the transition
        rect1_rotate .play();

        RotateTransition rect2_rotate  = new RotateTransition();

        //Setting Axis of rotation
        rect2_rotate.setAxis(Rotate.Z_AXIS);

        // setting the angle of rotation
        rect2_rotate.setByAngle(360);

        //setting cycle count of the rotation
        rect2_rotate.setCycleCount(5000);

        //Setting duration of the transition
        rect2_rotate.setDuration(Duration.millis(7000));

        //the transition will be auto reversed by setting this to false
        rect2_rotate.setAutoReverse(false);

        //setting Rectangle as the node onto which the
// transition will be applied
        rect2_rotate.setNode(rect2);

        //playing the transition
        rect2_rotate.play();

        RotateTransition rect3_rotate = new RotateTransition();

        //Setting Axis of rotation
        rect3_rotate.setAxis(Rotate.Z_AXIS);

        // setting the angle of rotation
        rect3_rotate.setByAngle(360);

        //setting cycle count of the rotation
        rect3_rotate.setCycleCount(5000);

        //Setting duration of the transition
        rect3_rotate.setDuration(Duration.millis(7000));

        //the transition will be auto reversed by setting this to false
        rect3_rotate.setAutoReverse(false);

        //setting Rectangle as the node onto which the
// transition will be applied
        rect3_rotate.setNode(rect3);

        //playing the transition
        rect3_rotate.play();

        RotateTransition rect4_rotate = new RotateTransition();

        //Setting Axis of rotation
        rect4_rotate.setAxis(Rotate.Z_AXIS);

        // setting the angle of rotation
        rect4_rotate.setByAngle(360);

        //setting cycle count of the rotation
        rect4_rotate.setCycleCount(5000);

        //Setting duration of the transition
        rect4_rotate.setDuration(Duration.millis(7000));

        //the transition will be auto reversed by setting this to false
        rect4_rotate.setAutoReverse(false);

        //setting Rectangle as the node onto which the
// transition will be applied
        rect4_rotate.setNode(rect4);

        //playing the transition
        rect4_rotate.play();


        FillTransition fill = new FillTransition();

        //The transition will set to be auto reserved by setting this to true
        fill.setAutoReverse(false);

        //setting cycle count for the fill transition
        fill.setCycleCount(50);

        //setting duration for the Fill Transition
        fill.setDuration(Duration.millis(10000));

        //setting the Intital from value of the color
        //fill.setFromValue(Color.YELLOW);

        //setting the target value of the color
        fill.setToValue(Color.RED);

        //setting polygon as the shape onto which the fill transition will be applied
        fill.setShape(sun);

        //playing the fill transition
        fill.play();

        TranslateTransition sunDown_translate = new TranslateTransition();
        sunDown_translate.setByY(500);
        sunDown_translate.setDuration(Duration.millis(10000));
        sunDown_translate.setCycleCount(500);
        sunDown_translate.setAutoReverse(false);
        sunDown_translate.setNode(sun);
        sunDown_translate.play();






        Group root=new Group();
        root.getChildren().addAll(SkyColor,sun,road,road_upper,road_lower,white_upper,white_lower,white_rect1,white_rect2,white_rect3,white_rect4,white_rect5,
                white_rect6,white_rect7,white_rect8,white_rect9,white_rect10,white_rect11,white_rect12,white_rect13
                ,car,cloud1,cloud2,cloud3,tree1,tree2,tree3,tree4,tree5,
                car2,car3,arc1,arc2,round1,round2,rect1,rect2,rect3,rect4,round3,round4);



        Scene scene = new Scene(root, 1050, 800);
        primaryStage.setTitle("Shahadat Hossain 16303022");
        primaryStage.setScene(scene);
        primaryStage.show();
    }






    public static void main(String[] args) {
        launch(args);
    }

}