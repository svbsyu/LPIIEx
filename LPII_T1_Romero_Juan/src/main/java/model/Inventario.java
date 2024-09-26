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
@Table(name="tb_inventario")
@NamedQuery(name="tb_inventario.findAll", query="SELECT e FROM Inventario e")
public class Inventario{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nro_inv;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "id_prod")
	private String idproducto;

	@Column(name = "cost_in")
	private String costo;
	
	public Inventario() {
	}
}
