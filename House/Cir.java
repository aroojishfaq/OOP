import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
public class Cir
{
  public static void main(String args[])
{ Canvas can=new Canvas("BlueJ Picture Demo", 500, 300, Color.white);

    Picture p=new Picture();
     p.draw(); 
    Circle sun = new Circle();
   
     sun.changeColor("yellow");
    
     sun.slowMoveHorizontal(-160);
  
      sun.moveVertical(-90);
    
     sun.changeSize(80);
    
     sun.makeVisible();

    sun.slowMoveHorizontal(+160);
 

   Person p1=new Person();
   Person p2=new Person();
   p1.moveVertical(20);
   p2.moveHorizontal(+160);
      
   p2.moveVertical(20);
   
   p1.makeVisible();
   p2.makeVisible();

   p1.slowMoveHorizontal(+140);
   p1.slowMoveHorizontal(-140); 
   p1.moveHorizontal(+20);
  
 
    Circle ball = new Circle();
  
     ball.moveHorizontal(+80);
      
     ball.moveVertical(130);
 
     ball.changeSize(20);
    
     ball.makeVisible();
    ball.slowMoveVertical(+20);
 
  
   for (int i=0;i<4;i++)
{  
   p1.moveHorizontal(22);
   p1.moveHorizontal(-22);
   ball.slowMoveHorizontal(+110);
     sun.moveHorizontal(20);
    sun.moveVertical(10);
   p2.moveHorizontal(-22);
   p2.moveHorizontal(22);
   ball.slowMoveHorizontal(-110);
  sun.moveHorizontal(20);
 sun.moveVertical(10);
    }
sun.changeColor("red");
can.changeColour();
   for (int j=0;j<1;j++)
{  
   p1.moveHorizontal(22);
   p1.moveHorizontal(-22);
   ball.slowMoveHorizontal(+110);
     sun.moveHorizontal(19);
    sun.moveVertical(8);
   p2.moveHorizontal(22);
   p2.moveHorizontal(-22);
   ball.slowMoveHorizontal(-110);
  sun.moveHorizontal(19);
 sun.moveVertical(8);
    }
   p1.slowMoveHorizontal(+120);
   p1.slowMoveHorizontal(-120);
  sun.makeInvisible();
   ball.slowMoveVertical(-20);
   ball.makeInvisible();
  p1.slowMoveHorizontal(-60);
  p1.makeInvisible();
   p2.slowMoveHorizontal(+160);
  p2.makeInvisible();
  can.changeColor();
 
  Circle moon = new Circle();
   
     moon.changeColor("white");
    
     moon.moveHorizontal(-180);
      
     moon.moveVertical(-80);
 
     moon.changeSize(80);
    
     moon.makeVisible();
    moon.slowMoveHorizontal(+260);
 
 Circle astar = new Circle();
   
     astar.changeColor("white");
    
     astar.moveHorizontal(-200);
      
     astar.moveVertical(-80);
 
     astar.changeSize(10);
    
     astar.makeVisible();
 Circle bstar = new Circle();
   
     bstar.changeColor("white");
    
     bstar.moveHorizontal(240);
      
     bstar.moveVertical(-50);
 
     bstar.changeSize(10);
    
     bstar.makeVisible();
 Circle cstar = new Circle();
   
     cstar.changeColor("white");
    
     cstar.moveHorizontal(0);
      
     cstar.moveVertical(-80);
 
     cstar.changeSize(10);
    
     cstar.makeVisible();
 Circle dstar = new Circle();
   
     dstar.changeColor("white");
    
     dstar.moveHorizontal(-180);
      
     dstar.moveVertical(0);
 
     dstar.changeSize(10);
    
     dstar.makeVisible();
 Circle estar = new Circle();
   
     estar.changeColor("white");
    
     estar.moveHorizontal(-120);
      
     estar.moveVertical(-50);
 
     estar.changeSize(10);
    
     estar.makeVisible();
 Circle fstar = new Circle();
   
     fstar.changeColor("white");
    
     fstar.moveHorizontal(200);
      
     fstar.moveVertical(0);
 
     fstar.changeSize(10);
    
     fstar.makeVisible();


for(int m=0;m<20;m++){
astar.changeColor("black");
 
bstar.changeColor("white");
 
cstar.changeColor("black");
dstar.changeColor("white");
 
estar.changeColor("black");
fstar.changeColor("white");
 
astar.changeColor("white");
 
bstar.changeColor("black");
 
cstar.changeColor("white");
 
dstar.changeColor("black");
 
estar.changeColor("white");
 
fstar.changeColor("black");
 
dstar.changeColor("white");
 
fstar.changeColor("white");
 
bstar.changeColor("white");
 


}
}
}