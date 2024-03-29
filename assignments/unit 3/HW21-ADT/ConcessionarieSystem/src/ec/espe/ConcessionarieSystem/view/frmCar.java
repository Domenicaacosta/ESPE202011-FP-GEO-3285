/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.ConcessionarieSystem.view;

import ec.espe.ConcessionarieSystem.controller.CarController;
import ec.espe.ConcessionarieSystem.model.Car;
import javax.swing.JOptionPane;



/**
 *
 * @author Domenica
 */
public class frmCar extends javax.swing.JFrame {

    /**
     * Creates new form frmCar
     */
    public frmCar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPower = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        cmbStandard = new javax.swing.JComboBox<>();
        cmbModel = new javax.swing.JComboBox<>();
        cmbColor = new javax.swing.JComboBox<>();
        cmbBrand = new javax.swing.JComboBox<>();
        btnAreCars = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowData = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("CARS");

        jLabel2.setText("Color:");

        jLabel3.setText("Brand:");

        jLabel4.setText("Model:");

        jLabel5.setText("Power:");

        jLabel6.setText("Price:");

        jLabel7.setText("Standar:");

        cmbStandard.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        cmbStandard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False", " " }));

        cmbModel.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        cmbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sail", "Grand Vitara", "Edge", "Explorer", " " }));

        cmbColor.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Withe", "Grey", "Black", "Blue" }));

        cmbBrand.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        cmbBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ford", "Chevrolet", " " }));

        btnAreCars.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        btnAreCars.setText("Show cars");
        btnAreCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreCarsActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtShowData.setColumns(20);
        txtShowData.setFont(new java.awt.Font("Eras Light ITC", 0, 12)); // NOI18N
        txtShowData.setRows(5);
        jScrollPane1.setViewportView(txtShowData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPower, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAreCars)
                                .addGap(163, 163, 163))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAreCars)
                    .addComponent(btnSave))
                .addGap(161, 161, 161))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreCarsActionPerformed

        CarController carController = new CarController();
        txtShowData.setText(carController.read());
    }//GEN-LAST:event_btnAreCarsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Car car;
        String color;
        String brand;
        String model;
        int power;
        int price;
        boolean standard;

        CarController carController = new CarController();

        color = cmbColor.getSelectedItem().toString();
        brand = cmbBrand.getSelectedItem().toString();
        model = cmbModel.getSelectedItem().toString();
        power = Integer.parseInt(txtPower.getText());
        price = Integer.parseInt(txtPrice.getText());
        standard = Boolean.parseBoolean(cmbStandard.getSelectedItem().toString());

        car = new Car(color, brand, model, power, price, standard);

        carController.save(car);

        JOptionPane.showMessageDialog(rootPane, car.getBrand());
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreCars;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbBrand;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbModel;
    private javax.swing.JComboBox<String> cmbStandard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPower;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextArea txtShowData;
    // End of variables declaration//GEN-END:variables
}
