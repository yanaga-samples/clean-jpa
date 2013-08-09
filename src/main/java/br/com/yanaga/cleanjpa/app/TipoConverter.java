package br.com.yanaga.cleanjpa.app;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class TipoConverter implements AttributeConverter<Tipo, String> {

	@Override
	public String convertToDatabaseColumn(Tipo attribute) {
		return attribute.getCodigo();
	}

	@Override
	public Tipo convertToEntityAttribute(String dbData) {
		return Tipo.fromCodigo(dbData);
	}

}