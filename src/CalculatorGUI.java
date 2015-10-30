import com.sun.deploy.panel.JSmartTextArea;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // применяем системный скин
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // создаем фрейм и устанавливаем его размер
        JFrame frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // создаем панель
        JPanel panel = new JPanel();

        panel.setSize(300, 250);
        panel.setBorder(BorderFactory.createEtchedBorder());
        frame.getContentPane().add(panel);

        // к панели добавляем менеджер GridLayout и устанавливаем размеры таблицы 6x3
        panel.setLayout(new GridLayout(6, 3));

//        panel.add(new JTextField("                      0"));
        JSmartTextArea display = new JSmartTextArea();
        panel.add(display);
        display.setSize(200, 50);

        JButton buttonClear = new JButton("C");
        panel.add(buttonClear);
        buttonClear.setSize(50, 50);

        JButton button0 = new JButton("0");
        panel.add(button0);

        JButton button1 = new JButton("1");
        panel.add(button1);

        JButton button2 = new JButton("2");
        panel.add(button2);

        JButton button3 = new JButton("3");
        panel.add(button3);

        JButton button4 = new JButton("4");
        panel.add(button4);

        JButton button5 = new JButton("5");
        panel.add(button5);

        JButton button6 = new JButton("6");
        panel.add(button6);

        JButton button7 = new JButton("7");
        panel.add(button7);

        JButton button8 = new JButton("8");
        panel.add(button8);

        JButton button9 = new JButton("9");
        panel.add(button9);

        JButton buttonSeparator = new JButton(",");
        panel.add(buttonSeparator);

        JButton buttonPlus = new JButton("+");
        panel.add(buttonPlus);

        JButton buttonMinus = new JButton("-");
        panel.add(buttonMinus);

        JButton buttonMultiply = new JButton("*");
        panel.add(buttonMultiply);

        JButton buttonDivide = new JButton("/");
        panel.add(buttonDivide);

        JButton buttonEqual = new JButton("=");
        panel.add(buttonEqual);

        //LAYOUT MANAGERS: http://www.quizful.net/post/swing-layout-managers
    }
}
