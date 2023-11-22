package com.remedios.luiz.remedio;

public record DadosCadastroRemedio(
		String nome,
		Via via,
		String lote,
		String quantidade,
		String validade,
		Laboratorio laboratorio
		) {
	
}
