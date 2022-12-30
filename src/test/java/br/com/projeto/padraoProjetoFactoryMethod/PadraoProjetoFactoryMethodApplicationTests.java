package br.com.projeto.padraoProjetoFactoryMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PadraoProjetoFactoryMethodApplicationTests {

	private static final int DOIS = 2;
	private static final int QUATRO = 4;
	private static final int SEIS = 6;

	@Test
	void converterValorParaTriplo_quandoSucesso() {

		Inteiro.value = 2;

		int valorInteiro = Inteiro.retornaTriplo() ;

		assertEquals(SEIS, valorInteiro);

	}

	@Test
	void converterValorParaInt_quandoSucesso() {

		Inteiro valor = new Inteiro();

		Inteiro.value = DOIS;

		int valorInteiro = valor.intValue();

		assertEquals(QUATRO, valorInteiro);

	}

	@Test
	void converterValorParaLong_quandoSucesso() {

		Inteiro valor = new Inteiro();

		Inteiro.value = DOIS;

		long valorInteiro = valor.longValue();

		assertEquals(QUATRO, valorInteiro);

	}

	@Test
	void converterValorParaFloat_quandoSucesso() {

		Inteiro valor = new Inteiro();

		Inteiro.value = DOIS;

		float valorInteiro = valor.floatValue();

		assertEquals(QUATRO, valorInteiro);

	}

	@Test
	void converterValorParaDouble_quandoSucesso() {

		Inteiro valor = new Inteiro();

		Inteiro.value = DOIS;

		double valorInteiro = valor.doubleValue();

		assertEquals(QUATRO, valorInteiro);

	}

}
