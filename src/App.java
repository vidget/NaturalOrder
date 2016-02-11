import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable{
	
	private int id;
	private String name;
	
	public Person (int id, String name){
		this.id=id;
		this.name=name;
		
		
	}
	
	public String toString(){
		return name;
	}

	

	@Override
	public int compareTo(Object person) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class App {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//TreeSets store sets in natural order..
		SortedSet<String> set = new TreeSet<String>();
		
		
		List<Person> listPerson = new ArrayList<Person>();
		SortedSet<Person> setPerson = new TreeSet<Person>();
				
		addElements(list);
		addElements(set);
		
		addElementsToPerson(listPerson);
		addElementsToPerson(setPerson);
		
		
		
		showElements(list);
		System.out.println();//Blank line
		
		//can sort the list Alphabetically
		Collections.sort(list);
		
		showElements(list);
		System.out.println();//Blank line
		showElements(set);
		
	}
	
		private static void addElements(Collection<String>col){
			col.add("Joe");
			col.add("Shemp");
			col.add("Moe");
			col.add("Larry");
			col.add("Curly");
			
		}
		
		private static void addElementsToPerson(Collection<Person>col){
			col.add(new Person(1,"Fred"));
			col.add(new Person(3,"Barney"));
			col.add(new Person(2,"Wilma"));
			col.add(new Person(5,"Dino"));
			col.add(new Person(4,"Betty"));
									
		}
		
		private static void showElements(Collection<String>col){
			for(String element: col){
				System.out.println(element);
			}
			

		}
		
		private static void showElementsPerson(Collection<Person>col){
			for(Person element: col){
				System.out.println(element);
			}
			

		}
		

	}


