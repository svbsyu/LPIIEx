package model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
@Data
@Entity
@Table(name="tb_categoria")
@NamedQuery(name="tb_categoria.findAll", query="SELECT e FROM Categoria e")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cate;

	@Column(name = "descripcion")
	private String descripción;

	@Column(name = "fre_comp")
	private String frecuencia;
}
