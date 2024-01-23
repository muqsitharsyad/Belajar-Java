class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //Constructur -> method yang akan dipanggil ketika pertamakali object dibuat
    //Nama harus sama dengan nama class
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    //constructor bisa lebih dari 1 asal beda parameter
    //tetapi menyebabkan constructor overloading
    Person(String paramName){
        //bisa memanggil dari constructor lain
        // name = paramName;
        this(paramName, null);
    }

    Person(){
        this(null);
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is  " + name);
    }
}
