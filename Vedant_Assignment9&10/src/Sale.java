public class Sale extends SalePerson{

    public static void main(String[] args) {
        Sale sales = new Sale();
        sales.setSales(12000.00);
        sales.setAdvance(100.00);
        sales.display();
    }

    @Override
    void display() {
        System.out.println("THe total sales of the person " + this.sales);
        System.out.println("THe total advance of the person " + this.advance);
        double payment=0.00;
        double totalPayment = 0.00;
        if(this.sales < 10000)
            payment = this.sales*0.5;
        else if(this.sales>=10000 && this.sales<15000)
            payment=this.sales*0.10;
        else if(this.sales>=15000 && this.sales<18000)
            payment=this.sales*0.12;
        else if(this.sales>=18000 && this.sales<22000)
            payment=this.sales*0.15;
        else if(this.sales >=22000)
            payment = this.sales*0.16;
        totalPayment =payment-this.advance;
        System.out.println("The total commission is " + totalPayment);
    }
}

