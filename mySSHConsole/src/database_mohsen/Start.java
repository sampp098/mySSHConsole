/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package database_mohsen;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mohsen
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
        console.setEditable(false);
        
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        command.setEnabled(false);
        console.setEnabled(false);
        
        setLocationRelativeTo(null);
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
        user = new javax.swing.JTextField();
        host = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        command = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("host");

        user.setText("mohsen");

        host.setText("localhost");

        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        jButton1.setText("connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("disconnect");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        command.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                commandKeyPressed(evt);
            }
        });

        jButton3.setText("send");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(command)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(command, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void commandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commandKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                out.write((command.getText() + "\n").getBytes());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            command.setText("");

        }
    }//GEN-LAST:event_commandKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connection();
        if(channel.isConnected()){
            jButton1.setEnabled(false);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            command.setEnabled(true);
            console.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            try {
                out.write((command.getText() + "\n").getBytes());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            command.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        channel.disconnect();
        session.disconnect();
        jButton2.setEnabled(false);
        jButton1.setEnabled(true);
        jButton3.setEnabled(false);
        command.setEnabled(false);
        console.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

//    InputStream in;
//    OutputStream out;
    ByteArrayInputStream bin;
    Channel channel;
    Session session;
    PipedOutputStream out = new PipedOutputStream();
    PipedInputStream in;
    OutputStream textStream;

    public void connection() {

        try {
            JSch jsch = new JSch();

            //jsch.setKnownHosts("/home/foo/.ssh/known_hosts");
            session = jsch.getSession(user.getText(), host.getText(), 22);

            session.setPassword(pass.getText());

            UserInfo ui = new MyUserInfo() {
                public void showMessage(String message) {
                    JOptionPane.showMessageDialog(null, message);
                }

                public boolean promptYesNo(String message) {
                    Object[] options = {"yes", "no"};
                    int foo = 0;
                    return foo == 0;
                }

                // If password is not given before the invocation of Session#connect(),
                // implement also following methods,
                //   * UserInfo#getPassword(),
                //   * UserInfo#promptPassword(String message) and
                //   * UIKeyboardInteractive#promptKeyboardInteractive()
            };

            session.setUserInfo(ui);

            // It must not be recommended, but if you want to skip host-key check,
            // invoke following,
            // session.setConfig("StrictHostKeyChecking", "no");
            //session.connect();
            session.connect(30000);   // making a connection with timeout.

            channel = session.openChannel("shell");

            // Enable agent-forwarding.
            //((ChannelShell)channel).setAgentForwarding(true);
//            bin = new ByteArrayInputStream(new String("ls\n\r").getBytes());
//            in = bin;
            in = new PipedInputStream(out);
            channel.setInputStream(in);
            //in = channel.getInputStream();
            /*
      // a hack for MS-DOS prompt on Windows.
      channel.setInputStream(new FilterInputStream(System.in){
          public int read(byte[] b, int off, int len)throws IOException{
            return in.read(b, off, (len>1024?1024:len));
          }
        });
             */

            textStream = new OutputStream() {
                @Override
                public void write(int i) throws IOException {
                    console.append(String.valueOf((char) i));
                    // scrolls the text area to the end of data
                    console.setCaretPosition(console.getDocument().getLength());
                }
            };
            //channel.setOutputStream(System.out);
            channel.setOutputStream(textStream);
            //out = channel.getOutputStream();

            /*
      // Choose the pty-type "vt102".
      ((ChannelShell)channel).setPtyType("vt102");
             */

 /*
      // Set environment variable "LANG" as "ja_JP.eucJP".
      ((ChannelShell)channel).setEnv("LANG", "ja_JP.eucJP");
             */
            //channel.connect();
            channel.connect(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static abstract class MyUserInfo
                          implements UserInfo, UIKeyboardInteractive{
    public String getPassword(){ return null; }
    public boolean promptYesNo(String str){ return false; }
    public String getPassphrase(){ return null; }
    public boolean promptPassphrase(String message){ return false; }
    public boolean promptPassword(String message){ return false; }
    public void showMessage(String message){ }
    public String[] promptKeyboardInteractive(String destination,
                                              String name,
                                              String instruction,
                                              String[] prompt,
                                              boolean[] echo){
      return null;
    }
  }
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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField command;
    private javax.swing.JTextArea console;
    private javax.swing.JTextField host;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
