public class Animal {
    private String breed;
    private int age;
    public static int test=1;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Animal(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public Animal()
    {
        this.age=10;
        this.breed="Dog";
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
