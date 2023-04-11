import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    ImageIcon Img = new ImageIcon("src\\img\\logo.png");
    JPanel titlePanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JButton addPillButton = new JButton("Эм нэмэх", scaleImage(new ImageIcon("src\\img\\pill.jpg"), 100, 100));
    JButton addInjectionButton = new JButton("Тариа нэмэх", scaleImage(new ImageIcon("src\\img\\injection.jpg"), 100, 100));
    JButton dataPillButton = new JButton("Эм Бүртгэл", scaleImage(new ImageIcon("src\\img\\pill.png"), 100, 100));
    JButton dataInjectionButton = new JButton("Тариа Бүртгэл", scaleImage(new ImageIcon("src\\img\\injectCircle.jpg"), 100, 100));
    JButton closeButton = new JButton("Гарах", scaleImage(new ImageIcon("src\\img\\exit.png"), 100, 100));

    MainFrame() {
        //Window settings
        this.setSize(1000, 600);
        this.setTitle("Эм тарианы бүртгэлийн систем");
        this.setIconImage(Img.getImage());
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
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50,170));
        mainPanel.add(buttonSet(addPillButton));
        mainPanel.add(buttonSet(addInjectionButton));
        mainPanel.add(buttonSet(dataPillButton));
        mainPanel.add(buttonSet(dataInjectionButton));
        mainPanel.add(buttonSet(closeButton));
        this.add(mainPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addPillButton) {
            PillFrame frame = new PillFrame();
            frame.setVisible(true);
        }
        if(e.getSource()==addInjectionButton) {
            InjectionFrame frame = new InjectionFrame();
            frame.setVisible(true);
        }
        if (e.getSource()==dataPillButton) {
            PillDatabaseFrame pillDatabaseFrame = new PillDatabaseFrame();
            pillDatabaseFrame.setVisible(true);
        }
        if (e.getSource()==dataInjectionButton) {
            InjectionDatabaseFrame injectionDatabaseFrame = new InjectionDatabaseFrame();
            injectionDatabaseFrame.setVisible(true);
        }
        if (e.getSource()==closeButton) {
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
        button.setFocusable(false);
        return button;
    }
}
