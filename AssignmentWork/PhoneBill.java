package AssignmentWork;
// Question 3
public class PhoneBill {
        String customerName;
        long phoneNumber;
        int no_of_unit;
        int rent;
        double amount;
    PhoneBill(String customerName,long phoneNumber,int no_of_unit,int rent,double amount){
        this.customerName=customerName;
        this.phoneNumber=phoneNumber;
        this.no_of_unit=no_of_unit;
        this.rent=rent;
        this.amount=amount;
    }

        public void calculate(){
            double charge;
            if (no_of_unit <= 50)
                charge = rent * 0.0;
            else if (no_of_unit <= 100)
                charge = (rent * 0.6);
            else if (no_of_unit <= 200)
                charge = 60+ ((rent - 200) * 0.8);
            else
                charge = 60 + 80 +((rent - 200) * 1.2);

            amount = charge+rent ;

        }
        public void display(){
            System.out.println("Customer Name : " + customerName);
            System.out.println("PhoneNumber : " + phoneNumber);
            System.out.println("No of Unit : " + no_of_unit);
            System.out.println("Rent :"+rent);
            System.out.println("Amount Payable: " + amount);
        }

    public static void main(String[] args) {
            PhoneBill obj=new PhoneBill("raju",259461,100,100,100);
            obj.calculate();
            obj.display();
    }
}
