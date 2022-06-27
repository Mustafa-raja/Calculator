import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Mustafa
 */
public class LnF2 extends Main implements MouseListener{
    public LnF2() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        JP_Button[1].setBackground(new Color(204,204,204));
        txt.setText(txt.getText()+2);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        JP_Button[1].setBackground(new Color(153,153,153));

    }

    @Override
    public void mouseEntered(MouseEvent e) {



        JP_Button[1].setBackground(new Color(153,153,153));


    }

    @Override
    public void mouseExited(MouseEvent e) {
        JP_Button[1].setBackground(new Color(0,0,0));
    }

}
