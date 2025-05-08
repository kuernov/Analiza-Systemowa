package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PropozycjaWspolpracyId.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PropozycjaWspolpracyId_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracyId#projektId
	 **/
	public static volatile SingularAttribute<PropozycjaWspolpracyId, Integer> projektId;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracyId
	 **/
	public static volatile EmbeddableType<PropozycjaWspolpracyId> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracyId#ekspertIPMAId
	 **/
	public static volatile SingularAttribute<PropozycjaWspolpracyId, Integer> ekspertIPMAId;

	public static final String PROJEKT_ID = "projektId";
	public static final String EKSPERT_IP_MA_ID = "ekspertIPMAId";

}

