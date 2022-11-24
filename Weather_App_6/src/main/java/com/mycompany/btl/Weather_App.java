
package com.mycompany.btl;

import com.mycompany.btl.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Weather_App extends javax.swing.JFrame {
//    public Weather_App weather;
//    public JsonResult result;
//    public ArrayList<Weather> listResult;
//    public int idx = 0; 
//    
    
    public Weather_App() throws IOException {
        initComponents();
        bt_find.setBackground(Color.white);
        pre.setBackground(Color.white);
        next.setBackground(Color.white);
        URL url = new URL("https://www.shell.com/energy-and-innovation/the-energy-future/scenarios/shell-scenario-sky/_jcr_content/pagePromo/image.img.960.jpeg/1548184031017/clear-blue-sky.jpeg");
        BufferedImage img = ImageIO.read(url);
        ImageIcon ic = new ImageIcon(img);
        jLabel2.setIcon(ic);
    }

    public JButton getBt_find() {
        return bt_find;
    }

    public JButton getBt_next() {
        return next;
    }

    public JButton getBt_pre() {
        return pre;
    }

    
    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public JLabel getLb_city() {
        return lb_city;
    }

    
    public JLabel getLb_date() {
        return lb_date;
    }

    public JLabel getLb_temperature() {
        return lb_temperature;
    }

    public JLabel getLb_weather() {
        return lb_weather;
    }

    public JLabel getLb_wind() {
        return lb_wind;
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lb_temperature = new javax.swing.JLabel();
        lb_weather = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bt_find = new javax.swing.JButton();
        next = new javax.swing.JButton();
        pre = new javax.swing.JButton();
        lb_city = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_date2 = new javax.swing.JLabel();
        lb_temperature2 = new javax.swing.JLabel();
        lb_weather2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_date3 = new javax.swing.JLabel();
        lb_temperature3 = new javax.swing.JLabel();
        lb_weather3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_date4 = new javax.swing.JLabel();
        lb_temperature4 = new javax.swing.JLabel();
        lb_weather4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lb_date5 = new javax.swing.JLabel();
        lb_temperature5 = new javax.swing.JLabel();
        lb_weather5 = new javax.swing.JLabel();
        lb_wind = new javax.swing.JLabel();
        lb_clouds = new javax.swing.JLabel();
        lb_pressure = new javax.swing.JLabel();
        lb_humidity = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jButton2.setText("jButton2");

        setTitle("Weather forecast");
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_temperature.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_temperature.setForeground(new java.awt.Color(255, 255, 255));
        lb_temperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_temperature.setText("0ºC");
        lb_temperature.setToolTipText("");
        getContentPane().add(lb_temperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 82, 460, 68));

        lb_weather.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_weather.setForeground(new java.awt.Color(255, 255, 255));
        lb_weather.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_weather.setText("   ");
        getContentPane().add(lb_weather, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 140, 190, 30));

        lb_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_date.setText("   ");
        getContentPane().add(lb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 204, 280, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("find a city");
        jTextField1.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 664, -1));

        bt_find.setText("FIND");
        bt_find.setBorder(null);
        bt_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_findActionPerformed(evt);
            }
        });
        getContentPane().add(bt_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 8, 64, 38));

        next.setText(">");
        next.setBorder(null);
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 30, 30));

        pre.setText("<");
        pre.setBorder(null);
        pre.setOpaque(true);
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });
        getContentPane().add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 30, 30));

        lb_city.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_city.setForeground(new java.awt.Color(255, 255, 255));
        lb_city.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_city.setText("   ");
        getContentPane().add(lb_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 70, 214, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Updated as of");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 182, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lb_date2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_date2.setText(" ");

        lb_temperature2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_temperature2.setText(" ");

        lb_weather2.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_temperature2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lb_date2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_weather2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_date2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_temperature2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_weather2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lb_date3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_date3.setText(" ");

        lb_temperature3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_temperature3.setText(" ");

        lb_weather3.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_temperature3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lb_date3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_weather3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_date3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_temperature3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_weather3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lb_date4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_date4.setText(" ");

        lb_temperature4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_temperature4.setText(" ");

        lb_weather4.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_temperature4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lb_date4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_weather4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_date4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_temperature4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_weather4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lb_date5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_date5.setText(" ");

        lb_temperature5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_temperature5.setText(" ");

        lb_weather5.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_temperature5, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lb_date5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_weather5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_date5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_temperature5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_weather5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        lb_wind.setForeground(new java.awt.Color(255, 255, 255));
        lb_wind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_wind.setText(" ");
        getContentPane().add(lb_wind, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 100, -1));

        lb_clouds.setForeground(new java.awt.Color(255, 255, 255));
        lb_clouds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_clouds.setText(" ");
        getContentPane().add(lb_clouds, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 100, -1));

        lb_pressure.setForeground(new java.awt.Color(255, 255, 255));
        lb_pressure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_pressure.setText(" ");
        getContentPane().add(lb_pressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 120, -1));

        lb_humidity.setForeground(new java.awt.Color(255, 255, 255));
        lb_humidity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_humidity.setText(" ");
        getContentPane().add(lb_humidity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 100, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_findActionPerformed
        // TODO add your handling code here:
        show();
    }//GEN-LAST:event_bt_findActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if(jTextField1.getText().equals("find a city")){
            jTextField1.setText("");
            jTextField1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")){
            jTextField1.setText("find a city");
            jTextField1.setForeground(new Color(140, 140, 140));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Weather_App().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Weather_App.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bt_find;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JLabel lb_city;
    public javax.swing.JLabel lb_clouds;
    public javax.swing.JLabel lb_date;
    public javax.swing.JLabel lb_date2;
    public javax.swing.JLabel lb_date3;
    public javax.swing.JLabel lb_date4;
    public javax.swing.JLabel lb_date5;
    public javax.swing.JLabel lb_humidity;
    public javax.swing.JLabel lb_pressure;
    public javax.swing.JLabel lb_temperature;
    public javax.swing.JLabel lb_temperature2;
    public javax.swing.JLabel lb_temperature3;
    public javax.swing.JLabel lb_temperature4;
    public javax.swing.JLabel lb_temperature5;
    public javax.swing.JLabel lb_weather;
    public javax.swing.JLabel lb_weather2;
    public javax.swing.JLabel lb_weather3;
    public javax.swing.JLabel lb_weather4;
    public javax.swing.JLabel lb_weather5;
    public javax.swing.JLabel lb_wind;
    private javax.swing.JButton next;
    private javax.swing.JButton pre;
    // End of variables declaration//GEN-END:variables
}
