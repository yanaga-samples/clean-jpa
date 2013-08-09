package br.com.yanaga.cleanjpa.app;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public enum Tipo {
	FISICA("F") {
		@Override
		public int getNumeroParcelas() {
			return 3;
		}
	},
	JURIDICA("J") {
		@Override
		public int getNumeroParcelas() {
			return 5;
		}
	};

	private static final Map<String, Tipo> valueMap;

	static {
		Builder<String, Tipo> builder = ImmutableMap.builder();
		for (Tipo tipo : values()) {
			builder.put(tipo.codigo, tipo);
		}
		valueMap = builder.build();
	}

	public static Tipo fromCodigo(String codigo) {
		return valueMap.get(codigo);
	}

	private final String codigo;

	private Tipo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public abstract int getNumeroParcelas();

}