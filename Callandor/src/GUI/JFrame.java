package GUI;

import Connection.*;
import Languages.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class JFrame extends javax.swing.JFrame {
    Methods methods=new Methods();
    IDataBase database = null;
    ILanguages language = null;
    DefaultTableModel model;
    int xx;
    int yy;
    
    int index = 0;
    boolean rowSelect = false;
    private MouseEvent Click;
    
    public JFrame() {
        initComponents();
        try {
            whileStarting();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        btn_show = new javax.swing.JPanel();
        jLabel_show = new javax.swing.JLabel();
        show_icon = new javax.swing.JLabel();
        pnl_add = new javax.swing.JPanel();
        add_icon = new javax.swing.JLabel();
        jLabel_add = new javax.swing.JLabel();
        btn_settings = new javax.swing.JPanel();
        jLabel_setting = new javax.swing.JLabel();
        setting_icon = new javax.swing.JLabel();
        btn_daily = new javax.swing.JPanel();
        jLabel_daily = new javax.swing.JLabel();
        daily_icon = new javax.swing.JLabel();
        Callandor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_top = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        panel_center = new javax.swing.JPanel();
        panel_add = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        text_english = new javax.swing.JTextField();
        text_mainlanguage = new javax.swing.JTextField();
        label_english = new javax.swing.JLabel();
        label_ML = new javax.swing.JLabel();
        lbl_engicon = new javax.swing.JLabel();
        lbl_engicon1 = new javax.swing.JLabel();
        btn_save = new javax.swing.JPanel();
        lbl_save = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_translate = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panel_text = new javax.swing.JPanel();
        lbl_alert = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTranslateText = new javax.swing.JEditorPane();
        panel_show = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_list = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        selectTable = new javax.swing.JLabel();
        combo_table = new javax.swing.JComboBox<>();
        combo_process = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_addTo = new javax.swing.JPanel();
        lbl_addTo = new javax.swing.JLabel();
        pnl_update = new javax.swing.JPanel();
        txt_english = new javax.swing.JTextField();
        txt_ML = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_update = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        update_ico = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_showAlert = new javax.swing.JLabel();
        panel_daily = new javax.swing.JPanel();
        panel_words = new javax.swing.JPanel();
        panel_dailyTurkish1 = new javax.swing.JPanel();
        lbl_dailyTurkish1 = new javax.swing.JLabel();
        panel_dailyTurkish2 = new javax.swing.JPanel();
        lbl_dailyTurkish2 = new javax.swing.JLabel();
        panel_dailyTurkish3 = new javax.swing.JPanel();
        lbl_dailyTurkish3 = new javax.swing.JLabel();
        panel_dailyTurkish4 = new javax.swing.JPanel();
        lbl_dailyTurkish4 = new javax.swing.JLabel();
        panel_dailyTurkish5 = new javax.swing.JPanel();
        lbl_dailyTurkish5 = new javax.swing.JLabel();
        panel_dailyEnglish1 = new javax.swing.JPanel();
        lbl_dailyEnglish1 = new javax.swing.JLabel();
        panel_dailyEnglish2 = new javax.swing.JPanel();
        lbl_dailyEnglish2 = new javax.swing.JLabel();
        panel_dailyEnglish3 = new javax.swing.JPanel();
        lbl_dailyEnglish3 = new javax.swing.JLabel();
        panel_dailyEnglish4 = new javax.swing.JPanel();
        lbl_dailyEnglish4 = new javax.swing.JLabel();
        panel_dailyEnglish5 = new javax.swing.JPanel();
        lbl_dailyEnglish5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panel_date = new javax.swing.JPanel();
        lbl_todayWord = new javax.swing.JLabel();
        lbl_today = new javax.swing.JLabel();
        lbl_day = new javax.swing.JLabel();
        lbl_dailyico = new javax.swing.JLabel();
        panel_settings = new javax.swing.JPanel();
        radio_MySQL = new javax.swing.JRadioButton();
        radio_SQLite = new javax.swing.JRadioButton();
        pnl_MySQLSettings = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_mysqlUsername = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_mysqlPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_mysqlPort = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_mysqlHost = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_apply = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_settingsAlert = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboLanguage = new javax.swing.JComboBox<>();
        panel_detail = new javax.swing.JPanel();
        exitDetails = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelDeatilPane = new javax.swing.JEditorPane();
        jLabel21 = new javax.swing.JLabel();
        panelDeatilEnglish = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btnSave = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        detailAlert = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Callandor");
        setIconImage(new javax.swing.ImageIcon("src/images/swordico.png").getImage());
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(54, 33, 89));
        sidepane.setForeground(new java.awt.Color(153, 102, 255));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_show.setBackground(new java.awt.Color(64, 43, 100));
        btn_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFrame.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterSide(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedSide(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });
        btn_show.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_show.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_show.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_show.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_show.setText("    Show");
        btn_show.add(jLabel_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 214, -1));

        show_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_show.png"))); // NOI18N
        show_icon.setText(" ");
        btn_show.add(show_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, -1, 58));

        sidepane.add(btn_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 310, 80));

        pnl_add.setBackground(new java.awt.Color(64, 43, 100));
        pnl_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFrame.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterSide(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedSide(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });

        add_icon.setIcon(new javax.swing.ImageIcon("src/images/add_images.png"));
        add_icon.setText(" ");

        jLabel_add.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_add.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_add.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_add.setText("   Add");

        javax.swing.GroupLayout pnl_addLayout = new javax.swing.GroupLayout(pnl_add);
        pnl_add.setLayout(pnl_addLayout);
        pnl_addLayout.setHorizontalGroup(
            pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(add_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_addLayout.setVerticalGroup(
            pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnl_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_add)
                    .addComponent(add_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        sidepane.add(pnl_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 80));

        btn_settings.setBackground(new java.awt.Color(64, 43, 100));
        btn_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFrame.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterSide(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedSide(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });

        jLabel_setting.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_setting.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_setting.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_setting.setText("  Settings");

        setting_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_setting.png"))); // NOI18N
        setting_icon.setText(" ");

        javax.swing.GroupLayout btn_settingsLayout = new javax.swing.GroupLayout(btn_settings);
        btn_settings.setLayout(btn_settingsLayout);
        btn_settingsLayout.setHorizontalGroup(
            btn_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_settingsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(setting_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_setting, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        btn_settingsLayout.setVerticalGroup(
            btn_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setting_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btn_settingsLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel_setting)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sidepane.add(btn_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 310, 80));

        btn_daily.setBackground(new java.awt.Color(64, 43, 100));
        btn_daily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFrame.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterSide(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedSide(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });

        jLabel_daily.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_daily.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_daily.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_daily.setText("  Daily");

        daily_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_daily.png"))); // NOI18N
        daily_icon.setText(" ");

        javax.swing.GroupLayout btn_dailyLayout = new javax.swing.GroupLayout(btn_daily);
        btn_daily.setLayout(btn_dailyLayout);
        btn_dailyLayout.setHorizontalGroup(
            btn_dailyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_dailyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(daily_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_daily, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        btn_dailyLayout.setVerticalGroup(
            btn_dailyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_dailyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_dailyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daily_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btn_dailyLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_daily)
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sidepane.add(btn_daily, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 310, 80));

        Callandor.setBackground(new java.awt.Color(255, 255, 255));
        Callandor.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Callandor.setForeground(new java.awt.Color(204, 204, 204));
        Callandor.setText("Callandor");
        sidepane.add(Callandor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 90));
        sidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 10));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        panel_top.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panel_topLayout = new javax.swing.GroupLayout(panel_top);
        panel_top.setLayout(panel_topLayout);
        panel_topLayout.setHorizontalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        panel_topLayout.setVerticalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        bg.add(panel_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 47, 890, 120));

        exit.setIcon(new javax.swing.ImageIcon("src/images/icon_exit.png"));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        bg.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 30, 40));
        //minimize.setIcon(new ImageIcon("src/images/images_exit.png"));

        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        bg.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 40, 40));
        minimize.setIcon(new ImageIcon("src/images/minimize.png"));
        //minimize.setIcon(new ImageIcon("C:\\Users\\Talha\\Documents\\NetBeansProjects\\Callandor\\src\\images\\minimize.png"));

        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        bg.add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 40));

        panel_center.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_add.setBackground(new java.awt.Color(255, 255, 255));
        panel_add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_add.setVisible(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_english.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_english.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panel_add_textEnglishKeyPressed(evt);
            }
        });
        jPanel2.add(text_english, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 15, 400, 60));

        text_mainlanguage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_mainlanguage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panel_add_textML(evt);
            }
        });
        jPanel2.add(text_mainlanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 95, 400, 60));

        label_english.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
        label_english.setText("English :");
        jPanel2.add(label_english, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 15, 100, 60));

        label_ML.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
        label_ML.setText("Turkish :");
        jPanel2.add(label_ML, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 95, 100, 60));

        lbl_engicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_english.png"))); // NOI18N
        jPanel2.add(lbl_engicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 73, -1));

        lbl_engicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_turkish.png"))); // NOI18N
        jPanel2.add(lbl_engicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, 73, -1));

        btn_save.setBackground(new java.awt.Color(204, 204, 204));
        btn_save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_save.setForeground(new java.awt.Color(102, 102, 102));
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOperationButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOperationButtons(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });
        btn_save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_save.png"))); // NOI18N
        btn_save.add(lbl_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 1, -1, 58));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(" Save");
        btn_save.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 15, 94, 30));

        jPanel2.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 175, 170, 60));

        btn_translate.setBackground(new java.awt.Color(204, 204, 204));
        btn_translate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_translate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_translateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOperationButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOperationButtons(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });
        btn_translate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Translate");
        btn_translate.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 58));

        jLabel18.setIcon(new javax.swing.ImageIcon("src/images/icon_translate.png"));
        btn_translate.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 58));

        jPanel2.add(btn_translate, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 175, 170, 60));

        panel_add.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 650, 260));

        javax.swing.GroupLayout panel_textLayout = new javax.swing.GroupLayout(panel_text);
        panel_text.setLayout(panel_textLayout);
        panel_textLayout.setHorizontalGroup(
            panel_textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_textLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_alert, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_textLayout.setVerticalGroup(
            panel_textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_textLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_alert, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel_add.add(panel_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 300, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_add2.png"))); // NOI18N
        panel_add.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, 120));

        jTranslateText.setEditable(false);
        jScrollPane3.setViewportView(jTranslateText);
        jTranslateText.setContentType("text/html");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        panel_add.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 470, 220));

        panel_center.add(panel_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 880, 530));

        panel_show.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_list.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "English", "Main Language", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_listMouseClicked(evt);
            }
        });
        table_list.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_listKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table_list);
        table_list.getColumnModel().getColumn(0).setPreferredWidth(1);
        table_list.getColumnModel().getColumn(1).setPreferredWidth(100);
        table_list.getColumnModel().getColumn(2).setPreferredWidth(100);
        table_list.getColumnModel().getColumn(3).setPreferredWidth(100);
        table_list.getAccessibleContext().setAccessibleDescription("");
        table_list.setToolTipText("Press \"U\" for focus the update panel."
            + "\n Press \"S\" for focus the Search.");

        panel_show.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 258, 880, 262));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectTable.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        selectTable.setText("Select Table");
        jPanel4.add(selectTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 11, -1, 33));

        combo_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combo_table.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Words", "Learned", "Forgot Date" }));
        combo_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tableActionPerformed(evt);
            }
        });
        jPanel4.add(combo_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 12, 126, 33));

        combo_process.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combo_process.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show", "Update" }));
        combo_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_processActionPerformed(evt);
            }
        });
        jPanel4.add(combo_process, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 64, 126, 33));

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jLabel3.setText("Process");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 63, 95, 33));

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel4.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 115, 126, 34));
        txt_search.setToolTipText("Press Enter for focus the table.");

        search.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        search.setText("Search");
        jPanel4.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 115, 95, 34));

        btn_refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_refresh.setToolTipText("You can use \"R\" key in the table.");
        btn_refresh.setPreferredSize(new java.awt.Dimension(102, 36));
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOperationButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOperationButtons(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });

        jLabel2.setText("         Refresh");

        javax.swing.GroupLayout btn_refreshLayout = new javax.swing.GroupLayout(btn_refresh);
        btn_refresh.setLayout(btn_refreshLayout);
        btn_refreshLayout.setHorizontalGroup(
            btn_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn_refreshLayout.setVerticalGroup(
            btn_refreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel4.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 180, -1, 38));

        btn_delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_delete.setToolTipText("You can use \"DEL\"or \"D\" key in the table.");
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOperationButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOperationButtons(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });

        jLabel5.setText("           Delete");

        javax.swing.GroupLayout btn_deleteLayout = new javax.swing.GroupLayout(btn_delete);
        btn_delete.setLayout(btn_deleteLayout);
        btn_deleteLayout.setHorizontalGroup(
            btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
        btn_deleteLayout.setVerticalGroup(
            btn_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel4.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 180, -1, 38));

        btn_addTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_addTo.setToolTipText("You can use \"T\" key in the table.");
        btn_addTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addToMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOperationButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOperationButtons(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });

        lbl_addTo.setText("Add Learned");

        javax.swing.GroupLayout btn_addToLayout = new javax.swing.GroupLayout(btn_addTo);
        btn_addTo.setLayout(btn_addToLayout);
        btn_addToLayout.setHorizontalGroup(
            btn_addToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_addToLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(lbl_addTo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_addToLayout.setVerticalGroup(
            btn_addToLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_addTo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel4.add(btn_addTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 180, -1, 38));

        panel_show.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, 355, 234));

        pnl_update.setBackground(new java.awt.Color(204, 204, 204));
        pnl_update.setVisible(false);
        pnl_update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_english.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_english.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_englishKeyPressed(evt);
            }
        });
        pnl_update.add(txt_english, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 6, 216, 45));
        txt_english.getAccessibleContext().setAccessibleDescription("\"\"");
        txt_english.setToolTipText("Press \"F1\" to focus on the table.");

        txt_ML.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_ML.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_MLKeyPressed(evt);
            }
        });
        pnl_update.add(txt_ML, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 69, 216, 45));
        txt_ML.getAccessibleContext().setAccessibleDescription("");
        txt_ML.setToolTipText("Press \"F1\" to focus on the table.");

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jLabel6.setText("   English");
        pnl_update.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 89, 45));

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
        jLabel7.setText("   Turkish");
        pnl_update.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 89, 45));

        btn_update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOperationButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOperationButtons(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });
        btn_update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText(" Update");
        btn_update.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1, 80, 40));

        update_ico.setIcon(new javax.swing.ImageIcon("src/images/icon_update.png"));
        btn_update.add(update_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 40));

        pnl_update.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 153, -1, 40));

        lbl_id.setVisible(false);
        pnl_update.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, 146, 33));

        lbl_date.setVisible(false);
        pnl_update.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 159, 106, 35));

        lbl_showAlert.setVisible(true);
        pnl_update.add(lbl_showAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 34));

        panel_show.add(pnl_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 6, 360, 230));

        panel_show.setVisible(false);

        panel_center.add(panel_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));

        panel_daily.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_daily.setVisible(false);

        panel_words.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_dailyTurkish1.setBackground(new java.awt.Color(153, 153, 153));
        panel_dailyTurkish1.setForeground(new java.awt.Color(153, 153, 153));

        lbl_dailyTurkish1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyTurkish1.setText(" ");
        lbl_dailyTurkish1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyTurkish1Layout = new javax.swing.GroupLayout(panel_dailyTurkish1);
        panel_dailyTurkish1.setLayout(panel_dailyTurkish1Layout);
        panel_dailyTurkish1Layout.setHorizontalGroup(
            panel_dailyTurkish1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyTurkish1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyTurkish1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );
        panel_dailyTurkish1Layout.setVerticalGroup(
            panel_dailyTurkish1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyTurkish1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyTurkish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 225, 35));

        panel_dailyTurkish2.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyTurkish2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyTurkish2.setText(" ");
        lbl_dailyTurkish2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyTurkish2Layout = new javax.swing.GroupLayout(panel_dailyTurkish2);
        panel_dailyTurkish2.setLayout(panel_dailyTurkish2Layout);
        panel_dailyTurkish2Layout.setHorizontalGroup(
            panel_dailyTurkish2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyTurkish2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyTurkish2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );
        panel_dailyTurkish2Layout.setVerticalGroup(
            panel_dailyTurkish2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyTurkish2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyTurkish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 225, 35));

        panel_dailyTurkish3.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyTurkish3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyTurkish3.setText(" ");
        lbl_dailyTurkish3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyTurkish3Layout = new javax.swing.GroupLayout(panel_dailyTurkish3);
        panel_dailyTurkish3.setLayout(panel_dailyTurkish3Layout);
        panel_dailyTurkish3Layout.setHorizontalGroup(
            panel_dailyTurkish3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyTurkish3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyTurkish3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );
        panel_dailyTurkish3Layout.setVerticalGroup(
            panel_dailyTurkish3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyTurkish3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyTurkish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 225, 35));

        panel_dailyTurkish4.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyTurkish4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyTurkish4.setText(" ");
        lbl_dailyTurkish4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyTurkish4Layout = new javax.swing.GroupLayout(panel_dailyTurkish4);
        panel_dailyTurkish4.setLayout(panel_dailyTurkish4Layout);
        panel_dailyTurkish4Layout.setHorizontalGroup(
            panel_dailyTurkish4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyTurkish4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyTurkish4, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );
        panel_dailyTurkish4Layout.setVerticalGroup(
            panel_dailyTurkish4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyTurkish4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyTurkish4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 225, 35));

        panel_dailyTurkish5.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyTurkish5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyTurkish5.setText(" ");
        lbl_dailyTurkish5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyTurkish5Layout = new javax.swing.GroupLayout(panel_dailyTurkish5);
        panel_dailyTurkish5.setLayout(panel_dailyTurkish5Layout);
        panel_dailyTurkish5Layout.setHorizontalGroup(
            panel_dailyTurkish5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyTurkish5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyTurkish5, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );
        panel_dailyTurkish5Layout.setVerticalGroup(
            panel_dailyTurkish5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyTurkish5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyTurkish5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 225, 35));

        panel_dailyEnglish1.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyEnglish1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyEnglish1.setText(" ");
        lbl_dailyEnglish1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyEnglish1Layout = new javax.swing.GroupLayout(panel_dailyEnglish1);
        panel_dailyEnglish1.setLayout(panel_dailyEnglish1Layout);
        panel_dailyEnglish1Layout.setHorizontalGroup(
            panel_dailyEnglish1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyEnglish1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyEnglish1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );
        panel_dailyEnglish1Layout.setVerticalGroup(
            panel_dailyEnglish1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyEnglish1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyEnglish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 175, 35));

        panel_dailyEnglish2.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyEnglish2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyEnglish2.setText(" ");
        lbl_dailyEnglish2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyEnglish2Layout = new javax.swing.GroupLayout(panel_dailyEnglish2);
        panel_dailyEnglish2.setLayout(panel_dailyEnglish2Layout);
        panel_dailyEnglish2Layout.setHorizontalGroup(
            panel_dailyEnglish2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyEnglish2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyEnglish2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );
        panel_dailyEnglish2Layout.setVerticalGroup(
            panel_dailyEnglish2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyEnglish2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyEnglish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 175, 35));

        panel_dailyEnglish3.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyEnglish3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyEnglish3.setText(" ");
        lbl_dailyEnglish3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyEnglish3Layout = new javax.swing.GroupLayout(panel_dailyEnglish3);
        panel_dailyEnglish3.setLayout(panel_dailyEnglish3Layout);
        panel_dailyEnglish3Layout.setHorizontalGroup(
            panel_dailyEnglish3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyEnglish3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyEnglish3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );
        panel_dailyEnglish3Layout.setVerticalGroup(
            panel_dailyEnglish3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyEnglish3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyEnglish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 175, 35));

        panel_dailyEnglish4.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyEnglish4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyEnglish4.setText(" ");
        lbl_dailyEnglish4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyEnglish4Layout = new javax.swing.GroupLayout(panel_dailyEnglish4);
        panel_dailyEnglish4.setLayout(panel_dailyEnglish4Layout);
        panel_dailyEnglish4Layout.setHorizontalGroup(
            panel_dailyEnglish4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyEnglish4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyEnglish4, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );
        panel_dailyEnglish4Layout.setVerticalGroup(
            panel_dailyEnglish4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyEnglish4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyEnglish4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 175, 35));

        panel_dailyEnglish5.setBackground(new java.awt.Color(153, 153, 153));

        lbl_dailyEnglish5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dailyEnglish5.setText(" ");
        lbl_dailyEnglish5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dailyMouseClickeds(evt);
            }
        });

        javax.swing.GroupLayout panel_dailyEnglish5Layout = new javax.swing.GroupLayout(panel_dailyEnglish5);
        panel_dailyEnglish5.setLayout(panel_dailyEnglish5Layout);
        panel_dailyEnglish5Layout.setHorizontalGroup(
            panel_dailyEnglish5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dailyEnglish5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dailyEnglish5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );
        panel_dailyEnglish5Layout.setVerticalGroup(
            panel_dailyEnglish5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dailyEnglish5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panel_words.add(panel_dailyEnglish5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 175, 35));

        jLabel20.setFont(new java.awt.Font("Bernard MT Condensed", 2, 36)); // NOI18N
        jLabel20.setText("Here, your words!");
        panel_words.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 470, 70));

        panel_daily.add(panel_words, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 530));

        lbl_todayWord.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        lbl_todayWord.setText("Today");

        lbl_today.setFont(new java.awt.Font("Stencil", 0, 35)); // NOI18N
        lbl_today.setText("22 January 2021");

        lbl_day.setFont(new java.awt.Font("Stencil", 0, 35)); // NOI18N
        lbl_day.setText("Monday");

        javax.swing.GroupLayout panel_dateLayout = new javax.swing.GroupLayout(panel_date);
        panel_date.setLayout(panel_dateLayout);
        panel_dateLayout.setHorizontalGroup(
            panel_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dateLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_todayWord, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dateLayout.createSequentialGroup()
                        .addComponent(lbl_today, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_dateLayout.createSequentialGroup()
                        .addComponent(lbl_day)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel_dateLayout.setVerticalGroup(
            panel_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dateLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_todayWord, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_day)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_today, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        panel_daily.add(panel_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 330, 210));
        panel_daily.add(lbl_dailyico, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 220, 210));

        panel_center.add(panel_daily, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));

        panel_settings.setVisible(false);
        panel_settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(radio_MySQL);
        radio_MySQL.setText("MySQL");
        radio_MySQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_MySQLActionPerformed(evt);
            }
        });
        panel_settings.add(radio_MySQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 53, -1, -1));
        radio_MySQL.setActionCommand("MySQL");

        buttonGroup1.add(radio_SQLite);
        radio_SQLite.setSelected(true);
        radio_SQLite.setText("SQLite");
        radio_SQLite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_SQLiteActionPerformed(evt);
            }
        });
        panel_settings.add(radio_SQLite, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 53, -1, -1));
        radio_SQLite.setActionCommand("SQLite");

        pnl_MySQLSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Username : ");
        pnl_MySQLSettings.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 101, -1));

        txt_mysqlUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_mysqlUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedSettings(evt);
            }
        });
        pnl_MySQLSettings.add(txt_mysqlUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 5, 325, 35));

        jLabel11.setText("Password : ");
        pnl_MySQLSettings.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, -1, -1));

        txt_mysqlPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_mysqlPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedSettings(evt);
            }
        });
        pnl_MySQLSettings.add(txt_mysqlPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 55, 325, 35));

        jLabel12.setText("Host : ");
        pnl_MySQLSettings.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, -1, -1));

        txt_mysqlPort.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_mysqlPort.setText("3306");
        txt_mysqlPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedSettings(evt);
            }
        });
        pnl_MySQLSettings.add(txt_mysqlPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 155, 325, 35));

        jLabel13.setText("Port : ");
        pnl_MySQLSettings.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 165, -1, -1));

        txt_mysqlHost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_mysqlHost.setText("localhost");
        txt_mysqlHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedSettings(evt);
            }
        });
        pnl_MySQLSettings.add(txt_mysqlHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 105, 325, 35));

        jLabel14.setText("   if you are working on localhost do not change this settings.");
        pnl_MySQLSettings.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 350, 80));

        panel_settings.add(pnl_MySQLSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 820, 200));
        pnl_MySQLSettings.setVisible(false);

        jLabel9.setText("Select Database : ");
        panel_settings.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, -1, -1));

        btn_apply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_apply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_applyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_applyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_applyMouseReleased(evt);
            }
        });
        btn_apply.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_save.png"))); // NOI18N
        btn_apply.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 66, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel15.setText("Apply");
        btn_apply.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 8, 112, 40));

        panel_settings.add(btn_apply, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 200, 60));
        panel_settings.add(lbl_settingsAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, 50));

        jLabel19.setText("Language : ");
        panel_settings.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 55, -1, -1));

        jComboLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turkish", "German", "Italian", "French" }));
        panel_settings.add(jComboLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 120, 30));

        panel_center.add(panel_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));

        exitDetails.setIcon(new javax.swing.ImageIcon("src/images/icon_exit.png"));
        exitDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDeatilPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(panelDeatilPane);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 530, 190));

        jLabel21.setText("English");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, 40));
        jPanel3.add(panelDeatilEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 530, 40));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 40));

        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.setToolTipText("You can use \"R\" key in the table.");
        btnDelete.setPreferredSize(new java.awt.Dimension(102, 36));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOperationButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOperationButtons(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });

        jLabel24.setText("           Delete");

        javax.swing.GroupLayout btnDeleteLayout = new javax.swing.GroupLayout(btnDelete);
        btnDelete.setLayout(btnDeleteLayout);
        btnDeleteLayout.setHorizontalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnDeleteLayout.setVerticalGroup(
            btnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSave.setToolTipText("You can use \"R\" key in the table.");
        btnSave.setPreferredSize(new java.awt.Dimension(102, 36));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOperationButtons(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOperationButtons(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonsPressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonsReleased(evt);
            }
        });

        jLabel25.setText("            Save");

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        detailAlert.setEditable(false);
        jScrollPane4.setViewportView(detailAlert);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 250, 80));

        javax.swing.GroupLayout panel_detailLayout = new javax.swing.GroupLayout(panel_detail);
        panel_detail.setLayout(panel_detailLayout);
        panel_detailLayout.setHorizontalGroup(
            panel_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_detailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_detailLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panel_detailLayout.setVerticalGroup(
            panel_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detailLayout.createSequentialGroup()
                .addComponent(exitDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panel_center.add(panel_detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));
        panel_detail.setVisible(false);

        bg.add(panel_center, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 880, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_dragMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        if (evt.getSource() == exit) {
            int x = (evt.getXOnScreen() - 1160 - evt.getX());
            methods.setValue("xx", String.valueOf(x));

            int y = (evt.getYOnScreen() - evt.getY());
            methods.setValue("yy", String.valueOf(y));

            System.exit(0);
        }else if(evt.getSource() == exitDetails){
            panel_detail.setVisible(false);
            panel_show.setVisible(true);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void mouseExitedSide(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitedSide
        //(64, 43, 100)
        methods.resetColor((JPanel) evt.getSource(),64,43,100);
    }//GEN-LAST:event_mouseExitedSide

    private void mouseEnterSide(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnterSide
        //(85, 65, 118)
        methods.setColor((JPanel) evt.getSource(),85,65,118);
    }//GEN-LAST:event_mouseEnterSide

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        if (evt.getSource() == pnl_add) {
            panel_add.setVisible(true);
            panel_show.setVisible(false);
            panel_daily.setVisible(false);
            panel_settings.setVisible(false);
            panel_detail.setVisible(false);
            
            text_english.requestFocusInWindow();
        } else if (evt.getSource() == btn_show) {
            panel_add.setVisible(false);
            panel_show.setVisible(true);
            panel_daily.setVisible(false);
            panel_settings.setVisible(false);
            panel_detail.setVisible(false);
            
        } else if (evt.getSource() == btn_daily) {
            panel_add.setVisible(false);
            panel_show.setVisible(false);
            panel_daily.setVisible(true);
            panel_settings.setVisible(false);
            panel_detail.setVisible(false);
            
            new Thread() {
                @Override
                public void run() {
                    try {
                        getDate();
                        dailyWords();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }.start();
            
        } else if (evt.getSource() == btn_settings) {
            panel_add.setVisible(false);
            panel_show.setVisible(false);
            panel_daily.setVisible(false);
            panel_settings.setVisible(true);
            panel_detail.setVisible(false);
            lbl_settingsAlert.setText("");
            
            if (database instanceof MySQL) {
                radio_MySQL.setSelected(true);
                radio_SQLite.setSelected(false);
                pnl_MySQLSettings.setVisible(true);
                
                txt_mysqlHost.setText(methods.getValue("MySQL.Host"));
                txt_mysqlPort.setText(methods.getValue("MySQL.Port"));
                txt_mysqlUsername.setText(methods.getValue("MySQL.Username"));
                txt_mysqlPassword.setText(methods.getValue("MySQL.Password"));
                
                
            } else {
                radio_MySQL.setSelected(false);
                radio_SQLite.setSelected(true);
                pnl_MySQLSettings.setVisible(false);
                
            }
        }
    }//GEN-LAST:event_mouseClicked

    private void panel_add_textEnglishKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panel_add_textEnglishKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Thread() {
                public void run() {
                    String english = text_english.getText();
                    jTranslateText.setText(language.translate(english));
                }
            }.start();
            text_mainlanguage.requestFocusInWindow();
        }
    }//GEN-LAST:event_panel_add_textEnglishKeyPressed

    private void panel_add_textML(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panel_add_textML
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.panel_add_textAlert();
        }
    }//GEN-LAST:event_panel_add_textML

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked
        panel_add_textAlert();
    }//GEN-LAST:event_btn_saveMouseClicked

    private void table_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_listMouseClicked
        index = table_list.getSelectedRow();
        
        model = (DefaultTableModel) table_list.getModel();
        lbl_id.setText(model.getValueAt(table_list.getSelectedRow(), 0).toString());
        txt_english.setText(model.getValueAt(table_list.getSelectedRow(), 1).toString());
        txt_ML.setText(model.getValueAt(table_list.getSelectedRow(), 2).toString());
        lbl_date.setText(model.getValueAt(table_list.getSelectedRow(), 3).toString());
        
        if (evt.getClickCount() == 2) {
            panel_detail.setVisible(true);
            panel_show.setVisible(false);
            
            panelDeatilEnglish.setText(model.getValueAt(table_list.getSelectedRow(), 1).toString());
            panelDeatilPane.setText(model.getValueAt(table_list.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_table_listMouseClicked

    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
        lbl_showAlert.setText("");
        new Thread() {
            public void run() {
                Refresh();
            }
        }.start();
    }//GEN-LAST:event_btn_refreshMouseClicked

    private void combo_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tableActionPerformed
        String selectedTable = combo_table.getSelectedItem().toString();
        String selectedProcess = combo_process.getSelectedItem().toString();
        if (selectedTable == "Words") {
            lbl_addTo.setText("Add Learned");
            btn_addTo.setVisible(true);
            txt_english.setText("");
            txt_ML.setText("");
            lbl_id.setText("");
            Refresh();

            if (selectedProcess == "Update") {
                pnl_update.setVisible(true);
            }
            lbl_showAlert.setText("");
        } else if (selectedTable == "Learned") {
            lbl_addTo.setText("Add Words");
            btn_addTo.setVisible(true);
            txt_english.setText("");
            txt_ML.setText("");
            lbl_id.setText("");
            Refresh();

            if (selectedProcess == "Update") {
                pnl_update.setVisible(true);
            }
            lbl_showAlert.setText("");
        } else if (selectedTable == "Forgot Date") {
            btn_addTo.setVisible(false);
            pnl_update.setVisible(false);
            txt_english.setText("");
            txt_ML.setText("");
            lbl_id.setText("");
            Refresh();
            lbl_showAlert.setText("");
        }

    }//GEN-LAST:event_combo_tableActionPerformed

    private void combo_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_processActionPerformed
        String selectedTable = combo_table.getSelectedItem().toString();
        String selectedProcess = combo_process.getSelectedItem().toString();
        
        if (selectedProcess == "Update" && (selectedTable == "Words" || selectedTable == "Learned"))
            pnl_update.setVisible(true);
        else if (selectedProcess == "Show")
            pnl_update.setVisible(false);
    }//GEN-LAST:event_combo_processActionPerformed

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
        if (lbl_id.getText().length() != 0) {
            new Thread() {
                public void run() {
                    try {
                        if (combo_table.getSelectedItem().toString() == "Words") {
                            lbl_showAlert.setText(database.delete("words", Integer.parseInt(lbl_id.getText())));
                        } else if (combo_table.getSelectedItem().toString() == "Learned") {
                            lbl_showAlert.setText(database.delete("learned", Integer.parseInt(lbl_id.getText())));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        Timer myTimer = new Timer();
                        TimerTask alert = new TimerTask() {
                            @Override
                            public void run() {
                                lbl_showAlert.setText("");
                                myTimer.cancel();
                            }
                        };
                        myTimer.schedule(alert, 1000);
                    }
                    
                    index = table_list.getSelectedRow();
                    rowSelect = true;
                    Refresh();
                    
                    txt_english.setText("");
                    txt_ML.setText("");
                    lbl_id.setText("");
                    lbl_date.setText("");
                    
                }
            }.start();
        }
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_addToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addToMouseClicked
        if (lbl_id.getText().length() != 0) {
            try {
                if (this.lbl_addTo.getText() == "Add Learned") {
                    database.addTo("learned", "words", Integer.parseInt(this.lbl_id.getText()), txt_english.getText(), txt_ML.getText(), this.lbl_date.getText());
                    index = table_list.getSelectedRow();
                    rowSelect = true;
                    Refresh();
                    lbl_showAlert.setText("Done!");
                } else if (this.lbl_addTo.getText() == "Add Words") {
                    database.addTo("words", "learned", Integer.parseInt(this.lbl_id.getText()), txt_english.getText(), txt_ML.getText(), this.lbl_date.getText());
                    index = table_list.getSelectedRow();
                    rowSelect = true;
                    Refresh();
                    this.lbl_showAlert.setText("Done!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                Timer myTimer = new Timer();
                TimerTask alert = new TimerTask() {
                    @Override
                    public void run() {
                        lbl_showAlert.setText("");
                        myTimer.cancel();
                    }
                };
                myTimer.schedule(alert, 1000);
                
            }
            txt_english.setText("");
            txt_ML.setText("");
            lbl_id.setText("");
            lbl_date.setText("");
        }
    }//GEN-LAST:event_btn_addToMouseClicked

    private void btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseClicked
        if (lbl_id.getText().length() == 0) {
            lbl_showAlert.setText("make a choice");
        } else if (txt_english.getText().length() == 0) {
            lbl_showAlert.setText("It cannot be empty.");
            txt_english.requestFocusInWindow();
        } else if (txt_ML.getText().length() == 0) {
            lbl_showAlert.setText("It cannot be empty.");
            txt_ML.requestFocusInWindow();
            
        } else {
            update(txt_english.getText(), txt_ML.getText(), Integer.parseInt(lbl_id.getText()));
            txt_english.setText("");
            txt_ML.setText("");
            lbl_id.setText("");
            lbl_date.setText("");
            table_list.requestFocusInWindow();
        }
        
        Timer myTimer = new Timer();
        TimerTask alert = new TimerTask() {
            @Override
            public void run() {
                lbl_showAlert.setText("");
                myTimer.cancel();
            }
        };
        myTimer.schedule(alert, 1000);
    }//GEN-LAST:event_btn_updateMouseClicked

    private void txt_englishKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_englishKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_english.getText().length() == 0) {
                lbl_showAlert.setText("It cannot be empty.");
                txt_english.requestFocusInWindow();
            } else {
                txt_ML.requestFocusInWindow();
            }
        } else if (evt.getKeyCode() == 112) {
            table_list.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt_englishKeyPressed

    private void txt_MLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MLKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (lbl_id.getText().length() == 0) {
                lbl_showAlert.setText("make a choice");
            } else if (txt_english.getText().length() == 0) {
                lbl_showAlert.setText("It cannot be empty.");
                txt_english.requestFocusInWindow();
            } else if (txt_ML.getText().length() == 0) {
                lbl_showAlert.setText("It cannot be empty.");
                txt_ML.requestFocusInWindow();
            } else {
                update(txt_english.getText(), txt_ML.getText(), Integer.parseInt(lbl_id.getText()));
                txt_english.setText("");
                txt_ML.setText("");
                lbl_id.setText("");
                lbl_date.setText("");
                table_list.requestFocusInWindow();
            }
            
            Timer myTimer = new Timer();
            TimerTask alert = new TimerTask() {
                @Override
                public void run() {
                    lbl_showAlert.setText("");
                    myTimer.cancel();
                }
            };
            myTimer.schedule(alert, 1000);
        } else if (evt.getKeyCode() == 112) {
            table_list.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt_MLKeyPressed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String selectedItem = tableName(combo_table.getSelectedItem().toString());
        new Thread() {
            @Override
            public void run() {
                try {
                    if (selectedItem == "forgotten_date") {
                        List(database.search(txt_search.getText(), selectedItem), true);
                    } else {
                        List(database.search(txt_search.getText(), selectedItem), false);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }//GEN-LAST:event_txt_searchKeyReleased

    private void lbl_dailyMouseClickeds(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dailyMouseClickeds
        String message = ((JLabel) evt.getSource()).getText();
        StringSelection selection = new StringSelection(message);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }//GEN-LAST:event_lbl_dailyMouseClickeds

    private void radio_MySQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_MySQLActionPerformed
        pnl_MySQLSettings.setVisible(true);
        panel_settings.add(btn_apply, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));
        
        txt_mysqlHost.setText(methods.getValue("MySQL.Host"));
        txt_mysqlPort.setText(methods.getValue("MySQL.Port"));
        txt_mysqlUsername.setText(methods.getValue("MySQL.Username"));
        txt_mysqlPassword.setText(methods.getValue("MySQL.Password"));
    }//GEN-LAST:event_radio_MySQLActionPerformed

    private void radio_SQLiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_SQLiteActionPerformed
        pnl_MySQLSettings.setVisible(false);
    }//GEN-LAST:event_radio_SQLiteActionPerformed

    private void btn_applyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_applyMouseClicked
        String selected = buttonGroup1.getSelection().getActionCommand();
        txt_mysqlUsername.setBorder(new LineBorder(Color.black));
        txt_mysqlPassword.setBorder(new LineBorder(Color.black));
        txt_mysqlHost.setBorder(new LineBorder(Color.black));
        txt_mysqlPort.setBorder(new LineBorder(Color.black));

        if (txt_mysqlUsername.getText().length() == 0) {
            txt_mysqlUsername.setBorder(new LineBorder(Color.red));
            txt_mysqlUsername.requestFocusInWindow();
        } else if (txt_mysqlPassword.getText().length() == 0) {
            txt_mysqlPassword.setBorder(new LineBorder(Color.red));
            txt_mysqlPassword.requestFocusInWindow();
        } else if (txt_mysqlHost.getText().length() == 0) {
            txt_mysqlHost.setBorder(new LineBorder(Color.red));
            txt_mysqlHost.requestFocusInWindow();
        } else if (txt_mysqlPort.getText().length() == 0) {
            txt_mysqlPort.setBorder(new LineBorder(Color.red));
            txt_mysqlPort.requestFocusInWindow();
        } else {
            if (selected == "MySQL") {
                MySQL m = new MySQL();
                if (m.isValid(txt_mysqlHost.getText(), txt_mysqlPort.getText(), txt_mysqlUsername.getText(), txt_mysqlPassword.getText()) == false) {
                    lbl_settingsAlert.setText("Check pls");
                } else {
                    try {
                        m.createTables(txt_mysqlHost.getText(), txt_mysqlPort.getText(), txt_mysqlUsername.getText(), txt_mysqlPassword.getText());

                        methods.setValue("database", "MySQL");
                        methods.setValue("MySQL.Host", txt_mysqlHost.getText());
                        methods.setValue("MySQL.Port", txt_mysqlPort.getText());
                        methods.setValue("MySQL.Username", txt_mysqlUsername.getText());
                        methods.setValue("MySQL.Password", txt_mysqlPassword.getText());

                        lbl_settingsAlert.setText("Done!");
                    } catch (Exception ex) {
                        lbl_settingsAlert.setText(ex.getMessage());
                    }

                    database = new MySQL();
                }

            } else if (selected == "SQLite") {
                try {
                    File file = new File("components/english.db");
                    if (file.exists() == false) {
                        new SQLite().CreateTables();
                    }

                    database = new SQLite();
                    methods.setValue("database", "SQLite");

                } catch (Exception ex) {
                    lbl_settingsAlert.setText(ex.getMessage());
                }
            }
            System.out.println(selected);
        }

        String select = jComboLanguage.getSelectedItem().toString();
        System.out.println(select);
        if (select.equals("German") == true) {
            language = new german();
        } else if (select.equals("French") == true) {
            language = new french();
        } else if (select.equals("Italian") == true) {
            language = new italian();
        } else {
            language = new turkish();
        }
        methods.setValue("language", select);

        label_ML.setText(language.getText() + " :");
        jLabel22.setText(language.getText() + " :");
        jLabel7.setText("   " + language.getText() + " :");

    }//GEN-LAST:event_btn_applyMouseClicked

    private void keyPressedSettings(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressedSettings
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (evt.getSource() == txt_mysqlUsername) {
                txt_mysqlPassword.requestFocusInWindow();
            } else if (evt.getSource() == txt_mysqlPassword) {
                txt_mysqlHost.requestFocusInWindow();
            } else if (evt.getSource() == txt_mysqlHost) {
                txt_mysqlPort.requestFocusInWindow();
            } else if (evt.getSource() == txt_mysqlPort) {
                btn_applyMouseClicked(Click);
            }
        }
    }//GEN-LAST:event_keyPressedSettings

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void table_listKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_listKeyPressed
        if (evt.getKeyCode() == 127 || evt.getKeyCode() == 68) {
            btn_deleteMouseClicked(Click);
        } else if (evt.getKeyCode() == 82) {
            Refresh();
        } else if (evt.getKeyCode() == 84) {
            btn_addToMouseClicked(Click);
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            createKeybindings(table_list);
        } else if (evt.getKeyCode() == 40) {
            model = (DefaultTableModel) table_list.getModel();
            if (table_list.getSelectedRow() != table_list.getRowCount() - 1) {
                lbl_id.setText(model.getValueAt(table_list.getSelectedRow() + 1, 0).toString());
                txt_english.setText(model.getValueAt(table_list.getSelectedRow() + 1, 1).toString());
                txt_ML.setText(model.getValueAt(table_list.getSelectedRow() + 1, 2).toString());
                lbl_date.setText(model.getValueAt(table_list.getSelectedRow() + 1, 3).toString());
            }
        } else if (evt.getKeyCode() == 38) {
            model = (DefaultTableModel) table_list.getModel();
            if (table_list.getSelectedRow() != 0) {
                lbl_id.setText(model.getValueAt(table_list.getSelectedRow() - 1, 0).toString());
                txt_english.setText(model.getValueAt(table_list.getSelectedRow() - 1, 1).toString());
                txt_ML.setText(model.getValueAt(table_list.getSelectedRow() - 1, 2).toString());
                lbl_date.setText(model.getValueAt(table_list.getSelectedRow() - 1, 3).toString());
            }
        } else if (evt.getKeyCode() == 85) {
            pnl_update.setVisible(true);
            txt_english.requestFocusInWindow();
        } else if (evt.getKeyCode() == 83) {
            txt_search.requestFocusInWindow();
        }
    }//GEN-LAST:event_table_listKeyPressed

    private void btn_applyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_applyMousePressed
        btn_apply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_btn_applyMousePressed

    private void btn_applyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_applyMouseReleased
        btn_apply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_btn_applyMouseReleased

    private void buttonsPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsPressed
        if (evt.getSource() == pnl_add) {
            pnl_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_show) {
            btn_show.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_daily) {
            btn_daily.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_settings) {
            btn_settings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_save) {
            btn_save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_refresh) {
            btn_refresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_addTo) {
            btn_addTo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_delete) {
            btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_update) {
            btn_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btn_translate) {
            btn_translate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btnDelete) {
            btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        } else if (evt.getSource() == btnSave) {
            btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        }

    }//GEN-LAST:event_buttonsPressed

    private void buttonsReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsReleased
        if (evt.getSource() == pnl_add) {
            pnl_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        } else if (evt.getSource() == btn_show) {
            btn_show.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        } else if (evt.getSource() == btn_daily) {
            btn_daily.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        } else if (evt.getSource() == btn_settings) {
            btn_settings.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        } else if (evt.getSource() == btn_save) {
            btn_save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (evt.getSource() == btn_refresh) {
            btn_refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (evt.getSource() == btn_addTo) {
            btn_addTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (evt.getSource() == btn_delete) {
            btn_delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (evt.getSource() == btn_update) {
            btn_update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (evt.getSource() == btn_translate) {
            btn_translate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (evt.getSource() == btnDelete) {
            btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        } else if (evt.getSource() == btnSave) {
            btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        }

    }//GEN-LAST:event_buttonsReleased

    private void btn_translateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_translateMouseClicked
        new Thread() {
            public void run() {
                String english = text_english.getText();
                jTranslateText.setText(language.translate(english));
            }
        }.start();
        text_mainlanguage.requestFocusInWindow();
    }//GEN-LAST:event_btn_translateMouseClicked

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            table_list.requestFocusInWindow();
            table_list.setRowSelectionInterval(0, 0);
            txt_search.setText("");
        }
    }//GEN-LAST:event_txt_searchKeyPressed

    private void mouseEnteredOperationButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnteredOperationButtons
        //(153,153,153)
        methods.setColor((JPanel) evt.getSource(),153,153,153);
    }//GEN-LAST:event_mouseEnteredOperationButtons

    private void mouseExitedOperationButtons(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitedOperationButtons
        //(204,204,204)
        if(evt.getSource() == btn_save || evt.getSource() == btn_translate)
            methods.resetColor((JPanel) evt.getSource(),204,204,204);
        else
            methods.resetColor((JPanel) evt.getSource(),240,240,240);
            
    }//GEN-LAST:event_mouseExitedOperationButtons

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (panelDeatilEnglish.getText().length() == 0) {
            detailAlert.setText("It cannot be empty.");
            panelDeatilEnglish.requestFocusInWindow();
        } else if (panelDeatilPane.getText().length() == 0) {
            detailAlert.setText("It cannot be empty.");
            panelDeatilPane.requestFocusInWindow();
        }else {
            update(panelDeatilEnglish.getText(), panelDeatilPane.getText(), Integer.parseInt(lbl_id.getText()));
            panelDeatilEnglish.requestFocusInWindow();
        }

        Timer myTimer = new Timer();
        TimerTask alert = new TimerTask() {
            @Override
            public void run() {
                detailAlert.setText("");
                myTimer.cancel();
            }
        };
        myTimer.schedule(alert, 1000);
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (lbl_id.getText().length() != 0) {
            new Thread() {
                public void run() {
                    try {
                        if (combo_table.getSelectedItem().toString() == "Words") {
                            lbl_showAlert.setText(database.delete("words", Integer.parseInt(lbl_id.getText())));
                        } else if (combo_table.getSelectedItem().toString() == "Learned") {
                            lbl_showAlert.setText(database.delete("learned", Integer.parseInt(lbl_id.getText())));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        Timer myTimer = new Timer();
                        TimerTask alert = new TimerTask() {
                            @Override
                            public void run() {
                                detailAlert.setText("");
                                myTimer.cancel();
                            }
                        };
                        myTimer.schedule(alert, 1000);
                    }

                    index = table_list.getSelectedRow();
                    rowSelect = true;
                    Refresh();

                    txt_english.setText("");
                    txt_ML.setText("");
                    lbl_id.setText("");
                    lbl_date.setText("");
                    panel_detail.setVisible(false);
                    panel_show.setVisible(true);

                }
            }.start();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked
    
    public static void main(String args[]) {
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new JFrame().setVisible(true);
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    void panel_add_textAlert() {
        if (this.text_mainlanguage.getText().length() == 0) {
            this.lbl_alert.setText("It cannot be empty.");
            this.text_mainlanguage.requestFocusInWindow();
        } else if (this.text_english.getText().length() == 0) {
            this.lbl_alert.setText("It cannot be empty.");
            this.text_english.requestFocusInWindow();
        } else if (this.text_english.getText().length() == 0 && this.text_mainlanguage.getText().length() != 0) {
            this.lbl_alert.setText("It cannot be empty.");
            this.text_english.requestFocusInWindow();
        } else if (this.text_english.getText().length() == 0 && this.text_mainlanguage.getText().length() == 0) {
            this.lbl_alert.setText("It cannot be empty.");
            this.text_english.requestFocusInWindow();
        } else {
            String textEnglish = text_english.getText();
            String textTurkish = text_mainlanguage.getText();
            new Thread() {
                @Override
                public void run() {
                    try {
                        String message = database.addWord(textEnglish, textTurkish);
                        lbl_alert.setText(message);
                        lbl_alert.setToolTipText(message);
                    } catch (SQLException ex) {
                        Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        Timer myTimer = new Timer();
                        TimerTask alert = new TimerTask() {
                            @Override
                            public void run() {
                                lbl_alert.setText("");
                                myTimer.cancel();
                            }
                        };
                        myTimer.schedule(alert, 5000);
                    }
                }
            }.start();
            
            text_english.setText("");
            text_mainlanguage.setText("");
            text_english.requestFocusInWindow();
            jTranslateText.setText("");
        }
    }
    
    void Refresh() {
        String selected = combo_table.getSelectedItem().toString();
        new Thread() {
            @Override
            public void run() {
                try {
                    if (tableName(selected) == "forgotten_date") {
                        List(database.getWords(tableName(selected)), true);
                    } else {
                        List(database.getWords(tableName(selected)), false);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                txt_english.setText("");
                txt_ML.setText("");
                lbl_id.setText("");
                lbl_date.setText("");
            }
        }.start();

    }

    void List(ArrayList list, boolean forgotten_date) {
        ArrayList<Words> words = list;
        try {
            if (forgotten_date == true) {
                btn_delete.setVisible(false);
                table_list.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "English", language.getText(), "Date", "Date Forgot"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });

                model = (DefaultTableModel) table_list.getModel();
                model.setRowCount(0);

                for (int i = 0; i < words.size(); i++) {
                    Object[] row = {words.get(i).getEnglish(), words.get(i).getTurkish(), words.get(i).getDate(), words.get(i).getForgotten_date()};
                    model.addRow(row);
                }

                table_list.getColumnModel().getColumn(0).setPreferredWidth(300);
                table_list.getColumnModel().getColumn(1).setPreferredWidth(300);
                table_list.getColumnModel().getColumn(2).setPreferredWidth(100);
                table_list.getColumnModel().getColumn(3).setPreferredWidth(100);

            } else {
                txt_search.setEditable(true);
                btn_delete.setVisible(true);
                table_list.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Id", "English", language.getText(), "Date"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });

                model = (DefaultTableModel) table_list.getModel();
                model.setRowCount(0);

                for (int i = 0; i < words.size(); i++) {
                    Object[] row = {words.get(i).getId(), words.get(i).getEnglish(), words.get(i).getTurkish(), words.get(i).getDate()};
                    model.addRow(row);
                }

                table_list.getColumnModel().getColumn(0).setPreferredWidth(10);
                table_list.getColumnModel().getColumn(1).setPreferredWidth(300);
                table_list.getColumnModel().getColumn(2).setPreferredWidth(300);
                table_list.getColumnModel().getColumn(3).setPreferredWidth(100);
            }

        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }

        if ((combo_table.getSelectedItem().toString().equals("Words") || combo_table.getSelectedItem().toString().equals("Learned")) && rowSelect == true) {
            if (index > 0) {
                table_list.setRowSelectionInterval(index - 1, index - 1);
                index -= 1;
                rowSelect = false;
            }
        } else {
            index = 0;
        }

    }
    
    void update(String english, String turkish, int id) {
        if (id == 0) {
            this.lbl_showAlert.setText("You did not choose.");
        } else if (english.length() == 0) {
            this.lbl_showAlert.setText("It cannot be empty.");
            txt_english.requestFocusInWindow();
        } else if (turkish.length() == 0) {
            this.lbl_showAlert.setText("It cannot be empty.");
            txt_ML.requestFocusInWindow();
        } else {
            try {
                database.update(tableName(combo_table.getSelectedItem().toString()), english, turkish, id);
                this.lbl_showAlert.setText("Done!");
            } catch (SQLException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                index = table_list.getSelectedRow() + 1;
                rowSelect = true;

                Refresh();
            }
        }
    }
    
    String tableName(String table) {
        if (table == "Words") {
            return "words";
        } else if (table == "Learned") {
            return "learned";
        } else if (table == "Forgot Date") {
            return "forgotten_date";
        } else {
            return null;
        }
    }
    
    void getDate() {
        Date time = new Date();
        String[] timeSplit = time.toString().split(" ");
        
        if (timeSplit[0].equals("Mon") == true) {
            lbl_day.setText("Monday ");
            lbl_dailyico.setIcon(new javax.swing.ImageIcon("src/images/images_monday.png"));
        } else if (timeSplit[0].equals("Tue") == true) {
            lbl_day.setText("Tuesday ");
            lbl_dailyico.setIcon(new javax.swing.ImageIcon("src/images/images_tuesday.png"));
        } else if (timeSplit[0].equals("Wed") == true) {
            lbl_day.setText("Wednesday ");
            lbl_dailyico.setIcon(new javax.swing.ImageIcon("src/images/images_wednesday.png"));
        } else if (timeSplit[0].equals("Thu") == true) {
            lbl_day.setText("Thursday ");
            lbl_dailyico.setIcon(new javax.swing.ImageIcon("src/images/images_thursday.png"));
        } else if (timeSplit[0].equals("Fri") == true) {
            lbl_day.setText("Friday ");
            lbl_dailyico.setIcon(new javax.swing.ImageIcon("src/images/images_friday.png"));
            
        } else if (timeSplit[0].equals("Sat") == true) {
            lbl_day.setText("Saturday ");
            lbl_dailyico.setIcon(new javax.swing.ImageIcon("src/images/images_saturday.png"));
        } else {
            lbl_day.setText("Sunday ");
            lbl_dailyico.setIcon(new javax.swing.ImageIcon("src/images/images_sunday.png"));
        }
        
        if (timeSplit[1].equals("Jan") == true) {
            lbl_today.setText(timeSplit[2] + " January" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("Feb") == true) {
            lbl_today.setText(timeSplit[2] + " February" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("Mar") == true) {
            lbl_today.setText(timeSplit[2] + " March" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("Apr") == true) {
            lbl_today.setText(timeSplit[2] + " April" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("May") == true) {
            lbl_today.setText(timeSplit[2] + " May" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("June") == true) {
            lbl_today.setText(timeSplit[2] + " June" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("July") == true) {
            lbl_today.setText(timeSplit[2] + " July" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("Aug") == true) {
            lbl_today.setText(timeSplit[2] + " August" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("Sep") == true) {
            lbl_today.setText(timeSplit[2] + " September" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("Oct") == true) {
            lbl_today.setText(timeSplit[2] + " October" + " " + timeSplit[5]);
        } else if (timeSplit[1].equals("Nov") == true) {
            lbl_today.setText(timeSplit[2] + " November" + " " + timeSplit[5]);
        } else {
            lbl_today.setText(timeSplit[2] + " December" + " " + timeSplit[5]);
        }
    }
    
    void dailyWords() throws SQLException, IOException {
        ArrayList<String> daily = database.getDaily();
        lbl_dailyEnglish1.setText(daily.get(0));
        lbl_dailyEnglish1.setToolTipText(daily.get(0));
        lbl_dailyTurkish1.setText(daily.get(1));
        lbl_dailyTurkish1.setToolTipText(daily.get(1));
        
        lbl_dailyEnglish2.setText(daily.get(2));
        lbl_dailyEnglish2.setToolTipText(daily.get(2));
        lbl_dailyTurkish2.setText(daily.get(3));
        lbl_dailyTurkish2.setToolTipText(daily.get(3));
        
        lbl_dailyEnglish3.setText(daily.get(4));
        lbl_dailyEnglish3.setToolTipText(daily.get(4));
        lbl_dailyTurkish3.setText(daily.get(5));
        lbl_dailyTurkish3.setToolTipText(daily.get(5));
        
        lbl_dailyEnglish4.setText(daily.get(6));
        lbl_dailyEnglish4.setToolTipText(daily.get(6));
        lbl_dailyTurkish4.setText(daily.get(7));
        lbl_dailyTurkish4.setToolTipText(daily.get(7));
        
        lbl_dailyEnglish5.setText(daily.get(8));
        lbl_dailyEnglish5.setToolTipText(daily.get(8));
        lbl_dailyTurkish5.setText(daily.get(9));
        lbl_dailyTurkish5.setToolTipText(daily.get(9));
    }
        
    void whileStarting() throws IOException, SQLException{
        String StringDatabase = methods.getValue("database");
        database = methods.getDataBase(StringDatabase);
        System.out.println(StringDatabase);
        
        String StringLanguage = methods.getValue("language");
        language = methods.getLanguage(StringLanguage);
        jComboLanguage.setSelectedIndex(language.getIndex());
        
        
        int xx = Integer.valueOf(methods.getValue("xx"));
        int yy = Integer.valueOf(methods.getValue("yy"));
        setLocation(xx, yy);
        
        label_ML.setText(language.getText() + " :");
        jLabel22.setText(language.getText() + " :");
        jLabel7.setText("   " + language.getText() + " :");
        
        
    }
    
    private void createKeybindings(JTable table_list) {
        table_list.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        table_list.getActionMap().put("Enter", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                model = (DefaultTableModel) table_list.getModel();
                lbl_id.setText(model.getValueAt(table_list.getSelectedRow(), 0).toString());
                txt_english.setText(model.getValueAt(table_list.getSelectedRow(), 1).toString());
                txt_ML.setText(model.getValueAt(table_list.getSelectedRow(), 2).toString());
                lbl_date.setText(model.getValueAt(table_list.getSelectedRow(), 3).toString());
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Callandor;
    private javax.swing.JLabel add_icon;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnDelete;
    private javax.swing.JPanel btnSave;
    private javax.swing.JPanel btn_addTo;
    private javax.swing.JPanel btn_apply;
    private javax.swing.JPanel btn_daily;
    private javax.swing.JPanel btn_delete;
    private javax.swing.JPanel btn_refresh;
    private javax.swing.JPanel btn_save;
    private javax.swing.JPanel btn_settings;
    private javax.swing.JPanel btn_show;
    private javax.swing.JPanel btn_translate;
    private javax.swing.JPanel btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo_process;
    private javax.swing.JComboBox<String> combo_table;
    private javax.swing.JLabel daily_icon;
    private javax.swing.JEditorPane detailAlert;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exitDetails;
    private javax.swing.JComboBox<String> jComboLanguage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_add;
    private javax.swing.JLabel jLabel_daily;
    private javax.swing.JLabel jLabel_setting;
    private javax.swing.JLabel jLabel_show;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JEditorPane jTranslateText;
    private javax.swing.JLabel label_ML;
    private javax.swing.JLabel label_english;
    private javax.swing.JLabel lbl_addTo;
    private javax.swing.JLabel lbl_alert;
    private javax.swing.JLabel lbl_dailyEnglish1;
    private javax.swing.JLabel lbl_dailyEnglish2;
    private javax.swing.JLabel lbl_dailyEnglish3;
    private javax.swing.JLabel lbl_dailyEnglish4;
    private javax.swing.JLabel lbl_dailyEnglish5;
    private javax.swing.JLabel lbl_dailyTurkish1;
    private javax.swing.JLabel lbl_dailyTurkish2;
    private javax.swing.JLabel lbl_dailyTurkish3;
    private javax.swing.JLabel lbl_dailyTurkish4;
    private javax.swing.JLabel lbl_dailyTurkish5;
    private javax.swing.JLabel lbl_dailyico;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_day;
    private javax.swing.JLabel lbl_engicon;
    private javax.swing.JLabel lbl_engicon1;
    public javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_save;
    private javax.swing.JLabel lbl_settingsAlert;
    public javax.swing.JLabel lbl_showAlert;
    private javax.swing.JLabel lbl_today;
    private javax.swing.JLabel lbl_todayWord;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField panelDeatilEnglish;
    private javax.swing.JEditorPane panelDeatilPane;
    private javax.swing.JPanel panel_add;
    private javax.swing.JPanel panel_center;
    private javax.swing.JPanel panel_daily;
    private javax.swing.JPanel panel_dailyEnglish1;
    private javax.swing.JPanel panel_dailyEnglish2;
    private javax.swing.JPanel panel_dailyEnglish3;
    private javax.swing.JPanel panel_dailyEnglish4;
    private javax.swing.JPanel panel_dailyEnglish5;
    private javax.swing.JPanel panel_dailyTurkish1;
    private javax.swing.JPanel panel_dailyTurkish2;
    private javax.swing.JPanel panel_dailyTurkish3;
    private javax.swing.JPanel panel_dailyTurkish4;
    private javax.swing.JPanel panel_dailyTurkish5;
    private javax.swing.JPanel panel_date;
    private javax.swing.JPanel panel_detail;
    private javax.swing.JPanel panel_settings;
    private javax.swing.JPanel panel_show;
    private javax.swing.JPanel panel_text;
    private javax.swing.JPanel panel_top;
    private javax.swing.JPanel panel_words;
    private javax.swing.JPanel pnl_MySQLSettings;
    private javax.swing.JPanel pnl_add;
    private javax.swing.JPanel pnl_update;
    private javax.swing.JRadioButton radio_MySQL;
    private javax.swing.JRadioButton radio_SQLite;
    private javax.swing.JLabel search;
    private javax.swing.JLabel selectTable;
    private javax.swing.JLabel setting_icon;
    private javax.swing.JLabel show_icon;
    private javax.swing.JPanel sidepane;
    private javax.swing.JTable table_list;
    private javax.swing.JTextField text_english;
    private javax.swing.JTextField text_mainlanguage;
    private javax.swing.JTextField txt_ML;
    private javax.swing.JTextField txt_english;
    private javax.swing.JTextField txt_mysqlHost;
    private javax.swing.JTextField txt_mysqlPassword;
    private javax.swing.JTextField txt_mysqlPort;
    private javax.swing.JTextField txt_mysqlUsername;
    private javax.swing.JTextField txt_search;
    private javax.swing.JLabel update_ico;
    // End of variables declaration//GEN-END:variables
}
