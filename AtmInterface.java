package atm.pkginterface;

import java.io.InputStream;
import java.io.FileInputStream;
import javafx.application.Application; 
import static javafx.application.Application.launch;
import javafx.scene.Group;  
import javafx.scene.Scene; 
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;  
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView; 
import javafx.stage.Stage; 

public class AtmInterface extends Application {
    
    int balance = 50000;
    int minAmount = 50;
    int maxAmount = 5000;;
    Scene scn1, scn2, scn3, scn4, scn5, scn6, scn7;
    Stage primaryStage, NewWindow1, NewWindow2, NewWindow3, NewWindow4, NewWindow5, NewWindow6, NewWindow7;
    
    @Override   
    
    public void start(Stage primaryStage) throws Exception {  
        primaryStage.setTitle(" My ATM ! ");                                      //put the title to Stage. 
        // setting for Text 
        Text tx1 = new Text();
        tx1.setText(" Welcome Dear Client ... ");
        tx1.setX(360);
        tx1.setY(100);
        tx1.setFont(Font.font("Forte", FontWeight.BOLD.BLACK,FontPosture.ITALIC, 25));    // string family for font, font weight, Font Posture, font size
        tx1.setFill(Color.BLACK);
        // setting for label 1
        Label l1 = new Label();
        l1.setText(" User Number  : ");
        l1.setLayoutX(180);
        l1.setLayoutY(270);
        l1.setStyle("-fx-background-color: #555553;");
        l1.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 35)); 
        //setting for text field 1  just for  integer number
        TextField NumberField = new TextField() {
        @Override public void replaceText(int start, int end, String text) {
            if (text.matches("[0-9]*"))
            {
               super.replaceText(start, end, text);
            }
          }
        @Override public void replaceSelection(String text) {
            if (text.matches("[0-9]*"))
            {
              super.replaceSelection(text);
              Group NumberField = new Group();
              primaryStage.setScene(new Scene(NumberField));
            }
          }
          };
        NumberField.setLayoutX(440);
        NumberField.setLayoutY(266);
        NumberField.setPromptText(" Enter Your User Number ");
        NumberField.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25));
        NumberField.setOnKeyTyped(event ->{ 
        int maxch = 4;
        if(NumberField.getText().length() > maxch) event.consume();
      });
        //setting for label 2
        Label l2 = new Label();
        l2.setText("   PassWord     : ");
        l2.setLayoutX(187);
        l2.setLayoutY(380);
        l2.setStyle("-fx-background-color: #555553;");
        l2.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 35));
        // setting for PassWor field  just for  integer number and not shown it
        PasswordField NumberField2 = new PasswordField() {
            @Override public void replaceText(int start, int end, String text) {
              if (text.matches("[0-9]*"))
              {
                 super.replaceText(start, end, text);
              }
              }
            @Override public void replaceSelection(String text) {
              if (text.matches("[0-9]*")) {
                super.replaceSelection(text);
                Group NumberField = new Group();
                primaryStage.setScene(new Scene(NumberField));
              }
              }
          };
        NumberField2.setLayoutX(440);
        NumberField2.setLayoutY(376);
        NumberField2.setPromptText(" Enter Your PassWord ");
        NumberField2.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25)); 
        NumberField2.setOnKeyTyped(event ->{ 
        int maxch = 4;
        if(NumberField2.getText().length() > maxch) event.consume();
    });                       
        Button bt11 = new Button();
        bt11.setText(" Exit ");
        bt11.setLayoutX(540);
        bt11.setLayoutY(610);
        bt11.setStyle("-fx-background-color: #ff3300;");
        bt11.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 30));
        bt11.setOnAction(new EventHandler<ActionEvent>() { 
            @Override 
            public void handle(ActionEvent e)
            {
                 primaryStage.close();
            }
            });                                                     
        // setting for Button 1  
        Button bt1 = new Button();
        bt1.setText(" Login ");
        bt1.setLayoutX(340);
        bt1.setLayoutY(610);
        bt1.setStyle("-fx-background-color: #ff3300;");
        bt1.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 30));
        // setting for new window 1
        bt1.setOnAction(new EventHandler<ActionEvent>() { 
           @Override 
           public void handle(ActionEvent e) {
            Button bt69 = new Button();
            bt69.setText(" Close ");
            bt69.setLayoutX(30);
            bt69.setLayoutY(430);
            bt69.setStyle("-fx-background-color: #566666;");
            bt69.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 20));
            bt69.setOnAction(new EventHandler<ActionEvent>() { 
               @Override 
               public void handle(ActionEvent e)
               {
                    NewWindow2.close();
                    primaryStage.setScene(scn1);
               }
               });             
                // seting for button 3
                Button bt3 = new Button();
                bt3.setText("    Deposit Balance   ");
                bt3.setLayoutX(40);
                bt3.setLayoutY(130);
                bt3.setStyle("-fx-background-color: #009dff;");
                bt3.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 30));
                // setting for new window 2
                bt3.setOnAction(new EventHandler<ActionEvent>() { 
                    @Override 
                     public void handle(ActionEvent e) {
                        Text tx1 = new Text ();
                        tx1.setText(" Welcome Dear Client ... ");
                        tx1.setX(120);
                        tx1.setY(80);
                        tx1.setFont(Font.font("Forte", FontWeight.BOLD.BLACK,FontPosture.ITALIC, 25));    // string family for font, font weight, Font Posture, font size
                        tx1.setFill(Color.BLACK);
                        Label l5 = new Label();
                        l5.setText(" Enter The Amount : ");
                        l5.setLayoutX(35);
                        l5.setLayoutY(203);
                        l5.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 18));
                        // setting for text field 2
                        Group TextField = new Group();
                        TextField NumberField = new TextField() {
                        @Override public void replaceText(int start, int end, String text) {
                          if (text.matches("[0-9]*"))
                          {
                            super.replaceText(start, end, text);
                          }
                          }
                        @Override public void replaceSelection(String text) {
                          if (text.matches("[0-9]*"))
                          {
                            super.replaceSelection(text);
                            Group NumberField = new Group();
                                  primaryStage.setScene(new Scene(NumberField));
                          }
                          }
                          };
                                NumberField.setLayoutX(210);
                                NumberField.setLayoutY(200);
                                NumberField.setPromptText(" Enter Your Amount ");
                                NumberField.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 18));     
                                NumberField.setOnKeyTyped(event ->{ 
                                int maxch = 3;
                                if(NumberField.getText().length() > maxch) event.consume();
                          });
                    // setting for button 6
                    Button bt6 = new Button();
                    bt6.setText(" Ok ");
                    bt6.setLayoutX(230);
                    bt6.setLayoutY(310);
                    bt6.setStyle("-fx-background-color: #ff3300;");
                    bt6.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 20));
                    bt6.setOnAction(new EventHandler<ActionEvent>() { 
                         @Override 
                            public void handle(ActionEvent e)
                            {
                                if(Integer.parseInt(NumberField.getText()) > maxAmount )
                                {
                                    System.out.println(" > Sorry Wrong Value, It Must Be Less Than 5000 ");

                                }
                                else
                                {
                                balance += Integer.parseInt(NumberField.getText());
                                System.out.println( " > Your balance now is : " + balance);
                                NewWindow4.close();
                                }
                            }
                            }); 
                         Group root2 = new Group();
                         root2.getChildren().add(l5);
                         root2.getChildren().add(NumberField);
                         root2.getChildren().add(bt6);
                         root2.getChildren().add(tx1);
                         scn6 = new Scene(root2, 500, 400); 
                         scn6.setFill(Color.GREEN); 
                         NewWindow4 = new Stage();
                         NewWindow4.setTitle(" Deposit Balance ");
                         NewWindow4.setScene(scn6);
                         NewWindow4.show(); 
            }     
            }); 
                Text tx1 = new Text ();
                tx1.setText(" Welcome Dear Client ... ");
                tx1.setX(240);
                tx1.setY(70);
                tx1.setFont(Font.font("Forte", FontWeight.BOLD.BLACK,FontPosture.ITALIC, 25));    // string family for font, font weight, Font Posture, font size
                tx1.setFill(Color.BLACK);
                                                                                // setting for button 4
                        Button bt4 = new Button();
                        bt4.setText(" Withdraw Balance ");
                        bt4.setLayoutX(400);
                        bt4.setLayoutY(130);
                        bt4.setStyle("-fx-background-color: #009dff;");
                        bt4.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 30));
                        // setting for new window 4
                        bt4.setOnAction(new EventHandler<ActionEvent>() { 
                            @Override 
                                public void handle(ActionEvent e) {
                                    Text tx1 = new Text ();
                                    tx1.setText(" Welcome Dear Client ... ");
                                    tx1.setX(120);
                                    tx1.setY(100);
                                    tx1.setFont(Font.font("Forte", FontWeight.BOLD.BLACK,FontPosture.ITALIC, 25));    // string family for font, font weight, Font Posture, font size
                                    tx1.setFill(Color.BLACK);
                                    Label l5 = new Label();
                                    l5.setText(" Enter The Amount : ");
                                    l5.setLayoutX(35);
                                    l5.setLayoutY(203);
                                    l5.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 18));
                    // setting for text field 2
                    Group TextField = new Group();
                    TextField NumberField = new TextField() {
                    @Override public void replaceText(int start, int end, String text) {
                      if (text.matches("[0-9]*"))
                      {
                        super.replaceText(start, end, text);
                      }
                      }
                    @Override public void replaceSelection(String text) {
                      if (text.matches("[0-9]*"))
                      {
                        super.replaceSelection(text);
                              Group NumberField = new Group();
                              primaryStage.setScene(new Scene(NumberField));
                      }
                    }
                      };
                            NumberField.setLayoutX(210);
                            NumberField.setLayoutY(200);
                            NumberField.setPromptText(" Enter Your Amount ");
                            NumberField.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 18));
                            NumberField.setOnKeyTyped(event ->{ 
                            int maxch = 3;
                            if(NumberField.getText().length() > maxch) event.consume();
                      });
                    // setting for button 6
                    Button bt7 = new Button();
                    bt7.setText(" Ok ");
                    bt7.setLayoutX(230);
                    bt7.setLayoutY(310);
                    bt7.setStyle("-fx-background-color: #ff3300;");
                    bt7.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 20));
                    bt7.setOnAction(new EventHandler<ActionEvent>() { 
                        @Override 
                            public void handle(ActionEvent e)
                            {
                                if(Integer.parseInt(NumberField.getText()) < minAmount )
                                {
                                    System.out.println(" > Sorry Wrong Value, It Must Be More Than 50 ");
                                }
                                else if (Integer.parseInt(NumberField.getText()) > maxAmount)
                                {
                                    System.out.println(" > Soorry Wrong Value, It Must Be Less Than 5000 ");
                                }
                                else
                                {
                                balance -= Integer.parseInt(NumberField.getText());
                                System.out.println(" > Your balance now is : " + balance);
                                NewWindow1.close();
                                }
                            }
                            });
            Group root3 = new Group();
            root3.getChildren().add(l5);
            root3.getChildren().add(NumberField);
            root3.getChildren().add(bt7);
            root3.getChildren().add(tx1);
            scn5 = new Scene(root3, 500, 400); 
            scn5.setFill(Color.GREEN); 
            NewWindow1 = new Stage();
            NewWindow1.setTitle(" Withdraw Balance ");
            NewWindow1.setScene(scn5);
            NewWindow1.show(); 
                }
                });
                Button bt45 = new Button();
                bt45.setText("  Change Language   ");
                bt45.setLayoutX(400);
                bt45.setLayoutY(250);
                bt45.setStyle("-fx-background-color: #009dff;");
                bt45.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 30));
                bt45.setOnAction(new EventHandler<ActionEvent>() { 
                    @Override 
                       public void handle(ActionEvent e)
                       {
                           Text tx1 = new Text ();
                           tx1.setText(" Welcome Dear Client ... ");
                           tx1.setX(120);
                           tx1.setY(80);
                           tx1.setFont(Font.font("Forte", FontWeight.BOLD.BLACK,FontPosture.ITALIC, 25));    // string family for font, font weight, Font Posture, font size
                           tx1.setFill(Color.BLACK);
                           RadioButton rb1 = new RadioButton();
                           rb1.setText(" English ");
                           rb1.setLayoutX(100);
                           rb1.setLayoutY(150);
                           rb1.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 22));                                                                                           
                           RadioButton rb2 = new RadioButton();
                           rb2.setText(" French ");
                           rb2.setLayoutX(100);
                           rb2.setLayoutY(190);
                           rb2.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 22));
                           RadioButton rb3 = new RadioButton();
                           rb3.setText(" Arabic ");
                           rb3.setLayoutX(100);
                           rb3.setLayoutY(230);
                           rb3.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 22));
                           Button bt98 = new Button();
                           bt98.setText(" Ok ");
                           bt98.setLayoutX(220);
                           bt98.setLayoutY(300);
                           bt98.setStyle("-fx-background-color: #566666;");
                           bt98.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25));
                           bt98.setOnAction(new EventHandler <ActionEvent>() { 
                               @Override 
                                   public void handle(ActionEvent e)
                                   {

                                        //set the language when i choose and close the window           
                                        NewWindow7.close();
                                   }
                            });  
                // to choose one option                                                      
                ToggleGroup tg = new ToggleGroup();
                rb1.setToggleGroup(tg);
                rb2.setToggleGroup(tg);
                rb3.setToggleGroup(tg);      
                Group root8 = new Group();
                root8.getChildren().add(rb1);
                root8.getChildren().add(rb2);
                root8.getChildren().add(tx1);
                root8.getChildren().add(rb3);
                root8.getChildren().add(bt98);
                scn7 = new Scene(root8, 500, 400); 
                scn7.setFill(Color.GREEN); 
                NewWindow7 = new Stage();
                NewWindow7.setTitle(" Change Language ");
                NewWindow7.setScene(scn7);
                NewWindow7.show(); 
            }
            });
                    // setting for button 5
                    Button bt5 = new Button();
                    bt5.setText(" Check My Balance ");
                    bt5.setLayoutX(40);
                    bt5.setLayoutY(250);
                    bt5.setStyle("-fx-background-color: #009dff;");
                    bt5.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 30));
                    bt5.setOnAction(new EventHandler<ActionEvent>() { 
                        @Override 
                            public void handle(ActionEvent e)
                            {
                                Text tx1 = new Text ();
                                tx1.setText(" Welcome Dear Client ... ");
                                tx1.setX(120);
                                tx1.setY(70);
                                tx1.setFont(Font.font("Forte", FontWeight.BOLD.BLACK,FontPosture.ITALIC, 25));    // string family for font, font weight, Font Posture, font size
                                tx1.setFill(Color.BLACK);
                                Label l6 = new Label();
                                l6.setText(" User Number : ");
                                l6.setLayoutX(60);
                                l6.setLayoutY(120);
                                l6.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25));
                                // to print User Number in new window 3  
                                Text tx99 = new Text (NumberField.getText());
                                tx99.setX(230);
                                tx99.setY(145);
                                tx99.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.ITALIC, 25));    // string family for font, font weight, Font Posture, font size
                                tx99.setFill(Color.BLACK);
                                Label l8 = new Label();
                                l8.setText(" Last Check  : ");
                                l8.setLayoutX(70);
                                l8.setLayoutY(160);
                                l8.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25));
                                Label l9 = new Label();
                                l9.setText(" My Balance  : " + balance);
                                l9.setLayoutX(65);
                                l9.setLayoutY(200);
                                l9.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25));
                                Button bt99 = new Button();
                                bt99.setText(" Close ");
                                bt99.setLayoutX(20);
                                bt99.setLayoutY(430);
                                bt99.setStyle("-fx-background-color: #566666;");
                                bt99.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25));
                                bt99.setOnAction(new EventHandler <ActionEvent>() { 
                                    @Override 
                                        public void handle(ActionEvent e)
                                        {
                                                 NewWindow5.close();
                                        }
                                        });  
                           Group root6 = new Group();
                           root6.getChildren().add(tx1);
                           root6.getChildren().add(l6);
                           root6.getChildren().add(l8);
                           root6.getChildren().add(l9);
                           root6.getChildren().add(tx99);
                           root6.getChildren().add(bt99);
                           scn3 = new Scene(root6, 500, 500); 
                           scn3.setFill(Color.GREEN);                     
                           NewWindow5 = new Stage();
                           NewWindow5.setTitle(" Check My Balance ");
                           NewWindow5.setScene(scn3);
                           NewWindow5.show(); 
                        }
                        });
                       Group root4 = new Group();
                       root4.getChildren().add(bt3);
                       root4.getChildren().add(bt4); 
                       root4.getChildren().add(bt45); 
                       root4.getChildren().add(bt5);
                       root4.getChildren().add(tx1);
                       root4.getChildren().add(bt69);
                       scn2 = new Scene(root4, 750, 500); 
                       scn2.setFill(Color.GREEN); 
                       NewWindow2 = new Stage();
                       NewWindow2.setTitle(" Login ");
                       NewWindow2.setScene(scn2); 
                       primaryStage.setScene(scn2);
            }           
            }); 
            // setting for Button 2
            Button bt2 = new Button();
            bt2.setText(" Help ");
            bt2.setLayoutX(30);
            bt2.setLayoutY(730);
            bt2.setStyle("-fx-background-color: #566666;");
            bt2.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25));
            // setting for new window 3   
            bt2.setOnAction(new EventHandler<ActionEvent>() { 
                @Override 
                        public void handle(ActionEvent e)
                        {
                            Text tx1 = new Text ();
                            tx1.setText(" Welcome Dear Client ... ");
                            tx1.setX(280);
                            tx1.setY(80);
                            tx1.setFont(Font.font("Forte", FontWeight.BOLD.BLACK,FontPosture.ITALIC, 25));    // string family for font, font weight, Font Posture, font size
                            tx1.setFill(Color.BLACK);
                            Text tx5 = new Text();
                            tx5.setText( " Dear Clint, Welcome To Your  ATM Service .... \n" + "\n" +
                                         "To Help You With Anything You Want, Read These Rules Carefully\n" + "\n" +
                                         "First: You Must Have A Bank Account, Either Here Or Any Other Bank In Order\n " + "\n" +
                                         "To Be Able To Do Operations In This Account\n" + "\n" +
                                         "Second: Try To Choose The Process Carefully So As Not\n " + "\n" +
                                         "To Lose Your Bank Balance  ..................... ");
                            tx5.setLayoutX(10);
                            tx5.setLayoutY(130);
                            tx5.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 22));    // string family for font, font weight, Font Posture, font size
                            tx5.setFill(Color.BLACK);
                            Button bt8 = new Button();
                            bt8.setText(" Close ");
                            bt8.setLayoutX(500);
                            bt8.setLayoutY(410);
                            bt8.setStyle("-fx-background-color: #566666;");
                            bt8.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 25));
                            bt8.setOnAction(new EventHandler <ActionEvent>() { 
                                    @Override 
                                           public void handle(ActionEvent e)
                                           {
                                                 NewWindow3.close();
                                                 primaryStage.setScene(scn1);
                                           }
                                           });  
                            Group root3 = new Group();
                            Scene  scn4 = new Scene(root3, 810, 500); 
                            scn4.setFill(Color.GREEN); 
                            root3.getChildren().add(tx1);
                            root3.getChildren().add(tx5);
                            root3.getChildren().add(bt8);
                            NewWindow3 = new Stage();
                            NewWindow3.setTitle(" Help ");
                            NewWindow3.setScene(scn4);
                            primaryStage.setScene(scn4);
                        }
                        }); 
          //RadioButton 1, it is not important but it will use to take tax from the clint
          RadioButton rb1 = new RadioButton();
          rb1.setText(" I am a Clint In This Bank. ");
          rb1.setLayoutX(300);
          rb1.setLayoutY(470);
          rb1.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 22));
          //RadioButton 2
          RadioButton rb2 = new RadioButton();
          rb2.setText(" I am Not. ");
          rb2.setLayoutX(300);
          rb2.setLayoutY(520);
          rb2.setFont(Font.font("Times New Roman", FontWeight.BOLD.BLACK,FontPosture.REGULAR, 22));
          // to choose one option 
          ToggleGroup tg = new ToggleGroup();
          rb1.setToggleGroup(tg);
          rb2.setToggleGroup(tg);
          // for image at primaryStage
          /*
            Image img2 = new Image ("htttps://image.app.goo.gl/DS6f4kJmHhRULi9E8"); // code for image but online

          */
          InputStream strm = new FileInputStream("D:\\image pro\\images.jpeg");
          Image img1 = new Image(strm);
          ImageView imgv = new ImageView();
          imgv.setImage(img1);
          imgv.setLayoutX(805);
          imgv.setLayoutY(590);
          imgv.setFitWidth(180);
          imgv.setPreserveRatio(true);
          Group root1 = new Group(); 
          root1.getChildren().add(tx1);
          root1.getChildren().add(bt1);
          root1.getChildren().add(bt11);
          root1.getChildren().add(bt2);
          root1.getChildren().add(NumberField);
          root1.getChildren().add(NumberField2);
          root1.getChildren().add(l1);
          root1.getChildren().add(rb1);
          root1.getChildren().add(rb2);
          root1.getChildren().add(l2);
          root1.getChildren().add(imgv);
          scn1 = new Scene(root1, 1000, 800); 
          scn1.setFill(Color.GREEN); 
          primaryStage.setScene(scn1);
          primaryStage.show(); 
       }    
       public static void main(String args[]){ 
          launch(args);
       }      
}