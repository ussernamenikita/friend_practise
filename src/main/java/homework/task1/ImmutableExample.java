package homework.task1;


final class ImmutableExample {
    private int age;
    private String name;

    public ImmutableExample(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Возраст  = " + age + '\n' + "Имя = " + name + '\n';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
