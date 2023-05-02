import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentTable {

    public static void main(String[] args) {
        // Create a student table with fields roll number, name, and percentage
        String[] columnNames = { "Roll Number", "Name", "Percentage" };
        Object[][] data = {
                { 1, "John", 85.5 },
                { 2, "Jane", 92.3 },
                { 3, "Bob", 77.8 },
                { 4, "Mary", 89.6 },
                { 5, "Tom", 81.2 }
        };
        JTable table = new JTable(data, columnNames);

        // Display all the details of the student table in a tabular format on the
        // screen using Swing
        JFrame frame = new JFrame("Student Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
