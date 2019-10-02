import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;


public class drawLoops {
    //the
    public static void main(String[] args){
        System.out.println("***Hello draw method***");
        System.out.println();
        System.out.println("In Java is quite easy to draw usiing the 'draw' method. This method takes in objects of Graphics.");
        System.out.println("The program draws rows of squares.");
        System.out.println("Note: The public static void draw method, does nothing by itself; it needs a second method, a frame\n" +
                "this frame eventually call the draw method for rendering.");
    }

    public static void draw(Graphics g){//draw is the method, Graphics is the Object and g is the method of Graphics.
    int width = 20;
    g.setColor(Color.BLUE);
    //the graphic method for square is expecting x and y coordinates to position the top left corner.
    int x = 0;
    int y =0;
    //now let's use the fill rectangle method
        for (int i = 0; i <10 ; i++) {
            g.fillRect(x, y, width, width);
            x= x + 2 * width;
        }
    }

    public static void main2(String[] args){
    //let's create an instance of JFrame() for the window and set the width and height
        JFrame frame = new JFrame();
        final int FRAME_WIDTH =400;
        final int FRAME_HEIGHT =400;
    //let's build the frame
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //let's create an instance of JComponent ()
         JComponent component = new JComponent(){
            //let's create a method to grab the draw method
             public void paintCompponent(Graphics graph){
                 draw(graph);
             }
        };
         frame.add(component);
         frame.setVisible(true);
    }
}
