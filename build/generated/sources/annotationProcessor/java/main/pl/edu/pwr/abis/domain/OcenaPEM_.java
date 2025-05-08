package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OcenaPEM.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class OcenaPEM_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaPEM#liczbaPunktow
	 **/
	public static volatile SingularAttribute<OcenaPEM, Integer> liczbaPunktow;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaPEM#id
	 **/
	public static volatile SingularAttribute<OcenaPEM, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaPEM#uzasadnieniePunktacji
	 **/
	public static volatile SingularAttribute<OcenaPEM, String> uzasadnieniePunktacji;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaPEM
	 **/
	public static volatile EntityType<OcenaPEM> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaPEM#ocena
	 **/
	public static volatile SingularAttribute<OcenaPEM, Ocena> ocena;

	public static final String LICZBA_PUNKTOW = "liczbaPunktow";
	public static final String ID = "id";
	public static final String UZASADNIENIE_PUNKTACJI = "uzasadnieniePunktacji";
	public static final String OCENA = "ocena";

}

