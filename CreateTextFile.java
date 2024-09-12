package createtextfile;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import com.deitel.ch17.AccountRecord;

public class CreateTextFile {

    private Formatter output; // objeto utilizado para enviar texto para arquivo

    // permite ao usuário abrir o arquivo
    public void openFile() {
        Timer timer = new Timer();
        try {
            output = new Formatter("clients.txt"); // abre o arquivo
        } catch (SecurityException securityException) {
            JOptionPane.showMessageDialog(null, "Você não tem permissão para acessar esse arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
            TimerTask tarefa = new TimerTask() {
                @Override
                public void run() {
                    System.exit(1); // termina o programa
                }
            };
            timer.schedule(tarefa, 5000);
        } catch (FileNotFoundException fileNotFoundException) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir ou criar o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
            TimerTask tarefa = new TimerTask() {
                @Override
                public void run() {
                    System.exit(1); // termina o programa
                }
            };
            timer.schedule(tarefa, 5000);
        }
    } // fim do método openFile

    // adiciona registros ao arquivo
    public void addRecords() {
        AccountRecord record = new AccountRecord();

        // StringBuilder para armazenar a saída
        StringBuilder outputString = new StringBuilder();

        while (true) { // Loop que só será quebrado com comando de fim de arquivo
            try {
                String accountStr = JOptionPane.showInputDialog("Insira o número da conta (>0) ou aperte cancelar para finalizar");
                if (accountStr == null) {
                    break; // Encerra o loop ao cancelar o input
                }
                record.setAccount(Integer.parseInt(accountStr));

                String firstName = JOptionPane.showInputDialog("Insira o primeiro Nome:");
                if (firstName == null) {
                    break;
                }
                record.setFirstName(firstName);

                String lastName = JOptionPane.showInputDialog("Insira o sobrenome");
                if (lastName == null) {
                    break;
                }
                record.setLastName(lastName);

                String balanceStr = JOptionPane.showInputDialog("Insira o Saldo:");
                if (balanceStr == null) {
                    break;
                }
                record.setBalance(Double.parseDouble(balanceStr));

                if (record.getAccount() > 0) {
                    // Grava o novo registro no arquivo e no StringBuilder
                    outputString.append(String.format("%d %s %s %.2f\n", record.getAccount(),
                            record.getFirstName(), record.getLastName(), record.getBalance()));

                    output.format("%d %s %s %.2f\n", record.getAccount(),
                            record.getFirstName(), record.getLastName(), record.getBalance());
                } else {
                    JOptionPane.showMessageDialog(null, "O número da conta deve ser > 0");
                }

            } catch (FormatterClosedException formatterClosedException) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar dado no arquivo!","Erro", JOptionPane.ERROR_MESSAGE);
                break;
            } catch (NumberFormatException | NullPointerException elementException) {
                JOptionPane.showMessageDialog(null, "Entrada Inválida!, tente novamente.", "ALERTA!", JOptionPane.WARNING_MESSAGE);
            }
        }

        // Exibe o resultado final
        JOptionPane.showMessageDialog(null, "Saída:\n" + outputString.toString());
    } // fim do método addRecords

    // fecha o arquivo
    public void closeFile() {
        if (output != null) {
            output.close();
        }
    } // fim do método closeFile
} // fim da classe CreateTextFile
