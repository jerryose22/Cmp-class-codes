package Ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUi {
    JFrame frame= new JFrame("Geometry");
    JButton areaOfSquare= new JButton("Area of square");
    JButton areaOfTriangle= new JButton("Area of triangle");
    JButton areaOfRectangle= new JButton("Area of rectangle");
    JFrame areaOfSquareFrame = new JFrame("Area of square");
    JTextField enterLengthOfSquare= new JTextField("Enter length");
    JButton calculateAreaOfSquare  = new JButton("Calculate");
    public void MainUi() {
        frame.add(areaOfSquare);
        frame.add(areaOfRectangle);
        frame.add(areaOfTriangle);
        frame.setSize(150, 200);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        areaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("calculate area of square");
//                JOptionPane.showMessageDialog(null, "calculate area of square");
                drawAreaOfSquareUi();
//
            }
        });


    }
        public void drawAreaOfSquareUi() {
            Geometry geo = new Geometry();
            areaOfSquareFrame.add(enterLengthOfSquare);
            areaOfSquareFrame.add(calculateAreaOfSquare);
            areaOfSquareFrame.setLayout(new GridLayout(2,1));
            areaOfSquareFrame.setSize(150,200);
            areaOfSquareFrame.setVisible(true);

            calculateAreaOfSquare.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    float area= geo.areaOfSquare(Float.parseFloat(enterLengthOfSquare.getText()));
                    System.out.println("calculate area of square");
                    JOptionPane.showMessageDialog(null, area);

                }
            });


        }
        }



