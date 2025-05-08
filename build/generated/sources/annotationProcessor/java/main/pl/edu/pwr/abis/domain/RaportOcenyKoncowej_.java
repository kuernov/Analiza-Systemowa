package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(RaportOcenyKoncowej.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class RaportOcenyKoncowej_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportOcenyKoncowej#ocenaKoncowa
	 **/
	public static volatile SingularAttribute<RaportOcenyKoncowej, OcenaKoncowa> ocenaKoncowa;
	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportOcenyKoncowej#id
	 **/
	public static volatile SingularAttribute<RaportOcenyKoncowej, Integer> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportOcenyKoncowej
	 **/
	public static volatile EntityType<RaportOcenyKoncowej> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.RaportOcenyKoncowej#wyjasnienieOdrzuceniaDecyzji
	 **/
	public static volatile SingularAttribute<RaportOcenyKoncowej, String> wyjasnienieOdrzuceniaDecyzji;

	public static final String OCENA_KONCOWA = "ocenaKoncowa";
	public static final String ID = "id";
	public static final String WYJASNIENIE_ODRZUCENIA_DECYZJI = "wyjasnienieOdrzuceniaDecyzji";

}

