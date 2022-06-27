import java.awt.*;
import javax.swing.*;

public class Main {
    public static char chk;
    public static double var1=0;
    public static double var2=0;

    public static Dimension dim= new Dimension(55,45);
    // Frame:
    public static JFrame JF= new JFrame();
    // Panels:
    public static JPanel JF_JP=new JPanel();
    public static JPanel JP_text =new JPanel();
    public static JPanel JP_Buttons =new JPanel();
    public static JPanel [] JP_Button = new JPanel [20];
     //Text Field:
    public static JTextField txt=new JTextField();
    //Labels;
    public static JLabel [] B_lbl = new JLabel[20];
    public static JLabel dummy = new JLabel();
    public static void main(String[] args){
        Color clr_Button= new Color(0,0,0);
        JF_JP.setLayout(new GridLayout(2, 1, 0, 0));
        JF_JP.setSize(311, 500);
        JP_text.setSize(311, 150);
        JP_Buttons.setSize(311, 350);
        JP_Buttons.setBackground(new Color(51,51,51));
        JP_text.setBackground(new Color(51,51,51));
        JF.setSize(311, 498);
        JF.add(JF_JP);
        JF_JP.add(JP_text);
        JF_JP.add(JP_Buttons);


        txt.setBorder(BorderFactory.createEmptyBorder());
        txt.setBackground(new Color(51,51,51));
        txt.setForeground(Color.white);
        txt.setPreferredSize(new java.awt.Dimension (200, 40));
        txt.setFont(new Font("Roboto",Font.PLAIN,20));
        JP_text.setLayout(new GridLayout(3, 1));
        JP_text.add(dummy);
        JP_text.add(txt);

        JP_Buttons.setLayout( new GridLayout(4,5,3,3));
        for(int i=0;i<20;i++)
        {
            JP_Button [i]= new JPanel();
            JP_Button[i].setLayout(new BorderLayout());
            B_lbl [i] = new JLabel();
            B_lbl[i].setForeground(new Color(242, 242, 242));
            B_lbl[i].setFont(new Font("Roboto", Font.PLAIN, 20));
            B_lbl[i].setHorizontalAlignment(SwingConstants.CENTER);
        }
        B_lbl[0].setText("1");
        B_lbl[1].setText("2");
        B_lbl[2].setText("3");
        B_lbl[5].setText("4");
        B_lbl[6].setText("5");
        B_lbl[7].setText("6");
        B_lbl[10].setText("7");
        B_lbl[11].setText("8");
        B_lbl[12].setText("9");
        B_lbl[14].setText("x^y");
        B_lbl[16].setText("0");
        B_lbl[19].setText("CLR");

// ICONS:
        ImageIcon title =new ImageIcon("C:\\Users\\Mustafa\\Downloads\\icons8-calculator-96.png");
        JF.setIconImage(title.getImage());
        JF.setTitle("Calculator");
        B_lbl[3].setIcon(new ImageIcon("C:\\Users\\Mustafa\\Downloads\\+.png"));
        B_lbl[4].setIcon(new ImageIcon("C:\\Users\\Mustafa\\Downloads\\icons8-multiply-30.png"));
        B_lbl[8].setIcon(new ImageIcon("C:\\Users\\Mustafa\\Downloads\\icons8-subtract-30.png"));
        B_lbl[9].setIcon(new ImageIcon("C:\\Users\\Mustafa\\Downloads\\icons8-divide-30.png"));
        B_lbl[13].setIcon(new ImageIcon("C:\\Users\\Mustafa\\Downloads\\icons8-square-root-30.png"));
        B_lbl[18].setIcon(new ImageIcon("C:\\Users\\Mustafa\\Downloads\\=.png"));
        for(int i=0;i<20;i++)
        {
            JP_Buttons.add(JP_Button[i]);
            JP_Button[i].setSize(dim);
            JP_Button[i].setBackground(clr_Button);
            JP_Button[i].add(B_lbl[i]);
        }
        JP_Button[18].setBackground(new Color(255, 93, 93));
        JP_Button[0].addMouseListener(new LnF1());
        JP_Button[1].addMouseListener(new LnF2());
        JP_Button[2].addMouseListener(new LnF3());
        JP_Button[5].addMouseListener(new LnF4());
        JP_Button[6].addMouseListener(new LnF5());
        JP_Button[7].addMouseListener(new LnF6());
        JP_Button[10].addMouseListener(new LnF7());
        JP_Button[11].addMouseListener(new LnF8());
        JP_Button[12].addMouseListener(new LnF9());
        JP_Button[16].addMouseListener(new LnF0());
        JP_Button[3].addMouseListener(new LnFplus());
        JP_Button[4].addMouseListener(new LnFmul());
        JP_Button[8].addMouseListener(new LnFmin());
        JP_Button[9].addMouseListener(new LnFdiv());
        JP_Button[18].addMouseListener(new LnFeql());
        JP_Button[19].addMouseListener(new LnFclr());
        JP_Button[13].addMouseListener(new LnFsqrt());
        JP_Button[14].addMouseListener(new LnFpow());


        JP_Button[15].setBackground(new Color(51,51,51));
        JP_Button[17].setBackground(new Color(51,51,51));



        JF.setResizable(false);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(JF);
        }catch(Exception e){
            System.out.println("Look and Feel Not Found");
        }
        JF.setVisible(true);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}