package com.isaiassantos.model;

import com.isaiassantos.enums.TipoDocumento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
	private String nome;
    private String documento;
    private TipoDocumento tipoDocumento;
}
