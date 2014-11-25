package com.algaworks.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;

public class Motoristas {

	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();

	public Motoristas() {
		Seguro seguro = new Seguro("Parcial - não cobre roubo", new BigDecimal("5000"));
		Caminhao caminhao = new Caminhao("Mercedes Atron", Optional.ofNullable(seguro));
		Optional<Motorista> motoristaJoao = Optional.of(new Motorista("João", 40, Optional.ofNullable(caminhao)));
		
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("José", 25, Optional.ofNullable(null)));

		motoristas.put("João", motoristaJoao);
		motoristas.put("José", motoristaJose);
	}

	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}

}
