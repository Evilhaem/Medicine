import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PillAddFrame extends JFrame implements ActionListener {
    ImageIcon Img = new ImageIcon("C:\\Users\\evilh\\Downloads\\Medicine\\src\\img\\logo.png");
    JPanel titlePanel = new JPanel();
    JPanel mainPanel = new JPanel();

    JLabel nameLabel = labelMaker("Эмийн нэр:");
    JLabel codeLabel = labelMaker("Эмийн код:");
    JLabel manufacturerCountryLabel = labelMaker("Үйлдвэрлэсэн улс:");
    JLabel ingredientsLabel = labelMaker("Найрлага:");
    JLabel quantityLabel = labelMaker("Хэмжээ:");
    JLabel useMethodLabel = labelMaker("Зориулалт:");
    JLabel manufacturedDateLabel = labelMaker("Үйлдвэрлэсэн огноо:");
    JLabel expirationDateLabel = labelMaker("Дуусах огноо:");
    JLabel descriptionLabel = labelMaker("Тайлбар:");

    JTextField nameField = fieldMaker();
    JTextField codeField = fieldMaker();
    JTextField manufacturerCountryField = fieldMaker();
    JTextField ingredientsField = fieldMaker();
    JTextField quantityField = fieldMaker();
    JTextField useMethodField = fieldMaker();
    JDateChooser manufacturedDateField = new JDateChooser();
    JDateChooser expirationDateField = new JDateChooser();
    JTextField descriptionField = fieldMaker();
    JButton addButton = new JButton("Шинээр нэмэх");

    PillAddFrame() {
        //Window settings
        this.setSize(800, 600);
        this.setTitle("Эм нэмэх");
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setIconImage(Img.getImage());

        //Title configs
        titlePanel.setLayout(new BorderLayout());
        JLabel main_label = new JLabel("Эм нэмэх");
        main_label.setFont(new Font("Roboto", Font.BOLD, 40));
        main_label.setForeground(Color.WHITE);
        main_label.setVerticalAlignment(JLabel.CENTER);
        main_label.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(main_label);
        titlePanel.setBackground(Color.decode("#a28cff"));
        titlePanel.setBounds(0, 0, 1200, 80);
        this.add(titlePanel, BorderLayout.NORTH);

        //Main panel
        main_label.setLayout(new GridBagLayout());
        mainPanel.setBackground(Color.decode("#a28cff"));
        mainPanel.setBounds(0, 80, 1200, 200);

        descriptionField.setPreferredSize(new Dimension(200, 140));
        expirationDateField.setPreferredSize(new Dimension(200, 30));
        manufacturedDateField.setPreferredSize(new Dimension(200, 30));

        mainPanel.setLayout(new GridBagLayout());
        mainPanel.add(nameLabel,                new GridBagConstraints( 0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(codeLabel,                new GridBagConstraints( 1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(manufacturerCountryLabel, new GridBagConstraints( 2, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(nameField,                new GridBagConstraints( 0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(codeField,                new GridBagConstraints( 1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(manufacturerCountryField, new GridBagConstraints( 2, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(ingredientsLabel,         new GridBagConstraints( 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(quantityLabel,            new GridBagConstraints( 1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(useMethodLabel,           new GridBagConstraints( 2, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(ingredientsField,         new GridBagConstraints( 0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(quantityField,            new GridBagConstraints( 1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(useMethodField,           new GridBagConstraints( 2, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(descriptionLabel,         new GridBagConstraints( 0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(manufacturedDateLabel,    new GridBagConstraints( 1, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(expirationDateLabel,      new GridBagConstraints( 2, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(descriptionField,         new GridBagConstraints( 0, 5, 1, 2, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(manufacturedDateField,    new GridBagConstraints( 1, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(expirationDateField,      new GridBagConstraints( 2, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
        mainPanel.add(buttonSet(addButton),     new GridBagConstraints( 1, 6, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));

        this.add(mainPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addButton) {
            System.out.println("Pill add function called");
            Pill pill = new Pill(
                    nameField.getText(),
                    codeField.getText(),
                    manufacturerCountryField.getText(),
                    ingredientsField.getText(),
                    quantityField.getText(),
                    useMethodField.getText(),
                    manufacturedDateField.getDate(),
                    expirationDateField.getDate(),
                    new Date(),
                    descriptionField.getText()
            );
            System.out.println(pill.toString());

        }
    }
    public JButton buttonSet(JButton button) {
        button.setPreferredSize(new Dimension(200, 50));
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setBackground(Color.WHITE);
        button.addActionListener(this);
        return button;
    }
    public JLabel labelMaker(String name) {
        JLabel jlabel = new JLabel(name);
        jlabel.setFont(new Font("Roboto", Font.BOLD, 14));
        jlabel.setHorizontalAlignment(JLabel.LEFT);
        jlabel.setVerticalAlignment(JLabel.BOTTOM);
        return jlabel;
    }
    public JTextField fieldMaker() {
        JTextField jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(200, 30));
        return jTextField;
    }
}
