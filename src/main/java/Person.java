public record Person(String name,String surname) {
    static int age;

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age=newAge;
    }
}
