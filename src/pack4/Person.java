package pack4;

public class Person {

protected	char gender;
protected int age;
protected String name;
public Person(char gender, int age, String name) {
	super();
	this.gender = gender;
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
}
}
