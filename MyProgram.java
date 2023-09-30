import java.util.*;
import java.awt.*;
//import World;
//import Turtle;
import java.io.File;
import javax.sound.sampled.*;


public class MyProgram
{
  public static void main(String[] args)
  {
      World habitat = new World(800,800);
      Turtle t = new Turtle(habitat);
      t.setDelay(0.0275);
      t.setColor(Color.YELLOW);

  
      
      habitat.show(true);
       try {
        String filePath = "C:/Users/Atharva Donkar/Desktop/pratham/mp3.wav";
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            // Play the audio
            clip.start();

            // Your Turtle Graphics code here
      //upper triangle
            t.setPenWidth(100);
      t.penUp();
      t.goTo(-400,350);
      t.turnLeft(20);
      t.penDown();
      t.forward(400);
      t.backward(500);
      t.forward(500);

      t.turnRight(20);
      
      t.penUp();
      t.forward(35);
      
      t.penDown();
      t.turnRight(20);
      t.forward(450);
      
      t.turnLeft(20);
      
      //down strips striaght
      t.penUp();
      
      t.turnRight(90);
      t.forward(10);

      t.penDown();
     
      t.forward(700);
      t.turnLeft(90);
      
      t.penUp();
      t.goTo(-428,350);
            t.penDown();

      t.turnRight(90);
      t.forward(700);
      t.turnLeft(90);
      // triange down
      t.setPenWidth(110);
        t.penUp();
      t.goTo(-428,-340);
      t.penDown();
      t.turnRight(20);

      t.forward(400);
      t.backward(150);
      t.turnLeft(20);
      
      t.penUp();
      t.forward(400);
      
      t.penDown();
      t.turnLeft(20);
      t.forward(300);
      t.backward(500);
      t.turnRight(20);
      
      
      
      //turban
      t.setColor(Color.RED);
      t.penUp();
      t.goTo(40,250);
      t.penDown();
      t.setPenWidth(4);
      t.turnLeft(90);
      int i=0;
      t.setDelay(0);
      for(i=0;i<14;i++)
        {
        t.forward(10);
        t.turnLeft(13);
        }
        t.forward(10);
       t.turnLeft(180); 
       t.penUp();
       t.goTo(80,170);
       t.penDown();
       for(i=0;i<14;i++)
        {
        t.forward(19);
        t.turnLeft(13);
        }
        t.forward(15);

        
        //right face
       t.turnLeft(150); 
       t.penUp();
       t.goTo(20,150);
       t.penDown();
       for(i=0;i<12;i++)
        {
        t.forward(8);
        t.turnRight(16);
        }
        t.forward(40);
        
        for(i=0;i<6;i++)
        {
        t.forward(4);
        t.turnLeft(3);
        }
        t.forward(20);
         for(i=0;i<12;i++)
        {
        t.forward(4);
        t.turnLeft(8);
        }
        t.turnLeft(30);
        t.forward(6);
        t.turnLeft(30);
       //t.forward(6);
          t.forward(20);

          for(i=0;i<30;i++)
          {
            t.forward(1);
            t.turnRight(6);
          }
          t.turnLeft(180);
       
       // left face 
       
       t.penUp();
       t.goTo(15,150);
       t.turnLeft(90);
       t.penDown();
       t.forward(20);
        for(i=0;i<17;i++)
        {
        t.forward(9);
        t.turnLeft(10);
        }
         t.forward(20);
        //t.penUp();
        t.turnRight(15);
        t.forward(10);
        t.penDown();
        t.turnLeft(8);
        t.forward(40);
        t.turnLeft(9);
        t.forward(40);
        
         for(i=0;i<25;i++)
        {
        t.forward(5);
        t.turnLeft(5);
        }
        
        //right ear
        t.penUp();
         t.goTo(80,170);
         t.turnRight(60);
         t.backward(20);
      t.penDown();
      
      for (i=0;i<10;i++)
      {
        
        t.forward(6);
        t.turnLeft(1);
          
      }
        t.turnRight(160);
        
        for (i=0;i<10;i++)
      {
        
        t.forward(3);
        t.turnLeft(1);
          
      }
      t.turnLeft(20);
      
       for (i=0;i<40;i++)
      {
        
        t.forward(1);
        t.turnLeft(1);
          
      }
        
        for (i=0;i<45;i++)
      {
        
        t.forward(1);
        t.turnRight(6);
          
      }
    //leftt ear    
       t.penUp();
         t.goTo(-90,165);
         t.turnLeft(140);
         t.backward(10);
      t.penDown(); 
      
       for (i=0;i<10;i++)
      {
        
        t.forward(6);
        t.turnRight(1);
          
      }
        
        t.turnLeft(140);
        
        for (i=0;i<10;i++)
      {
        
        t.forward(3);
        t.turnLeft(1);
          
      }
       for (i=0;i<40;i++)
      {
        
        t.forward(1);
        t.turnRight(1);
          
      }
       
        for (i=0;i<45;i++)
      {
        
        t.forward(1);
        t.turnLeft(6);
          
      }
      
    //eyes
    t.setColor(Color.ORANGE);
        t.penUp();
        t.turnRight(160);
        t.forward(60);
        t.turnRight(80);
        t.penDown();
        for (i=0;i<10;i++)
      {
        
        t.forward(2);
        t.turnRight(3);
          
      }
      t.turnRight(90);
      t.penUp();
        
        t.forward(10);
 
        t.penDown();
        
    for (i=0;i<15;i++)
      {
        
        t.forward(3);
        t.turnLeft(60);
          
      }
       
       t.penUp();
       t.goTo(30,140);
       t.turnRight(120);
       t.penDown();
       
        for (i=0;i<10;i++)
      {
        
        t.forward(2);
        t.turnLeft(3);
          
      }
      t.turnLeft(90);
      t.penUp();
      t.forward(10);
      t.penDown();
      
      for (i=0;i<15;i++)
      {
        
        t.forward(3);
        t.turnLeft(60);
          
      }
      t.setColor(Color.RED);
      //left hand
      t.penUp();
      t.goTo(-100,80);
      t.turnLeft(40);
      t.penDown();
      
      for (i=0;i<15;i++)
      {
        
        t.forward(10);
        t.turnLeft(6);
          
      }
       for (i=0;i<25;i++)
      {
        
        t.forward(5);
        t.turnLeft(10);
          
      }
      
    //right hand
         t.penUp();
      t.goTo(100,80);
      t.turnRight(220);
      t.penDown();
      
      for (i=0;i<15;i++)
      {
        
        t.forward(10);
        t.turnRight(6);
          
      }
       for (i=0;i<25;i++)
      {
        
        t.forward(5);
        t.turnRight(10);
          
      }
      
      //lower 
      t.penUp();
      t.goTo(-90,-75);
      t.turnRight(30);
      t.penDown();
      for (i=0;i<25;i++)
      {
        
        t.forward(8);
        t.turnLeft(3);
          
      }
     
     //left leg
      t.penUp();
      t.goTo(-100,-75);
      t.turnRight(220);
      t.penDown();
      for (i=0;i<16;i++)
      {
        
        t.forward(4);
        t.turnLeft(8);
          
      }
      t.forward(20);
         for (i=0;i<22;i++)
      {
        
        t.forward(4);
        t.turnLeft(3);
          
      }
      t.turnRight(4);
      t.forward(15);
        for (i=0;i<25;i++)
      {
        
        t.forward(3);
        t.turnRight(8);
          
      }
      //right leg
        t.penUp();
      t.goTo(110,-75);
      t.turnRight(180);
      t.penDown();
      for (i=0;i<20;i++)
      {
        
        t.forward(4);
        t.turnRight(8);
          
      }
      for(i=0;i<3;i++)
      {
      t.forward(30);
      t.turnRight(1);
     
      } 
      //pratham
      t.penUp();
      t.turnRight(95);
      t.forward(375);
      t.turnLeft(90);
      t.forward(20);
      t.turnRight(90);
      t.penDown();
      t.setDelay(0.1);
      t.drop("C:/Users/Atharva Donkar/Desktop/pratham/pratham.png", 300);

      //morya
      t.penUp();
      t.backward(575);
      
      t.penDown();
      t.setDelay(0.1);
      t.drop("C:/Users/Atharva Donkar/Desktop/pratham/morya.png",250);
            // Close the audio resources when done
           // clip.close();
            //clip.start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        //left  vertical lines 
        
        
        line(t,-220,200);
        line(t,-250,200);
        line(t,230,200);
        line(t,260,200);


      }

        public static void line(Turtle t, int x, int y) {
        t.setColor(Color.BLUE);
        

        t.setPenWidth(3);
        t.penUp();
        t.goTo(x,y);
        t.penDown();
        t.setDelay(0.05);
        t.backward(350);  
        }
        
  
}
      