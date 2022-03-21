package week5;

public class Person {
    private String firstName;
    private String lastName;
    private double age;
    private String[] hobbies = new String[]{
            "Cycling",
            "Reading books",
            "Studying",
            "Programming",
            "Debugging"
    };

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

//    public String getFirstName() {
//        return firstName;
//    }

    public String getFirstName() {
    return firstName.charAt(0)+ ".";
}

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 2) {
            this.lastName = lastName;
        } else {
            System.out.println("Wrong name, minmal 3 char.");
        }
    }

    public boolean isAdult(){
        return age >= 18 ? true : false;
    }

    //Exceptie voorbeeld 1
    public String getPercentageOfAge(int specificAge){
        double agePercentage = specificAge / this.age;

        return Math.floor(agePercentage*100)+"%";
    }

//    public String getHobbyAtIndex(int index){
//        // exception prevention
//        if (index < 0 || index > this.hobbies.length-1){
//            return "INVALID HOBBY INDEX";
//        }
//        return this.hobbies[index];
//    }
//
        public String getHobbyAtIndex(int index){
            // error handeling
            try {
                // code
                int a = 10/0;
                return this.hobbies[index];
            } catch (ArrayIndexOutOfBoundsException e){
                return "INVALID HOBBY INDEX";
            } catch (ArithmeticException e){
                return "ArithmeticException door fout bla";
            }

        }

}
