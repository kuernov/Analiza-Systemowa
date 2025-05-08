package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassB1.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassB1_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB1#classA1
	 **/
	public static volatile SingularAttribute<ClassB1, ClassA1> classA1;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB1#id
	 **/
	public static volatile SingularAttribute<ClassB1, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB1#attributeB
	 **/
	public static volatile SingularAttribute<ClassB1, String> attributeB;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB1
	 **/
	public static volatile EntityType<ClassB1> class_;

	public static final String CLASS_A1 = "classA1";
	public static final String ID = "id";
	public static final String ATTRIBUTE_B = "attributeB";

}

