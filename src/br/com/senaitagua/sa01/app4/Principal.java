package br.com.senaitagua.sa01.app4;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.DivCIncoMilBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resp = JOptionPane.showInputDialog("Informe o número de clientes especiais da VoeAirlines:");
		double nCLientes = Double.parseDouble(resp);
		
		DivCIncoMilBO dbo = new DivCIncoMilBO ();
		JOptionPane.showMessageDialog(null,"Cada cliente receberá R$: " + dbo.divCico(nCLientes));
	}

}
