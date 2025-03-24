import java.awt.*;
import java.awt.event.*;

public class EmployeeForm extends Frame implements ActionListener {
    TextField nameField, idField, deptField;
    TextArea displayArea;
    Button submitButton;

    EmployeeForm() {
        setTitle("Employee Information Form");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);

        add(new Label("Name:"));
        nameField = new TextField(30);
        add(nameField);

        add(new Label("Employee ID:"));
        idField = new TextField(30);
        add(idField);

        add(new Label("Department:"));
        deptField = new TextField(30);
        add(deptField);

        submitButton = new Button("Submit");
        add(submitButton);
        submitButton.addActionListener(this);

        displayArea = new TextArea(10, 40);
        add(displayArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String id = idField.getText();
        String dept = deptField.getText();

        String info = "Employee Information:\n";
        info += "Name: " + name + "\n";
        info += "Employee ID: " + id + "\n";
        info += "Department: " + dept + "\n";

        displayArea.setText(info);
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}
