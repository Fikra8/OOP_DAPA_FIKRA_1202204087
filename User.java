public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    int phoneNumber;

    public void setname(String name){
        this.name = name;
    }

    public void setphoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void register(){
        System.out.println("Succsess");
        System.out.println("Nama = " + name);
        System.out.println("Phone Number = " + phoneNumber);
    }

}
