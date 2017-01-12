/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorexample;

import calculatorexample.model.Calculator;
import calculatorexample.model.Calculator.Data.DataType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rimi
 */
public class MainFrame extends javax.swing.JFrame implements ActionListener {

    private final Calculator mCalculator;

    /**
     * Creates new form MainFrame
     *
     * @param model
     */
    public MainFrame(Calculator model) {
        initComponents();
        mCalculator = model;

        setupComponents();
    }

    private void setupComponents() {
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMulti.addActionListener(this);
        btnDivide.addActionListener(this);

        btnAnswer.addActionListener(this);
        btnClear.addActionListener(this);
        btnClearError.addActionListener(this);
        btnBack.addActionListener(this);

        mCalculator.addData("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnAnswer = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnClearError = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setText("1");

        btn2.setText("2");

        btn3.setText("3");

        btn4.setText("4");

        btn5.setText("5");

        btn6.setText("6");

        btn7.setText("7");

        btn8.setText("8");

        btn9.setText("9");

        btnClear.setText("C");

        btn0.setText("0");

        btnAnswer.setText("=");

        btnPlus.setText("+");

        btnMinus.setText("-");

        btnMulti.setText("*");

        btnDivide.setText("/");

        txtResult.setEditable(false);
        txtResult.setText("0");

        btnBack.setText("←");

        btnClearError.setText("CE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinus))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlus))
                            .addComponent(btnAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7)
                            .addComponent(btnBack))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClearError)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDivide)
                            .addComponent(btnMulti)))
                    .addComponent(txtResult))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnDivide)
                    .addComponent(btnBack)
                    .addComponent(btnClearError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnMulti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btnMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnPlus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnAnswer))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame(new Calculator()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAnswer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearError;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPlus;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String cmd = e.getActionCommand();
        String displayText = txtResult.getText();

        System.out.println("BEFORE: " + mCalculator.getCurrentDatas() + ", SIZE: " + mCalculator.getSequence().size());

        if (mCalculator.findDataType(cmd) == DataType.TYPE_OPERATOR) {
            if (mCalculator.getSequence().size() > 2) {
                // 만약 피연산자 / 연산자 / 피연산자 3개가 모두 입력된 상태에서
                // 또 다시 연산자가 입력되면 기존에 입력된 값을 계산하고
                // 첫번째 피연산자에 추가한다.
                displayText = mCalculator.calculateResult();
                mCalculator.addData(displayText);
                mCalculator.addData(cmd);
            } else {
                mCalculator.addData(cmd);
                mCalculator.addData("0");
                displayText = mCalculator.getLastInput();
            }

        } else if (mCalculator.findDataType(cmd) == DataType.TYPE_COMMAND) {
            switch (cmd) {
                case "=":
                    if (mCalculator.getSequence().size() > 2) {
                        // 피연산자 / 연산자 / 피연산자 형태일때만 계산결과를 출력한다.
                        displayText = mCalculator.calculateResult();
                        mCalculator.addData(displayText);
                    }

                    break;

                case "←":
                    JOptionPane.showMessageDialog(null, "미구현");
                    break;

                case "CE":
                    // ClearError: 피연산자를 초기화한다.
                    mCalculator.resetLastInput();
                    displayText = "0";
                    break;

                case "C":
                    // Clear: 계산과정을 초기화한다.
                    mCalculator.reset();
                    mCalculator.addData("0");
                    displayText = "0";
                    break;
            }
        } else {
            if (displayText.equals("0")) {
                displayText = cmd;
            } else {
                if (mCalculator.findDataType(mCalculator.getLastInput()) == DataType.TYPE_OPERATOR) {
                    // 이미 중간 계산결과가 화면에 출력되있다면 두번째 피연산자를
                    // 초기화한 후 값을 넣는다.
                    mCalculator.addData("0");
                    displayText = cmd;
                } else {
                    displayText += cmd;
                }
            }

            mCalculator.editLatestInput(displayText);
        }

        System.out.println("AFTER: " + mCalculator.getCurrentDatas() + ", SIZE: " + mCalculator.getSequence().size());

        setDisplayText(displayText);
    }

    private void setDisplayText(String text) {
        txtResult.setText(text);
    }
}