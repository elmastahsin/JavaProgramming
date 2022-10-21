package day34_abstraction.animalTask;

public abstract class Animal {
        private String name, breed;
        private final char gender;
        private int age;
        private String size, color;

        public Animal(String name, String breed, char gender, int age, String size, String color) {
            setName(name);
            setBreed(breed);
            this.gender=gender;
            setAge(age);
            setSize(size);
            setColor(color);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public char getGender() {
            return gender;
        }



        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public abstract void drink() ;

        public abstract void eat() ;

        public abstract void sleep() ;

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

/*Animal task:
	interface Swimmable
		swim()

	interface Flyable
			fly();

	interface Wild:
			hunt();

	interface Playable
			play();


	abstractClass Animal:
		eat();
		drink();



	Dog extend Animal implements Playable, Swimmable

	Cat extend Animal implements Playable

	Cow extend Animal implements Playable

	Horse extend Animal implements Playable

	Parrot extend Animal implements Playable, Flyable

	Eagle extend Animal implements Wild, Flyable

	Tiger extend Animal implements Wild

	Lion extend Animal implements Wild

	Falcon extend Animal implements Wild, Flyable

	Shark extend Animal implements Wild, Swimmable

	Dolphin extend Animal implements Playable, Swimmable

	Duck extend Animal implements Playable, Swimmable, Flyable

	Java extend Animal implements Playable, Swimmable, Flyable, Wild


*/