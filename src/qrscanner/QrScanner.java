/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qrscanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author IT sohit
 */
public class QrScanner extends javax.swing.JFrame {

    /**
     * Creates new form QrScanner
     */
    public QrScanner() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textdataCreate = new javax.swing.JEditorPane();
        createbtn = new javax.swing.JButton();
        pathcreatebtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        locationcreate = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textdataScanner = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        selectImgScanner = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FilenameScanner = new javax.swing.JTextField();
        scanBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(214, 217, 224));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(33, 63, 87));

        jButton1.setBackground(new java.awt.Color(33, 63, 87));
        jButton1.setForeground(new java.awt.Color(215, 228, 231));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(33, 63, 87));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(215, 228, 231));
        jLabel1.setText("QRScanner");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 293, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 670, 35);

        jPanel3.setBackground(new java.awt.Color(214, 219, 223));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel3.setText("QR Creator");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(120, 10, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Text Data :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 70, 70, 20);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textdataCreate.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(textdataCreate);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(40, 90, 260, 90);

        createbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });
        jPanel3.add(createbtn);
        createbtn.setBounds(130, 260, 70, 30);

        pathcreatebtn.setText("Select Path");
        pathcreatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathcreatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(pathcreatebtn);
        pathcreatebtn.setBounds(40, 190, 90, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Location :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 220, 60, 30);

        locationcreate.setEditable(false);
        jPanel3.add(locationcreate);
        locationcreate.setBounds(100, 220, 200, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 40, 330, 330);

        jPanel4.setBackground(new java.awt.Color(214, 219, 223));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel2.setText("QR Scanner");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(110, 10, 100, 40);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textdataScanner.setEditable(false);
        textdataScanner.setContentType("text/html"); // NOI18N
        jScrollPane3.setViewportView(textdataScanner);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(30, 220, 260, 100);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Text Data :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(30, 200, 70, 20);

        selectImgScanner.setText("Select Image");
        selectImgScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImgScannerActionPerformed(evt);
            }
        });
        jPanel4.add(selectImgScanner);
        selectImgScanner.setBounds(110, 70, 100, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("File name :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(30, 120, 70, 30);

        FilenameScanner.setEditable(false);
        jPanel4.add(FilenameScanner);
        FilenameScanner.setBounds(100, 120, 190, 30);

        scanBtn.setText("Scan");
        scanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanBtnActionPerformed(evt);
            }
        });
        jPanel4.add(scanBtn);
        scanBtn.setBounds(120, 170, 73, 23);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(340, 40, 330, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(667, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            System.exit(0);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selectImgScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImgScannerActionPerformed
            fileselect = new JFileChooser();
             filter = new FileNameExtensionFilter("Images PNG,JPG & JPEG","png","jpg","jpeg");
             fileselect.addChoosableFileFilter(filter);
             fileselect.setAcceptAllFileFilterUsed(false);
           returnvalue = fileselect.showOpenDialog(null);
              FilenameScanner.setText(String.valueOf(fileselect.getSelectedFile()));
    }//GEN-LAST:event_selectImgScannerActionPerformed

    private void scanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanBtnActionPerformed
        if(returnvalue== JFileChooser.APPROVE_OPTION){
        try{ BufferedImage bImage = ImageIO.read(fileselect.getSelectedFile());
            LuminanceSource source = new BufferedImageLuminanceSource(bImage);
              BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));     
              Result r = new MultiFormatReader().decode(bitmap);
                textdataScanner.setText(r.getText());
                 System.out.println(" result.getText() :"+r.getText()); }
        catch(Exception e){ 
           textdataScanner.setText("Select File");}
        }else{
          textdataScanner.setText("Please Select File"); }
    }//GEN-LAST:event_scanBtnActionPerformed

    private void pathcreatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathcreatebtnActionPerformed
      try{ JFileChooser select = new JFileChooser();
           select.setAcceptAllFileFilterUsed(false);
           FileNameExtensionFilter f = new FileNameExtensionFilter("IMAGES PNG,JPG&JPEG","png","jpg","jpeg");  
           select.addChoosableFileFilter(f);
          rcreate = select.showSaveDialog(null);
              pathcreatestr = (select.getSelectedFile()).getPath();
              if(pathcreatestr.lastIndexOf(".")== -1){
                pathcreatestr = pathcreatestr+".png"; }
              locationcreate.setText(pathcreatestr); }
      catch(Exception e){
        locationcreate.setText("Select Path Image"); }
    }//GEN-LAST:event_pathcreatebtnActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
       if(rcreate==JFileChooser.APPROVE_OPTION){
       try{  String data = textdataCreate.getText();        
              String charset = "UTF-8";                
            Map<EncodeHintType,ErrorCorrectionLevel> hintMap = new HashMap<EncodeHintType,ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.L);
               System.out.println(hintMap.toString());
             BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset),charset),BarcodeFormat.QR_CODE,200,200,hintMap);
              MatrixToImageWriter.writeToFile(matrix,pathcreatestr.substring(pathcreatestr.lastIndexOf('.')+1),new File(pathcreatestr));
              System.out.println(pathcreatestr.substring(pathcreatestr.lastIndexOf('.')+1));
                System.out.println("Image Created");
      }catch(Exception e){
        locationcreate.setText("Select Path"); }
       }
      
    }//GEN-LAST:event_createbtnActionPerformed

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
            java.util.logging.Logger.getLogger(QrScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QrScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QrScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QrScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QrScanner().setVisible(true);
            }
        });
    }

    private String pathcreatestr;
    private int returnvalue,rcreate;
    private FileNameExtensionFilter filter;
    private JFileChooser fileselect;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FilenameScanner;
    private javax.swing.JButton createbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField locationcreate;
    private javax.swing.JButton pathcreatebtn;
    private javax.swing.JButton scanBtn;
    private javax.swing.JButton selectImgScanner;
    private javax.swing.JEditorPane textdataCreate;
    private javax.swing.JTextPane textdataScanner;
    // End of variables declaration//GEN-END:variables
}
