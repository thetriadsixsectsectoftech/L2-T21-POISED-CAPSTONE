package namedpackage;

public class PoisedProjectClass {
    int projectnumb;
    String projectname;
    String buildingtype;
    int erfnumb;
    int projecttotalfee;
    int amountpaidtodate;

    String date;
    String physicaladdy;

    PoisedPersonClass architect;
    PoisedPersonClass contractor;
    PoisedPersonClass customer;


    public PoisedProjectClass(int projectnumb,String projectname,String buildingtype,int erfnumb,int projecttotalfee,int amountpaidtodate,String date,String physicaladdy,PoisedPersonClass archiect,PoisedPersonClass contractor,PoisedPersonClass customer){
        this.projectnumb = projectnumb;
        this.projectname = projectname;
        this.buildingtype = buildingtype;
        this.erfnumb = erfnumb;
        this.projecttotalfee = projecttotalfee;
        this.amountpaidtodate = amountpaidtodate;
        this.date = date;
        this.physicaladdy = physicaladdy;
        this.setArchitect(archiect);
        this.setContractor(contractor);
        this.setCustomer(customer);


    }


    public String toString(){
        String output = "project number: " + projectnumb;
        output += "\nproject name: " + projectname;
        output += "\nbuilding type: " + buildingtype;
        output += "\nerfnumber: " + erfnumb;
        output += "\nproject total fee: " + projecttotalfee;
        output += "\namount paid to date: " + amountpaidtodate;
        output += "\ndue date: " + date;
        output += "\narchitect details\n";
        output += getArchitect();
        output += "\ncontractor details\n";
        output += getContractor();
        output += "\ncustomer details\n";
        output += getCustomer();





        return output;
    }


    public void setDate(String newdate) {
        this.date = newdate;
    }

    public void setAmountpaidtodate(String newamountpaidtodate) {this.amountpaidtodate = Integer.parseInt(newamountpaidtodate);}


    public PoisedPersonClass getArchitect() {
        return architect;
    }

    public void setArchitect(PoisedPersonClass architect) {
        this.architect = architect;
    }

    public PoisedPersonClass getContractor() {
        return contractor;
    }

    public void setContractor(PoisedPersonClass contractor) {
        this.contractor = contractor;
    }

    public PoisedPersonClass getCustomer() {
        return customer;
    }

    public void setCustomer(PoisedPersonClass customer) {
        this.customer = customer;
    }
}
