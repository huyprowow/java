public class MyComplex {
    private double real;
    private double imag;
    MyComplex(double real,double imag){
        this.imag=imag;
        this.real=real;
    }

    public double getImag() {
        return imag;
    }

    public double getReal() {
        return real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }
    public void setValue(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    @Override
    public String toString() {
        return "("+real+" ,"+imag+"i)";
    }
    public boolean isReal(){
        return imag==0;
    }
    public boolean isImaginary(){
        return real==0 && imag!=0;
    }

    @Override
    public boolean equals(Object obj) {
              return (this.real==((MyComplex)obj).real&&this.imag==((MyComplex)obj).imag);
    }

    public double magnitude(){
        return Math.sqrt(real+imag);
    }
    public double argumentInRadius(){
        return  Math.atan2(imag,real);
    }
    public int argumentInDegrees(){
        return Integer.parseInt(Math.atan2(imag,real)*180/Math.PI+"");
    }
    public MyComplex conjugate(){
        return new MyComplex(real,-imag);
    }
    public MyComplex add(MyComplex another){
        //(a + bi) + (c + di) = (a+c) + (b+d)i
        return new MyComplex(this.real+another.real ,this.imag+another.imag);
    }
    public MyComplex subtract(MyComplex another){
//        (a + bi) ‐ (c + di) = (a‐c) + (b‐d)i
        return new MyComplex(this.real-another.real ,this.imag-another.imag);


    }
    public MyComplex multiplyWith(MyComplex another){
//        (a + bi) * (c + di) = (ac ‐ bd) + (ad + bc)i
        return new MyComplex(this.real*another.real-this.imag*another.imag ,this.real*another.imag+this.imag*another.real);


    }
    public MyComplex devideBy(MyComplex another){
//                (a + bi) / (c + di) = [(a + bi) * (c – di)] / (c2 + d2)
//        return this.multiplyWith(another.conjugate())/(another.real*another.real+another.imag*another.imag);

        double mau=another.real*another.real+another.imag*another.imag;
        double tu1=this.real*another.real+this.imag*another.imag;
        double tu2=this.imag*another.real-this.real*another.imag;


        return new MyComplex(tu1/mau,tu2/mau);

    }



}
