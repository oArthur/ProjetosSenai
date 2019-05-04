import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class GerenciarPessoa {

	public static void main(String[] args) {

		try {

			String nome = JOptionPane
					.showInputDialog("Digite o nome do cliente");
			String renda = JOptionPane.showInputDialog("Digite a renda");
			Cliente cliente = new Cliente(nome, Double.parseDouble(renda));

			String dtN = JOptionPane.showInputDialog(null,
					"Digite a data de nascimento");

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			cliente.setdNascimento(sdf.parse(dtN));
			
			
			
			do {
			cliente.setCpf(JOptionPane.showInputDialog("Digite o CPF"));
			
			}while(cliente.getCpf() != null);
			
			cliente.setTelefone(JOptionPane
					.showInputDialog("Digite o telefone"));
			Object[] opcSexo = { "Masculino", "Feminino" };
				Object sexo = JOptionPane.showInputDialog(null, "Qual o sexo?",
						"Op��es", JOptionPane.DEFAULT_OPTION, null, opcSexo,
						opcSexo[0]);
			cliente.setSexo(sexo.toString().charAt(0));

			/*JOptionPane.showMessageDialog(
					null,
					"Nome: " + cliente.getNome() +"\n"+"Data de Nascimento: "+ cliente.getdNascimento()+ "\n" + "Renda: "
							+ String.format("%,.2f", cliente.getRenda()) + "\n"
							+ "CPF: " + cliente.getCpf() + "\n" + "Sexo: "
							+ cliente.getSexo() + "\n" + "Tell: "
							+ cliente.getTelefone());*/

			GerenciarConta gerenciar = new GerenciarConta();
			gerenciar.usarConta(cliente);

		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "ERROR.");
		}

	}

}