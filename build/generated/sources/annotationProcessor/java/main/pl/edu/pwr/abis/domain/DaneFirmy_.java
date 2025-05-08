package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DaneFirmy.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DaneFirmy_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneFirmy#ulicaNumer
	 **/
	public static volatile SingularAttribute<DaneFirmy, String> ulicaNumer;
	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneFirmy#kodPocztowyLubMiasto
	 **/
	public static volatile SingularAttribute<DaneFirmy, String> kodPocztowyLubMiasto;
	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneFirmy#numerNIP
	 **/
	public static volatile SingularAttribute<DaneFirmy, Integer> numerNIP;
	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneFirmy
	 **/
	public static volatile EmbeddableType<DaneFirmy> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneFirmy#nazwa
	 **/
	public static volatile SingularAttribute<DaneFirmy, String> nazwa;

	public static final String ULICA_NUMER = "ulicaNumer";
	public static final String KOD_POCZTOWY_LUB_MIASTO = "kodPocztowyLubMiasto";
	public static final String NUMER_NI_P = "numerNIP";
	public static final String NAZWA = "nazwa";

}

