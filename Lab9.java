import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lab9 extends JFrame {

    private JTable studentTable;

    public Lab9() {
        super("Student Table");

        // Create the student table model and set it as the table data
        StudentTableModel studentTableModel = new StudentTableModel(getConnection());
        studentTable = new JTable(studentTableModel);

        // Add the table to a scroll pane and add the scroll pane to the frame
        JScrollPane scrollPane = new JScrollPane(studentTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Set the frame size and make it visible
        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab9();
    }

    private static Connection getConnection() {
        Connection connection = null;
        try {
            // Change the following parameters to match your database configuration
            String url = "jdbc:mysql://localhost:3306/college";
            String user = "root";
            String password = "asdfghjkl123";

            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

class StudentTableModel extends javax.swing.table.AbstractTableModel {

    private static final long serialVersionUID = 1L;

    private String[] columnNames = { "Roll Number", "Name", "Percentage" };
    private Object[][] data;

    public StudentTableModel(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            // Get the number of rows from the result set
            resultSet.last();
            int rowCount = resultSet.getRow();
            resultSet.beforeFirst();

            // Initialize the data array with the row count
            data = new Object[rowCount][3];

            // Fill the data array with the result set data
            int i = 0;
            while (resultSet.next()) {
                data[i][0] = resultSet.getInt("roll_number");
                data[i][1] = resultSet.getString("name");
                data[i][2] = resultSet.getFloat("percentage");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class<?> getColumnClass(int col) {
        return getValueAt(0, col).getClass();
    }
}
