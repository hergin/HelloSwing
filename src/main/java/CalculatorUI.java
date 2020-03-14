import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {

    Calculator theCalculator = new Calculator();
    JLabel displayLabel;

    int operationID = 0;

    JButton button7;
    JButton button8;
    JButton button9;
    JButton plusButton;
    JButton minusButton;

    JButton button4;
    JButton button5;
    JButton button6;
    JButton multiplyButton;
    JButton divideButton;

    JButton button1;
    JButton button2;
    JButton button3;

    JButton button0;

    JButton clearButton;
    JButton equalsButton;






    public CalculatorUI() {
        super("Hello Swing Calculator");

        UIManager.put("Label.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));
        UIManager.put("Button.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));

        JPanel panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        displayLabel = new JLabel("_");
        var displayLabelConstraints = new GridBagConstraints(0, 0, 5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(displayLabel, displayLabelConstraints);


        button7 = new JButton("7");
        var button7constraints = new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button7.addActionListener(e -> {
            theCalculator.appendToMainNumber("7");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button7, button7constraints);


        button8 = new JButton("8");
        var button8constraints = new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button8.addActionListener(e -> {
            theCalculator.appendToMainNumber("8");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button8, button8constraints);


        button9 = new JButton("9");
        var button9constraints = new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button9.addActionListener(e -> {
            theCalculator.appendToMainNumber("9");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button9, button9constraints);


        plusButton = new JButton("+");
        var plusButtonConstraints = new GridBagConstraints(3, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        plusButton.addActionListener(e -> {
            theCalculator.storeAndResetMainNumber();
            displayLabel.setText(theCalculator.getMainNumber());
            operationID = 1;
        });
        panel.add(plusButton, plusButtonConstraints);


        minusButton = new JButton("-");
        var minusButtonConstraints = new GridBagConstraints(4, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        minusButton.addActionListener(e -> {
            theCalculator.storeAndResetMainNumber();
            displayLabel.setText(theCalculator.getMainNumber());
            operationID = 2;
        });
        panel.add(minusButton, minusButtonConstraints);




        button4 = new JButton("4");
        var button4constraints = new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button4.addActionListener(e -> {
            theCalculator.appendToMainNumber("4");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button4, button4constraints);


        button5 = new JButton("5");
        var button5constraints = new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button5.addActionListener(e -> {
            theCalculator.appendToMainNumber("5");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button5, button5constraints);


        button6 = new JButton("6");
        var button6constraints = new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button6.addActionListener(e -> {
            theCalculator.appendToMainNumber("6");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button6, button6constraints);


        multiplyButton = new JButton("x");
        var multiplyButtonConstraints = new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        multiplyButton.addActionListener(e -> {
            theCalculator.storeAndResetMainNumber();
            displayLabel.setText(theCalculator.getMainNumber());
            operationID = 3;
        });
        panel.add(multiplyButton, multiplyButtonConstraints);


        divideButton = new JButton("/");
        var divideButtonConstraints = new GridBagConstraints(4, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        divideButton.addActionListener(e -> {
            theCalculator.storeAndResetMainNumber();
            displayLabel.setText(theCalculator.getMainNumber());
            operationID = 4;
        });
        panel.add(divideButton, divideButtonConstraints);





        button1 = new JButton("1");
        var button1constraints = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button1.addActionListener(e -> {
            theCalculator.appendToMainNumber("1");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button1, button1constraints);


        button2 = new JButton("2");
        var button2constraints = new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button2.addActionListener(e -> {
            theCalculator.appendToMainNumber("2");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button2, button2constraints);


        button3 = new JButton("3");
        var button3constraints = new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button3.addActionListener(e -> {
            theCalculator.appendToMainNumber("3");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button3, button3constraints);





        button0 = new JButton("0");
        var button0constraints = new GridBagConstraints(0, 4, 3, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button0.addActionListener(e -> {
            theCalculator.appendToMainNumber("0");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button0, button0constraints);





        clearButton = new JButton("C");
        var clearButtonConstraints = new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        clearButton.addActionListener(e -> {
            theCalculator.resetMainNumber();
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(clearButton, clearButtonConstraints);


        equalsButton = new JButton("=");
        var equalButtonConstraints = new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        equalsButton.addActionListener(e -> {
            if(((JButton) e.getSource()).getText().equals("="))
            {
                if(operationID == 1)
                {
                    theCalculator.add(displayLabel.getText());
                }
                else if(operationID == 2)
                {
                    theCalculator.subtract(displayLabel.getText());
                }

                else if(operationID == 3)
                {
                    theCalculator.multiply(displayLabel.getText());
                }

                if(operationID == 4)
                {
                    theCalculator.divide(displayLabel.getText());
                }

                displayLabel.setText(theCalculator.getMainNumber());
                operationID = 0;
            }
        });
        panel.add(equalsButton, equalButtonConstraints);

        setPreferredSize(new Dimension(400, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new CalculatorUI();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        theCalculator.resetMainNumber();
    }
}
