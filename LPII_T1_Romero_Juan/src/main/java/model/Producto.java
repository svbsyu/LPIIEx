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
@Table(name="tb_producto")
@NamedQuery(name="tb_producto.findAll", query="SELECT e FROM Producto e")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prod;

	@Column(name = "nom_prod")
	private String nombre;

	@Column(name = "id_cate")
	private String categoria;

	@Column(name = "stock")
	private String stock;
	
	public Producto() {
	}
}
