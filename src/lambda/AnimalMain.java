package lambda;
import java.util.ArrayList;
import java.util.function.Predicate;

public class AnimalMain {

	private static void print(ArrayList<Animal> animais,CheckPula checker) {
		for(Animal animal:animais) {
			System.out.println(checker.data(animal)+ checker.test(animal));
		}
	
	}
	
	private static void printPredicate(ArrayList<Animal> animais,Predicate<Animal> a) {
		for(Animal animal:animais) {
			if(a.test(animal))
				System.out.println(animal.getData());
		}
	}
	
	public static void main(String[] args) {
		
		 ArrayList<Animal> animais = new ArrayList<>(); 
		 // Animal(String nome, boolean pula,boolean nada,boolean voa)
		animais.add(new Animal("Tigre",			true,true,false));
		animais.add(new Animal("Sapo", 			true,true,false));
		animais.add(new Animal("Cachorro", 	true,true,false));
		animais.add(new Animal("Papagaio", true,false,true));
		animais.add(new Animal("Peixe", 			false,true,false));

		System.out.println("________________ lambda1__________________");
		print(animais,new CheckPula());
		
		System.out.println("________________ lambda2__________________");
		animais .forEach(a ->  System.out.println(a.getData()));
		
		System.out.println("________________ lambda3__________________");
		animais.forEach(a -> System.out.println(a.isPula()));
		
		System.out.println("________________ lambda4__________________");
		Check check = (Animal a) ->"-----------------"+ a.getData()+"-----------------";
		animais.forEach( a -> System.out.println(check.data(a)));
		
		System.out.println("________________ lambda5__________________");
		printPredicate(animais, a -> a.isPula());
		
		System.out.println("________________ lamabda6__________________");
		animais.forEach(System.out::println);
	}

}

