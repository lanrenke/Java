package code._05内部类_匿名内部类;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//

/**
    拓展：理解匿名内部类在开发中的具体使用。

 */
public class ButtonDemo03 {
    public static void main(String[] args) {
        JFrame win = new JFrame("登录界面");
        win.setSize(500,350);
        win.setLocationRelativeTo(null); // 居中。

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("开始登录");
        panel.add(btn);

        // 给按钮绑定点击事件监听器，让按钮可以点击。
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击一次，开始登录！");
            }
        });

        win.setVisible(true);

    }
}
