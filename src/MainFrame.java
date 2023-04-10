import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    ImageIcon Img = new ImageIcon("C:\\Users\\evilh\\Downloads\\Medicine\\src\\img\\logo.png");
    JPanel titlePanel = new JPanel();
    JPanel mainPanel = new JPanel();
    ImageIcon addButtonImg = new ImageIcon("C:\\Users\\evilh\\Downloads\\Medicine\\src\\img\\add.png");
    ImageIcon dataButtonImg = new ImageIcon("C:\\Users\\evilh\\Downloads\\Medicine\\src\\img\\data.png");
    ImageIcon closeButtonImg = new ImageIcon("C:\\Users\\evilh\\Downloads\\Medicine\\src\\img\\close.png");
    JButton addButton = new JButton("Шинэ нэмэх", scaleImage(addButtonImg, 100, 100));
    JButton dataButton = new JButton("Бүртгэл", scaleImage(dataButtonImg, 100, 100));
    JButton closeButton = new JButton("Гарах", scaleImage(closeButtonImg, 100, 100));

    MainFrame() {
        System.out.println("Main frame called");
        //Window settings

        this.setSize(800, 600);
        this.setTitle("Эм тарианы бүртгэлийн систем");
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setIconImage(Img.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Title configs

        titlePanel.setLayout(new BorderLayout());
        JLabel main_label = new JLabel("Эм тарианы бүртгэлийн систем");
        main_label.setFont(new Font("Roboto", Font.BOLD, 40));
        main_label.setForeground(Color.WHITE);
        main_label.setVerticalAlignment(JLabel.CENTER);
        main_label.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(main_label);
        titlePanel.setBackground(Color.decode("#a28cff"));
        titlePanel.setBounds(0, 0, 1200, 80);
        this.add(titlePanel, BorderLayout.NORTH);

        //Main panel

        mainPanel.setBackground(Color.decode("#826cdf"));
        mainPanel.setBounds(0, 80, 1200, 200);

        //Buttons

        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100,170));
        mainPanel.add(buttonSet(addButton));
        mainPanel.add(buttonSet(dataButton));
        mainPanel.add(buttonSet(closeButton));

        this.add(mainPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addButton) {
            System.out.println("PillAddFrame called");
            PillAddFrame pillAddFrame = new PillAddFrame();
        } else if (e.getSource()==dataButton) {
            //not
        } else if (e.getSource()==closeButton) {
            {
                int confirmed = JOptionPane.showConfirmDialog(null, "Програмаас гарах уу?","Гарах",JOptionPane.YES_NO_OPTION);
                if(confirmed == JOptionPane.YES_OPTION)
                {
                    dispose();
                }
            }
        }
    }
    public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();
        if(icon.getIconWidth() > w){
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }
        if(nh > h){
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }
        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
    public JButton buttonSet(JButton button) {
        button.setPreferredSize(new Dimension(140, 170));
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setBackground(Color.WHITE);
        button.addActionListener(this);
        return button;
    }
}
