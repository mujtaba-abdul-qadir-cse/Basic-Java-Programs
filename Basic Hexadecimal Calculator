import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

class Main implements ActionListener
{
    private JButton b1,b2,b3;
    private JButton b4,b5,b6;
    private JButton b7,b8,b9;
    private JButton bplus,b0,beq;
    private JButton bminus, bmultiply, bdivide;
    private JButton bA, bB, bC;
    private JButton bD, bE, bF;
    private JButton bAC;
    private JButton bOFF;
    private JTextField jtf;
    private JFrame jF;
    private JPanel jP;
    private int Buffer;
    private char operation;
    public Main()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        jF = new JFrame("Hexadecimal Calculator");
        jF.setLayout(new BorderLayout());
        jP = new JPanel();
        jtf = new JTextField();
        jP.setLayout(new GridLayout(5,5));
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bplus = new JButton("+");
        bminus = new JButton("-");
        bmultiply = new JButton("*");
        bdivide = new JButton("÷");
        b0 = new JButton("0");
        beq = new JButton("=");
        bA = new JButton("A");
        bB = new JButton("B");
        bC = new JButton("C");
        bD = new JButton("D");
        bE = new JButton("E");
        bF = new JButton("F");
        bAC = new JButton("AC");
        bOFF = new JButton("EXIT");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bA.addActionListener(this);
        bB.addActionListener(this);
        bC.addActionListener(this);
        bD.addActionListener(this);
        bE.addActionListener(this);
        bF.addActionListener(this);
        bAC.addActionListener(this);
        bOFF.addActionListener(this);
        bplus.addActionListener(this);
        bminus.addActionListener(this);
        bmultiply.addActionListener(this);
        bdivide.addActionListener(this);
        b0.addActionListener(this);
        beq.addActionListener(this);
        jP.add(b1);
        jP.add(b2);
        jP.add(b3);
        jP.add(bA);
        jP.add(bB);
        jP.add(b4);
        jP.add(b5);
        jP.add(b6);
        jP.add(bC);
        jP.add(bD);
        jP.add(b7);
        jP.add(b8);
        jP.add(b9);
        jP.add(bE);
        jP.add(bF);
        jP.add(b0);
        jP.add(bplus);
        jP.add(bminus);
        jP.add(bmultiply);
        jP.add(bdivide);
        jP.add(bAC);
        jP.add(beq);
        jP.add(bOFF);

        jF.add(jtf, BorderLayout.NORTH);
        jF.add(jP, BorderLayout.CENTER);
        jF.pack();
        //jF.setSize(400,400);
        jF.setVisible(true);
    }

    public static void main (String [] args)
    {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==b1)
        {
            String s = jtf.getText();
            s = s + "1";
            jtf.setText(s);
        }
        else if (e.getSource()==b2)
        {
            String s = jtf.getText();
            s = s + "2";
            jtf.setText(s);
        }
        else if (e.getSource()==b3)
        {
            String s = jtf.getText();
            s = s + "3";
            jtf.setText(s);
        }
        else if (e.getSource()==b4)
        {
            String s = jtf.getText();
            s = s + "4";
            jtf.setText(s);
        }
        else if (e.getSource()==b5)
        {
            String s = jtf.getText();
            s = s + "5";
            jtf.setText(s);
        }
        else if (e.getSource()==b6)
        {
            String s = jtf.getText();
            s = s + "6";
            jtf.setText(s);
        }
        else if (e.getSource()==b7)
        {
            String s = jtf.getText();
            s = s + "7";
            jtf.setText(s);
        }
        else if (e.getSource()==b8)
        {
            String s = jtf.getText();
            s = s + "8";
            jtf.setText(s);
        }
        else if (e.getSource()==b9)
        {
            String s = jtf.getText();
            s = s + "9";
            jtf.setText(s);
        }
        else if (e.getSource()==b0)
        {
            String s = jtf.getText();
            s = s + "0";
            jtf.setText(s);
        }
        else if(e.getSource()==bA){
            String s = jtf.getText();
            s = s + "a";
            jtf.setText(s);
        }
        else if(e.getSource()==bB){
            String s = jtf.getText();
            s = s + "b";
            jtf.setText(s);
        }
        else if(e.getSource()==bC){
            String s = jtf.getText();
            s = s + "c";
            jtf.setText(s);
        }
        else if(e.getSource()==bD){
            String s = jtf.getText();
            s = s + "d";
            jtf.setText(s);
        }
        else if(e.getSource()==bE){
            String s = jtf.getText();
            s = s + "e";
            jtf.setText(s);
        }
        else if(e.getSource()==bF){
            String s = jtf.getText();
            s = s + "f";
            jtf.setText(s);
        }
        else if (e.getSource()==bplus)
        {
            String s = jtf.getText();
            Buffer = Integer.parseInt(s, 16);
            operation = '+';
            jtf.setText("");
        }
        else if (e.getSource()==bminus)
        {
            String s = jtf.getText();
            Buffer = Integer.parseInt(s, 16);
            operation = '-';
            jtf.setText("");
        }
        else if (e.getSource()==bmultiply)
        {
            String s = jtf.getText();
            Buffer = Integer.parseInt(s, 16);
            operation = '*';
            jtf.setText("");
        }
        else if (e.getSource()==bdivide)
        {
            String s = jtf.getText();
            Buffer = Integer.parseInt(s, 16);
            operation = '/';
            jtf.setText("");
        }
        else if (e.getSource()==bAC)
        {
            Buffer = 0;
            operation = ' ';
            jtf.setText("");
        }
        else if (e.getSource()==bOFF)
        {
            System.exit(0);
        }

        else if (e.getSource()==beq)
        {
            String s = jtf.getText();
            if(operation == '+') {
                int n = Integer.parseInt(s, 16);
                int intresult = Buffer + n;
                String result = Integer.toHexString(intresult);
                jtf.setText(result + "");
            }
            else if(operation == '-'){
                int intresult;
                int n = Integer.parseInt(s, 16);
                int negativeFlag = 0;

                if(Buffer >= n){
                    intresult = Buffer - n;
                }
                else{
                    intresult = n - Buffer;
                    negativeFlag = 1;         // to avoid wrong output when result of subtraction is negative
                }
                String result = Integer.toHexString(intresult);
                if(negativeFlag == 0){
                    jtf.setText(result);
                }
                else{
                    jtf.setText("-" + result);
                }
            }
            else if(operation=='*'){
                int n = Integer.parseInt(s, 16);
                int intresult = Buffer * n;
                String result = Integer.toHexString(intresult);
                jtf.setText(result + "");
            }
            else if(operation=='/'){
                int n = Integer.parseInt(s, 16);
                int intresult = Buffer / n;
                String result = Integer.toHexString(intresult);
                int intremainder = Buffer % n;
                String remainder = Integer.toHexString(intremainder);
                jtf.setText(result + " Remainder " + remainder);
            }
        }
    }
}
