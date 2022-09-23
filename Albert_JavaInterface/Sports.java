public class Sports implements interFace{


    String name, profile;
    int age;
    String schoolName = "Mantalongon National High School"; 

    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getProfile() {
        return profile;
    }

    public Sports(){
        System.out.println("Hello, I'm a player of volleyball since high school.");
    }

    public Sports(String name, int age, String profile){
        this.name=name;
        this.age=age;
        this.profile=profile;
    }
    
    public void show(){
        System.out.println("And also I am a Table tennis player in my elementary days.");
        System.out.println("Then also basketball, yeah I really love ball games.");
    }
}
