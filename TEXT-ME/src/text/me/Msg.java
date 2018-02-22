/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.me;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Msg extends javax.swing.JFrame implements Runnable{
  Socket client;
  ServerSocket server;
  BufferedReader sread;
  BufferedWriter swrite;
static String finalstr,finalstr1,finalstr2;
static String n;
    public Msg(String name) {
        finalstr=" ";
        finalstr1=" ";
        finalstr2 =" ";
        n = name;
        initComponents();
        jTusername.setText(name);
    }
  /*  public Msg(String n) {
        jTusername.setText(n);
    }
*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jBon = new javax.swing.JButton();
        jTchat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lchat = new javax.swing.JTextArea();
        jTusername = new javax.swing.JTextField();
        jBsend = new javax.swing.JButton();
        jCBserver = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lchat1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CON1 = new javax.swing.JButton();
        RB1 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        jTchat1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBon.setText("ON");
        jBon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBonActionPerformed(evt);
            }
        });

        Lchat.setEditable(false);
        Lchat.setColumns(20);
        Lchat.setRows(5);
        jScrollPane1.setViewportView(Lchat);

        jTusername.setEditable(false);
        jTusername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jBsend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBsend.setText("SEND");
        jBsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsendActionPerformed(evt);
            }
        });

        jCBserver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCBserver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SERVER", "CLIENT" }));
        jCBserver.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBserverItemStateChanged(evt);
            }
        });

        Lchat1.setEditable(false);
        Lchat1.setColumns(20);
        Lchat1.setRows(5);
        jScrollPane2.setViewportView(Lchat1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("USERNAME :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Encoded :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Decoded :");

        CON1.setText("Convert");
        CON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CON1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RB1);
        RB1.setText("MORSE");

        buttonGroup1.add(RB2);
        RB2.setText("BINARY");

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTchat, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBsend))
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTchat1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CON1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jCBserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(228, 228, 228)
                                .addComponent(RB1)
                                .addGap(41, 41, 41)
                                .addComponent(RB2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTusername, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jBon)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RB1)
                                .addComponent(RB2))
                            .addComponent(jCBserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBsend)
                        .addComponent(jTchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CON1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTchat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBonActionPerformed
        if(jBon.getText().equals("CONNECT")) {
            jBon.setText("DISCONNECT");
            client_connection();
            Thread thread = new Thread(this);
            thread.start();
        }else if(jCBserver.getSelectedItem().equals("SERVER")){
            jBon.setText("OFF");
            read_connection();
            Thread thread = new Thread(this);
            thread.start();
        }
    }//GEN-LAST:event_jBonActionPerformed

    private void jBsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsendActionPerformed
    if((RB1.isSelected()== true))
    {
        
    String Alphabet [] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0","/","+","=",".",",","?","-","_",":",";","$"," "};
    
    String Morse [] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----","-..-.",".-.-.","-...-",".-.-.-","--..--","..--.."," -....-","..--.-","---...","-.-.-.","...-..-","......--"};
        
    String Ephrase = jTchat.getText();
        Ephrase = Ephrase.toUpperCase();

        for(int count = 0; count < Ephrase.length(); count++ )
        { 
            for(int index = 0; index < Alphabet.length; index++) 
            { 
                if(Ephrase.substring(count, (count+1)).equals(Alphabet[index]))
                {
                 finalstr=finalstr+Morse[index]+ " " ;                     
                }
            }
        }
        finalstr2 = finalstr;
        Lchat.append("\n"+"ME : " +finalstr);
        jTchat.setText("");                
        try {
            swrite.write(jTusername.getText() + " : " + finalstr);
            swrite.newLine();
            swrite.flush();
        } catch (IOException ex) {
            Logger.getLogger(Msg.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
      finalstr="";
        if((RB2.isSelected()== true))
{
       String Alphabet1 [] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0","/","+","=",".",",","?","-","_",":",";","$"," "};
       
       String Morse1 [] = {"01000001","01000010","01000011","01000100","01000101","01000110","01000111","01001000","01001001","01001010","01001011","01001100","01001101","01001110","01001111","01010000","01010001","01010010","01010011","01010100","01010101","01010110","01010111","01011000","01011001","01011010","01100001","01100010","01100011","01100100","01100101","01100110","01100111","01101000","01101001","01101010","01101011","01101100","01101101","01101110","01101111","01110000","01110001","01110010","01110011","01110100","01110101","01110110","01110111","01111000","01111001","01111010","00110000","00110001","00110010","00110011","00110100","00110101","00110110","00110111","00111000","00111001","01111011","01111100","01111101","01111110","01111111","10000000","10000001","10000010","10000011","10000100","10000101","1000000011 "};        
       
       String Ephrase1 = jTchat.getText();
       
        for(int count = 0; count < Ephrase1.length(); count++ )
        { 
            for(int index = 0; index < Alphabet1.length; index++) 
            { 
                if(Ephrase1.substring(count, (count+1)).equals(Alphabet1[index]))
                    finalstr=finalstr+Morse1[index]+ " " ;  
            } 
        }
         finalstr2 = finalstr;
        Lchat.append("\n"+"ME : " +finalstr);
        jTchat.setText("");
        try {
            swrite.write(jTusername.getText() + " : " + finalstr);
            swrite.newLine();
            swrite.flush();
        } catch (IOException ex) {
            Logger.getLogger(Msg.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        finalstr="";
    }//GEN-LAST:event_jBsendActionPerformed

    private void jCBserverItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBserverItemStateChanged
        if(jCBserver.getSelectedItem().equals("SERVER")){
            jBon.setText("ON");
            jTusername.setText(n);
        }else{
            jBon.setText("CONNECT");
            jTusername.setText(n);
        }
    }//GEN-LAST:event_jCBserverItemStateChanged

    private void CON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CON1ActionPerformed
        if((RB1.isSelected()== true))
               {
    String Alphabet [] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0","/","+","=",".",",","?","-","_",":",";","$"," "};
    
    String Morse [] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----","-..-.",".-.-.","-...-",".-.-.-","--..--","..--.."," -....-","..--.-","---...","-.-.-.","...-..-","......--"};
    
    String Mphrase =jTchat1.getText();
	
        for( int count = 0; count < Mphrase.length(); count++  )
        { 
            for (Scanner s = new Scanner(Mphrase); s.hasNext();) {

                String letter = s.next();

                for(int index = 0; index < Morse.length; index++) {

                    if(letter.equals(Morse[index])) { 
                        finalstr1=finalstr1+Alphabet[index]+ "" ;
                        break;
                   }
                }
            }
            Lchat1.append("\n"+finalstr1);
            jTchat1.setText("");
            break;
        }
               }
            finalstr1="";    
      if((RB2.isSelected()== true))
               {
       String Alphabet [] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0","/","+","=",".",",","?","-","_",":",";","$"," "};       
  
       String Morse [] = {"01000001","01000010","01000011","01000100","01000101","01000110","01000111","01001000","01001001","01001010","01001011","01001100","01001101","01001110","01001111","01010000","01010001","01010010","01010011","01010100","01010101","01010110","01010111","01011000","01011001","01011010","01100001","01100010","01100011","01100100","01100101","01100110","01100111","01101000","01101001","01101010","01101011","01101100","01101101","01101110","01101111","01110000","01110001","01110010","01110011","01110100","01110101","01110110","01110111","01111000","01111001","01111010","00110000","00110001","00110010","00110011","00110100","00110101","00110110","00110111","00111000","00111001","01111011","01111100","01111101","01111110","01111111","10000000","10000001","10000010","10000011","10000100","10000101","1000000011"};
      
       String Mphrase =jTchat1.getText();
	
        for( int count = 0; count < Mphrase.length(); count++  )
        { 
            for (Scanner s = new Scanner(Mphrase); s.hasNext();) {

                String letter = s.next();

                for(int index = 0; index < Morse.length; index++) {

                    if(letter.equals(Morse[index])) { 
                        finalstr1=finalstr1+Alphabet[index]+ "" ;
                        break;
                   }
                }
            }
            Lchat1.append("\n"+finalstr1);
            jTchat1.setText("");
            break;
        }
           
               }        
            finalstr1="";
    }//GEN-LAST:event_CON1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTchat1.setText("");
       Lchat1.setText("");
       Lchat.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
private void client_connection(){
      try {
          String ip = JOptionPane.showInputDialog("System IP Address");
          client = new Socket(ip, 2000);
          jCBserver.setEnabled(false);
          sread = new BufferedReader(new InputStreamReader(client.getInputStream()));
          swrite = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
          jBon.setText("Disconnect");
      } catch (IOException ex) {
          Logger.getLogger(Msg.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    }
private void read_connection() {
    try {
        try{
            try{
                server = new ServerSocket(2000);
                this.setTitle("Plese Wait ....");
            }catch(Exception ex){
                System.out.println("Not found");
                System.exit(-1);
            }
            client = server.accept();
            this.setTitle("CONNECTED" + client.getInetAddress());
        }catch(IOException ex){
            System.out.println("Failed");
                System.exit(-1);
        }
        sread = new BufferedReader(new InputStreamReader(client.getInputStream()));
        swrite = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
    }catch(IOException ex){
            System.out.println("Failed");
                System.exit(-1);
    }
}

private void disconnected_by_client(){
      try {
          client.close();
          sread.close();
          swrite.close();
          jCBserver.setEnabled(true);
          jBon.setText("CONNECT");    
      } catch (IOException ex) {
          Logger.getLogger(Msg.class.getName()).log(Level.SEVERE, null, ex);
      }
}
private void stopped_by_server(){
      try {
          sread.close();
          swrite.close();
          jBon.setText("ON");
          setTitle("DISCONNECT");
      } catch (IOException ex) {
          Logger.getLogger(Msg.class.getName()).log(Level.SEVERE, null, ex);
      }
}
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
            java.util.logging.Logger.getLogger(Msg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Msg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Msg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Msg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Msg("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CON1;
    private javax.swing.JTextArea Lchat;
    private javax.swing.JTextArea Lchat1;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBon;
    private javax.swing.JButton jBsend;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBserver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTchat;
    private javax.swing.JTextField jTchat1;
    private javax.swing.JTextField jTusername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
         while(true){
            try {
                String s = sread.readLine();
                Lchat.append("\n"+s);
                jTchat1.setText(s);
            } catch (IOException ex) {
                Logger.getLogger(Msg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
