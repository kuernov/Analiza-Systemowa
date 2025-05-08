package pl.edu.pwr.abis.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(PropozycjaWspolpracy.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class PropozycjaWspolpracy_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracy#projekt
	 **/
	public static volatile SingularAttribute<PropozycjaWspolpracy, Projekt> projekt;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracy#statusPropozycji
	 **/
	public static volatile SingularAttribute<PropozycjaWspolpracy, StatusPropozycji> statusPropozycji;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracy#dataZlozenia
	 **/
	public static volatile SingularAttribute<PropozycjaWspolpracy, LocalDateTime> dataZlozenia;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracy#id
	 **/
	public static volatile SingularAttribute<PropozycjaWspolpracy, PropozycjaWspolpracyId> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracy#czyAsesorWiodacy
	 **/
	public static volatile SingularAttribute<PropozycjaWspolpracy, Boolean> czyAsesorWiodacy;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracy
	 **/
	public static volatile EntityType<PropozycjaWspolpracy> class_;
	
	/**
	 * @see pl.edu.pwr.abis.domain.PropozycjaWspolpracy#ekspertIPMA
	 **/
	public static volatile SingularAttribute<PropozycjaWspolpracy, EkspertIPMA> ekspertIPMA;

	public static final String PROJEKT = "projekt";
	public static final String STATUS_PROPOZYCJI = "statusPropozycji";
	public static final String DATA_ZLOZENIA = "dataZlozenia";
	public static final String ID = "id";
	public static final String CZY_ASESOR_WIODACY = "czyAsesorWiodacy";
	public static final String EKSPERT_IP_MA = "ekspertIPMA";

}

