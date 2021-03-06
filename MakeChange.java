/**
 *Kenny Lin
 *Sir Winston Churchill Secondary School
 */

//Java library needed for decimal format
import java.text.*;

public class MakeChange extends javax.swing.JFrame {

    /**
     * Creates new form MakeChange
     */
    public MakeChange() {
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

        calculateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        subTotalInputBox = new javax.swing.JTextField();
        moneyFromCustomerInputBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        changeArea = new javax.swing.JTextArea();
        changeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        finalTotalOutputBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calculateButton.setText("Calculate Final Total");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Sub Total");

        jLabel2.setText("Money from Customer");

        changeArea.setColumns(20);
        changeArea.setRows(5);
        jScrollPane1.setViewportView(changeArea);

        changeButton.setText("Change to Give");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Final Total");

        finalTotalOutputBox.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Fast Food Restaurant Change Maker");

        jLabel5.setText("Step 1: Input the sub total.");

        jLabel6.setText("Step 2: Press the Calculate Final Total button");

        jLabel7.setText("to find the total after sales tax.");

        jLabel8.setText("Step 3: Input the amount that the customer");

        jLabel9.setText("gave. Note that the machine only accepts");

        jLabel10.setText("bills and coins.");

        jLabel11.setText("Step 4: Press the Change to Give button.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moneyFromCustomerInputBox, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(finalTotalOutputBox)
                            .addComponent(subTotalInputBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(subTotalInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(finalTotalOutputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneyFromCustomerInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(changeButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addContainerGap(142, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        //Variables to find the rounded final total
        double subTotal, finalTotal, cents, roundedCents, roundedFinalTotal;
        DecimalFormat dp2 = new DecimalFormat("0.00");
        
        subTotal = Double.parseDouble(subTotalInputBox.getText());
        
        //Calculates the exact final total 
        finalTotal = subTotal * 1.13;
        //Calculates the cents from the final total
        cents = (int)Math.ceil(finalTotal) - finalTotal;
        //Rounds the cents
        roundedCents = (int)Math.round(cents * 20.0) / 20.0;
        //Adds the rounded cents to the dollars of the final total
        roundedFinalTotal = (int)(finalTotal);  
        roundedFinalTotal = roundedFinalTotal + (1 - roundedCents);
        //Outputs and formats the rounded final total
        finalTotalOutputBox.setText(""+dp2.format(roundedFinalTotal));
               
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        //Variables for the change
        double moneyFromCustomer, change, displayChange, roundedFinalTotal;
        DecimalFormat dp2 = new DecimalFormat("0.00");        
        
        //Gets the rounded final total
        roundedFinalTotal = Double.parseDouble(finalTotalOutputBox.getText());    
        //Gets the money from customer
        moneyFromCustomer = Double.parseDouble(moneyFromCustomerInputBox.getText());
        
        //Caluclates the change
        change = moneyFromCustomer - roundedFinalTotal;
        displayChange = change;
       
        //Counter variables for the change
        int ctr20, ctr10, ctr5, ctr2, ctr1, ctr025, ctr010, ctr005;
        ctr20 = ctr10 = ctr5 = ctr2 = ctr1 = ctr025 = ctr010 = ctr005 = 0;
        
        while(true) //Keeps looping until all the bills and change are given out
        {
            if(change >= 20) //Twenties
            {
                ctr20++;
                change = change - 20;
            }     
            else if( (change >= 10) && (change < 20)) //Tens
            {
                ctr10++;
                change = change - 10;
            }
            else if( (change >= 5) && (change < 10))  //Fives
            {
                ctr5++;
                change = change - 5;
            }
            else if( (change >= 2) && (change < 5)) //Toonies
            {
                ctr2++;
                change = change - 2;
            }
            else if( (change >= 1) && (change < 2)) //Loonies
            {
                ctr1++;
                change = change - 1;
            }
            else if( (change >= 0.25) && (change < 1)) //Quarters
            {
                ctr025++;
                change = change - 0.25;
            }
            else if( (change >= 0.10) && (change < 0.25)) //Dimes
            {
                ctr010++;
                change = change - 0.10;
            }            
            else if( (change >= 0.05) && (change < 0.10)) //Nickels
            {
                ctr005++;
                change = change - 0.05;
            }             
            else //Breaks the loop when all the change is given out
            {
                break;
            }                            
        }

        //Displays the bills and coins to give the customer
        changeArea.setText("Give back $ " + dp2.format(displayChange) + ".\nTwenty Dollar Bills: " + ctr20 + "\nTen Dollar Bills: " + ctr10 + "\nFive Dollar Bills: " + ctr5 + "\nToonies: " + ctr2 + "\nLoonies: " + ctr1 + "\nQuarters: " + ctr025 + "\nDimes: " + ctr010 + "\nNickels: " + ctr005);
                       
    }//GEN-LAST:event_changeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MakeChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeChange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextArea changeArea;
    private javax.swing.JButton changeButton;
    private javax.swing.JTextField finalTotalOutputBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField moneyFromCustomerInputBox;
    private javax.swing.JTextField subTotalInputBox;
    // End of variables declaration//GEN-END:variables
}
