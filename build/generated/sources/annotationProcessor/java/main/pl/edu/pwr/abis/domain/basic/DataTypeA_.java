package pl.edu.pwr.abis.domain.basic;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DataTypeA.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class DataTypeA_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.basic.DataTypeA#attributeA
	 **/
	public static volatile SingularAttribute<DataTypeA, Character> attributeA;
	
	/**
	 * @see pl.edu.pwr.abis.domain.basic.DataTypeA#attributeB
	 **/
	public static volatile SingularAttribute<DataTypeA, String> attributeB;
	
	/**
	 * @see pl.edu.pwr.abis.domain.basic.DataTypeA
	 **/
	public static volatile EmbeddableType<DataTypeA> class_;

	public static final String ATTRIBUTE_A = "attributeA";
	public static final String ATTRIBUTE_B = "attributeB";

}

