public class Dog {
	String breed;
  	boolean hasOwner;
  	int age;
  
  	public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    		System.out.println("Constructor invoked!");
    		breed = dogBreed;
    		hasOwner = dogOwned;
    		age = dogYears;
  	}
  
  	public static void main(String[] args) {
    		System.out.println("Main method started");
    		Dog willy = new Dog("shih tzu", true, 1);
    		Dog cinnammon = new Dog("shiba inu", true, 3);
    		boolean isWillyOlder = willy.age > cinnammon.age;
    		int totalDogYears = willy.age + cinnammon.age;
   		System.out.println("Two dogs created: a " + willy.breed + " and a " + cinnammon.breed);
    		System.out.println("The statement that willy is an older dog is: " + isWillyOlder);
   		System.out.println("The total age of the dogs is: " + totalDogYears);
    		System.out.println("Main method finished");
  }
}
