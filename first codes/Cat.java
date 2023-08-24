public class Cat {
	String breed;
  	boolean hasOwner;
  	int age;
  
  	public Cat(String catBreed, boolean catOwned, int catYears) {
    		System.out.println("Constructor invoked!");
    		breed = catBreed;
    		hasOwner = catOwned;
    		age = catYears;
  	}
  
  	public static void main(String[] args) {
    		System.out.println("Main method started");
    		Cat lulu = new Cat("japanese bobtail", false, 4);
    		Cat coco = new Cat("maine coon", true, 12);
    		boolean isLuluOlder = lulu.age > coco.age;
    		int totalCatYears = coco.age + lulu.age;
   		System.out.println("Two cats created: a " + lulu.breed + " and a " + coco.breed);
    		System.out.println("The statement that lulu is an older cat is: " + isLuluOlder);
   		System.out.println("The total age of the cats is: " + totalCatYears);
    		System.out.println("Main method finished");
  }
}
