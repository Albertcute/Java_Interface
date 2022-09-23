public class Main{
    public static void main(String[] args){
        Sports a = new Sports(); 
        Sports sps = new Sports("Albert Monceda" , 21, "Volleyball player");

        a.setName("Albert Monceda");
        a.setAge(21);
        a.setProfile("Volleyball player");

        System.out.println("Name: " + a.getName() );
        System.out.println("Age: " + a.getAge() );
        System.out.println("Profile: " + a.getProfile() );

        System.out.println("Name: " + sps.name);
        System.out.println("Age: " + sps.age);
        System.out.println("Profile: " + sps.profile);

        Volleyball s = new Volleyball();
        System.out.println("I am proud to say that I came from the school of " + s.schoolName);

        Sports p = new Sports();
        p.show();
        Sports p2 = new Volleyball();
        p2.show();

    }
}