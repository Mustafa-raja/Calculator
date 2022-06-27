import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Mustafa
 */
public class LnF1 extends Main implements MouseListener {

    public LnF1() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        JP_Button[0].setBackground(new Color(204,204,204));
        txt.setText(txt.getText()+1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        JP_Button[0].setBackground(new Color(153,153,153));

    }

    @Override
    public void mouseEntered(MouseEvent e) {



        JP_Button[0].setBackground(new Color(153,153,153));


    }

    @Override
    public void mouseExited(MouseEvent e) {
        JP_Button[0].setBackground(new Color(0,0,0));
    }

}