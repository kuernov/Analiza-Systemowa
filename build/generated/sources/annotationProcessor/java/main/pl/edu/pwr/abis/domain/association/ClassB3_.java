package pl.edu.pwr.abis.domain.association;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ClassB3.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ClassB3_ {

	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB3#otherClassA3
	 **/
	public static volatile SingularAttribute<ClassB3, ClassA3> otherClassA3;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB3#id
	 **/
	public static volatile SingularAttribute<ClassB3, Long> id;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB3#attributeB
	 **/
	public static volatile SingularAttribute<ClassB3, String> attributeB;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB3#classA3
	 **/
	public static volatile SingularAttribute<ClassB3, ClassA3> classA3;
	
	/**
	 * @see pl.edu.pwr.abis.domain.association.ClassB3
	 **/
	public static volatile EntityType<ClassB3> class_;

	public static final String OTHER_CLASS_A3 = "otherClassA3";
	public static final String ID = "id";
	public static final String ATTRIBUTE_B = "attributeB";
	public static final String CLASS_A3 = "classA3";

}

