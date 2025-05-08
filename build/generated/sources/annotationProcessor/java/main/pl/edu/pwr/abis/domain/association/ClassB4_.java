package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassB4.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassB4_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB4#classA4
	 **/
	public static volatile SingularAttribute<ClassB4, ClassA4> classA4;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB4#id
	 **/
	public static volatile SingularAttribute<ClassB4, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB4#attributeB
	 **/
	public static volatile SingularAttribute<ClassB4, String> attributeB;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB4
	 **/
	public static volatile EntityType<ClassB4> class_;

	public static final String CLASS_A4 = "classA4";
	public static final String ID = "id";
	public static final String ATTRIBUTE_B = "attributeB";

}

