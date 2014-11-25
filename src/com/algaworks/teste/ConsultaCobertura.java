package com.algaworks.teste;

import java.util.Optional;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;
import com.algaworks.repository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();
		// Motorista motorista = motoristas.porNome("João");
		
		//String cobertura = motorista.getCaminhao().getSeguro().getCobertura();
		/*String cobertura = "Sem seguro";
		if (motorista != null) {
			Caminhao caminhao = motorista.getCaminhao();
			if (caminhao != null) {
				Seguro seguro = caminhao.getSeguro();
				if (seguro != null) {
					cobertura = seguro.getCobertura();
				}
			}
		}*/
		
		String cobertura = motoristas.porNome("João")
								.flatMap(Motorista::getCaminhao)
								.flatMap(Caminhao::getSeguro)
								.map(Seguro::getCobertura)
								.orElse("Sem cobertua");
		
		System.out.println("A cobertura é: " + cobertura);
	}
	
}















