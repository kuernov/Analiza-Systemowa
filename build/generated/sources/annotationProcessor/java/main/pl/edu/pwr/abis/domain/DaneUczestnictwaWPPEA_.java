package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DaneUczestnictwaWPPEA.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DaneUczestnictwaWPPEA_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneUczestnictwaWPPEA#rokKonkursu
	 **/
	public static volatile SingularAttribute<DaneUczestnictwaWPPEA, Integer> rokKonkursu;
	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneUczestnictwaWPPEA#uzyskanyTytul
	 **/
	public static volatile SingularAttribute<DaneUczestnictwaWPPEA, String> uzyskanyTytul;
	
	/**
	 * @see pl.edu.pwr.abis.domain.DaneUczestnictwaWPPEA
	 **/
	public static volatile EmbeddableType<DaneUczestnictwaWPPEA> class_;

	public static final String ROK_KONKURSU = "rokKonkursu";
	public static final String UZYSKANY_TYTUL = "uzyskanyTytul";

}

