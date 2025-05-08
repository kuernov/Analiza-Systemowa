package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OcenaIndywidualnaId.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class OcenaIndywidualnaId_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualnaId#projektId
	 **/
	public static volatile SingularAttribute<OcenaIndywidualnaId, Integer> projektId;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualnaId
	 **/
	public static volatile EmbeddableType<OcenaIndywidualnaId> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.OcenaIndywidualnaId#asesorId
	 **/
	public static volatile SingularAttribute<OcenaIndywidualnaId, Integer> asesorId;

	public static final String PROJEKT_ID = "projektId";
	public static final String ASESOR_ID = "asesorId";

}

