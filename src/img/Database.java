package img;

import javax.swing.*;
import java.awt.*;

public class Database extends JFrame {
    ImageIcon Img = new ImageIcon("src\\img\\logo.png");
    JPanel titlePanel = new JPanel();
    JPanel mainPanel = new JPanel();

    JLabel nameLabel = new JLabel("Эмийн нэр:");
    JLabel codeLabel = new JLabel("Эмийн код:");
    JLabel manufacturerCountryLabel = new JLabel("Үйлдвэрлэсэн улс:");
    JLabel ingredientsLabel = new JLabel("Найрлага:");
    JLabel quantityLabel = new JLabel("Хэмжээ:");
    JLabel useMethodLabel = new JLabel("Зориулалт:");
    JLabel manufacturedDateLabel = new JLabel("Үйлдвэрлэсэн огноо:");
    JLabel expirationDateLabel = new JLabel("Дуусах огноо:");
    JLabel descriptionLabel = new JLabel("Тайлбар:");

    Database() {
        //Window settings
        this.setSize(800, 600);
        this.setTitle("Database");
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
        this.add(mainPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
