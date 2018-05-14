package com.nick.algorithms.filterPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnnecessaryClasses {

	class Person {
		Address homeAddress;
		Address workAddress;
	}

	class Address {
		String city;
	}

	class Cat {
	}

	class Package {
		List<JavaClass> classes;

		Package(List<JavaClass> classes) {
			this.classes = classes;
		}

		List<JavaClass> getAllClasses() {
			return classes;
		}
	}

	class JavaClass {
		List<Field> fields = new ArrayList<>();
		String className;

		JavaClass(String className, List<Field> fields) {
			if (fields != null) {
				this.fields = fields;
			}
			this.className = className;
		}

		String getClassName() {
			return className;
		}

		List<Field> getFields() {
			return fields;
		}

		@Override
		public String toString() {
			return className;
		}
	}

	class Field {
		String className;

		Field(String className) {
			this.className = className;
		}

		String getClassName() {
			return className;
		}

		@Override
		public String toString() {
			return className;
		}
	}

	public Collection<String> findUnnecessaryClasses(Package pkg, String classToCompile) {

		Set<String> allClasses = new HashSet<>();
		JavaClass class2Compile = null;

		// create a flat list of all classes in the package
		for (JavaClass clazz : pkg.getAllClasses()) {
			allClasses.add(clazz.getClassName());

			if (clazz.getClassName().equals(classToCompile)) {
				// this is the class that we will want to compile
				class2Compile = clazz;
			}
			// add all distinct fields to the set
			for (Field field : clazz.getFields()) {
				allClasses.add(field.getClassName());
			}
		}

		System.out.println("All classes in package: " + allClasses);

		if (class2Compile == null) {
			return allClasses;
		} else {
			allClasses.remove(class2Compile.getClassName());
		}

		for (Field field : class2Compile.fields) {
			// remove all of these fields from the return list
			allClasses.remove(field.getClassName());
		}

		return allClasses;
	}

	public static void main(String[] args) {
		FindUnnecessaryClasses mainClass = new FindUnnecessaryClasses();
		
		List<JavaClass> classes = new ArrayList<>();

		// Cat
		classes.add(mainClass.new JavaClass("Cat", null));

		// Person
		classes.add(mainClass.new JavaClass("Person",
				Arrays.asList(mainClass.new Field("Address"), mainClass.new Field("Address"))));
		
		// Address
		classes.add(mainClass.new JavaClass("Address", null));

		Package pkg = mainClass.new Package(classes);

		System.out.println("Classes to exclude: " + mainClass.findUnnecessaryClasses(pkg, "Person"));
	}

}
