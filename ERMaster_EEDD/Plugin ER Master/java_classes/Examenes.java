import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of examenes.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Examenes implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** num_exa. */
	private Integer numExa;

	/** npreguntas. */
	private Integer npreguntas;

	/** fecha. */
	private Date fecha;

	/** The set of hacen. */
	private Set<Hacen> hacenSet;

	/**
	 * Constructor.
	 */
	public Examenes() {
		this.hacenSet = new HashSet<Hacen>();
	}

	/**
	 * Set the num_exa.
	 * 
	 * @param numExa
	 *            num_exa
	 */
	public void setNumExa(Integer numExa) {
		this.numExa = numExa;
	}

	/**
	 * Get the num_exa.
	 * 
	 * @return num_exa
	 */
	public Integer getNumExa() {
		return this.numExa;
	}

	/**
	 * Set the npreguntas.
	 * 
	 * @param npreguntas
	 *            npreguntas
	 */
	public void setNpreguntas(Integer npreguntas) {
		this.npreguntas = npreguntas;
	}

	/**
	 * Get the npreguntas.
	 * 
	 * @return npreguntas
	 */
	public Integer getNpreguntas() {
		return this.npreguntas;
	}

	/**
	 * Set the fecha.
	 * 
	 * @param fecha
	 *            fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Get the fecha.
	 * 
	 * @return fecha
	 */
	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * Set the set of the hacen.
	 * 
	 * @param hacenSet
	 *            The set of hacen
	 */
	public void setHacenSet(Set<Hacen> hacenSet) {
		this.hacenSet = hacenSet;
	}

	/**
	 * Add the hacen.
	 * 
	 * @param hacen
	 *            hacen
	 */
	public void addHacen(Hacen hacen) {
		this.hacenSet.add(hacen);
	}

	/**
	 * Get the set of the hacen.
	 * 
	 * @return The set of hacen
	 */
	public Set<Hacen> getHacenSet() {
		return this.hacenSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numExa == null) ? 0 : numExa.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Examenes other = (Examenes) obj;
		if (numExa == null) {
			if (other.numExa != null) {
				return false;
			}
		} else if (!numExa.equals(other.numExa)) {
			return false;
		}
		return true;
	}

}