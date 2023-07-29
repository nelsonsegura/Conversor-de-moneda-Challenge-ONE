package conversor_monedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {
    public static void main(String[] args) {

        Object[] options = { "Convertir monedas", "Conversor de temperatura", "EXIT" };
        int choice = JOptionPane.showOptionDialog(null, "Que desear hacer?", "Convertir",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        if (choice == 0) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Pesos a Dólares","Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen",
                        "Pesos a Won", "Dólares a Pesos", "Euros a Pesos", "Libras Esterlinas a Pesos", "Yen a Pesos",
                        "Won a Pesos"};
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog("Ingrese la cantidad de moneda a cambiar: ");
                double Pesos;
                try {
                	Pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.");
                    return;
                }

                if (cambio.equals("Pesos a Dólares")) {
                    double dollars = Pesos / 3940.56;
                    JOptionPane.showMessageDialog(null, Pesos + " pesos colombianos son " + FormatearDecimal.format(dollars) + " dólares.");
                } else if (cambio.equals("Pesos a Euros")) {
                    double euros = Pesos / 4349.00;
                    JOptionPane.showMessageDialog(null, Pesos + " pesos colombianos son " + FormatearDecimal.format(euros) + " euros.");
                } else if (cambio.equals("Pesos a Libras Esterlinas")) {
                    double pounds = Pesos / 5062.04;
                    JOptionPane.showMessageDialog(null, Pesos + " pesos colombianos son " + FormatearDecimal.format(pounds) + " libras esterlinas.");
                } else if (cambio.equals("Pesos a Yen")) {
                    double yen = Pesos / 27.92;
                    JOptionPane.showMessageDialog(null, Pesos + " pesos colombianos son " + FormatearDecimal.format(yen) + " yenes japoneses.");
                } else if (cambio.equals("Pesos a Won")) {
                    double won = Pesos / 3.09;
                    JOptionPane.showMessageDialog(null, Pesos + " pesos colombianos son " + FormatearDecimal.format(won) + " wones surcoreanos.");
                } else if (cambio.equals("Dólares a Pesos")) {
                    double dollars = Pesos * 3940.56;
                    JOptionPane.showMessageDialog(null, Pesos + " dólares son " + FormatearDecimal.format(dollars) + " pesos colombianos.");
                } else if (cambio.equals("Euros a Pesos")) {
                    double euros = Pesos * 4349.00;
                    JOptionPane.showMessageDialog(null, Pesos + " euros son " + FormatearDecimal.format(euros) + " pesos colombianos.");
                } else if (cambio.equals("Libras Esterlinas a Pesos")) {
                    double pounds = Pesos * 5062.04;
                    JOptionPane.showMessageDialog(null, Pesos + " libras esterlinas son " + FormatearDecimal.format(pounds) + " pesos colombianos.");
                } else if (cambio.equals("Yen a Pesos")) {
                    double yen = Pesos * 27.92;
                    JOptionPane.showMessageDialog(null, Pesos + " yenes japoneses son " + FormatearDecimal.format(yen) + " pesos colombianos.");
                } else if (cambio.equals("Won a Pesos")) {
                    double won = Pesos * 3.09;
                    JOptionPane.showMessageDialog(null, Pesos + " wones surcoreanos son " + FormatearDecimal.format(won) + " pesos colombianos.");
                }
                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar utilizando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                }
            }

        }
        if (choice == 1) {

            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Elige una de las opciones para la conversión:",
                        "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog("escriba el valor a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Celsius son " + resultado + " grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Fahrenheit son " + resultado + " grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}
