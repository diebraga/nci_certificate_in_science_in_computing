public class Cat {
    private String name;
    private String breed;
    private int age;
    private String meowSound;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMeowSound() {
        return meowSound;
    }

    public void setMeow(String meowSound) {
        this.meowSound = meowSound;
    }

    public void printMeow() {
        for (int i = 0; i < 3; i++) {
            System.out.print(meowSound + " ");
        }
        System.out.println();
    }
}
