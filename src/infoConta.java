
public class infoConta {
private double saldo;
public int agencia;
public String titular;
public int sacar;


public void setSaldo(double saldo) {
	this.saldo += saldo;
}
public double getSaldo() {
	return saldo;
}
public boolean sacaSaldo(double saldo) {
	if(this.saldo>=saldo) {
		this.saldo -= saldo;
		return true;
	}
	else {
		return false;
	}
}
}
