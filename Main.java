import java.awt.EventQueue;
import javax.swing.JFrame;
class Main extends JFrame {
  public Main(){
    initUI();
  }

  private void initUI(){
    add(new Board());
    setSize(250,200);
    setTitle("Application");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }
  public static void main(String[] args) {
    EventQueue.invokeLater(()->{
      Main ex = new Main();
      ex.setVisible(true);
    });
    System.out.println("Hello world!");
  }
}