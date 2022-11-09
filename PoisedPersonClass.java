package namedpackage;

public class PoisedPersonClass {
        String name;
        long telenum;
        String email;
        String address;




        public PoisedPersonClass(String name,long telenum,String email, String address){
                this.name = name;
                this.telenum = telenum;
                this.email = email;
                this.address = address;

        }
        public String toString(){
                String output = "name: " + name;
                output += "\ntelephone number: " + telenum;
                output += "\nemail adddress: " + email;
                output += "\nphysical address: " + address ;


                return output;
        }

        public void setName(String name) {this.name = name;}

        public void setTelenum(long telenum) {this.telenum = telenum;}

        public void setAddress(String address) {this.address = address;}

        public void setEmail(String email) {this.email = email;}
}
