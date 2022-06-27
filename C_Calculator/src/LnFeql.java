import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Mustafa
 */
public class LnFeql extends Main implements MouseListener{
    double res;

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        String str;
        int x;
        JP_Button[18].setBackground(new Color(255, 195, 195));
        switch (chk) {
            case '+':
                var2=Double.parseDouble(txt.getText().trim());

                res = var1+var2;
                str = Double.toString(res);
                x=str.indexOf('.');
                if(str.charAt(x+1)=='0'&&(x+2)>(str.length()-1))
                {
                    txt.setText(Integer.toString((int)res));
                }
                else{
                    txt.setText(Double.toString(res));
                }
                break;
            case '-':
                var2=Double.parseDouble(txt.getText().trim());
                res = var1-var2;
                str = Double.toString(res);
                x=str.indexOf('.');
                if(str.charAt(x+1)=='0'&&(x+2)>(str.length()-1))
                {
                    txt.setText(Integer.toString((int)res));
                }
                else{
                    txt.setText(Double.toString(res));
                }
                break;
            case '*':
                var2=Double.parseDouble(txt.getText().trim());
                res = var1*var2;
                str = Double.toString(res);
                x=str.indexOf('.');
                if(str.charAt(x+1)=='0'&&(x+2)>(str.length()-1))
                {
                    txt.setText(Integer.toString((int)res));
                }
                else{
                    txt.setText(Double.toString(res));
                }
                break;
            case '/':
                var2=Double.parseDouble(txt.getText().trim());
                res = var1/var2;
                str = Double.toString(res);
                x=str.indexOf('.');
                if(str.charAt(x+1)=='0'&&(x+2)>(str.length()-1))
                {
                    txt.setText(Integer.toString((int)res));
                }
                else{
                    txt.setText(Double.toString(res));
                }
                break;
            case 's':
                res = Math.sqrt(var1);
                str = Double.toString(res);
                x=str.indexOf('.');
                if(str.charAt(x+1)=='0'&&(x+2)>(str.length()-1))
                {
                    txt.setText(Integer.toString((int)res));
                }
                else{
                    txt.setText(Double.toString(res));
                }
                break;
            case 'p':
                res = 1;
                var2=Double.parseDouble(txt.getText().trim());
                for(int i=0;i<var2;i++)
                {
                    res *= var1;
                }
                str = Double.toString(res);
                x=str.indexOf('.');
                if(str.charAt(x+1)=='0'&&(x+2)>(str.length()-1))
                {
                    txt.setText(Integer.toString((int)res));
                }
                else{
                    txt.setText(Double.toString(res));
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        JP_Button[18].setBackground(new Color(255, 140, 140));

    }

    @Override
    public void mouseEntered(MouseEvent e) {



        JP_Button[18].setBackground(new Color(255, 140, 140));


    }

    @Override
    public void mouseExited(MouseEvent e) {
        JP_Button[18].setBackground(new Color(255, 93, 93));
    }
}

