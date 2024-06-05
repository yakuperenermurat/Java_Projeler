package week7.swingMiniProje.view;

import week7.swingMiniProje.business.UserController;
import week7.swingMiniProje.entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class UserView extends JFrame {
    private JPanel container;
    private JTabbedPane tab_menu;
    private JPanel pnl_user;
    private JScrollPane scrl_user;
    private JTable tbl_user;
    private JButton btn_user_new;
    private UserController userController;
    private DefaultTableModel mdl_user;
    private JPopupMenu user_popup;

    public UserView() {
        this.add(container);
        this.setTitle("Kullanıcı Yönetimi");
        this.setSize(500, 500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.userController = new UserController();
        this.mdl_user = new DefaultTableModel();
        this.user_popup = new JPopupMenu();

        Object[] columnUser = {"ID", "Ad", "Tip", "Cinsiyet", "Mail", "Şifre"};
        this.mdl_user.setColumnIdentifiers(columnUser);

        loadTableData();

        this.tbl_user.setModel(this.mdl_user);
        this.tbl_user.getTableHeader().setReorderingAllowed(false);

        this.tbl_user.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tbl_user.rowAtPoint(e.getPoint());
                tbl_user.setRowSelectionInterval(selectedRow, selectedRow);
                if (SwingUtilities.isRightMouseButton(e)) {
                    user_popup.show(tbl_user, e.getX(), e.getY());
                }
            }
        });

        this.user_popup.add("Güncelle").addActionListener(e -> {
            int selectedRow = tbl_user.getSelectedRow();
            if (selectedRow != -1) {
                int selectedId = Integer.parseInt(tbl_user.getValueAt(selectedRow, 0).toString());
                User selectedUser = this.userController.getById(selectedId);
                EditView editView = new EditView(selectedUser, this);
                editView.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        loadTableData(); // EditView kapandığında tabloyu güncelle
                    }
                });
            }
        });

        this.user_popup.add("Sil").addActionListener(e -> {
            int selectedRow = tbl_user.getSelectedRow();
            if (selectedRow != -1) {
                int selectedId = Integer.parseInt(tbl_user.getValueAt(selectedRow, 0).toString());
                boolean success = this.userController.delete(selectedId);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Kullanıcı başarıyla silindi.");
                    loadTableData();
                } else {
                    JOptionPane.showMessageDialog(this, "Kullanıcı silinemedi.");
                }
            }
        });

        this.tbl_user.setComponentPopupMenu(user_popup);

        btn_user_new.addActionListener(e -> {
            EditView editView = new EditView(new User(), this);
            editView.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    loadTableData(); // EditView kapandığında tabloyu güncelle
                }
            });
        });
    }

    public void loadTableData() {
        mdl_user.setRowCount(0);
        ArrayList<User> users = this.userController.findAll();
        for (User user : users) {
            Object[] row = {
                    user.getId(),
                    user.getName(),
                    user.getType(),
                    user.getGender(),
                    user.getMail(),
                    user.getPassword()
            };
            this.mdl_user.addRow(row);
        }
    }

}