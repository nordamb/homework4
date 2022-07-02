package senior;

public class Human {
    private String name;
    private int age;
    private double weight;

    private Human() {
    }

    static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void info() {
        System.out.println(getName() + " - возраст " + getAge() + ", вес " + getWeight());
    }

    static class HumanBuilder {
        private Human human;

        public HumanBuilder() {
            this.human = new Human();
        }

        HumanBuilder name(String name) {
            human.setName(name);
            return this;
        }

        HumanBuilder age(int age) {
            human.setAge(age);
            return this;
        }

        HumanBuilder weight(double weight) {
            human.setWeight(weight);
            return this;
        }

        Human build() {
            return human;
        }
    }
}
