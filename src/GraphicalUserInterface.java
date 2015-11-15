import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

public class GraphicalUserInterface extends JFrame {
    public void createGUI() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        // применяем системный СКИН (размещаем в начале кода)
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        // применяем Метал-СКИН
        UIManager.setLookAndFeel(new MetalLookAndFeel());
        JFrame.setDefaultLookAndFeelDecorated(true);

        // применяем кросс-платформенный СКИН
//        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        // создаем ПАНЕЛЬ
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 3, 6, 6));    // к панели добавляем менеджер GridLayout и устанавливаем размеры таблицы 6x3 и расстояние между кнопками
        panel.setBorder(BorderFactory.createEtchedBorder());

        // создаем ФРЕЙМ и устанавливаем его размер, крепим ПАНЕЛЬ
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);             // запрещает изменение размера
        frame.setMinimumSize(new Dimension(200, 250));
        frame.setSize(new Dimension(400, 300));

        // создаем ПОЛЕ для отобажения результата, устанавливаем его параметры и крепим к ПАНЕЛИ
        JTextField display = new JTextField(15);
        display.setEditable(false);
        display.setFocusable(false);
        display.setMinimumSize(new Dimension(200, 100));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(display);

        // создаем КНОПКИ и крепим к ПАНЕЛИ
        JButton buttonClear = new JButton("C");
        panel.add(buttonClear);

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

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);  // СТАВИТСЯ В КОНЦЕ для правильного отображения содержимого
    }
}


// LAYOUT MANAGERS: http://www.quizful.net/post/swing-layout-managers
// https://javaswing.wordpress.com/2009/07/26/jbutton_pressing/
// http://javatalks.ru/topics/24945
