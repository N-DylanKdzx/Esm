package upeu.edu.pe.Esm.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="matriculas")
public class Matricula {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name = "fecha_mat")	
	@Temporal(TemporalType.DATE) 
	private Date fecha_mat;
	
	@Column(name="horas")
	private Long horas;
	
	@Column(name="nivel")
	private String nivel;
	
	@ManyToOne
	@JoinColumn(name = "alumno_id", nullable = false)
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn(name = "empleado", nullable = false)
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name = "grado_id", nullable = false)
	private Grado grado;
	
	
}