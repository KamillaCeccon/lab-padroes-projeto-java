package one.digitalinnovation.gof;

import strategy.Comportamento;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}
}