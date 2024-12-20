import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;

public class ManajemenDataSiswa {

    private JFrame frame;
    public JTable table;
    private DefaultTableModel tableModel;
    public JTextField idField;
    public JTextField nameField;
    public JTextField ageField;
    private JLabel imageLabel;
    private File currentImage;

    public ManajemenDataSiswa() {
        // Frame setup
        frame = new JFrame("Student Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLayout(new BorderLayout(10, 10));
        frame.getContentPane().setBackground(new Color(245, 245, 245));

        // Table Model and Table
        tableModel = new DefaultTableModel(new String[]{"ID", "Nama", "Umur", "Gambar"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(new Color(54, 57, 63));
        JLabel titleLabel = new JLabel("Manajemen Data Siswa", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(titleLabel, BorderLayout.CENTER);

        // Form Panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        formPanel.setBackground(new Color(245, 245, 245));

        // Adjusting the dimensions of input fields to make them rectangular
        idField = new JTextField();
        idField.setPreferredSize(new Dimension(200, 30));  // Set preferred width and height
        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(200, 30));
        ageField = new JTextField();
        ageField.setPreferredSize(new Dimension(200, 30));