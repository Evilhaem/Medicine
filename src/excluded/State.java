//import com.toedter.calendar.JDateChooser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public interface State extends ActionListener {
//    ImageIcon Img = new ImageIcon("src\\img\\logo.png");
//    JPanel titlePanel = new JPanel();
//    JPanel mainPanel = new JPanel();
//
//    JLabel nameLabel = labelMaker("Эмийн нэр:");
//    JLabel codeLabel = labelMaker("Эмийн код:");
//    JLabel manufacturerCountryLabel = labelMaker("Үйлдвэрлэсэн улс:");
//    JLabel ingredientsLabel = labelMaker("Найрлага:");
//    JLabel quantityLabel = labelMaker("Хэмжээ:");
//    JLabel useMethodLabel = labelMaker("Зориулалт:");
//    JLabel manufacturedDateLabel = labelMaker("Үйлдвэрлэсэн огноо:");
//    JLabel expirationDateLabel = labelMaker("Дуусах огноо:");
//    JLabel descriptionLabel = labelMaker("Тайлбар:");
//
//    JTextField nameField = fieldMaker();
//    JTextField codeField = fieldMaker();
//    JTextField manufacturerCountryField = fieldMaker();
//    JTextField ingredientsField = fieldMaker();
//    JTextField quantityField = fieldMaker();
//    String[] useMethodCBOptions = {"Гадуур", "Дотуур"};
//    JComboBox<String> useMethodCB = new JComboBox<>(useMethodCBOptions);
//    JDateChooser manufacturedDateField = new JDateChooser();
//    JDateChooser expirationDateField = new JDateChooser();
//    JTextField descriptionField = fieldMaker();
//    String[] drugKindOptions = {"Эм", "Тариа"};
//    JComboBox<String> drugKind = new JComboBox<>(drugKindOptions);
//    JButton addButton = new JButton("Шинээр нэмэх");
//
//    public abstract void actionPerformed(ActionEvent e);
//
//    public default ImageIcon scaleImage(ImageIcon icon, int w, int h)
//    {
//        int nw = icon.getIconWidth();
//        int nh = icon.getIconHeight();
//        if(icon.getIconWidth() > w){
//            nw = w;
//            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
//        }
//        if(nh > h){
//            nh = h;
//            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
//        }
//        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
//    }
//    public default JButton buttonSet(JButton button) {
//        button.setPreferredSize(new Dimension(140, 170));
//        button.setVerticalTextPosition(SwingConstants.BOTTOM);
//        button.setHorizontalTextPosition(SwingConstants.CENTER);
//        button.setBackground(Color.WHITE);
//        button.addActionListener(this);
//        return button;
//    }
//
//    public static JLabel labelMaker(String name) {
//        JLabel jlabel = new JLabel(name);
//        jlabel.setFont(new Font("Roboto", Font.BOLD, 14));
//        jlabel.setHorizontalAlignment(JLabel.LEFT);
//        jlabel.setVerticalAlignment(JLabel.BOTTOM);
//        return jlabel;
//    }
//    public static JTextField fieldMaker() {
//        JTextField jTextField = new JTextField();
//        jTextField.setPreferredSize(new Dimension(200, 30));
//        return jTextField;
//    }
//}
