package modulo3;

import javax.swing.*;

public class LogicalOperators {
    public static void main(String[] args) {

        JTextArea outputArea = new JTextArea(25, 20);
        JScrollPane scrolle = new JScrollPane(outputArea);
        String output = "";

        output += "AND logico (&&)"
                + "\nfalse && false: " + (false && false)
                + "\nfalse && true: " + (false && true)
                + "\ntrue && false: " + (true && false)
                + "\ntrue && true: " + (true && true);

        output += "\n\nOR logico (||)"
                + "\nfalse || false: " + (false || false)
                + "\nfalse || true: " + (false || true)
                + "\ntrue || false: " + (true || false)
                + "\ntrue || true: " + (true || true);

        output += "\n\nAND logico booleano (&)"
                + "\nfalse & false: " + (false & false)
                + "\nfalse & true: " + (false & true)
                + "\ntrue & false: " + (true & false)
                + "\ntrue & true: " + (true & true);

        output += "\n\nOR logico booleano (|)"
                + "\nfalse | false: " + (false | false)
                + "\nfalse | true: " + (false | true)
                + "\ntrue | false: " + (true | false)
                + "\ntrue | true: " + (true | true);

        output += "\n\nOR logico esclusivo (^)"
                + "\nfalse ^ false: " + (false ^ false)
                + "\nfalse ^ true: " + (false ^ true)
                + "\ntrue ^ false: " + (true ^ false)
                + "\ntrue ^ true: " + (true ^ true);

        output += "\n\nNOT logico (!)"
                + "\n!false: " + (!false)
                + "\n!true: " + (!true);

        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, scrolle,
                "Tabelle di verità", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }// end main method
}// end class LogicalOperators
