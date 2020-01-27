package hometaskpudge;

public class Task extends javax.swing.JFrame {

    private final String helloKey = "hello";
    private final String ultKey = "ult";
    private final String hookKey = "hook";

    private final String fileName = "saveLanguage.byte";
    private final String defaultLanguage = "en";
    private TypeOfTranslate translator = new TypeOfTranslate();
    private final Loader loader = new Loader();
    private final Saver saver = new Saver();

    public Task() {
        initComponents();

        if (loader.load(fileName) == null) {
            this.translator.setLanguage(defaultLanguage);
        } else {
            this.translator = loader.load(fileName);
        }

        translator.setLanguage(translator.getLanguage());
        changeText();
    }

    private void setLanguage(String language) {
        this.translator.setLanguage(language);
    }

    private void changeText() {
        helloText.setText(translator.getString(helloKey));
        ultText.setText(translator.getString(ultKey));
        hookText.setText(translator.getString(hookKey));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enButton = new javax.swing.JButton();
        deButton = new javax.swing.JButton();
        ruButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        helloText = new javax.swing.JLabel();
        ultText = new javax.swing.JLabel();
        hookText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EN.jpg"))); // NOI18N
        enButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enButtonActionPerformed(evt);
            }
        });

        deButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DE.jpg"))); // NOI18N
        deButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deButtonActionPerformed(evt);
            }
        });

        ruButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RU.jpg"))); // NOI18N
        ruButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        helloText.setText("HELLO");

        ultText.setText("ULT");

        hookText.setText("HOOK");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/face.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(hookText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ultText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(helloText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deButton)
                                .addGap(14, 14, 14)
                                .addComponent(ruButton)))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deButton)
                            .addComponent(ruButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(helloText)
                        .addGap(18, 18, 18)
                        .addComponent(ultText)
                        .addGap(18, 18, 18)
                        .addComponent(hookText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enButtonActionPerformed
        setLanguage("en");
        changeText();
    }//GEN-LAST:event_enButtonActionPerformed

    private void deButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deButtonActionPerformed
        setLanguage("de");
        changeText();
    }//GEN-LAST:event_deButtonActionPerformed

    private void ruButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruButtonActionPerformed
        setLanguage("ru");
        changeText();
    }//GEN-LAST:event_ruButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        loader.load(fileName);
        translator.setLanguage(translator.getLanguage());
        changeText();
    }//GEN-LAST:event_loadButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saver.save(translator, fileName);
    }//GEN-LAST:event_saveButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Task().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deButton;
    private javax.swing.JButton enButton;
    private javax.swing.JLabel helloText;
    private javax.swing.JLabel hookText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton ruButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel ultText;
    // End of variables declaration//GEN-END:variables
}
