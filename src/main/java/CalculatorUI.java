import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class CalculatorUI extends JFrame implements ActionListener {

    Calculator theCalculator = new Calculator();
    JLabel displayLabel;

    public CalculatorUI() {
        super("Hello Swing Calculator");

        // Make fonts bigger in the whole app
        UIManager.put("Label.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));
        UIManager.put("Button.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));

        JPanel panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        displayLabel = new JLabel("0");
        var displayLabelConstraints = new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(displayLabel, displayLabelConstraints);

        JButton button0 = new JButton("0");
        var button0constraints = new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button0.addActionListener(e -> {
            theCalculator.appendToMainNumber("0");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button0, button0constraints);

        JButton button1 = new JButton("1");
        var button1constraints = new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("1");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button1, button1constraints);

        JButton plusButton = new JButton("+");
        var plusButtonConstraints = new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        plusButton.addActionListener(this);
        panel.add(plusButton, plusButtonConstraints);

        JButton equalButton = new JButton("=");
        var equalButtonConstraints = new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        equalButton.addActionListener(new EqualButtonHandler(theCalculator, displayLabel));
        panel.add(equalButton, equalButtonConstraints);

        JButton openChartButton = new JButton("Open Chart");
        var openChartButtonConstraints = new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        openChartButton.addActionListener(e -> {
            var theChart = new PieChart("Comparison", "");
            theChart.pack();
            theChart.setVisible(true);
        });
        panel.add(openChartButton, openChartButtonConstraints);

        setPreferredSize(new Dimension(400, 800));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {

        Runnable r = new Runnable() {

            LocalDateTime fiveSecondsLater = LocalDateTime.now().plusSeconds(5);

            @Override
            public void run() {
                while (LocalDateTime.now().isBefore(fiveSecondsLater)) {
                }
                JOptionPane.showMessageDialog(null, "5 seconds passed");
            }
        };
        Thread t = new Thread(r);
        t.start();


        new CalculatorUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayLabel.setText(((JButton) e.getSource()).getText());
    }
}
