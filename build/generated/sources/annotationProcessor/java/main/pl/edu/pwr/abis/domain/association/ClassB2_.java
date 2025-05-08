package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassB2.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassB2_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB2#classA2
	 **/
	public static volatile SingularAttribute<ClassB2, ClassA2> classA2;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB2#id
	 **/
	public static volatile SingularAttribute<ClassB2, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB2#attributeB
	 **/
	public static volatile SingularAttribute<ClassB2, String> attributeB;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB2
	 **/
	public static volatile EntityType<ClassB2> class_;

	public static final String CLASS_A2 = "classA2";
	public static final String ID = "id";
	public static final String ATTRIBUTE_B = "attributeB";

}

