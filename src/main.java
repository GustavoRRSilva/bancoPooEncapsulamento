
import java.util.Scanner;
import javax.swing.JOptionPane;
public class main
{
public static void main(String[] args) {
	infoConta contaGustavo = new infoConta();
	Object[] itens = {"Sacar", "Depositar","MostrarSaldo","Encerrar"};
	Object selectedValue = "";
	while(selectedValue!= "Encerrar"){
		 selectedValue = JOptionPane.showInputDialog(null, 
				 "Escolha o item","opção",JOptionPane.INFORMATION_MESSAGE,null,itens,itens[0]); 
		 String sacar;double valor;
		 if(selectedValue == "Sacar") {
			 sacar = JOptionPane.showInputDialog(null,"Digite o valor que deseja sacar");
			 valor = Double.parseDouble(sacar);
			 boolean verificaSeSacou =contaGustavo.sacaSaldo(valor);
			 if(verificaSeSacou) {
				 JOptionPane.showMessageDialog(null, "Saque feito com sucesso");
			 }
			else {
				JOptionPane.showMessageDialog(null, "Saque recusado");
			 }
		 
		 }
		 else if(selectedValue == "Depositar") {
			 sacar = JOptionPane.showInputDialog(null,"Digite o valor que deseja depositar");
			 valor = Double.parseDouble(sacar);
			 contaGustavo.setSaldo(valor);
		 }
		 else if(selectedValue == "MostrarSaldo") {
			 double valorConta = contaGustavo.getSaldo();
			 JOptionPane.showMessageDialog(null, "O saldo da sua conta é :"+valorConta);
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "Você encerrou!");
			 break;
		 }
	 };
}
}
