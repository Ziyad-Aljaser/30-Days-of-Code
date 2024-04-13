class Person {
    public String firstName;
    public String lastName;
    public int idNumber;
   
    // Constructor
    public Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    public void printPerson(){
        System.out.println(
            "Name: " + lastName + ", " + firstName 
            +     "\nID: " + idNumber); 
    }
}