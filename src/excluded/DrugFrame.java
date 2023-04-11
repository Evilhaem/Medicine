//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Date;
//
//public class DrugFrame extends JFrame implements State {
//    State state;
//
//    DrugFrame() {
//        state = new PillState();
//        //Window settings
//        this.setSize(800, 600);
//        this.setTitle("Эм нэмэх");
//        this.setResizable(false);
//        this.setLayout(new BorderLayout());
//        this.setIconImage(Img.getImage());
//
//        //Title configs
//        titlePanel.setLayout(new BorderLayout());
//        JLabel main_label = new JLabel("Эм нэмэх");
//        main_label.setFont(new Font("Roboto", Font.BOLD, 40));
//        main_label.setForeground(Color.WHITE);
//        main_label.setVerticalAlignment(JLabel.CENTER);
//        main_label.setHorizontalAlignment(JLabel.CENTER);
//        titlePanel.add(main_label);
//        titlePanel.setBackground(Color.decode("#a28cff"));
//        titlePanel.setBounds(0, 0, 1200, 80);
//        this.add(titlePanel, BorderLayout.NORTH);
//
//        //Main panel
//        main_label.setLayout(new GridBagLayout());
//        mainPanel.setBackground(Color.decode("#a28cff"));
//        mainPanel.setBounds(0, 80, 1200, 200);
//
//        descriptionField.setPreferredSize(new Dimension(200, 140));
//        expirationDateField.setPreferredSize(new Dimension(200, 30));
//        manufacturedDateField.setPreferredSize(new Dimension(200, 30));
//        drugKind.setPreferredSize(new Dimension(200, 30));
//        drugKind.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(e.getSource()==drugKind) {
//                    if(drugKind.getSelectedIndex()==0){
//                        setState(new InjectionState());
//                    }
//                    else if(drugKind.getSelectedIndex()==1){
//                        setState(new InjectionState());
//                    }
//                }
//            }
//        });
//        useMethodCB.setPreferredSize(new Dimension(200, 30));
//
//        mainPanel.setLayout(new GridBagLayout());
//        mainPanel.add(nameLabel,                new GridBagConstraints( 0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(codeLabel,                new GridBagConstraints( 1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(manufacturerCountryLabel, new GridBagConstraints( 2, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(nameField,                new GridBagConstraints( 0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(codeField,                new GridBagConstraints( 1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(manufacturerCountryField, new GridBagConstraints( 2, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(ingredientsLabel,         new GridBagConstraints( 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(quantityLabel,            new GridBagConstraints( 1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(useMethodLabel,           new GridBagConstraints( 2, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(ingredientsField,         new GridBagConstraints( 0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(quantityField,            new GridBagConstraints( 1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(useMethodCB,              new GridBagConstraints( 2, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(descriptionLabel,         new GridBagConstraints( 0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(manufacturedDateLabel,    new GridBagConstraints( 1, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(expirationDateLabel,      new GridBagConstraints( 2, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(descriptionField,         new GridBagConstraints( 0, 5, 1, 2, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(manufacturedDateField,    new GridBagConstraints( 1, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(expirationDateField,      new GridBagConstraints( 2, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(drugKind,                 new GridBagConstraints( 1, 6, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//        mainPanel.add(buttonSet(addButton),     new GridBagConstraints( 2, 6, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ));
//
//        this.add(mainPanel, BorderLayout.CENTER);
//        this.setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==addButton) {
//            System.out.println("Pill add function called");
//            Connector connector = new Connector();
//            Drug.Pill pill = new Drug.Pill(
//                    nameField.getText(),
//                    codeField.getText(),
//                    manufacturerCountryField.getText(),
//                    ingredientsField.getText(),
//                    quantityField.getText(),
//                    (String) useMethodCB.getSelectedItem(),
//                    manufacturedDateField.getDate(),
//                    expirationDateField.getDate(),
//                    new Date(),
//                    descriptionField.getText()
//            );
//        }
//    }
//
//    private void setState(State state) {
//        this.state = state;
//    }
//}
