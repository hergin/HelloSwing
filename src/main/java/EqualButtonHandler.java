import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqualButtonHandler implements ActionListener {

    Calculator theCalculator;
    JLabel displayLabel;

    public EqualButtonHandler(Calculator theCalculator, JLabel displayLabel) {
        this.displayLabel = displayLabel;
        this.theCalculator = theCalculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        theCalculator.add(displayLabel.getText());
        displayLabel.setText(theCalculator.getMainNumber());
    }
}
